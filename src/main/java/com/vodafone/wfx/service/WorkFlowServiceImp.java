/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vodafone.wfx.service;

import com.vodafone.wfx.dao.WorkFlowDao;
import com.vodafone.wfx.model.VfeWorkflowsAdp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author V19MFoda
 */
@Component

@Service
public class WorkFlowServiceImp implements WorkFlowService{
    @Autowired
    private WorkFlowDao workflowDao;
    
    @Override
    public VfeWorkflowsAdp getWorkFlow(long workFlowId, long workFlowVersion) {
    return   workflowDao.getWorkFlow(workFlowId, workFlowVersion);
    }

    @Override
    public boolean saveWorkFlow(VfeWorkflowsAdp workFlow) {
       return   workflowDao.saveWorkFlow(workFlow);
    }

    @Override
    public boolean deleteWorkFlow(VfeWorkflowsAdp workFlow) {
               return   workflowDao.deleteWorkFlow(workFlow);

    }
    
}
