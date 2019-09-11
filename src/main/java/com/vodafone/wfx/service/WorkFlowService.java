/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vodafone.wfx.service;

import com.vodafone.wfx.model.VfeWorkflowsAdp;
import org.springframework.stereotype.Component;

/**
 *
 * @author V19MFoda
 */
@Component

public interface WorkFlowService {
      public VfeWorkflowsAdp getWorkFlow(long workFlowId,long workFlowVersion);
        public boolean saveWorkFlow(VfeWorkflowsAdp workFlow);
        public boolean deleteWorkFlow(VfeWorkflowsAdp workFlow);
}
