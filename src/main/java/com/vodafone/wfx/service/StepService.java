/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vodafone.wfx.service;

import com.vodafone.wfx.model.VfeWorkflowStepsAdp;
import com.vodafone.wfx.model.VfeWorkflowStepsAdpId;
import org.springframework.stereotype.Component;

/**
 *
 * @author V19MFoda
 */
@Component
public interface StepService {

    public VfeWorkflowStepsAdp getStep(VfeWorkflowStepsAdpId stepId);

    public Boolean saveStep(VfeWorkflowStepsAdp step);

    public boolean deleteStep(VfeWorkflowStepsAdp step);
}
