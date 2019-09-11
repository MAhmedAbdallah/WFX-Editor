/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vodafone.wfx.service;

import com.vodafone.wfx.model.VfeWorkflowPreparationAdp;
import org.springframework.stereotype.Component;

/**
 *
 * @author V19MFoda
 */
@Component
public interface PreparationService {
    
    public VfeWorkflowPreparationAdp getPreparation(long preparationId);

    public boolean savePreparation(VfeWorkflowPreparationAdp preparation);

    public boolean deletePreparation(VfeWorkflowPreparationAdp preparation);
}
