/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vodafone.wfx.dao;

import com.vodafone.wfx.model.VfeWorkflowConditionsAdp;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 *
 * @author V19MFoda
 */
@Component

@Repository
public class WorkFlowConditionDAOImp implements WorkFlowConditionDAO {

    @Override
    public VfeWorkflowConditionsAdp getWorkFlowCondition(long conditionId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean saveWorkFlowCondition(VfeWorkflowConditionsAdp workFlowCondition) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteWorkFlowCondition(VfeWorkflowConditionsAdp workFlowCondition) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
