<%-- 
    Document   : index
    Created on : Jun 25, 2019, 1:34:51 PM
    Author     : V19MFoda
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="javax.servlet.http.HttpServletRequest, com.vodafone.wfx.model.VfeWorkflowsAdpId,  java.util.List,  org.apache.log4j.Logger, com.vodafone.wfx.util.EditorUtil"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en" xmlns:th="http://www.thymeleaf.org">
    <head>
         <!--Author     : V19MFoda-->
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>WorkFlow X Editor</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

        <link type="text/css" href="static/css/bootstrap.min.css" rel="stylesheet"   th:src="@{/css/bootstrap.min.css}" />
        <link rel="stylesheet" th:href="@{/css/bootstrap.min.css}"/>

        <link rel="shortcut icon" type="image/x-icon" href="webapp/WEB-INF/view/logo.jpg" />
<link rel="shortcut icon" type="image/x-icon" href="https://i.dlpng.com/static/png/401889_preview.png"    />

    </head>



    <body class="font-weight-bold font-small ">











        <div class="jumbotron jumbotron-fluid font-weight-bold">
            <div class="container">
                               <h1 class="display-4  animated swing" style="font-family:Vodafone Rg;" align="center">                  
                 
                     <img src="https://i.dlpng.com/static/png/401889_preview.png" 
                         alt="Vodafone Logo" width="100" height="100" align="middle">
                    WorkFlowX-Editor
                
                </h1>

                <!--<p class="lead">This is a modified jumbotron that occupies the entire horizontal space of its parent.</p>-->



                <br/><br/><br/>
                <div  class=" container   ">
                    <form action="index" class="form-row mb-4 form-group ">

                        <label for="workflow" class="     animated bounce infinite   col-sm-2 col-form-label">WorkFlow Name</label>



                        <input type="text" name="workflow"  id="workflow" class="form-control-sm w-30  form-control input-sm  
                               col-xs-3"  />
                        <br><br>


                        <button type="submit" value="Search" class="btn btn-primary">Search</button>


                    </form>









                    <%
                        if (request.getAttribute("list") != null) {
                            List list = (List) request.getAttribute("list");

                    %>

                    <table    class="table table-hover table-sm  table table-bordered table table-striped" >
                        <thead  class="thead-dark" >
                            <tr>
                                <th class="col">WorkFlow Id</th>
                                <th class="col">WorkFlow Name</th>
                            </tr>
                        </thead>
                        <tbody >

                            <%       for (int i = 0; i < list.size(); i++) {
                                    Object[] obj = (Object[]) list.get(i);
                                    String workFlowName = (String) obj[0];
                                    VfeWorkflowsAdpId id = (VfeWorkflowsAdpId) obj[1];


                            %>
                            <tr >
                                <td  class="col">
                                    <a href="WorkFlow/Get/<%=id.getWorkflowId()%>">
                                        <%=id.getWorkflowId()%>
                                    </a>
                                </td>
                                <td class="col"><%= workFlowName%></td>
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
