/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vodafone.wfx.dao;

import com.vodafone.wfx.model.VfeLkActivitiesTypeAdp;
import com.vodafone.wfx.model.VfePreparationConditionsAdp;
import com.vodafone.wfx.model.VfePreparationConditionsAdpId;
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
public class PreparationConditionDAOImp implements PreparationConditionDAO {

    @Override
    public VfePreparationConditionsAdp getPreparationParameter(VfePreparationConditionsAdpId preparationConditionId) {
        Session session = null;
        VfePreparationConditionsAdp preparationParameter = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.getTransaction().begin();

            preparationParameter = (VfePreparationConditionsAdp) session.get(VfePreparationConditionsAdp.class, preparationConditionId);
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
    public boolean savePreparationCondition(VfePreparationConditionsAdp preparationCondition) {
        Session session = null;
        boolean flag = false;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.getTransaction().begin();
            session.save(preparationCondition);
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
    public  boolean  deletePreparationCondition(VfePreparationConditionsAdp preparationCondition) {

        StatelessSession session = null;
        boolean flag = false;
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            session = sessionFactory.openStatelessSession();
            session.getTransaction().begin();
            session.delete(preparationCondition);
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
    public List<VfePreparationConditionsAdp> getPreparationCondition(long conditionId) {
        List<VfePreparationConditionsAdp> preparationConditions = new ArrayList<>();
        try {

            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

            String query = " from VfePreparationConditionsAdp where vfeConditionsAdp.conditionId =" + conditionId;

            Session session = sessionFactory.openSession();

            Query q = session.createQuery(query);
            // q.setLong(0, conditionId);
            preparationConditions = (List<VfePreparationConditionsAdp>) q.list();
            //         System.out.println("TEST");

        } catch (Exception e) {
            e.printStackTrace();

        }

        return preparationConditions;
    }

    @Override
    public List<VfePreparationConditionsAdp> getConditionPreparations(long preparationId) {

        List<VfePreparationConditionsAdp> conditionPreparation = new ArrayList<>();
        try {

            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

            String query = " from VfePreparationConditionsAdp where preparationId =" + preparationId;

            Session session = sessionFactory.openSession();

            Query q = session.createQuery(query);
            // q.setLong(0, conditionId);
            conditionPreparation = (List<VfePreparationConditionsAdp>) q.list();
            //         System.out.println("TEST");

        } catch (Exception e) {
            e.printStackTrace();

        }

        return conditionPreparation;

    }

}
