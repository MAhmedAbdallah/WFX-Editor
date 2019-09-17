/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vodafone.wfx.controller;

import com.vodafone.wfx.model.VfeActivitiesAdp;
import com.vodafone.wfx.model.VfeLkBooleanAdp;
import com.vodafone.wfx.model.VfePreparationConditionsAdp;
import com.vodafone.wfx.model.VfePreparationParametersAdp;
import com.vodafone.wfx.model.VfeWorkflowPreparationAdp;
import com.vodafone.wfx.model.VfeWorkflowStepsAdp;
import com.vodafone.wfx.model.VfeWorkflowStepsAdpId;
import com.vodafone.wfx.model.VfeWorkflowsAdp;
import com.vodafone.wfx.service.PreparationConditionService;
import com.vodafone.wfx.service.PreparationParameterService;
import com.vodafone.wfx.service.PreparationService;
import com.vodafone.wfx.service.StepService;
import com.vodafone.wfx.service.WorkFlowService;
import com.vodafone.wfx.util.EditorUtil;
import java.util.Enumeration;
import java.util.Iterator;
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
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author V19MFoda
 */
@Controller
@RequestMapping("Step")

public class StepController {

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private StepService stepService;
    @Autowired
    private WorkFlowService workFlowSerice;
    
    
    
    
    
    
    
    
        
      @Autowired
    private PreparationConditionService preparationConditionService;
      
       @Autowired
    private PreparationParameterService preparationParameterService;
       
        @Autowired
    private PreparationService preparationService;
        
    
    
    
    
    
    
    
    
    final Logger logger = Logger.getLogger(StepController.class);

    @GetMapping("/Get/{workFlowId}/{activityId}/{order}/{version}")
    public VfeWorkflowStepsAdp getStep(@PathVariable long order, @PathVariable long version, @PathVariable long workFlowId, @PathVariable long activityId) {
        VfeWorkflowStepsAdp step = null;
        try {
            VfeWorkflowStepsAdpId stepId = new VfeWorkflowStepsAdpId(workFlowId, activityId, order, version);
            step = stepService.getStep(stepId);
            logger.info("WorkFlow Name --------> " + step.getVfeWorkflowsAdp().getFlowName());
        } catch (Exception e) {
            logger.error("Error In fetching Step With Activity Id " + activityId);
        }
        return step;
    }

    @GetMapping("/Create")
    public String saveStep() {
        System.out.println("Test");

        long currentOrder = Long.parseLong(request.getSession().getAttribute("order").toString());
        long activityId = Long.parseLong(request.getSession().getAttribute("activityId").toString());

        VfeWorkflowsAdp workflow = (VfeWorkflowsAdp) request.getSession(false).getAttribute("workflow");

        VfeWorkflowStepsAdp step = getStep(currentOrder, workflow.getId().getVersionId(), workflow.getId().getWorkflowId(), activityId);// (VfeWorkflowStepsAdp) request.getSession().getAttribute("step");

        //  long activityId = (long) request.getSession().getAttribute("activityId");
        VfeActivitiesAdp activity = (VfeActivitiesAdp) request.getSession().getAttribute("activity");

//        Byte byteId = new Byte("-1");
//        VfeLkBooleanAdp booleanAdb = new VfeLkBooleanAdp(byteId);
//        booleanAdb.setBooleanId(byteId);
        //  VfeWorkflowStepsAdp step = new VfeWorkflowStepsAdp();
        //   step.setActivityId(activity);
        //step.setId(step.getId().setActivityId(activity.getActivityId()));
//        step.setActivityLoopId(null);
//        step.setAppendToInput(null);
//        step.setAppendToOutput(null);
//        step.setDescription("TestForWorkFlowEditor");
//        step.setDoCommit(booleanAdb);
//        step.setIgnoreErrors(booleanAdb);
//        step.setOnExit(booleanAdb);
//        step.setOutputFlag(booleanAdb);
//        step.setRepeatListName(null);
//        step.setSubOrder(null);
//        step.setTakeSnapshot(booleanAdb);
//        step.setVfeWorkflowsAdp(workFlow);
        //   step.setId(stepId);
        Object test = request.getSession().getAttribute("newActivityId");
        long newActivityId = Long.parseLong(test.toString());
        //   long newActivityId = Long.parseLong(request.getSession().getAttribute("newActivityId").toString());
        VfeWorkflowStepsAdpId stepId = new VfeWorkflowStepsAdpId(workflow.getId().getWorkflowId(), newActivityId, currentOrder, workflow.getId().getVersionId());
        step.setId(stepId);
        try {
            logger.info("Response Flag of saving step  ------->   " + stepService.saveStep(step));
            logger.info("Activity with Id " + newActivityId + " Created by  ------->   " +request.getSession().getAttribute("clientIp"));
            

        } catch (Exception e) {
            logger.error("Error In Creating Step In Workflow  " + workflow.getId().getWorkflowId());
        }
        return "redirect:/WorkFlow/Get/" + workflow.getId().getWorkflowId();
    }

    @GetMapping("/Delete/{workFlowId}/{activityId}/{order}/{version}")
    public String deleteWorkFlow(@PathVariable long order, @PathVariable long version, @PathVariable long workFlowId, @PathVariable long activityId) {
        try {
            VfeWorkflowStepsAdpId stepId = new VfeWorkflowStepsAdpId(workFlowId, activityId, order, version);
            VfeWorkflowStepsAdp step = stepService.getStep(stepId);
            
            
            
            
//                  VfeWorkflowsAdp workflow = (VfeWorkflowsAdp) request.getSession(false).getAttribute("workflow");
//
//            Set<VfeWorkflowStepsAdp> steps = workflow.getVfeWorkflowStepsAdps();
//
//            for (VfeWorkflowStepsAdp step : steps) {
//                if (step.getActivityId().getActivityId() == activityId) {
                   for(VfeWorkflowPreparationAdp preparation:step.getVfeWorkflowPreparationAdps()){
                      for(VfePreparationConditionsAdp preparationCondition : preparation.getVfePreparationConditionsAdps()){
                          preparationConditionService.deletePreparationCondition(preparationCondition);
                          
                      }
                      for(VfePreparationParametersAdp preparationParameter : preparation.getVfePreparationParametersAdps()){
                          preparationParameterService.deletePreparationParameter(preparationParameter);
                          
                      }
                      preparationService.deletePreparation(preparation);
                      
                   } 

                
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            logger.info("Response Flag of deleteing step ------->   " + stepService.deleteStep(step));

            logger.info("Activity with Id " + activityId + " Deleted by  ------->   " +  request.getSession().getAttribute("clientIp"));
          
               

            
        }catch (Exception e) {
            logger.error("Error In Deleting Step with activity id  " + activityId);
        }
            return "redirect:/WorkFlow/Get/" + workFlowId;

        }

    }
