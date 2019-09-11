<%-- 
    Document   : activity
    Created on : Jul 21, 2019, 11:36:40 AM
    Author     : V19MFoda
--%>

<%@page import="com.vodafone.wfx.model.VfeWorkflowPreparationAdp"%>
<%@page import="com.vodafone.wfx.model.VfePreparationParametersAdp"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.List"%>
<%@page import="com.vodafone.wfx.model.VfePreparationConditionsAdp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>WorkFlow X Editor</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link rel="shortcut icon" type="image/x-icon" href="https://i.dlpng.com/static/png/401889_preview.png"    />

    </head>
    <body class="font-weight-bold text-center">
        
        <div  class="   container-fluid ">
            <br/><br/><br/>
          <h1 class="navbar navbar-expand-lg navbar-dark bg-light"> Preparation Details</h1>
            
            <br/>
        
             <table    class=" table table-bordered table-hover  table-sm text-center " >
                <thead  class="thead text-center" >
                    <tr class="col-sm">
                         <th scope="col" class="col-sm text-center  " style="width: fit-content" >Preparation Id</th>
                        <th scope="col"  class="col-sm text-center" style="width: fit-content"  >Save To Pool</th>

                       
                        <th scope="col" class="col-sm text-center " style="width: fit-content" >Type</th>
                        <th scope="col" class="col-sm text-center " style="width: fit-content" >Error Codes</th>
                        <th scope="col" class="col-sm text-center " style="width: fit-content" >Preparation Mode</th>
                        <th scope="col" class="col-sm text-center " style="width: fit-content" >Description</th>
                       

<!--                        <th scope="col" class="col-sm text-center " style="width: fit-content" >Condition Type</th>
                        <th scope="col" class="col-sm text-center " style="width: fit-content" >Other Parameter</th>
                        <th scope="col" class="col-sm text-center " style="width: fit-content" >Condition Value</th>
                        <th scope="col" class="col-sm  text-center" style="width: fit-content" >Relation</th>
                        <th scope="col" class="col-sm  text-center" style="width: fit-content" >Operations</th>-->


                    </tr>
                </thead>

                <tbody >
       
        <%
            List<VfePreparationConditionsAdp> preparationsCondition = (List<VfePreparationConditionsAdp>) request.getSession().getAttribute("preparationsCondition");
            List<VfeWorkflowPreparationAdp> activityPreparations = (List<VfeWorkflowPreparationAdp>) request.getSession().getAttribute("requestedActivityPreparations");
            long preparationId = Long.parseLong( request.getSession().getAttribute("preparationId").toString());


            for (VfeWorkflowPreparationAdp preparation : activityPreparations) 
            {
                if(preparation.getPreparationId() != preparationId)
                {
                     continue;
                }
                
               
                
//             Set<VfePreparationParametersAdp> preparationParameter =    preparation.getVfeWorkflowPreparationAdp().getVfePreparationParametersAdps();
//                for( VfePreparationParametersAdp parameter : preparationParameter )
//                out.println(parameter.getId().getParameterName()    );
            

        %>
         <tr >
                       
                        <td > <%= preparation.getPreparationId()%>
                        </td>
                        <td > <%= preparation.getSaveToPool().getBooleanValue()%>
                        </td>
                        
                        <td > <%= preparation.getVfeLkPreparationTypesAdp().getPreparationDescription()%>
                        </td>
                        <td > <%= preparation.getVfeLkErrorCodesAdp()%>
                        </td>
                        <td > <%= preparation.getVfePreparationModeAdp().getModeDesc()%>
                        </td>
                        <td > <%= preparation.getDescription()%>
                        </td>
                        
                        
       
        <% } %>
          </tbody >
             </table>
          
          <br>
         <h1 class="navbar navbar-expand-lg navbar-dark bg-light"> Preparation Parameters</h1>
            
            <br>
          
              <table    class=" table table-bordered table-hover  table-sm text-center " >
                <thead  class="thead text-center" >
                    <tr class="col-sm">
                        <th scope="col" class="col-sm text-center " style="width: fit-content" >Parameter Name</th>
                        <th scope="col" class="col-sm text-center " style="width: fit-content" >Parameter Value</th>
                       
<!--                        <th scope="col" class="col-sm text-center " style="width: fit-content" >Condition Type</th>
                        <th scope="col" class="col-sm text-center " style="width: fit-content" >Other Parameter</th>
                        <th scope="col" class="col-sm text-center " style="width: fit-content" >Condition Value</th>
                        <th scope="col" class="col-sm  text-center" style="width: fit-content" >Relation</th>
                        <th scope="col" class="col-sm  text-center" style="width: fit-content" >Operations</th>-->


                    </tr>
                </thead>

                <tbody >
       
        <%
           
            for (VfeWorkflowPreparationAdp preparation : activityPreparations) 
            {
                if(preparation.getPreparationId() != preparationId)
                {
                     continue;
                }
                
                for(VfePreparationParametersAdp parameter : preparation.getVfePreparationParametersAdps())
                {
             %>
                      <tr >
                       
                        <td > <%= parameter.getId().getParameterName()%>
                        </td>
                        <td > <%= parameter.getParameterValue()%>
                        </td>
                                              
       
        <%      } 
                
               
                
//             Set<VfePreparationParametersAdp> preparationParameter =    preparation.getVfeWorkflowPreparationAdp().getVfePreparationParametersAdps();
//                for( VfePreparationParametersAdp parameter : preparationParameter )
//                out.println(parameter.getId().getParameterName()    );
                                   
       
         } %>
          </tbody >
             </table>
          
          </div>
    </body>
    
    
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
