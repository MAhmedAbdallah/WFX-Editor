<%-- 
    Document   : activity
    Created on : Aug 18, 2019, 10:54:43 AM
    Author     : V19MFoda
--%>

<%@page import="com.vodafone.wfx.model.VfePreparationConditionsAdp"%>
<%@page import="com.vodafone.wfx.util.EditorUtil"%>
<%@page import="java.util.Set"%>
<%@page import="com.vodafone.wfx.model.VfeWorkflowStepsAdp"%>
<%@page import="com.vodafone.wfx.model.VfeWorkflowsAdp"%>
<%@page import="java.util.List"%>
<%@page import="com.vodafone.wfx.model.VfeWorkflowPreparationAdp"%>
<%@page import="com.vodafone.wfx.model.VfeActivitiesAdp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>WorkFlow X Editor</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

        <!--<link rel="icon" type="image/x-icon" href="webapp/WEB-INF/view/logo.jpg" />-->
        <link rel="icon" href="logo.png">




        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <link rel="shortcut icon" type="image/x-icon" href="https://i.dlpng.com/static/png/401889_preview.png"    />


    </head>
    <body   class="font-weight-bold text-center">
        
        
        
        
        
        
        
        

        <div class="modal fade bd-insert-preparation-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-lg">
                <div class="modal-content container-fluid">
                    <div align="center" >
                        <form method="POST" action="../../Activity/Create" >


                            <input type="hidden" name="currentOrder" id="currentOrder" value="">
                            <input type="hidden" name="activityId" id="activityId" value="">
                            <br>
                            <div class="form-group row">
                                <label
                                    class="col-sm-2 col-form-label">PARAMETER NAME</label>
                                <div class="col-sm-10">

                                    <input type="text" name="activityDescription" class="form-control" id="inputPassword" placeholder="PARAMETER NAME">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="inputPassword" class="col-sm-2 col-form-label">SAVE TO POOL</label>
                                <div class="col-sm-10">
                                    <input type="text" name="activityDBQuery" class="form-control" id="inputPassword" placeholder="SAVE TO POOL">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="inputPassword" class="col-sm-2 col-form-label">PREPARATION ORDER</label>
                                <div class="col-sm-10">
                                    <input type="text" name="activityCMSFunction" class="form-control" id="inputPassword" placeholder="PREPARATION ORDER">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="inputPassword" class="col-sm-2 col-form-label">CURRENT ORDER</label>
                                <div class="col-sm-10">

                                    <select name="activityType" class="form-control">

                                          <option class="form-control" value="1">1</option>
                                      
                                    </select>


                                </div>
                            </div>
                         
                            <div class="form-group row">
                                <label for="inputPassword" class="col-sm-2 col-form-label">PREPARATION TYPE ID</label>
                                <div class="col-sm-10">
                                    <input type="text" name="activityHTTPURL" class="form-control" id="inputPassword" placeholder="PREPARATION TYPE ID">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="inputPassword" class="col-sm-2 col-form-label">ERROR CODE ID</label>
                                <div class="col-sm-10">

                                    <select  name="activitySystemID" class="form-control">

                                       
                                        <option class="form-control" value="Test">Test</option>
                                       
                                    </select>


                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="inputPassword" class="col-sm-2 col-form-label">PREPARATION MODE ID</label>
                                <div class="col-sm-10">
                                    <input type="text" name="activitySleepTime" class="form-control" id="inputPassword" placeholder="PREPARATION MODE ID">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="inputPassword" class="col-sm-2 col-form-label">DESCRIPTION</label>
                                <div class="col-sm-10">
                                    <input type="text" name="activityDoCache" class="form-control" id="inputPassword" placeholder="DESCRIPTION">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="inputPassword" class="col-sm-2 col-form-label">ROLLBACK ID</label>
                                <div class="col-sm-10">

                                    <select  name="httpRequestType" class="form-control">


                                        <option class="form-control" value="1">GET</option>
                                        <option class="form-control" value="2">POST</option>


                                    </select>


                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="inputPassword" class="col-sm-2 col-form-label">DB ID</label>
                                <div class="col-sm-10">
                                    <input type="text" name="activityHttpXmlInput" class="form-control" id="inputPassword" placeholder="DB ID">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="inputPassword" class="col-sm-2 col-form-label">DO COMMIT</label>
                                <div class="col-sm-10">
                                    <input type="text" name="activityInterfaceName" class="form-control" id="inputPassword" placeholder="DO COMMIT">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="inputPassword" class="col-sm-2 col-form-label">QUERY TIMEOUT</label>
                                <div class="col-sm-10">
                                    <input type="text" name="activityOperationName" class="form-control" id="inputPassword" placeholder="QUERY TIMEOUT">
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


        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        


        <br>
        <%
            // out.println(request.getAttribute("activityId"));
            long activityId = (long) request.getAttribute("activityId");
            VfeActivitiesAdp act = null;

            VfeWorkflowsAdp workflow = (VfeWorkflowsAdp) request.getSession(false).getAttribute("workflow");
            Set<VfeWorkflowStepsAdp> steps = workflow.getVfeWorkflowStepsAdps();

            for (VfeWorkflowStepsAdp step : steps) {
                if (step.getActivityId().getActivityId() == activityId) {
                    act = step.getActivityId();
                }
            }

            //  out.println(act.getDescription());
            VfeActivitiesAdp activity = (VfeActivitiesAdp) request.getAttribute("requestedActivity");
//       out.println(activity.getActivityId());

            List<VfeWorkflowPreparationAdp> activityPreparations = (List<VfeWorkflowPreparationAdp>) request.getAttribute("requestedActivityPreparations");
//         out.println(activityPreparations.size());

        %>
        <div  class="   container-fluid ">


            <div align ="center " class="   container-fluid ">

                <h1 class="navbar navbar-expand-lg navbar-dark bg-light">  Activity Properties </h1>  
            </div>

            <br>


            <table    class=" table table-bordered table-hover  table-sm text-center " >
                <thead  class="thead text-center" >
                    <tr class="col-sm">


                        <th scope="col" class="col-sm text-center  " style="width: fit-content" >Activity Id</th>
                        <th scope="col" class="col-sm text-center " style="width: fit-content" >Activity Description</th>

                        <th scope="col" class="col-sm text-center " style="width: fit-content" >DB Query</th>
                        <th scope="col" class="col-sm text-center " style="width: fit-content" >WorkFlow Name</th>
                        <!--<th scope="col" class="col-sm text-center " style="width: fit-content" >Current Order</th>-->
                        <th scope="col" class="col-sm text-center " style="width: fit-content" >CMS_FUNCTION </th>
                        <th scope="col" class="col-sm  text-center" style="width: fit-content" >ACTIVITY_TYPE_ID</th>
                        <th scope="col" class="col-sm  text-center" style="width: fit-content" >SP_ID</th>
                        <th scope="col" class="col-sm  text-center" style="width: fit-content" >HTTP_URL</th>
                        <th scope="col" class="col-sm  text-center" style="width: fit-content" >SYSTEM_ID</th>

                        <th scope="col" class="col-sm  text-center" style="width: fit-content" >SLEEP_TIME</th>

                        <th scope="col" class="col-sm  text-center" style="width: fit-content" >DO_CACHE</th>

                        <th scope="col" class="col-sm  text-center" style="width: fit-content" >HTTP_REQUEST_TYPE</th>

                        <th scope="col" class="col-sm  text-center" style="width: fit-content" >HTTP_XML_INPUT</th>

                        <th scope="col" class="col-sm  text-center" style="width: fit-content" >INTERFACE_NAME</th>

                        <th scope="col" class="col-sm  text-center" style="width: fit-content" >OPERATION_NAME</th>

                        <th scope="col" class="col-sm  text-center" style="width: fit-content" >INPUT_NAME</th>

                        <th scope="col" class="col-sm  text-center" style="width: fit-content" >DB_ID</th>

                        <th scope="col" class="col-sm  text-center" style="width: fit-content" >QUERY_TIMEOUT</th>

                        <th scope="col" class="col-sm  text-center" style="width: fit-content" >WEB_SERVICE_ID</th>

                        <th scope="col" class="col-sm  text-center" style="width: fit-content" >INPUT_COMMAND</th>

                        <th scope="col" class="col-sm  text-center" style="width: fit-content" >COMMAND_OUTPUT_SEPARATOR</th>

                        <th scope="col" class="col-sm  text-center" style="width: fit-content" >SSH_SERVER_ID</th>

                        <th scope="col" class="col-sm  text-center" style="width: fit-content" >SUCCESS_CODES</th>




                    </tr>
                </thead>

                <tbody >




                    <tr >
                        <td > <%= act.getActivityId()%>
                        </td>

                        <td > <%= EditorUtil.isNullString(act.getDescription())%>
                        </td>

                        <td > <%= EditorUtil.isNullString(act.getDbQuery())%>
                        </td>

                        <td > <%=EditorUtil.isNullString(act.getWorkflowName())%>
                        </td>

                        <td > <%= EditorUtil.isNullString(act.getCmsFunction())%>
                        </td>







                        <%

                            if (EditorUtil.isNull(act.getVfeLkActivitiesTypeAdp())) {
                        %>



                        <td > -
                        </td>
                        <%
                        } else {

                        %>


                        <td > <%= act.getVfeLkActivitiesTypeAdp().getDescription()%>
                        </td>

                        <%}%>


























                        <td > <%=  act.getVfeLkStoredProceduresAdp()%>
                        </td>

                        <td > <%= EditorUtil.isNullString(act.getHttpUrl())%>
                        </td>






                        <%

                            if (EditorUtil.isNull(act.getSystemId())) {
                        %>



                        <td > -
                        </td>
                        <%
                        } else {

                        %>


                        <td > <%= act.getSystemId().getSystemId()%>
                        </td>

                        <%}%>




















                        <td > <%= act.getSleepTime()%>
                        </td>

                        <td > <%= act.getDoCache()%>
                        </td>




                        <%

                            if (EditorUtil.isNull(act.getVfeLkHttpRequestTypeAdp())) {
                        %>



                        <td > -
                        </td>
                        <%
                        } else {

                        %>


                        <td > <%= act.getVfeLkHttpRequestTypeAdp().getType()%>
                        </td>

                        <%}%>


                        <td > <%=EditorUtil.isNullString(act.getHttpXmlInput())%>
                        </td>

                        <td > <%=EditorUtil.isNullString(act.getInterfaceName())%>
                        </td>

                        <td > <%= EditorUtil.isNullString(act.getOperationName())%>
                        </td>

                        <td > <%= EditorUtil.isNullString(act.getInputName())%>
                        </td>













                        <%

                            if (EditorUtil.isNull(act.getVfeLkDbAdp())) {
                        %>



                        <td > -
                        </td>
                        <%
                        } else {

                        %>


                        <td > <%= act.getVfeLkDbAdp().getDatabaseName()%>
                        </td>

                        <%}%>

















                        <td > <%= act.getQueryTimeout()%>
                        </td>









                        <%

                            if (EditorUtil.isNull(act.getVfeWebServiceSettings())) {
                        %>



                        <td > -
                        </td>
                        <%
                        } else {

                        %>


                        <td > <%= act.getVfeWebServiceSettings().getId()%>
                        </td>

                        <%}%>

















                        <td > <%=EditorUtil.isNullString(act.getInputCommand())%>
                        </td>

                        <td > <%=EditorUtil.isNullString(act.getCommandOutputSeparator())%>
                        </td>









                        <%

                            if (EditorUtil.isNull(act.getVfeLkSshServersAdp())) {
                        %>



                        <td > -
                        </td>
                        <%
                        } else {

                        %>


                        <td > <%= act.getVfeLkSshServersAdp().getIp()%>
                        </td>

                        <%}%>





















                        <td > <%=EditorUtil.isNullString(act.getSuccessCodes())%>
                        </td>

                    </tr>
                </tbody>
            </table>





























































































            <br><br>
            <div align ="center " class="   container-fluid ">

                <h1 class="navbar navbar-expand-lg navbar-light bg-light">  Preparations Properties &nbsp;&nbsp;&nbsp;
                      <a href="#" data-toggle="modal" data-target=".bd-insert-preparation-modal-lg" class="btn btn-labeled btn-success btn-sm" >

                                Insert Preparation


                            </a>
                    
                    <h1> 
                        
                            
                        </div>
            
                        <br>
                        <table    class=" table table-bordered table-hover  table-sm text-center " >
                            <thead  class="thead text-center" >
                                <tr class="col-sm">


                                    <th scope="col" class="col-sm text-center " style="width: fit-content" >Preparation Id</th>
                                    <th scope="col" class="col-sm text-center " style="width: fit-content" >Preparation Order</th>
                                    <th scope="col" class="col-sm text-center " style="width: fit-content" >Preparation Type </th>
                                    <th scope="col" class="col-sm  text-center" style="width: fit-content" >Preparation Mode Id</th>



                                    <th scope="col" class="col-sm  text-center" style="width: fit-content" >Condition ID</th>
                                    <th scope="col" class="col-sm  text-center" style="width: fit-content" >Condition Order</th>
                                    <th scope="col" class="col-sm  text-center" style="width: fit-content" >Parameter Name</th>
                                    <th scope="col" class="col-sm  text-center" style="width: fit-content" >Condition Type</th>
                                    <th scope="col" class="col-sm  text-center" style="width: fit-content" >Other Parameter Name</th>
                                    <th scope="col" class="col-sm  text-center" style="width: fit-content" >Condition Value</th>
                                    <th scope="col" class="col-sm  text-center" style="width: fit-content" >Condition Relation</th>
                                    <th scope="col" class="col-sm  text-center" style="width: fit-content" >Condition Description</th>
                                    <th scope="col" class="col-sm  text-center" style="width: fit-content" >Operation</th>
                                    
                              

                                </tr>
                            </thead>

                            <tbody >


                                <%
                                    StringBuilder conditions = new StringBuilder();

                                    for (VfeWorkflowPreparationAdp preparation : activityPreparations) {
                                %> <tr >


                                    <td >  

                                        <a href="../../PreparationCondition/Get/Conditions/<%= preparation.getPreparationId()%>">
                                            <%= preparation.getPreparationId()%>
                                            <br>
                                              <a href="#" onclick="return confirm('Are you sure?')" class=" btn-sm  btn-labeled btn-danger "  role="button">Delete Preparation</a>  

                                        </a>                


                                    </td>

                                    <td > <%= preparation.getPreparationOrder()%> </td>

                                    <td > <%= preparation.getVfeLkPreparationTypesAdp().getPreparationDescription()%>
                                    </td>

                                    <td > <%= preparation.getVfePreparationModeAdp().getModeDesc()%>
                                    </td>                      


                                    <%
                                        for (VfePreparationConditionsAdp condition : preparation.getVfePreparationConditionsAdps())
                                        {
                                            // conditions.append(condition.getId().getConditionId() );
                                            String relationtype="OR";
                                            if(condition.getRelationTypeId()!= null){
                                            Long relationID=condition.getRelationTypeId();
                                            
                                            
                                            if(relationID.equals(1L))
                                                relationtype="AND";
                                            }
                                            else{
                                                relationtype="-";
        }%>

                                    <td > <%= condition.getId().getConditionId()%>
                                    <td > <%= EditorUtil.isNull(condition.getConditionOrder())%>
                                    <td > <%= condition.getVfeConditionsAdp().getParameterName()%>
                                    <td > <%= condition.getVfeConditionsAdp().getVfeLkConditionTypesAdp().getConditionTypeDesc()%>

                                    <td > <%= condition.getVfeConditionsAdp().getOtherParameterName()%>  


                                    <td > <%= condition.getVfeConditionsAdp().getConditionValue()%>
                                    <td > <%= relationtype %>
                                    <td > <%= EditorUtil.isNullString(condition.getDescription())%>
                                    <td > 
                                    
                                    
                                    
                                    
                                                                <a href="#" onclick="return confirm('Are you sure?')" class=" btn-sm  btn-labeled btn-danger "  role="button">Delete Condition</a>  

                                    </td>


                                <tr></tr>
                            <td colspan="4">




                                <%

                                        }
                                    }
                                %>

                                </tr>
                                </tbody>
                        </table>

                        </div>

                        </body>
                        </html>
