/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vodafone.wfx.dao;

import com.vodafone.wfx.model.VfeWorkflowsAdp;
import com.vodafone.wfx.model.VfeWorkflowsAdpId;
import com.vodafone.wfx.util.HibernateUtil;
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
public class WorkFlowDaoImp implements WorkFlowDao {

    @Override
    public VfeWorkflowsAdp getWorkFlow(long workFlowId, long workFlowVersion) {
        VfeWorkflowsAdpId id = new VfeWorkflowsAdpId(workFlowId, workFlowVersion);

        VfeWorkflowsAdp workFlow = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.getTransaction();

            workFlow = (VfeWorkflowsAdp) session.get(VfeWorkflowsAdp.class, id);
//      session.close();
//        HibernateUtil.getSessionFactory().close();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return workFlow;
    }

    @Override
    public boolean saveWorkFlow(VfeWorkflowsAdp workFlow) {
        Session session = null;
        boolean flag = false;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.getTransaction().begin();
            session.save(workFlow);
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
    public boolean deleteWorkFlow(VfeWorkflowsAdp workFlow) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        StatelessSession session = sessionFactory.openStatelessSession();
        boolean flag = false;
        try {

            session.getTransaction().begin();
            session.delete(workFlow);
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
