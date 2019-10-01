/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vodafone.wfx.controller;

import com.vodafone.wfx.model.VfeLkBooleanAdp;
import com.vodafone.wfx.model.VfeLkDbAdp;
import com.vodafone.wfx.model.VfeLkErrorCodesAdp;
import com.vodafone.wfx.model.VfeLkPreparationTypesAdp;
import com.vodafone.wfx.model.VfePreparationModeAdp;
import com.vodafone.wfx.model.VfeWorkflowPreparationAdp;
import com.vodafone.wfx.model.VfeWorkflowRollbackAdp;
import com.vodafone.wfx.model.VfeWorkflowStepsAdp;
import com.vodafone.wfx.model.VfeWorkflowsAdp;
import com.vodafone.wfx.service.PreparationService;
import com.vodafone.wfx.service.WorkFlowService;
import com.vodafone.wfx.util.EditorUtil;
import java.math.BigDecimal;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author V19MFoda
 */
@Controller
@RequestMapping("Preparation")
public class PreparationController {

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private PreparationService preparationService;

    @Autowired
    private WorkFlowService workFlowService;

    final Logger logger = Logger.getLogger(PreparationController.class);

    @GetMapping("/Get/{preparationId}")
    public void getPreparation(@PathVariable long preparationId) {
        try {

            VfeWorkflowPreparationAdp preparation = preparationService.getPreparation(preparationId);
            // logger.info("Preparation Description --------> " + preparation.getDescription());
        } catch (Exception e) {
            logger.error("Error in fetching preparation with id " + preparationId + " because " + e.getMessage());
        }
    }

    @PostMapping("/Create/{activityId}")
    public String savePreparation(@PathVariable long activityId,
            @RequestParam(name = "parameterName") String parameterName,
            @RequestParam(name = "saveToPool") String saveToPool,
            @RequestParam(name = "preparationOrder") String preparationOrder,
            @RequestParam(name = "preparationTypeId") String preparationTypeId,
            @RequestParam(name = "errorCodeId") String errorCodeId,
            @RequestParam(name = "preparationModeId") String preparationModeId,
            @RequestParam(name = "description") String description,
            @RequestParam(name = "rollBackId") String rollBackId,
            @RequestParam(name = "dbId") String dbId,
            @RequestParam(name = "doCommit") String doCommit,
            @RequestParam(name = "queryTimeOut") String queryTimeOut
    ) {

        VfeWorkflowsAdp workflow = (VfeWorkflowsAdp) request.getSession(false).getAttribute("workflow");

        long maxId = EditorUtil.getMaxId("PREPARATION_ID", "VfeWorkflowPreparationAdp");
        logger.info("New Preparation ID ---------> " + maxId);

        VfeWorkflowPreparationAdp preparation = new VfeWorkflowPreparationAdp();

        Byte byteId = new Byte(doCommit);
        VfeLkBooleanAdp booleanAdb = null;
        booleanAdb = new VfeLkBooleanAdp(byteId);
        booleanAdb.setBooleanId(byteId);
        preparation.setDoCommit(booleanAdb);

        byteId = new Byte(saveToPool);

        booleanAdb = new VfeLkBooleanAdp(byteId);
        booleanAdb.setBooleanId(byteId);

        preparation.setSaveToPool(booleanAdb);

//-------------------------------------------------------------------------------------------
        preparation.setDescription(description);
        preparation.setVfeWorkflowRollbackAdp(new VfeWorkflowRollbackAdp(Long.parseLong(rollBackId)));
        preparation.setDbId(new VfeLkDbAdp(Long.parseLong(dbId)));

        preparation.setParameterName(parameterName);
        preparation.setPreparationId(maxId);

        preparation.setPreparationOrder(Long.parseLong(preparationOrder));
        preparation.setQueryTimeout(Long.parseLong(queryTimeOut));

        preparation.setVfeLkErrorCodesAdp(new VfeLkErrorCodesAdp(Long.parseLong(errorCodeId)));
        preparation.setVfeLkPreparationTypesAdp(new VfeLkPreparationTypesAdp(Long.parseLong(preparationTypeId)));

        preparation.setVfePreparationModeAdp(new VfePreparationModeAdp(Byte.parseByte(preparationModeId)));

        //____________________________________________________________________________________________________________________________
        //  VfeWorkflowsAdp workflow = workFlowService.getWorkFlow(workFlowId, 1L);
        //  preparation.setVfeWorkflowStepsAdp(workflow.getVfeWorkflowStepsAdps().iterator().next());
        Set<VfeWorkflowStepsAdp> steps = workflow.getVfeWorkflowStepsAdps();

        for (VfeWorkflowStepsAdp step : steps) {
            if (step.getActivityId().getActivityId() == activityId) {
                preparation.setVfeWorkflowStepsAdp(step);
            }
        }

        //preparation.set
        try {
            logger.info("Response Flag of creating preparation with id " + maxId + "------->   " + preparationService.savePreparation(preparation));
            logger.info("creating preparation with id " + maxId + " created by  ------->   " + request.getSession().getAttribute("clientIp"));

            workflow = workFlowService.getWorkFlow(workflow.getId().getWorkflowId(), workflow.getId().getVersionId());
            //workflow.getVfeWorkflowStepsAdps().iterator().next().getVfeWorkflowPreparationAdps().add(preparation);
            request.getSession(false).setAttribute("workflow", workflow);
        } catch (Exception e) {
            logger.error("Error in creating preparation with Activity id " + activityId + " because " + e.getMessage());

        }

        return "redirect:/Activity/Get/" + activityId;

    }

    @GetMapping("/Delete/{preparationId}/{activityId}")
    public String deletePreparation(@PathVariable long preparationId, @PathVariable long activityId) {
        try {
            VfeWorkflowsAdp workflow = (VfeWorkflowsAdp) request.getSession(false).getAttribute("workflow");
            // VfeWorkflowPreparationAdp preparation = preparationService.getPreparation(preparationId);
            VfeWorkflowPreparationAdp preparation = new VfeWorkflowPreparationAdp(preparationId);
            logger.info("Response Flag of deleting Preparation  ------->   " + preparationService.deletePreparation(preparation));

            logger.info("deleting Preparation with id " + preparationId + " deleted by  ------->   " + request.getSession().getAttribute("clientIp"));

            workflow = workFlowService.getWorkFlow(workflow.getId().getWorkflowId(), workflow.getId().getVersionId());
            request.getSession(false).setAttribute("workflow", workflow);
        } catch (Exception e) {
            logger.error("Error in deleting preparation with id " + preparationId + " because " + e.getMessage());

        }
        return "redirect:/Activity/Get/" + activityId;

    }

}
