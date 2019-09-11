/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vodafone.wfx.service;

import com.vodafone.wfx.model.VfeConditionsAdp;
import com.vodafone.wfx.model.VfeWorkflowConditionsAdp;
import com.vodafone.wfx.model.VfeWorkflowConditionsAdpId;
import org.springframework.stereotype.Component;

/**
 *
 * @author V19MFoda
 */
@Component
public interface ConditionService {
    
       public VfeConditionsAdp getCondition(long conditionId);
        public boolean saveCondition(VfeConditionsAdp condition , VfeWorkflowConditionsAdp workFlowCondition);
        public boolean deleteCondition(VfeWorkflowConditionsAdpId workFlowConditionId);
    
}
