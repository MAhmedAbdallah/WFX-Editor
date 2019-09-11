/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vodafone.wfx.dao;

import com.vodafone.wfx.model.VfeActivitiesAdp;
import com.vodafone.wfx.model.VfeConditionsAdp;
import com.vodafone.wfx.model.VfeWorkflowConditionsAdp;
import com.vodafone.wfx.model.VfeWorkflowConditionsAdpId;
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
public class ConditionDAOImp implements ConditionDAO {

    @Override
    public VfeConditionsAdp getCondition(long conditionId) {

        Session session = null;
        VfeConditionsAdp condition = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.getTransaction().begin();

            condition = (VfeConditionsAdp) session.get(VfeConditionsAdp.class, conditionId);
//      session.close();
//        HibernateUtil.getSessionFactory().close();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return condition;

    }

    @Override
    public boolean saveCondition(VfeConditionsAdp condition , VfeWorkflowConditionsAdp workFlowCondition) {
        Session session = null;
        boolean flag = false;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.getTransaction().begin();
            session.save(condition);
            session.save(workFlowCondition);
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

//    @Override
//    public boolean deleteCondition(VfeConditionsAdp condition) {
//
//        StatelessSession session = null;
//        boolean flag = false;
//        try {
//            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
//            session = sessionFactory.openStatelessSession();
//            session.getTransaction().begin();
//            session.delete(condition);
//            session.getTransaction().commit();
//            flag = true;
//        } catch (HibernateException e) {
//            session.getTransaction().rollback();
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
//        return flag;
//    }

    @Override
    public boolean deleteCondition(VfeWorkflowConditionsAdpId workFlowConditionId) {
       Session session = null;
        boolean flag = false;
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            session = sessionFactory.openSession();
            session.getTransaction().begin();
            System.out.println("Hello");
            VfeWorkflowConditionsAdp workflowCondition =   (VfeWorkflowConditionsAdp) session.get(VfeWorkflowConditionsAdp.class, workFlowConditionId);
            session.delete(workflowCondition);
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
