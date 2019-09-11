/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vodafone.wfx.dao;

import com.vodafone.wfx.model.VfeWorkflowStepsAdp;
import com.vodafone.wfx.model.VfeWorkflowStepsAdpId;
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
public class StepDAOImp implements StepDAO {

    @Override
    public VfeWorkflowStepsAdp getStep(VfeWorkflowStepsAdpId stepId) {
        Session session = null;
        VfeWorkflowStepsAdp step = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.getTransaction().begin();

            step = (VfeWorkflowStepsAdp) session.get(VfeWorkflowStepsAdp.class, stepId);
//      session.close();
//        HibernateUtil.getSessionFactory().close();

        } catch (HibernateException e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return step;
    }

    @Override
    public Boolean saveStep(VfeWorkflowStepsAdp step) {
        Session session = null;
        boolean flag = false;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.getTransaction().begin();
            session.save(step);
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
    public boolean deleteStep(VfeWorkflowStepsAdp step) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        StatelessSession session = sessionFactory.openStatelessSession();
        boolean flag = false;
        try {

            session.getTransaction().begin();
            session.delete(step);
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
