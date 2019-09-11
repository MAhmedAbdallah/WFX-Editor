/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vodafone.wfx.service;

import com.vodafone.wfx.dao.StepDAO;
import com.vodafone.wfx.model.VfeWorkflowStepsAdp;
import com.vodafone.wfx.model.VfeWorkflowStepsAdpId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author V19MFoda
 */
@Component

@Service
public class StepServiceImp implements StepService {

    @Autowired
    private StepDAO stepDAO;

    @Override
    public VfeWorkflowStepsAdp getStep(VfeWorkflowStepsAdpId stepId) {
        return stepDAO.getStep(stepId);
    }

    @Override
    public Boolean saveStep(VfeWorkflowStepsAdp step) {
       return stepDAO.saveStep(step);
    }

    @Override
    public boolean deleteStep(VfeWorkflowStepsAdp step) {
       return stepDAO.deleteStep(step);
    }

}
