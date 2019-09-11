/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vodafone.wfx.dao;

import com.vodafone.wfx.model.VfePreparationConditionsAdp;
import com.vodafone.wfx.model.VfePreparationConditionsAdpId;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author V19MFoda
 */
@Component
public interface PreparationConditionDAO {
       public VfePreparationConditionsAdp getPreparationParameter(VfePreparationConditionsAdpId preparationConditionId);

    public boolean savePreparationCondition(VfePreparationConditionsAdp preparationCondition);

    public boolean deletePreparationCondition(VfePreparationConditionsAdp preparationCondition);

    public List<VfePreparationConditionsAdp> getPreparationCondition(long conditionId);

    public List<VfePreparationConditionsAdp> getConditionPreparations(long preparationId);

}
