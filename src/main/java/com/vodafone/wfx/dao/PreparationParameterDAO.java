/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vodafone.wfx.dao;

import com.vodafone.wfx.model.VfePreparationParametersAdp;
import com.vodafone.wfx.model.VfePreparationParametersAdpId;
import org.springframework.stereotype.Component;

/**
 *
 * @author V19MFoda
 */
@Component
public interface PreparationParameterDAO {
    
    public VfePreparationParametersAdp getPreparationParameter(VfePreparationParametersAdpId preparationParameterId);

    public boolean savePreparationParameter(VfePreparationParametersAdp preparationParameter);

    public boolean deletePreparationParameter(VfePreparationParametersAdp preparationParameter);
}
