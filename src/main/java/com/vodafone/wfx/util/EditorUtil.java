/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vodafone.wfx.util;

import com.sun.corba.se.spi.presentation.rmi.StubAdapter;
import com.vodafone.wfx.model.VfeHttpSystemsAdp;
import com.vodafone.wfx.model.VfeLkActivitiesTypeAdp;
import com.vodafone.wfx.model.VfeLkConditionTypesAdp;
import com.vodafone.wfx.model.VfeLkDbAdp;
import com.vodafone.wfx.model.VfeLkSshServersAdp;
import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.hibernate.StatelessSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author V19MFoda
 */
@Component

public class EditorUtil {

    @Autowired
    // private static HttpServletRequest request;

    public static synchronized long getMaxId(String columnName, String className) {

        Integer maxId = 0;

        try {

            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

            String query = "select max(" + columnName + ")+1 from " + className;

            StatelessSession session = sessionFactory.openStatelessSession();

            Query q = session.createQuery(query);

            maxId = (Integer) q.list().get(0);

        } catch (Exception e) {
            e.printStackTrace();

        }

        return maxId.longValue();
    }

    public static List getAllWorkflows(String flowName) {

        List list = new ArrayList<>();
        try {

            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

            String query = "select distinct  flowName , id  from VfeWorkflowsAdp where flowName like '%" + flowName + "%' and version_Id =1 ";//and version_Id =1
            //       select  FLOW_NAME , WORKFLOW_ID  from WORKFLOWX.VFE_WORKFLOWS_ADP where FLOW_NAME like '%Test%' ;

            StatelessSession session = sessionFactory.openStatelessSession();

            Query q = session.createQuery(query);

            list = q.list();

        } catch (Exception e) {
            e.printStackTrace();

        }
        return list;
    }

    public static long getCurrentVersion(long workFlowId) {
        BigDecimal versionId;
        long version = 0;
        List list = new ArrayList<>();
        try {

//           VfeWorkflowVersionsAdp version = new VfeWorkflowVersionsAdp
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

            String query = "select VERSION_ID from WORKFLOWX.VFE_WORKFLOW_VERSIONS_ADP where IS_DEFAULT=1 and WORKFLOW_ID=" + workFlowId; //id=" + intId + " and

            //"select  flowName , id  from VfeWorkflowsAdp where flowName like '%"+flowName +"%'";
            //       select  FLOW_NAME , WORKFLOW_ID  from WORKFLOWX.VFE_WORKFLOWS_ADP where FLOW_NAME like '%Test%' ;
            StatelessSession session = sessionFactory.openStatelessSession();

            SQLQuery q = session.createSQLQuery(query);

            versionId = (BigDecimal) q.list().get(0);
            version = versionId.longValue();

        } catch (Exception e) {
            e.printStackTrace();

        }
        return version;
    }

    public static List<VfeLkActivitiesTypeAdp> getActivityType() {

        List<VfeLkActivitiesTypeAdp> activityTypes = new ArrayList<>();

        try {

            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

            String query = " from VfeLkActivitiesTypeAdp ";

            StatelessSession session = sessionFactory.openStatelessSession();

            Query q = session.createQuery(query);

            activityTypes = (List<VfeLkActivitiesTypeAdp>) q.list();
            //         System.out.println("TEST");

        } catch (Exception e) {
            e.printStackTrace();

        }

        return activityTypes;

    }

    public static List<VfeHttpSystemsAdp> getSystemsAdp() {

        List<VfeHttpSystemsAdp> httpSystems = new ArrayList<>();

        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            String query = " from VfeHttpSystemsAdp";
            StatelessSession session = sessionFactory.openStatelessSession();
            Query q = session.createQuery(query);
            httpSystems = (List<VfeHttpSystemsAdp>) q.list();

        } catch (Exception e) {
            e.printStackTrace();

        }

        return httpSystems;

    }

    public static List<VfeLkDbAdp> getDBID() {

        List<VfeLkDbAdp> dbName = new ArrayList<>();

        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            String query = " from VfeLkDbAdp";
            StatelessSession session = sessionFactory.openStatelessSession();
            Query q = session.createQuery(query);
            dbName = (List<VfeLkDbAdp>) q.list();

        } catch (Exception e) {
            e.printStackTrace();

        }

        return dbName;

    }

    public static List<VfeLkSshServersAdp> getSSHServers() {

        List<VfeLkSshServersAdp> sshServers = new ArrayList<>();

        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            String query = " from VfeLkSshServersAdp";
            StatelessSession session = sessionFactory.openStatelessSession();
            Query q = session.createQuery(query);
            sshServers = (List<VfeLkSshServersAdp>) q.list();

        } catch (Exception e) {
            e.printStackTrace();

        }

        return sshServers;

    }



    public static List<VfeLkConditionTypesAdp> getConditionTypes() {
        List<VfeLkConditionTypesAdp> conditionTypes = new ArrayList<>();

        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            String query = " from VfeLkConditionTypesAdp";
            StatelessSession session = sessionFactory.openStatelessSession();
            Query q = session.createQuery(query);
            conditionTypes = (List<VfeLkConditionTypesAdp>) q.list();

        } catch (Exception e) {
            e.printStackTrace();

        }

        return conditionTypes;

    }

    public static void prepareEditorLists(HttpServletRequest request) {
        // HttpSession session = request.getSession();
        List<VfeLkActivitiesTypeAdp> activityTypes = getActivityType();
        List<VfeHttpSystemsAdp> httpSystems = getSystemsAdp();
        List<VfeLkDbAdp> dbName = getDBID();
        List<VfeLkSshServersAdp> sshServerList = getSSHServers();
        List<VfeLkConditionTypesAdp> conditionTypes = getConditionTypes();
        request.getSession().setMaxInactiveInterval(-1);
        request.getSession().setAttribute("sshServers", sshServerList);
        request.getSession().setAttribute("activityTypes", activityTypes);
        request.getSession().setAttribute("httpSystems", httpSystems);
        request.getSession().setAttribute("dbName", dbName);
        request.getSession().setAttribute("conditionTypes", conditionTypes);

    }
    
    
    public static boolean isNull(Object object ){
        return object==null;
        
        
    }
     public static String isNullString(String content ){
        return content==null? "-" : content  ;

    }
     
     public static String isNull(Long content)
     {
         
      return content==null? "-" : content.toString() ;


    }
     
     
     
     

}
