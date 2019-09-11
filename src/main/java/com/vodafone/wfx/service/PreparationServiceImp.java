/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vodafone.wfx.service;

import com.vodafone.wfx.dao.PreparationDAO;
import com.vodafone.wfx.model.VfeWorkflowPreparationAdp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author V19MFoda
 */
@Component
@Service
public class PreparationServiceImp implements PreparationService{

    @Autowired
    private PreparationDAO preparationDAO;
    @Override
    public VfeWorkflowPreparationAdp getPreparation(long preparationId) {
       return preparationDAO.getPreparation(preparationId);
    }

    @Override
    public boolean savePreparation(VfeWorkflowPreparationAdp preparation) {
        return  preparationDAO.savePreparation(preparation);
    }

    @Override
    public boolean deletePreparation(VfeWorkflowPreparationAdp preparation) {
      return preparationDAO.deletePreparation(preparation);
    }
    
}
