/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vodafone.wfx.controller;

import com.vodafone.wfx.model.VfeConditionsAdp;
import com.vodafone.wfx.model.VfeLkConditionTypesAdp;
import com.vodafone.wfx.model.VfeLkErrorCodesAdp;
import com.vodafone.wfx.model.VfeLkRelationTypesAdp;
import com.vodafone.wfx.model.VfeWorkflowConditionsAdp;
import com.vodafone.wfx.model.VfeWorkflowConditionsAdpId;
import com.vodafone.wfx.model.VfeWorkflowPreparationAdp;
import com.vodafone.wfx.model.VfeWorkflowStepsAdp;
import com.vodafone.wfx.model.VfeWorkflowsAdp;
import com.vodafone.wfx.service.ConditionService;
import com.vodafone.wfx.util.EditorUtil;
import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author V19MFoda
 */
@Controller
@RequestMapping("Condition")
public class ConditionController {

    @Autowired
    private HttpServletRequest request;
    @Autowired
    private ConditionService conditionService;
    @Autowired
    private WorkFlowController wfController;
    @Autowired
    private StepController step;

    final Logger logger = Logger.getLogger(ConditionController.class);

    @GetMapping("/Get/{conditionId}")
    public VfeConditionsAdp getCondition(@PathVariable long conditionId) {
        VfeConditionsAdp condition = null;

        try {
            condition = conditionService.getCondition(conditionId);
            //  logger.info("Condition Parameter Name --------> " + condition.getParameterName());

        } catch (Exception e) {
            logger.error("Error in fetching condition with id --------> " + conditionId);
            logger.error("Error in fetching Condition with id " + conditionId + " because  --------> " + e.getMessage());

        }
        return condition;
    }

    @PostMapping("/Create")
    public String saveCondition() {
        long maxId = EditorUtil.getMaxId("CONDITION_ID", "VfeConditionsAdp");
        logger.info("New Condition ID ---------> " + maxId);
        VfeConditionsAdp condition = new VfeConditionsAdp();

        condition.setConditionId(maxId);

        String parameterName = request.getParameter("parameterName");
        String otherParameterName = request.getParameter("otherParameterName");
        String conditionValue = request.getParameter("conditionValue");
        Long conditionType = Long.parseLong(request.getParameter("conditionType"));

        condition.setVfeLkConditionTypesAdp(new VfeLkConditionTypesAdp(conditionType));

        condition.setConditionValue(conditionValue);
        condition.setOtherParameterName(otherParameterName);
        condition.setParameterName(parameterName);

//        ____________________VFE_WORKFLOW_CONDITION___________________________________
        String x = request.getParameter("currentOrder");
        Long currentOrder = Long.parseLong(request.getParameter("currentOrder"));

        Long activityId = Long.parseLong(request.getParameter("activityId"));
        Long version = Long.parseLong(request.getParameter("version"));
        VfeWorkflowsAdp workFlow = (VfeWorkflowsAdp) request.getSession(false).getAttribute("workflow");

        VfeWorkflowConditionsAdpId workFlowConditionId = new VfeWorkflowConditionsAdpId(maxId, version, workFlow.getId().getWorkflowId(), currentOrder);
        VfeWorkflowConditionsAdp workFlowCondition = new VfeWorkflowConditionsAdp(workFlowConditionId);
        Long relationType = 1L;//Long.parseLong(request.getParameter("relationType"));
        workFlowCondition.setVfeLkRelationTypesAdp(new VfeLkRelationTypesAdp(relationType));
        Long conditionOrder = Long.parseLong(request.getParameter("conditionOrder"));
        workFlowCondition.setConditionOrder(conditionOrder);
        Long errorCode = Long.parseLong(request.getParameter("errorCode"));
        workFlowCondition.setVfeLkErrorCodesAdp(new VfeLkErrorCodesAdp(errorCode));

        Long preparationId = Long.parseLong(request.getParameter("preparationId"));
        workFlowCondition.setVfeWorkflowPreparationAdp(new VfeWorkflowPreparationAdp(preparationId));
        VfeWorkflowStepsAdp workflowStep = new VfeWorkflowStepsAdp();
        workflowStep = step.getStep(currentOrder, version, workFlow.getId().getWorkflowId(), activityId);

        workFlowCondition.setVfeWorkflowStepsAdp(workflowStep);

        String description = request.getParameter("description");
        workFlowCondition.setDescription(description);

        Long pathId = Long.parseLong(request.getParameter("pathId"));
        workFlowCondition.setPathId(pathId);

        Long negateActivityId = Long.parseLong(request.getParameter("negateActivityId"));
        workFlowCondition.setNegateActivityId(negateActivityId);
        Long negatePathId = Long.parseLong(request.getParameter("negatePathId"));
        workFlowCondition.setNegateActivityId(negatePathId);
        workFlowCondition.setActivityId(activityId);
        try {
            logger.info("Response Flag of creating condition ------->   " + conditionService.saveCondition(condition, workFlowCondition));
            //   logger.info("Created Conidtion with Id " + maxId + " By ------->   " +      EditorUtil.getClientName(request));
            logger.info("Created Conidtion with Id " + maxId + " By ------->   " + request.getSession().getAttribute("clientIp"));

        } catch (Exception e) {
            logger.error("Error in creating Condition with id " + maxId);
            logger.error("Error in creating Condition with id " + maxId + " because  --------> " + e.getMessage());

        }
        return "redirect:/WorkFlow/Get/" + workFlow.getId().getWorkflowId();
    }

    @GetMapping("/Delete/{conditionId}/{workFlowId}/{currentOrder}/{versionId}")
    public String deleteCondition(@PathVariable long conditionId, @PathVariable long workFlowId, @PathVariable long currentOrder, @PathVariable long versionId) {
        try {
            // VfeConditionsAdp condition = conditionService.getCondition(conditionId);

            VfeWorkflowConditionsAdpId workFlowConditionId = new VfeWorkflowConditionsAdpId(conditionId, versionId, workFlowId, currentOrder);

            logger.info("Response Flag of deleting condition ------->   " + conditionService.deleteCondition(workFlowConditionId));
            logger.info("Condition with Id " + conditionId + " Deleted by  ------->   " + request.getSession().getAttribute("clientIp"));
        } catch (Exception e) {
            logger.error("Error in deleting Condition with id " + conditionId);
            logger.error("Error in Deleting Condition with id " + conditionId + " because  --------> " + e.getMessage());

        }
        VfeWorkflowsAdp workflows = (VfeWorkflowsAdp) request.getSession(false).getAttribute("workflow");
        // return "WorkFlow/Get/"+workflows.getId().getWorkflowId();
//        wfController.getWorkFlow(workflows.getId().getWorkflowId().longValue());
        return "redirect:/WorkFlow/Get/" + workFlowId;
    }

}
