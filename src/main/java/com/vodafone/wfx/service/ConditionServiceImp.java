/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vodafone.wfx.service;

import com.vodafone.wfx.dao.ConditionDAO;
import com.vodafone.wfx.model.VfeConditionsAdp;
import com.vodafone.wfx.model.VfeWorkflowConditionsAdp;
import com.vodafone.wfx.model.VfeWorkflowConditionsAdpId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author V19MFoda
 */
@Component
@Service
public class ConditionServiceImp implements ConditionService {

    @Autowired
    private ConditionDAO conditionDAO;

    @Override
    public VfeConditionsAdp getCondition(long conditionId) {
        return conditionDAO.getCondition(conditionId);
    }

    @Override
    public boolean saveCondition(VfeConditionsAdp condition , VfeWorkflowConditionsAdp workFlowCondition) {
        return conditionDAO.saveCondition(condition , workFlowCondition); 
    }

//    @Override
//    public boolean deleteCondition(VfeConditionsAdp condition) {
//        return conditionDAO.deleteCondition(condition);
//    }

    @Override
    public boolean deleteCondition(VfeWorkflowConditionsAdpId workFlowConditionId) {
        return conditionDAO.deleteCondition(workFlowConditionId);
    }

}
