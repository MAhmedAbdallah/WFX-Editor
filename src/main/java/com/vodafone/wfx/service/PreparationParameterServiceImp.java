/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vodafone.wfx.service;

import com.vodafone.wfx.dao.PreparationParameterDAO;
import com.vodafone.wfx.model.VfePreparationParametersAdp;
import com.vodafone.wfx.model.VfePreparationParametersAdpId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author V19MFoda
 */
@Component
@Service
public class PreparationParameterServiceImp implements PreparationParameterService{
    @Autowired PreparationParameterDAO preparationParameterDAO;

    @Override
    public VfePreparationParametersAdp getPreparationParameter(VfePreparationParametersAdpId preparationParameterId) {
    return preparationParameterDAO.getPreparationParameter(preparationParameterId);
    }

    @Override
    public boolean savePreparationParameter(VfePreparationParametersAdp preparationParameter) {
        return preparationParameterDAO.savePreparationParameter(preparationParameter);
    }

    @Override
    public boolean deletePreparationParameter(VfePreparationParametersAdp preparationParameter) {
        return preparationParameterDAO.deletePreparationParameter(preparationParameter);
    }
    
}
