/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vodafone.wfx.dao;

import com.vodafone.wfx.model.VfeWorkflowPreparationAdp;
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
public class PreparationDAOImp implements PreparationDAO {

    @Override
    public VfeWorkflowPreparationAdp getPreparation(long preparationId) {
        Session session = null;
        VfeWorkflowPreparationAdp preparation = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.getTransaction().begin();

            preparation = (VfeWorkflowPreparationAdp) session.get(VfeWorkflowPreparationAdp.class, preparationId);
//      session.close();
//        HibernateUtil.getSessionFactory().close();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return preparation;
    }

    @Override
    public boolean savePreparation(VfeWorkflowPreparationAdp preparation) {
        Session session = null;
        boolean flag = false;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.getTransaction().begin();
            session.save(preparation);
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
    public boolean deletePreparation(VfeWorkflowPreparationAdp preparation) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        StatelessSession session = sessionFactory.openStatelessSession();
        boolean flag = false;
        try {

            session.getTransaction().begin();
            session.delete(preparation);
            session.getTransaction().commit();
            flag = true;
        } catch (HibernateException e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        }
        return flag;
    }

}
