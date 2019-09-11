/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vodafone.wfx.service;

import com.vodafone.wfx.dao.PreparationConditionDAO;
import com.vodafone.wfx.model.VfePreparationConditionsAdp;
import com.vodafone.wfx.model.VfePreparationConditionsAdpId;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author V19MFoda
 */
@Component
@Service
public class PreparationConditionServiceImp implements PreparationConditionService{

    @Autowired
    
    private PreparationConditionDAO preparationConditionDAO;
    
    @Override
    public VfePreparationConditionsAdp getPreparationCondition(VfePreparationConditionsAdpId preparationConditionId) {
       return preparationConditionDAO.getPreparationParameter(preparationConditionId);
    }

    @Override
    public boolean savePreparationCondition(VfePreparationConditionsAdp preparationCondition) {
        return preparationConditionDAO.savePreparationCondition(preparationCondition);
    }

    @Override
    public boolean deletePreparationCondition(VfePreparationConditionsAdp preparationCondition) {
       return preparationConditionDAO.deletePreparationCondition(preparationCondition);
    }

    @Override
    public List<VfePreparationConditionsAdp> getPreparationCondition(long conditionId) {
        return preparationConditionDAO.getPreparationCondition(conditionId);
    }

    @Override
    public List<VfePreparationConditionsAdp> getConditionPreparation(long preparationId) {
       return preparationConditionDAO.getConditionPreparations(preparationId);
    }
    
}
