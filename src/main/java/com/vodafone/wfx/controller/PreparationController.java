/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vodafone.wfx.controller;

import com.vodafone.wfx.model.VfeLkBooleanAdp;
import com.vodafone.wfx.model.VfeLkPreparationTypesAdp;
import com.vodafone.wfx.model.VfeWorkflowPreparationAdp;
import com.vodafone.wfx.model.VfeWorkflowsAdp;
import com.vodafone.wfx.service.PreparationService;
import com.vodafone.wfx.service.WorkFlowService;
import com.vodafone.wfx.util.EditorUtil;
import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author V19MFoda
 */
@RestController
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
            logger.info("Preparation Description --------> " + preparation.getDescription());
        } catch (Exception e) {
            logger.error("Error in fetching preparation with id " + preparationId);
        }
    }

    @PostMapping("/Create/{workFlowId}")
    public void savePreparation(@PathVariable long workFlowId) {
        long maxId = EditorUtil.getMaxId("PREPARATION_ID", "VfeWorkflowPreparationAdp");
        logger.info("New Preparation ID ---------> " + maxId);
        VfeWorkflowPreparationAdp preparation = new VfeWorkflowPreparationAdp();

        Byte byteId = new Byte("-1");
        VfeLkBooleanAdp booleanAdb = new VfeLkBooleanAdp(byteId);
        booleanAdb.setBooleanId(byteId);

        preparation.setDescription("TestForWorkFlowEditor");
        preparation.setDoCommit(booleanAdb);
        preparation.setParameterName(null);
        preparation.setPreparationId(maxId);

        preparation.setPreparationOrder(1L);
        preparation.setQueryTimeout(null);
        preparation.setSaveToPool(booleanAdb);

        preparation.setVfeLkErrorCodesAdp(null);
        preparation.setVfeLkPreparationTypesAdp(new VfeLkPreparationTypesAdp(20L));
        VfeWorkflowsAdp workflow = workFlowService.getWorkFlow(workFlowId, 1L);
        preparation.setVfeWorkflowStepsAdp(workflow.getVfeWorkflowStepsAdps().iterator().next());

        try {
            logger.info("Response Flag of creating preparation ------->   " + preparationService.savePreparation(preparation));
        } catch (Exception e) {
            logger.error("Error in creating preparation with workflow id " + workFlowId);

        }

    }

    @DeleteMapping("/Delete/{preparationId}")
    public void deletePreparation(@PathVariable long preparationId) {
        try {
            VfeWorkflowPreparationAdp preparation = preparationService.getPreparation(preparationId);

            logger.info("Response Flag of deleting Preparation  ------->   " + preparationService.deletePreparation(preparation));
        } catch (Exception e) {
            logger.error("Error in deleting preparation with id " + preparationId);

        }

    }

}
