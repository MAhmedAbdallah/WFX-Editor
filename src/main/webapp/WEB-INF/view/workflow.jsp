<%-- 
    Document   : workflow
    Created on : Jul 18, 2019, 12:45:03 PM
    Author     : V19MFoda
--%>

<%@page import="java.net.UnknownHostException"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.vodafone.wfx.util.EditorUtil"%>
<%@page import="java.net.InetAddress"%>
<%@page import="com.vodafone.wfx.model.VfeLkConditionTypesAdp"%>
<%@page import="com.vodafone.wfx.model.VfeLkSshServersAdp"%>
<%@page import="com.vodafone.wfx.model.VfeLkDbAdp"%>
<%@page import="com.vodafone.wfx.model.VfeHttpSystemsAdp"%>
<%@page import="com.vodafone.wfx.model.VfeLkActivitiesTypeAdp"%>
<%@page import="com.vodafone.wfx.model.VfeWorkflowPreparationAdp"%>
<%@page import="com.vodafone.wfx.model.VfeWorkflowOutputAdp"%>
<%@page import="com.vodafone.wfx.model.VfeWorkflowInputAdp"%>
<%@page import="com.vodafone.wfx.model.VfeWorkflowConditionsAdp"%>
<%@page import="com.vodafone.wfx.model.VfeConditionsAdp"%>
<%@page import="com.vodafone.wfx.model.VfeActivitiesAdp"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Set"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="javax.servlet.http.HttpServletRequest, com.vodafone.wfx.model.VfeWorkflowStepsAdp,com.vodafone.wfx.model.VfeWorkflowsAdp"%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html xmlns:th="http://www.thymeleaf.org">
    <head>
        <link rel="shortcut icon" type="image/x-icon" href="https://i.dlpng.com/static/png/401889_preview.png"    />

        <script>

            function values(currentOrder, activityId) {
                console.log(currentOrder + '       ' + activityId);
                document.getElementById("currentOrder").value = currentOrder;
                document.getElementById("activityId").value = activityId;
                console.log(location.hostname)
            }
            function setValues(currentOrder, activityId, versionId) {
                console.log(currentOrder + '       ' + activityId + '       ' + versionId);
                document.getElementById("ConditionCurrentOrder").value = currentOrder;
                document.getElementById("ConditionActivityId").value = activityId;
                document.getElementById("conditionVersionId").value = versionId;

            }
        </script>                    
        
        
        
        

        <!--    Author     : V19MFoda    -->


        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>WorkFlow X Editor</title>
        <!--        <link href="webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
                <script src="webjars/bootstrap/4.0.0/js/bootstrap.min.js" ></script>
                <script src="webjars/jquery/3.0.0/jquery.min.js" ></script>-->
        <!--<script src="/webjars/jquery/3.1.1/jquery.min.js"></script>
        <script src="/webjars/bootstrap/3.3.7-1/js/bootstrap.min.js"></script>
        <link rel="stylesheet"
                href="/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css" />-->

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

        <!--<link rel="icon" type="image/x-icon" href="webapp/WEB-INF/view/logo.jpg" />-->
        <link rel="icon" href="logo.png">




        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

    </head>
    <body class="font-weight-bold text-center">
        <% VfeWorkflowsAdp workflow = (VfeWorkflowsAdp) request.getSession(false).  getAttribute("workflow");%>
        <%

            // out.println("remote adress::" + request.getRemoteAddr()+ "<br>");
//           
//            response.setContentType("text/html");        l;
//
//    String hostname = request.getRemoteHost(); // hostname
//    out.println("hostname"+hostname+"<br>");
//
//    String computerName = null;
//    String remoteAddress = request.getRemoteAddr();
//   out.println("remoteAddress: " + remoteAddress+"<br>");
//    try {
//        InetAddress inetAddress = InetAddress.getByName(remoteAddress);
//        out.println("inetAddress: " + inetAddress+"<br>");
//        computerName = inetAddress.getHostName();
//
//       out.println("computerName: " + computerName+"<br>");
//
//
//        if (computerName.equalsIgnoreCase("localhost")) {
//            computerName = java.net.InetAddress.getLocalHost().getCanonicalHostName();
//        } 
//    } catch (UnknownHostException e) {
//
//        }
//
//    out.println("computerName: " + computerName+"<br>");
//           
//  ___________________________________________________________________________________________________________
            InetAddress inetAddress = InetAddress.getByName(request.getRemoteAddr());

            inetAddress.getHostName();
            java.net.InetAddress.getLocalHost().getHostName();

            InetAddress ip = InetAddress.getLocalHost();

            ip.toString();
//           out.println(ip.getHostName() );
//         out.println(ip.getHostAddress() );

            ip.getCanonicalHostName();

            // inetAddress = InetAddress.getByName(request.getRemoteAddr());
            //out.println("Host Name: /////////////" + inetAddress.getHostName().toString()+ "<br>");
            request.getSession().setAttribute("clientIp", inetAddress.getHostName());
//            com.sun.security.auth.module.NTSystem NTSystem = new com.sun.security.auth.module.NTSystem();
//
//            out.println(NTSystem.getName());


        %>
        <br/><br/><br/>


        <div align="center" >
            <button type="button" class="btn btn-primary" data-toggle="modal" data-target=".bd-input-modal-lg">WorkFlow Inputs</button>
            <button type="button" class="btn btn-primary" data-toggle="modal" data-target=".bd-output-modal-lg">WorkFlow Outputs</button>
<!--            <button type="button" class="btn btn-primary" data-toggle="modal" data-target=".bd-preparation-modal-lg"> WorkFlow Preparations</button>-->

        </div>
        <br><br>


        <div class="modal fade bd-input-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-lg">
                <div class="modal-content container-fluid">








                    <div align="center">

                        <table    class=" table table-bordered table-hover table-responsive  table-sm  text-center" >
                            <thead  class="thead text-center" >
                                <tr class="col-sm">
                                    <th scope="col"  class="col-sm text-center" style="width: fit-content"  >Parameter Name</th>

                                    <th scope="col" class="col-sm  " style="width: fit-content" >Is List ?!</th>
                                    <th scope="col" class="col-sm  " style="width: fit-content" >Sub Fields</th>
                                    <th scope="col" class="col-sm  " style="width: fit-content" >Parameter type</th>



                                </tr>
                            </thead>

                            <tbody >

                                <%                                    for (VfeWorkflowInputAdp input : workflow.getVfeWorkflowInputAdps()) {
                                        String isList = "-";
                                        String subFields = "-";

                                %>
                                <tr>
                                    <td><%= input.getId().getParameterName()%></td>

                                    <% if (input.getIsList() != null) {
                                            isList = input.getIsList().toString();
                                        }
                                    %>
                                    <td>



                                        <%= isList%>

                                    </td>
                                    <%
                                        if (input.getSubFields() != null) {
                                            subFields = input.getSubFields();
                                        }
                                    %>
                                    <td>

                                        <%= subFields%></td>
                                    <td><%= input.getParameterType()%></td>
                                </tr>





                                <%}%>

                            </tbody>
                        </table>







                    </div>














                </div>
            </div>
        </div>








        <div class="modal fade bd-insert-activity-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-lg">
                <div class="modal-content container-fluid">
                    <div align="center" >
                        <form method="POST" action="../../Activity/Create" >


                            <input type="hidden" name="currentOrder" id="currentOrder" value="">
                            <input type="hidden" name="activityId" id="activityId" value="">
                            <br>
                            <div class="form-group row">
                                <label
                                    class="col-sm-2 col-form-label">Activity Description</label>
                                <div class="col-sm-10">

                                    <input type="text" name="activityDescription" class="form-control" id="inputPassword" placeholder="Activity Description">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="inputPassword" class="col-sm-2 col-form-label">Database Query</label>
                                <div class="col-sm-10">
                                    <input type="text" name="activityDBQuery" class="form-control" id="inputPassword" placeholder="Database Query">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="inputPassword" class="col-sm-2 col-form-label">CMS Function</label>
                                <div class="col-sm-10">
                                    <input type="text" name="activityCMSFunction" class="form-control" id="inputPassword" placeholder="CMS Function">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="inputPassword" class="col-sm-2 col-form-label">Activity Type</label>
                                <div class="col-sm-10">

                                    <select name="activityType" class="form-control">

                                        <%

                                            if (request.getSession().getAttribute("activityTypes") == null) {
                                                EditorUtil.prepareEditorLists(request);
                                            }
                                            List<VfeLkActivitiesTypeAdp> types = (List<VfeLkActivitiesTypeAdp>) request.getSession().getAttribute("activityTypes");
                                            for (VfeLkActivitiesTypeAdp type : types) {%>
                                        <option class="form-control" value="<%= type.getActivityTypeId().toString()%>"><%=type.getDescription().toString()%></option>
                                        <%}%>
                                    </select>


                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="inputPassword" class="col-sm-2 col-form-label">Stored Procedure Id </label>
                                <div class="col-sm-10">
                                    <input type="text" name="activityStoredProcedure" class="form-control" id="inputPassword" placeholder="Stored Procedure Id">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="inputPassword" class="col-sm-2 col-form-label">HTTP URL</label>
                                <div class="col-sm-10">
                                    <input type="text" name="activityHTTPURL" class="form-control" id="inputPassword" placeholder="HTTP URL">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="inputPassword" class="col-sm-2 col-form-label">System Id</label>
                                <div class="col-sm-10">

                                    <select  name="activitySystemID" class="form-control">

                                        <%
                                            List<VfeHttpSystemsAdp> httpSystemTypes = (List<  VfeHttpSystemsAdp>) request.getSession().getAttribute("httpSystems");

                                            for (VfeHttpSystemsAdp type : httpSystemTypes) {%>
                                        <option class="form-control" value="<%= type.getSystemId().toString()%>"><%=type.getSystemName()%></option>
                                        <%}%>
                                    </select>


                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="inputPassword" class="col-sm-2 col-form-label">Sleep Time</label>
                                <div class="col-sm-10">
                                    <input type="text" name="activitySleepTime" class="form-control" id="inputPassword" placeholder="Sleep Time">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="inputPassword" class="col-sm-2 col-form-label">Do Cache</label>
                                <div class="col-sm-10">
                                    <input type="text" name="activityDoCache" class="form-control" id="inputPassword" placeholder="Do Cache">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="inputPassword" class="col-sm-2 col-form-label">HTTP REQUEST TYPE</label>
                                <div class="col-sm-10">

                                    <select  name="httpRequestType" class="form-control">


                                        <option class="form-control" value="1">GET</option>
                                        <option class="form-control" value="2">POST</option>


                                    </select>


                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="inputPassword" class="col-sm-2 col-form-label">HTTP XML INPUT</label>
                                <div class="col-sm-10">
                                    <input type="text" name="activityHttpXmlInput" class="form-control" id="inputPassword" placeholder="HTTP XML INPUT">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="inputPassword" class="col-sm-2 col-form-label">INTERFACE NAME</label>
                                <div class="col-sm-10">
                                    <input type="text" name="activityInterfaceName" class="form-control" id="inputPassword" placeholder="INTERFACE NAME">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="inputPassword" class="col-sm-2 col-form-label">OPERATION NAME</label>
                                <div class="col-sm-10">
                                    <input type="text" name="activityOperationName" class="form-control" id="inputPassword" placeholder="OPERATION NAME">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="inputPassword" class="col-sm-2 col-form-label">INPUT NAME</label>
                                <div class="col-sm-10">
                                    <input type="text" name="activityInputName" class="form-control" id="inputPassword" placeholder="INPUT NAME">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="inputPassword" class="col-sm-2 col-form-label">DB ID</label>
                                <div class="col-sm-10">

                                    <select  name="activityDBID" class="form-control">

                                        <option class="form-control" value="null">Null</option>
                                        <%
                                            List<VfeLkDbAdp> dbName = (List<  VfeLkDbAdp>) request.getSession().getAttribute("dbName");

                                            for (VfeLkDbAdp type : dbName) {%>
                                        <option class="form-control" value="<%= type.getId().toString()%>"><%=type.getDatabaseName()%></option>
                                        <%}%>


                                    </select>


                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="inputPassword" class="col-sm-2 col-form-label">QUERY TIMEOUT</label>
                                <div class="col-sm-10">
                                    <input type="text" name="activityQueryTimeOut" class="form-control" id="inputPassword" placeholder="QUERY TIMEOUT">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="inputPassword" class="col-sm-2 col-form-label">WEB SERVICE ID</label>
                                <div class="col-sm-10">

                                    <select  name="activityWebServiceID" class="form-control">

                                        <option class="form-control" value="1">lenghtConverter.wsdl</option>

                                        <option class="form-control" value="1">country.wsdl</option>



                                    </select>





                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="inputPassword" class="col-sm-2 col-form-label">INPUT COMMAND</label>
                                <div class="col-sm-10">
                                    <input type="text" name="activityInputCommand"  class="form-control" id="inputPassword" placeholder="INPUT COMMAND">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="inputPassword" class="col-sm-2 col-form-label">COMMAND OUTPUT SEPARATOR</label>
                                <div class="col-sm-10">
                                    <input type="text" name="activityCommandOutputSeparatior" class="form-control" id="inputPassword" placeholder="COMMAND OUTPUT SEPARATOR">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="inputPassword" class="col-sm-2 col-form-label">SSH SERVER ID</label>
                                <div class="col-sm-10">

                                    <select  name="activitySSHServerID" class="form-control">

                                        <%
                                            List<VfeLkSshServersAdp> sshServers = (List<VfeLkSshServersAdp>) request.getSession().getAttribute("sshServers");
                                            for (VfeLkSshServersAdp type : sshServers) {
                                        %>


                                        <option class="form-control" value="<%= type.getSshServerId().toString()%>"><%=type.getIp()%></option>
                                        <%
                                            }
                                        %>
                                        <option class="form-control" value="null">Null</option>


                                    </select>


                                </div>

                            </div>
                            <div class="form-group row">
                                <label for="inputPassword" class="col-sm-2 col-form-label">SUCCESS CODES</label>
                                <div class="col-sm-10">
                                    <input type="text" name="activitySuccessCodes" class="form-control" id="inputPassword" placeholder="SUCCESS CODES">
                                </div>
                            </div>



                            <div class="form-group row">
                                <label for="inputPassword" class="col-sm-2 col-form-label"></label>
                                <div class="col-sm-10">
                                    <input type="submit" for="inputPassword" class="col-sm-2 col-form-label btn btn-success" />
                                </div>
                            </div>

                        </form >
                    </div>
                </div>
            </div>
        </div>










        <div class="modal fade bd-insert-condition-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-lg">
                <div class="modal-content container-fluid">
                    <div align="center" >
                        <form method="POST" action="../../Condition/Create" >


                            <input type="hidden" name="currentOrder" id="ConditionCurrentOrder" value="">
                            <input type="hidden" name="activityId" id="ConditionActivityId" value="">
                            <input type="hidden" name="version" id="conditionVersionId" value="">

                            <br>
                            <div class="form-group row">
                                <label
                                    class="col-sm-2 col-form-label">PARAMETER NAME</label>
                                <div class="col-sm-10">

                                    <input type="text" name="parameterName" class="form-control" id="inputPassword" placeholder="Parameter Name">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="inputPassword" class="col-sm-2 col-form-label">OTHER PARAMETER NAME</label>
                                <div class="col-sm-10">
                                    <input type="text" name="otherParameterName" class="form-control" id="inputPassword" placeholder="Other Parameter Name">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="inputPassword" class="col-sm-2 col-form-label">CONDITION VALUE</label>
                                <div class="col-sm-10">
                                    <input type="text" name="conditionValue" class="form-control" id="inputPassword" placeholder="Condition Value">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="inputPassword" class="col-sm-2 col-form-label">CONDITION TYPE</label>
                                <div class="col-sm-10">

                                    <select name="conditionType" class="form-control">

                                        <%
                                            List<VfeLkConditionTypesAdp> conditionTypes = (List<VfeLkConditionTypesAdp>) request.getSession().getAttribute("conditionTypes");

                                            for (VfeLkConditionTypesAdp type : conditionTypes) {%>
                                        <option class="form-control" value="<%= type.getConditionTypeId()%>"><%=type.getConditionTypeDesc()%></option>
                                        <%}%>
                                    </select>


                                </div>
                            </div>
                            <!--     _______________________________________________________________________________________ -->

                            <div class="form-group row">
                                <label for="inputPassword" class="col-sm-2 col-form-label">RELATION TYPE </label>
                                <div class="col-sm-10">

                                    <select name="relationType" class="form-control">


                                        <option class="form-control" value="1">AND</option>
                                        <option class="form-control" value="2">OR</option>

                                    </select>


                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="inputPassword" class="col-sm-2 col-form-label">CONDITION ORDER</label>
                                <div class="col-sm-10">
                                    <input type="text" name="conditionOrder" class="form-control" id="inputPassword" placeholder="Condition Order">
                                </div>
                            </div>

                            <div class="form-group row">
                                <label for="inputPassword" class="col-sm-2 col-form-label">ERROR CODE</label>
                                <div class="col-sm-10">
                                    <input type="text" name="errorCode" class="form-control" id="inputPassword" placeholder="Error Code">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="inputPassword" class="col-sm-2 col-form-label">PREPARATION ID</label>
                                <div class="col-sm-10">
                                    <input type="text" name="preparationId" class="form-control"  placeholder="Preparation Id">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="inputPassword" class="col-sm-2 col-form-label">DESCRIPTION</label>
                                <div class="col-sm-10">

                                    <input type="text" name="description" class="form-control"  placeholder="Description">


                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="inputPassword" class="col-sm-2 col-form-label">PATH ID</label>
                                <div class="col-sm-10">
                                    <input type="text" name="pathId" class="form-control" id="inputPassword" placeholder="Path Id">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="inputPassword" class="col-sm-2 col-form-label">NEGATE_ACTIVITY_ID</label>
                                <div class="col-sm-10">
                                    <input type="text" name="negateActivityId" class="form-control" id="inputPassword" placeholder="Negate Activity Id">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="inputPassword" class="col-sm-2 col-form-label">Negate Path Id</label>
                                <div class="col-sm-10">
                                    <input type="text" name="negatePathId" class="form-control" id="inputPassword" placeholder="Negate Path Id">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="inputPassword" class="col-sm-2 col-form-label"></label>
                                <div class="col-sm-10">
                                    <input type="submit" for="inputPassword" class="col-sm-2 col-form-label btn btn-success" />
                                </div>
                            </div>

                        </form >
                    </div>
                </div>
            </div>
        </div>






<div class="modal fade bd-output-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-lg">
                <div class="modal-content container-fluid">
                    <div align="center" >
                        <table    class=" table table-bordered table-hover text-center table-responsive  table-sm  " >
                            <thead  class="thead text-center " >
                                <tr class="col-sm">
                                    <th scope="col"  class="col-sm  text-center" style="width: fit-content"  >Parameter Name</th>
                                </tr>
                            </thead>

                            <tbody >

                                <%
                                    for (VfeWorkflowOutputAdp output : workflow.getVfeWorkflowOutputAdps()) {


                                %>
                                <tr>
                                    <td><%= output.getId().getParameterName()%></td>

                                </tr>





                                <%}%>

                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>


















        <div class="modal fade bd-preparation-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-lg">
                <div class="modal-content container-fluid">








                    <div align="center">

                        <table    class=" table table-bordered table-hover table-responsive  table-sm  text-center" >
                            <thead  class="thead text-center" >
                                <tr class="col-sm">
                                    <th scope="col"  class="col-sm text-center" style="width: fit-content"  >Preparation Id</th>

                                    <th scope="col" class="col-sm  " style="width: fit-content" >Parameter Name</th>
                                    <th scope="col" class="col-sm  " style="width: fit-content" >Save To Pool</th>
                                    <th scope="col" class="col-sm  " style="width: fit-content" >Preparation Order</th>
                                    <th scope="col" class="col-sm  " style="width: fit-content" >Activity Id</th>
                                    <!--                                            <th scope="col" class="col-sm  " style="width: fit-content" >Current Order</th>-->
                                    <th scope="col" class="col-sm  " style="width: fit-content" >Preparation Type</th>



                                </tr>
                            </thead>

                            <tbody >

                                <%

                                    Set<VfeWorkflowStepsAdp> steps = workflow.getVfeWorkflowStepsAdps();

                                    for (VfeWorkflowStepsAdp step : steps) {

                                        for (VfeWorkflowPreparationAdp preparation : step.getVfeWorkflowPreparationAdps()) {
                                            //   String isList = "-";
                                            // String subFields = "-";
                                            //VfeActivitiesAdp activity = step.getActivityId();
                                            //System.out.println(step.get);

                                %>
                                <tr>
                                    <td><%= preparation.getPreparationId()%></td>

                                    <td> <%= preparation.getParameterName()%></td>
                                    <td><%= preparation.getSaveToPool().getBooleanValue()%> </td>
                                    <td><%= preparation.getPreparationOrder()%> </td>
                                    <td> <%= step.getActivityId().getActivityId()%> </td>


                                    <td><%= preparation.getVfeLkPreparationTypesAdp().getPreparationDescription()%></td>
                                </tr>





                                <%

                                        }
                                    }
                                %>

                            </tbody>
                        </table>







                    </div>














                </div>
            </div>
        </div>
        <!--_______________________________________________________________________________________________________-->

        <div  class="   container-fluid ">







            <table    class=" table table-bordered table-hover  table-sm text-center " >
                <thead  class="thead text-center" >
                    <tr class="col-sm">
                        <th scope="col"  class="col-sm text-center" style="width: fit-content"  >Step Order</th>




                        <th scope="col" class="col-sm text-center  " style="width: fit-content" >Activity Id</th>
                        <th scope="col" class="col-sm text-center " style="width: fit-content" >Activity Type</th>

                        <th scope="col" class="col-sm text-center " style="width: fit-content" >Activity Description</th>

                        
                     
                        
                        
                        
                        
                        


                        <th scope="col" class="col-sm text-center " style="width: fit-content" >Condition ID</th>
                        <th scope="col" class="col-sm text-center " style="width: fit-content" >Condition Order</th>





                        <th scope="col" class="col-sm text-center " style="width: fit-content" >Parameter_Name</th>
                        <th scope="col" class="col-sm text-center " style="width: fit-content" >Condition Type</th>
                        <th scope="col" class="col-sm text-center " style="width: fit-content" >Other Parameter</th>
                        <th scope="col" class="col-sm text-center " style="width: fit-content" >Condition Value</th>





                        <th scope="col" class="col-sm  text-center" style="width: fit-content" >Relation</th>


                        <th scope="col" class="col-sm  text-center" style="width: fit-content" >Operations</th>


                    </tr>
                </thead>

                <tbody >



                    <%
                        // Set<VfeWorkflowStepsAdp> steps = workflow.getVfeWorkflowStepsAdps();
                        long previousStepOrder = 0;

                        for (VfeWorkflowStepsAdp step : steps) {

                            String activityName = step.getActivityId().getDescription();
                            String otherParamName = "-";
                            String conditionValue = "-";


                    %>
                    <tr >
                        <td >



                            <%= step.getId().getCurrentOrder()%> <br>

                            <a href="#" data-toggle="modal" data-target=".bd-insert-activity-modal-lg" class="btn btn-labeled btn-success btn-sm" onclick="values(<%= step.getId().getCurrentOrder()%>,<%= step.getId().getActivityId()%>)">

                                Insert Activity


                            </a>
                            






                        </td>





























                        <td>
                            <a href="../../Activity/Get/<%= step.getActivityId().getActivityId()%>" > 

                                <%= step.getActivityId().getActivityId()%>

                                <br>
                                <a href="#" data-toggle="modal" data-target=".bd-insert-condition-modal-lg" class="btn btn-labeled btn-success btn-sm"
                                   onclick="setValues(<%= step.getId().getCurrentOrder()%>,<%= step.getId().getActivityId()%>,<%= step.getId().getVersionId()%>)"
                                   >
                                    Insert Condition</a> 

                                <br/><br/>

                                <a  href="../../Step/Delete/<%= workflow.getId().getWorkflowId()%>/<%= step.getActivityId().getActivityId()%>/<%= step.getId().getCurrentOrder()%>/<%= workflow.getId().getVersionId()%>" onclick="return confirm('Are you sure?')" class=" btn-sm  btn-labeled btn-danger  ">Delete Activity</a> 


                        </td>
                        </a>


                        <td><%=step.getActivityId().getVfeLkActivitiesTypeAdp().getDescription()%><br/>




                        </td>
                        <td><%= activityName%><br/>




                        </td>

<!--Here-->






































                        <% boolean flag = true;
                            for (VfeWorkflowConditionsAdp condition : step.getVfeWorkflowConditionsAdps()) {


                        %>

                        <td>


                           

                                <%= condition.getId().getConditionId()%>
                           



                        </td>
                        <td>
                            <%= condition.getConditionOrder() %>
                        </td>
                        <td><%= condition.getVfeConditionsAdp().getParameterName()%></td>
                        <td><%= condition.getVfeConditionsAdp().getVfeLkConditionTypesAdp().getConditionTypeDesc()%></td>
                        <%

                            if (condition.getVfeConditionsAdp().getOtherParameterName() != null) {

                                otherParamName = condition.getVfeConditionsAdp().getOtherParameterName();

                            }%>
                        <td>

                            <%= otherParamName%>

                        </td>


                        <%

                            if (condition.getVfeConditionsAdp().getConditionValue() != null) {

                                conditionValue = condition.getVfeConditionsAdp().getConditionValue();

                            }%>


                        <td><%= conditionValue%></td>
                        <td><%= condition.getVfeLkRelationTypesAdp()%></td>





















                        <td >
                            <!--                            <button type="button" class="">
                                                            <span class="btn-label"><i class=""></i></span>-->

                            <!--                                <a href="">-->


                            <!--                            <a  href="#link" class=" btn-sm  btn-labeled btn-danger  ">Delete Activity</a> 
                            
                                                        <a href="#link"  role="button" class=" btn-sm  btn-labeled btn-success  ">Insert Activity</a>-->
                            <!--                            <br/><br/>-->
                            <a href="../../Condition/Delete/<%= condition.getId().getConditionId()%>/<%= condition.getId().getWorkflowId()%>/<%= condition.getId().getCurrentOrder()%>/<%= condition.getId().getVersionId()%>" onclick="return confirm('Are you sure?')" class=" btn-sm  btn-labeled btn-danger "  role="button">Delete Condition</a>
                            <!--<a href="#link" class=" btn-sm  btn-labeled btn-success  " role="button">Insert condition</a>-->


                            <!--</a>-->
                            <!--                            </button>-->

                        </td>



                    <tr > </tr>

                <td colspan="4">

                    <%
                        if (flag && (step.getId().getCurrentOrder() != previousStepOrder)) {
                            //  if () {

                    %>   


                    <% }
                        //  }
                        flag = false;
                    %>
                </td>
                <%
                        previousStepOrder = step.getId().getCurrentOrder();
                    }
                %> 



                <tr > </tr>

                <td colspan="3">

                    <%
                        if (flag && (step.getId().getCurrentOrder() != previousStepOrder)) {
                            // break ;
                    %>



                    <!--    <a href="#" data-toggle="modal" data-target=".bd-insert-activity-modal-lg" class="btn btn-labeled btn-success btn-sm">Insert condition</a> -->
                    <% }
                        flag = false;
                    %>
                </td>

                <%
                    }


                %>






                </tbody>
            </table>
        </div>
    </body>
    <!-- Footer -->
    <footer class="page-footer font-small blue">

        <!-- Copyright -->
        <div class="footer-copyright text-center py-3">© 2019 Copyright: &nbsp;
            Automation Team - Vodafone Egypt || Billing Team - Vodafone Egypt
        </div>
        <!-- Copyright -->

    </footer>
    <!-- Footer -->
    <footer class="page-footer font-small Red">




        <div class="footer-copyright text-center py-3">Contact:<br/>
            <a href="mailto:Mohamed.foda@vodafone.com">
                Mohamed Foda </a>  <br/>
            <a href="mailto:Ahmed.motawea@vodafone.com">
                Ahmed Motawea
            </a>
        </div>


    </footer>




</html>
