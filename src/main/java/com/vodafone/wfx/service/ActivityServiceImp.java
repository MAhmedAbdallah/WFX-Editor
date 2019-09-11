/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vodafone.wfx.service;

import com.vodafone.wfx.dao.ActivityDAO;
import com.vodafone.wfx.model.VfeActivitiesAdp;
import com.vodafone.wfx.model.VfeWorkflowPreparationAdp;
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
public class ActivityServiceImp implements ActivityService{
    @Autowired
    private ActivityDAO activityDAO;

    @Override
    public VfeActivitiesAdp getActivity(long activityId) {
       return activityDAO.getActivity(activityId);
    }

    @Override
    public boolean saveActivity(VfeActivitiesAdp activity) {
        return  activityDAO.saveActivity(activity);
    }

    @Override
    public boolean deleteActivity(VfeActivitiesAdp activity) {
       return activityDAO.deleteActivity(activity);
    }

    @Override
    public List<VfeWorkflowPreparationAdp> getActivityPrepartions(long activityId) {
        return activityDAO.getActivityPreparations(activityId);
    }
    
}
