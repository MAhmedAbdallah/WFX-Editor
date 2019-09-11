/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vodafone.wfx.controller;

import com.vodafone.wfx.model.VfeConditionsAdp;
import com.vodafone.wfx.model.VfePreparationConditionsAdp;
import com.vodafone.wfx.model.VfePreparationConditionsAdpId;
import com.vodafone.wfx.model.VfeWorkflowConditionsAdp;
import com.vodafone.wfx.model.VfeWorkflowPreparationAdp;
import com.vodafone.wfx.service.ConditionService;
import com.vodafone.wfx.service.PreparationConditionService;
import com.vodafone.wfx.service.PreparationService;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author V19MFoda
 */
@Controller
@RequestMapping("PreparationCondition")
public class PreparationConditionController {
       @Autowired
    private HttpServletRequest request;

    @Autowired
    private PreparationConditionService preparationConditionservice;

    @Autowired
    private PreparationService preparationService;

    @Autowired
    private ConditionService conditionService;

    final Logger logger = Logger.getLogger(PreparationConditionController.class);

    @GetMapping("/Get/{preparationId}/{conditionId}")

    public void getPreparationCondition(@PathVariable long preparationId, @PathVariable long conditionId) {
        try {
            VfePreparationConditionsAdpId preparationConditionId = new VfePreparationConditionsAdpId(preparationId, conditionId);
            VfePreparationConditionsAdp preparationCondition = preparationConditionservice.getPreparationCondition(preparationConditionId);
            logger.info("Preparation Parameter Value --------> " + preparationCondition.getRelationTypeId());
        } catch (Exception e) {
            logger.error("Error in fetching Preparation Condition with preparation id " + preparationId);
        }

    }

    @PostMapping("/Create/{preparationId}/{conditionId}")
    public void savePreparationParameter(@PathVariable long preparationId, @PathVariable long conditionId) {

        VfeWorkflowPreparationAdp preparation = preparationService.getPreparation(preparationId);
        VfeConditionsAdp condition = conditionService.getCondition(conditionId);

        VfePreparationConditionsAdp preparationCondition = new VfePreparationConditionsAdp();
        VfePreparationConditionsAdpId preparationConditionId = new VfePreparationConditionsAdpId(preparation.getPreparationId(), condition.getConditionId());

        preparationCondition.setConditionOrder(1L);
        preparationCondition.setDescription("TestForWorkFlowEditor");
        preparationCondition.setId(preparationConditionId);
        preparationCondition.setRelationTypeId(1L);
        preparationCondition.setVfeConditionsAdp(condition);
        preparationCondition.setVfeWorkflowPreparationAdp(preparation);

        try {
            logger.info("Response Flag of creating preparation condition ------->   " + preparationConditionservice.savePreparationCondition(preparationCondition));
        } catch (Exception e) {
            logger.error("Error in Creating Preparation Condition with preparation id " + preparationId);
        }

    }

    @DeleteMapping("/Delete/{preparationId}/{conditionId}")
    public void deletePreparationCondition(@PathVariable long preparationId, @PathVariable long conditionId) {
        try {
            VfePreparationConditionsAdpId preparationConditionId = new VfePreparationConditionsAdpId(preparationId, conditionId);
            VfePreparationConditionsAdp preparationCondition = preparationConditionservice.getPreparationCondition(preparationConditionId);
            logger.info("Preparation Parameter Value --------> " + preparationConditionservice.deletePreparationCondition(preparationCondition));
        } catch (Exception e) {
            logger.error("Error in deleting Preparation Condition with preparation id " + preparationId);

        }
    }
    
    
    
    
    
    @GetMapping("/Get/{conditionId}")
    public String getPreparationCondition(@PathVariable long conditionId){
        
        List<VfePreparationConditionsAdp> preparationsCondition = new ArrayList<>();
         try {
           preparationsCondition= preparationConditionservice.getPreparationCondition(conditionId);
           request.getSession().setAttribute("preparationsCondition", preparationsCondition);
        } catch (Exception e) {
            logger.error("Error in fetching Preparation Condition with condition id " + conditionId);
        }
        return "preparationscondition";
    }
    
    
    
    
    
    
    
    
    
    
    
        @GetMapping("/Get/Conditions/{preparationId}")
    public String getConditionPreparation(@PathVariable long preparationId){
        
        request.getSession().setAttribute("preparationId", preparationId);
            //System.out.println("Obeyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy    "+preparationId);
        
        
         List<VfePreparationConditionsAdp> preparationsCondition = new ArrayList<>();
         
         
     List<VfeWorkflowPreparationAdp> activityPreparations =   (List<VfeWorkflowPreparationAdp>) request.getSession().getAttribute("requestedActivityPreparations");
     for(VfeWorkflowPreparationAdp prep : activityPreparations){
         if(prep.getPreparationId() == preparationId){
             preparationsCondition.addAll( prep.getVfePreparationConditionsAdps());
         }
     }
        
       
         try {
          // preparationsCondition= preparationConditionservice.getConditionPreparation(preparationId);
           request.getSession().setAttribute("preparationsCondition", preparationsCondition);
        } catch (Exception e) {
            logger.error("Error in fetching Preparation Condition with Preparation id " + preparationId);
        }
        return "preparationscondition";
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
