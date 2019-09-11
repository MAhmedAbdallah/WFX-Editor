/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vodafone.wfx.dao;

import com.vodafone.wfx.model.VfeConditionsAdp;
import com.vodafone.wfx.model.VfeWorkflowConditionsAdp;
import org.springframework.stereotype.Component;

/**
 *
 * @author V19MFoda
 */
@Component
public interface WorkFlowConditionDAO {

    public VfeWorkflowConditionsAdp getWorkFlowCondition(long conditionId);

    public boolean saveWorkFlowCondition(VfeWorkflowConditionsAdp workFlowCondition);

    public boolean deleteWorkFlowCondition(VfeWorkflowConditionsAdp workFlowCondition);

}
