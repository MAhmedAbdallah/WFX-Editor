/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vodafone.wfx.dao;

import com.vodafone.wfx.model.VfePreparationParametersAdp;
import com.vodafone.wfx.model.VfePreparationParametersAdpId;
import com.vodafone.wfx.util.HibernateUtil;
import javax.transaction.Transactional;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.StatelessSession;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 *
 * @author V19MFoda
 */
@Component
@Repository
public class PreparationParameterDAOImp implements PreparationParameterDAO {

    @Override
    public VfePreparationParametersAdp getPreparationParameter(VfePreparationParametersAdpId preparationParameterId) {
        VfePreparationParametersAdp preparationParameter = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.getTransaction().begin();

            preparationParameter = (VfePreparationParametersAdp) session.get(VfePreparationParametersAdp.class, preparationParameterId);
//      session.close();
//        HibernateUtil.getSessionFactory().close();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

        return preparationParameter;
    }

    @Override
    public boolean savePreparationParameter(VfePreparationParametersAdp preparationParameter) {
        Session session = null;
        boolean flag = false;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.getTransaction().begin();
            session.save(preparationParameter);
            session.getTransaction().commit();
            flag = true;
        } catch (HibernateException e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

        return flag;
    }

    @Override
    public boolean deletePreparationParameter(VfePreparationParametersAdp preparationParameter) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        StatelessSession session = sessionFactory.openStatelessSession();
        boolean flag = false;
        try {

            session.getTransaction().begin();
            session.delete(preparationParameter);
            session.getTransaction().commit();
            flag = true;
        } catch (HibernateException e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return flag;
    }

}
