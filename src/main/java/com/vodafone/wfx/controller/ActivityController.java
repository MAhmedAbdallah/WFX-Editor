/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vodafone.wfx.controller;

import com.vodafone.wfx.model.VfeActivitiesAdp;
import com.vodafone.wfx.model.VfeHttpSystemsAdp;
import com.vodafone.wfx.model.VfeLkActivitiesTypeAdp;
import com.vodafone.wfx.model.VfeLkBooleanAdp;
import com.vodafone.wfx.model.VfeLkDbAdp;
import com.vodafone.wfx.model.VfeLkHttpRequestTypeAdp;
import com.vodafone.wfx.model.VfeLkSshServersAdp;
import com.vodafone.wfx.model.VfeLkStoredProceduresAdp;
import com.vodafone.wfx.model.VfePreparationConditionsAdp;
import com.vodafone.wfx.model.VfePreparationParametersAdp;
import com.vodafone.wfx.model.VfeWebServiceSettings;
import com.vodafone.wfx.model.VfeWorkflowPreparationAdp;
import com.vodafone.wfx.model.VfeWorkflowStepsAdp;
import com.vodafone.wfx.model.VfeWorkflowsAdp;
import com.vodafone.wfx.service.ActivityService;
import com.vodafone.wfx.service.PreparationConditionService;
import com.vodafone.wfx.service.PreparationParameterService;
import com.vodafone.wfx.service.PreparationService;
import com.vodafone.wfx.service.WorkFlowService;
import com.vodafone.wfx.util.EditorUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author V19MFoda
 */
@Controller
@RequestMapping("Activity")
public class ActivityController {

    @Autowired
    private HttpServletRequest request;
//    @Autowired
//    private HttpServletResponse response;

    @Autowired
    private ActivityService activityService;

    @Autowired
    private PreparationConditionService preparationConditionService;

    @Autowired
    private PreparationParameterService preparationParameterService;

    @Autowired
    private PreparationService preparationService;

    @Autowired
    private WorkFlowService workFlowService;
    final Logger logger = Logger.getLogger(ActivityController.class);

    @GetMapping("/Get/{activityId}")
    public String getActivity(@PathVariable long activityId) {
        request.setAttribute("activityId", activityId);
        VfeActivitiesAdp activity = null;
        try {
            activity = activityService.getActivity(activityId);
            List<VfeWorkflowPreparationAdp> activityPreparations = new ArrayList<>();  //activityService.getActivityPrepartions(activityId);
            //Test get Preparation without hitting DB

            VfeWorkflowsAdp workflow = (VfeWorkflowsAdp) request.getSession(false).getAttribute("workflow");
            Set<VfeWorkflowStepsAdp> steps = workflow.getVfeWorkflowStepsAdps();

            for (VfeWorkflowStepsAdp step : steps) {

                for (VfeWorkflowPreparationAdp preparation : step.getVfeWorkflowPreparationAdps()) {

                    if (preparation.getActivityId() == activityId) {
                        activityPreparations.add(preparation);
                    }
                    //  request.getSession().setAttribute("stepOrder",step.getId().getCurrentOrder());

                }

                //  logger.info("WorkFlow Name --------> " + activity.getWorkflowName());
                request.setAttribute("requestedActivity", activity);
                request.setAttribute("requestedActivityPreparations", activityPreparations);

                request.getSession().setAttribute("requestedActivityPreparations", activityPreparations);
            }

        } catch (Exception e) {
//            logger.error("Error in fetching Activity with id  --------> " + activityId);
//            logger.error("Error in fetching beacause  --------> " + e.getMessage());
        }
        return "activity";
    }

    @PostMapping("/Create")
    public String saveActivity() {

        long currentOrder = Long.parseLong(request.getParameter("currentOrder"));
        long activityId = Long.parseLong(request.getParameter("activityId"));

        request.getSession().setAttribute("order", currentOrder);
        request.getSession().setAttribute("activityId", activityId);

        Byte byteId = null;//new Byte("-1");
        // VfeLkBooleanAdp booleanAdb = new VfeLkBooleanAdp(byteId);
        // booleanAdb.setBooleanId(byteId);
        //  VfeWorkflowsAdp workFlow = (VfeWorkflowsAdp) request.getSession().getAttribute("workflow");//workFlowService.getWorkFlow(workFlowId, 1L);

        //Get Workflow Object
        VfeWorkflowsAdp workFlow = (VfeWorkflowsAdp) request.getSession(false).getAttribute("workflow");

        //Intializing a new Activity to be inserted in the DB
        VfeActivitiesAdp activity = new VfeActivitiesAdp();

        //Getting Parameters From Request(HTML FORM)
        String activityDescription = request.getParameter("activityDescription");
        String activityDBQuery = request.getParameter("activityDBQuery");
        String activityCMSFunction = request.getParameter("activityCMSFunction");
        String activityTypeForm = request.getParameter("activityType");
        String activityStoredProcedure = request.getParameter("activityStoredProcedure");
        String activityHTTPURL = request.getParameter("activityHTTPURL");
        String activitySystemID = request.getParameter("activitySystemID");
        String activitySleepTime = request.getParameter("activitySleepTime");
        String activityDoCache = request.getParameter("activityDoCache");
        String activityHttpRequestType = request.getParameter("httpRequestType");
        String activityInterfaceName = request.getParameter("activityInterfaceName");
        String activityOperationName = request.getParameter("activityOperationName");
        String activityHttpXmlInput = request.getParameter("activityHttpXmlInput");
        String activityInputName = request.getParameter("activityInputName");
        String activityDBID = request.getParameter("activityDBID");
        String activityQueryTimeOut = request.getParameter("activityQueryTimeOut");
        String activityWebServiceID = request.getParameter("activityWebServiceID");
        String activityInputCommand = request.getParameter("activityInputCommand");
        String activityCommandOutputSeparatior = request.getParameter("activityCommandOutputSeparatior");
        String activitySuccessCodes = request.getParameter("activitySuccessCodes");
        String activitySSHServerID = request.getParameter("activitySSHServerID");

        //Handling null value from input
        if (activityDescription == null || activityDescription.length() == 0) {
            activity.setDescription(null);
        } else {
            activity.setDescription(activityDescription);
        }

        if (activityDBQuery == null || activityDBQuery.length() == 0) {
            activity.setDbQuery(null);
        } else {
            activity.setDbQuery(activityDBQuery);
        }

        if (activityCMSFunction == null || activityCMSFunction.length() == 0) {
            activity.setCmsFunction(null);
        } else {
            activity.setCmsFunction(activityCMSFunction);
        }

        if (activityTypeForm== null || activityTypeForm.length() == 0  ) {
            activity.setVfeLkActivitiesTypeAdp(null);
        } else {
            activity.setVfeLkActivitiesTypeAdp(new VfeLkActivitiesTypeAdp(Long.parseLong(activityTypeForm)));
        }

        if (activityStoredProcedure == null || activityStoredProcedure.length() == 0) {
            activity.setVfeLkStoredProceduresAdp(null);
        } else {
            activity.setVfeLkStoredProceduresAdp(new VfeLkStoredProceduresAdp(Long.parseLong(activityStoredProcedure)));
        }

        if (activityDBQuery == null || activityDBQuery.length() == 0) {
            activity.setHttpUrl(null);
        } else {
            activity.setHttpUrl(activityHTTPURL);
        }

        if (activitySystemID .equalsIgnoreCase("null")) {
            activity.setSystemId(null);
        } else {
            activity.setSystemId(new VfeHttpSystemsAdp(Long.parseLong(activitySystemID)));
        }

        if (activitySleepTime == null || activitySleepTime.length() == 0) {
            activity.setSleepTime(null);
        } else {
            activity.setSleepTime(Long.parseLong(activitySleepTime));
        }
        if (activityDoCache == null || activityDoCache.length() == 0) {
            activity.setDoCache(null);
        } else {
            activity.setDoCache(new VfeLkBooleanAdp(new Byte(activityDoCache)));
        }

        if (activityHttpRequestType == null || activityHttpRequestType.length() == 0) {
            activity.setVfeLkHttpRequestTypeAdp(null);
        } else {
            activity.setVfeLkHttpRequestTypeAdp(new VfeLkHttpRequestTypeAdp(new Byte(activityHttpRequestType)));
        }

        if (activityInterfaceName == null || activityInterfaceName.length() == 0) {
            activity.setInterfaceName(null);
        } else {
            activity.setInterfaceName(activityInterfaceName);
        }

        if (activityOperationName == null || activityOperationName.length() == 0) {
            activity.setOperationName(null);
        } else {
            activity.setOperationName(activityOperationName);
        }

        if (activityHttpXmlInput == null || activityHttpXmlInput.length() == 0) {
            activity.setHttpXmlInput(null);
        } else {
            activity.setHttpXmlInput(activityHttpXmlInput);
        }

        if (activityInputName == null || activityInputName.length() == 0) {
            activity.setInputName(null);
        } else {
            activity.setInputName(activityInputName);
        }

        if (activityDBID .equalsIgnoreCase("null")) {
            activity.setVfeLkDbAdp(null);
        } else {
            activity.setVfeLkDbAdp(new VfeLkDbAdp(Long.parseLong(activityDBID)));
        }

        if (activityQueryTimeOut == null || activityQueryTimeOut.length() == 0) {
            activity.setQueryTimeout(null);
        } else {
            activity.setQueryTimeout(Long.parseLong(activityQueryTimeOut));
        }

        if (activityWebServiceID == null || activityWebServiceID.length() == 0) {
            activity.setVfeWebServiceSettings(null);
        } else {
            activity.setVfeWebServiceSettings(new VfeWebServiceSettings(Long.parseLong(activityWebServiceID)));
        }

        if (activityInputCommand == null || activityInputCommand.length() == 0) {
            activity.setInputCommand(null);
        } else {
            activity.setInputCommand(activityInputCommand);
        }

        if (activityCommandOutputSeparatior == null || activityCommandOutputSeparatior.length() == 0) {
            activity.setCommandOutputSeparator(null);
        } else {
            activity.setCommandOutputSeparator(activityCommandOutputSeparatior);
        }

        if (activitySuccessCodes == null || activitySuccessCodes.length() == 0) {
            activity.setSuccessCodes(null);
        } else {
            activity.setSuccessCodes(activitySuccessCodes);
        }

        if (activitySSHServerID == null || activitySSHServerID.length() == 0) {
            activity.setVfeLkSshServersAdp(null);
        } else {
            activity.setVfeLkSshServersAdp(new VfeLkSshServersAdp(Long.parseLong(activitySSHServerID)));
        }

        activity.setWorkflowName(workFlow.getFlowName());

        //Get Max ID of Activties from the DB
        long maxId = EditorUtil.getMaxId("ACTIVITY_ID", "VfeActivitiesAdp");
        request.getSession().setAttribute("newActivityId", maxId);

        logger.info("New Activity ID ---------> " + maxId);

        //Setting the ID for the new Created Activity
        activity.setActivityId(maxId);

        try {
            logger.info("Response Flag of Creating activity ------->   " + activityService.saveActivity(activity));
            request.getSession().setAttribute("activity", activity);
            logger.info("Created Activity with Id " + maxId + " By ------->   " + request.getSession().getAttribute("clientIp"));

            //response.sendRedirect("/Step/Create");
            // request.getRequestDispatcher("/Step/Create").forward(request, response);
        } catch (Exception e) {
            logger.error("Error in creating Activity with id  --------> " + maxId);
            logger.error("Error in creating because  --------> " + e.getMessage());
        }
        return "redirect:/Step/Create";
    }

    @GetMapping("/Delete/{activityId}")
    public void deleteActivity(@PathVariable long activityId) {
        try {
//            VfeWorkflowsAdp workflow = (VfeWorkflowsAdp) request.getSession(false).getAttribute("workflow");
//
//            Set<VfeWorkflowStepsAdp> steps = workflow.getVfeWorkflowStepsAdps();
//
//            for (VfeWorkflowStepsAdp step : steps) {
//                if (step.getActivityId().getActivityId() == activityId) {
//                   for(VfeWorkflowPreparationAdp preparation:step.getVfeWorkflowPreparationAdps()){
//                      for(VfePreparationConditionsAdp preparationCondition : preparation.getVfePreparationConditionsAdps()){
//                          preparationConditionService.deletePreparationCondition(preparationCondition);
//                          
//                      }
//                      for(VfePreparationParametersAdp preparationParameter : preparation.getVfePreparationParametersAdps()){
//                          preparationParameterService.deletePreparationParameter(preparationParameter);
//                          
//                      }
//                      preparationService.deletePreparation(preparation);
//                      
//                   } 
//
//                }
//            }
//after this line delete activity working
            VfeActivitiesAdp activity = activityService.getActivity(activityId);
            logger.info("Response Flag of deleting activity ------->   " + activityService.deleteActivity(activity));
            logger.info("Deleted Activity with Id " + activityId + " By ------->   " + request.getSession().getAttribute("clientIp"));

        } catch (Exception e) {
            logger.error("Error in Deleting Activity with id " + activityId + " because  --------> " + e.getMessage());

        }
    }

}
