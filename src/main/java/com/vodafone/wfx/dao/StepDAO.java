/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vodafone.wfx.dao;

import com.vodafone.wfx.model.VfeWorkflowStepsAdp;
import com.vodafone.wfx.model.VfeWorkflowStepsAdpId;
import com.vodafone.wfx.model.VfeWorkflowStepsAdp_;
import org.springframework.stereotype.Component;

/**
 *
 * @author V19MFoda
 */
@Component
public interface StepDAO {
    public VfeWorkflowStepsAdp getStep(VfeWorkflowStepsAdpId stepId);
    public Boolean saveStep(VfeWorkflowStepsAdp step);

    public boolean deleteStep(VfeWorkflowStepsAdp step);
}
