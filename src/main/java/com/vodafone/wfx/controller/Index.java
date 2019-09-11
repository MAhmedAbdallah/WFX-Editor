/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vodafone.wfx.controller;

import com.vodafone.wfx.model.VfeHttpSystemsAdp;
import com.vodafone.wfx.model.VfeLkActivitiesTypeAdp;
import com.vodafone.wfx.model.VfeLkConditionTypesAdp;
import com.vodafone.wfx.model.VfeLkDbAdp;
import com.vodafone.wfx.model.VfeLkSshServersAdp;
import com.vodafone.wfx.util.EditorUtil;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.net.InetAddress;
import java.net.UnknownHostException;
import javax.servlet.http.HttpSession;

/**
 *
 * @author V19MFoda
 */
@Controller
public class Index {

    @Autowired
    private HttpServletRequest request;

    final Logger logger = Logger.getLogger(Index.class);

    @GetMapping("/")

    public String getIndex() {
//        HttpSession session = request.getSession(true);
//        List<VfeLkActivitiesTypeAdp> activityTypes = EditorUtil.getActivityType();
//        List<VfeHttpSystemsAdp> httpSystems = EditorUtil.getSystemsAdp();
//        List<VfeLkDbAdp> dbName = EditorUtil.getDBID();
//        List<VfeLkSshServersAdp> sshServerList = EditorUtil.getSSHServers();
//        List<VfeLkConditionTypesAdp> conditionTypes = EditorUtil.getConditionTypes();
//        session.setMaxInactiveInterval(-1);
//        session.setAttribute("sshServers", sshServerList);
//        session.setAttribute("activityTypes", activityTypes);
//        session.setAttribute("httpSystems", httpSystems);
//        session.setAttribute("dbName", dbName);
//        session.setAttribute("conditionTypes", conditionTypes);

        return "index";
    }

    @GetMapping("/index")
    public String getIndex(@RequestParam(value = "workflow") String workFlowName) {
        List list = EditorUtil.getAllWorkflows(workFlowName);
        request.setAttribute("list", list);

//        for (int i = 0; i < list.size(); i ++) {
//            Object[] obj = (Object[]) list.get(i);
//            String workFlowName = (String) obj[0];
//            VfeWorkflowsAdpId id = (VfeWorkflowsAdpId) obj[1];
//            logger.info("WorkFlow Name -------> " + workFlowName);
//            logger.info("WorkFlow Id -------> " + id.getWorkflowId());
//}
        return "index";
    }
    
     @GetMapping(value = "/error")
    public String error() {
        return "error";
    }

}
