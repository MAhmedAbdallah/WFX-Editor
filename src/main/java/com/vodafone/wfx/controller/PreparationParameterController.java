/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vodafone.wfx.controller;

import com.vodafone.wfx.model.VfePreparationParametersAdp;
import com.vodafone.wfx.model.VfePreparationParametersAdpId;
import com.vodafone.wfx.model.VfeWorkflowPreparationAdp;
import com.vodafone.wfx.service.PreparationParameterService;
import com.vodafone.wfx.service.PreparationService;
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
@RequestMapping("PreparationParameter")
public class PreparationParameterController {
       @Autowired
    private HttpServletRequest request;

    @Autowired
    private PreparationParameterService preparationParameterService;

    @Autowired
    private PreparationService preparationService;

    final Logger logger = Logger.getLogger(PreparationParameterController.class);

    @GetMapping("/Get/{preparationId}/{preparationParameterName}")
    public void getPreparationParameter(@PathVariable long preparationId, @PathVariable String preparationParameterName) {
        try {
            VfePreparationParametersAdpId preparationParameterId = new VfePreparationParametersAdpId(preparationId, preparationParameterName);
            VfePreparationParametersAdp preparationParameter = preparationParameterService.getPreparationParameter(preparationParameterId);
            logger.info("Preparation Parameter Value --------> " + preparationParameter.getVfeWorkflowPreparationAdp().getDescription());
        } catch (Exception e) {
            logger.error("Error in fetchiing Preparation Parameter with preparation id " + preparationId);
        }
    }

    @PostMapping("/Create/{preparationId}")
    public void savePreparationParameter(@PathVariable long preparationId) {

        VfePreparationParametersAdp preparationParameter = new VfePreparationParametersAdp();
        VfePreparationParametersAdpId preparationParameterId = new VfePreparationParametersAdpId();
        VfeWorkflowPreparationAdp preparation = preparationService.getPreparation(preparationId);
        preparationParameterId.setPreparationId(preparation.getPreparationId());
        preparationParameterId.setParameterName("DATABASE_QUERY");

        preparationParameter.setId(preparationParameterId);
        preparationParameter.setParameterValue(null);
        preparationParameter.setVfeWorkflowPreparationAdp(preparation);

        try {
            logger.info("Response Flag of creating preparation parameter ------->   " + preparationParameterService.savePreparationParameter(preparationParameter));
        } catch (Exception e) {
            logger.error("Error in fetchiing Preparation Parameter with preparation id " + preparation.getPreparationId());

        }

    }

    @DeleteMapping("/Delete/{preparationId}/{preparationParameterName}")
    public void deleteWorkFlow(@PathVariable long preparationId, @PathVariable String preparationParameterName) {
        try {
            VfePreparationParametersAdpId preparationParameterId = new VfePreparationParametersAdpId(preparationId, preparationParameterName);
            VfePreparationParametersAdp preparationParameter = preparationParameterService.getPreparationParameter(preparationParameterId);
            logger.info("Response Flag ------->   " + preparationParameterService.deletePreparationParameter(preparationParameter));
        } catch (Exception e) {
            logger.error("Error in Deleting Preparation Parameter with preparation id " + preparationId);

        }

    }
}
