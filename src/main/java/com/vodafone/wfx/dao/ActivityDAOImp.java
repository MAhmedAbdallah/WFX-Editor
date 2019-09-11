/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vodafone.wfx.dao;

import com.vodafone.wfx.model.VfeActivitiesAdp;
import com.vodafone.wfx.model.VfeWorkflowPreparationAdp;
import com.vodafone.wfx.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.HibernateException;
import org.hibernate.Query;
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
public class ActivityDAOImp implements ActivityDAO {

    @Override
    public VfeActivitiesAdp getActivity(long activityId) {
        Session session = null;
        VfeActivitiesAdp activity = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.getTransaction().begin();

            activity = (VfeActivitiesAdp) session.get(VfeActivitiesAdp.class, activityId);
        } catch (HibernateException e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            session.close();
//        HibernateUtil.getSessionFactory().close();
        }
        return activity;

    }

    @Override
    public boolean saveActivity(VfeActivitiesAdp activity) {
        Session session = null;
        boolean flag = false;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.getTransaction().begin();
            session.save(activity);
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
    public boolean deleteActivity(VfeActivitiesAdp activity) {

        StatelessSession session = null;
        boolean flag = false;
        try {

            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            session = sessionFactory.openStatelessSession();
            session.getTransaction().begin();
            session.delete(activity);
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
    public List<VfeWorkflowPreparationAdp> getActivityPreparations(long activityId) {
        List<VfeWorkflowPreparationAdp> preparationList = new ArrayList<VfeWorkflowPreparationAdp>();

        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            String query = " from VfeWorkflowPreparationAdp where activityId = " + activityId;
            Session session = sessionFactory.openSession();
            Query q = session.createQuery(query);
            preparationList = (List<VfeWorkflowPreparationAdp>) q.list();

        } catch (Exception e) {
            e.printStackTrace();

        }
        return preparationList;
    }
}
