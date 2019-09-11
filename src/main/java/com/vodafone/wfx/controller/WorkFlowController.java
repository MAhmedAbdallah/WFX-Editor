/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vodafone.wfx.controller;

import com.vodafone.wfx.model.VfeLkBooleanAdp;
import com.vodafone.wfx.model.VfePreparationParametersAdp;
import com.vodafone.wfx.model.VfeWorkflowConditionsAdp;
import com.vodafone.wfx.model.VfeWorkflowInputAdp;
import com.vodafone.wfx.model.VfeWorkflowPreparationAdp;
import com.vodafone.wfx.model.VfeWorkflowStepsAdp;
import com.vodafone.wfx.model.VfeWorkflowsAdp;
import com.vodafone.wfx.model.VfeWorkflowsAdpId;
import com.vodafone.wfx.service.WorkFlowService;
import com.vodafone.wfx.util.EditorUtil;
import java.awt.PageAttributes;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author V19MFoda
 */
@Controller
@RequestMapping("WorkFlow")

public class WorkFlowController {

    @Autowired
    private HttpServletRequest request;
    @Autowired
    private WorkFlowService workFlowService;

    final Logger logger = Logger.getLogger(WorkFlowController.class);

    //@GetMapping( "/Get/{workFlowId}/{workFlowVersion}" )
    @GetMapping("/Get/{workFlowId}")

    // @ResponseBody
    public  String getWorkFlow(@PathVariable long workFlowId) {
        VfeWorkflowsAdp workFlow = null;
//        logger.info(
//                "\n------------------------------------------------------------------------------------------------------------------------------------------------------");
//        

        try {
            long workFlowVersion = EditorUtil.getCurrentVersion(workFlowId);

            workFlow = workFlowService.getWorkFlow(workFlowId, workFlowVersion); //(VfeWorkflowsAdp) session.get(VfeWorkflowsAdp.class, id);
                     
            HttpSession session = request.getSession(true);
            session.setMaxInactiveInterval(3600);
            session.setAttribute("workflow", workFlow);
            //Obey on hands
           
//          
//            long prepID=workFlow.getVfeWorkflowStepsAdps().iterator().next().getVfeWorkflowPreparationAdps().iterator().next().getPreparationId();
//            long stepID=workFlow.getVfeWorkflowStepsAdps().iterator().next().getId().getCurrentOrder();
//            
//           workFlow.getVfeWorkflowStepsAdps().iterator().next().getVfeWorkflowPreparationAdps().iterator().next()
//                   .getVfePreparationConditionsAdps().iterator().next().getVfeConditionsAdp()
            

//            
//             
//             
//             
//             
//             
//            logger.info(workFlow.getFlowName());
//            for (VfeWorkflowInputAdp input : workFlow.getVfeWorkflowInputAdps()) {
//                logger.info("WorkFlow Inout Parameter Type ------> " + input.getParameterType());
//            }
//
//            for (VfeWorkflowStepsAdp step : workFlow.getVfeWorkflowStepsAdps()) {
//                logger.info(("Activity ID " + step.getId().getActivityId()));
//                logger.info(("Activity Description ------> " + step.getActivityId().getDescription()));
//                for (VfeWorkflowConditionsAdp condition : step.getVfeWorkflowConditionsAdps()) {
//                    logger.info("Condition Order ------> " + condition.getConditionOrder());
//                }
//                for (VfeWorkflowPreparationAdp preparation : step.getVfeWorkflowPreparationAdps()) {
//                    logger.info("Preparation Type ------> " + preparation.getVfeLkPreparationTypesAdp());
//
//                    for (VfePreparationParametersAdp preparationParameter : preparation.getVfePreparationParametersAdps()) {
//                        logger.info("Preparation Parameter Name ------> " + preparation.getParameterName());
//
//                    }
//
//                }
//                logger.info(
//                        "\n-----------------------------------------------Step Ended-------------------------------------------------------------------------------------------------------");
//
//            }
        } catch (Exception e) {

            logger.error("Error In fetching Workflow With Id " + workFlowId);
            e.printStackTrace();
        }

        return "workflow";
    }

    @PostMapping("/Create")
    public void saveWorkFlow() {

        VfeWorkflowsAdp workFlow = new VfeWorkflowsAdp();
        long maxId = EditorUtil.getMaxId("WORKFLOW_ID", "VfeWorkflowsAdp");
        VfeWorkflowsAdpId id = new VfeWorkflowsAdpId(maxId, 1L);
        logger.info("New WorkFlow ID ---------> " + maxId);
        //initiating VFEBooleanAdb and set it's ID
        Byte byteId = new Byte("-1");
        VfeLkBooleanAdp booleanAdb = new VfeLkBooleanAdp(byteId);
        booleanAdb.setBooleanId(byteId);

        workFlow.setActionType("Read");
        workFlow.setEligibleToCreate(booleanAdb);
        workFlow.setDoCommit(booleanAdb);
        workFlow.setFlowName("TestForWorkFlowEditor");
        workFlow.setId(id);

        workFlow.setListenerName(null);
        workFlow.setMapOutputToXml(booleanAdb);
        workFlow.setOperationName(null);
        workFlow.setOutputClassName(null);
        workFlow.setReturnAllOutputs(booleanAdb);
        workFlow.setXmlTemplate(null);
        workFlow.setXmlParamName(null);

//         
//         VfeWorkflowVersionsAdp workFlowVersion = new VfeWorkflowVersionsAdp();
//         workFlowVersion.set
//         workFlow.setVfeWorkflowVersionsAdp(vfeWorkflowVersionsAdp);
        // workFlow.setVfeCmsLoadingExceptionsAdp();
        //   workFlow.setVfeWorkflowDetailOutputAdps(vfeWorkflowDetailOutputAdps);
        //  workFlow.setVfeWorkflowInputAdps(vfeWorkflowInputAdps);
        //     workFlow.setVfeWorkflowLogAdp(vfeWorkflowLogAdp);
        try {
            logger.info("Response Flag of Creating New Workflow ------->   " + workFlowService.saveWorkFlow(workFlow));
        } catch (Exception e) {
            logger.error("Error In Creating Workflow With Name " + workFlow.getFlowName());
        }

    }

    @DeleteMapping("/Delete/{workFlowId}/{workFlowVersion}")
    public void deleteWorkFlow(@PathVariable long workFlowId, @PathVariable long workFlowVersion) {
        try {
            VfeWorkflowsAdp workFlow = workFlowService.getWorkFlow(workFlowId, workFlowVersion);

            logger.info("Response Flag of Deleting Workflow ------->   " + workFlowService.deleteWorkFlow(workFlow));
        } catch (Exception e) {
            logger.error("Error In Deleting Workflow With Id " + workFlowId);
        }

    }
    
    
    

    @GetMapping("/test")
    public String getMaxId() {
            System.out.println( request.getAttribute("TEST"));
            
            EditorUtil.getActivityType();
            
        return "activity";
    }

}
