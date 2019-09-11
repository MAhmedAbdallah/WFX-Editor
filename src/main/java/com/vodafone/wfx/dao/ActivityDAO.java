/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vodafone.wfx.dao;

import com.vodafone.wfx.model.VfeActivitiesAdp;
import com.vodafone.wfx.model.VfeWorkflowPreparationAdp;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author V19MFoda
 */
@Component
public interface ActivityDAO {

    public VfeActivitiesAdp getActivity(long activityId);

    public boolean saveActivity(VfeActivitiesAdp activity);

    public boolean deleteActivity(VfeActivitiesAdp activity);

    public List<VfeWorkflowPreparationAdp> getActivityPreparations(long activityId);
}
