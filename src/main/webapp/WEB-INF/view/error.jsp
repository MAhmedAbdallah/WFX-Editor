<%-- 
    Document   : error
    Created on : Sep 10, 2019, 1:17:12 PM
    Author     : V19MFoda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>WorkFlow X Editor</title>        

            <style>
                * {
                    -webkit-box-sizing: border-box;
                    box-sizing: border-box;
                }

                body {
                    padding: 0;
                    margin: 0;
                }

                #notfound {
                    position: relative;
                    height: 100vh;
                }

                #notfound .notfound {
                    position: absolute;
                    left: 50%;
                    top: 50%;
                    -webkit-transform: translate(-50%, -50%);
                    -ms-transform: translate(-50%, -50%);
                    transform: translate(-50%, -50%);
                }

                .notfound {
                    max-width: 767px;
                    width: 100%;
                    line-height: 1.4;
                    padding: 0px 15px;
                }

                .notfound .notfound-404 {
                    position: relative;
                    height: 150px;
                    line-height: 150px;
                    margin-bottom: 25px;
                }

                .notfound .notfound-404 h1 {
                    font-family: 'Titillium Web', sans-serif;
                    font-size: 186px;
                    font-weight: 900;
                    margin: 0px;
                    text-transform: uppercase;
                    background: url('../img/text.png');
                    -webkit-background-clip: text;
                    -webkit-text-fill-color: transparent;
                    background-size: cover;
                    background-position: center;
                }

                .notfound h2 {
                    font-family: 'Titillium Web', sans-serif;
                    font-size: 26px;
                    font-weight: 700;
                    margin: 0;
                }

                .notfound p {
                    font-family: 'Montserrat', sans-serif;
                    font-size: 14px;
                    font-weight: 500;
                    margin-bottom: 0px;
                    text-transform: uppercase;
                }

                .notfound a {
                    font-family: 'Titillium Web', sans-serif;
                    display: inline-block;
                    text-transform: uppercase;
                    color: #fff;
                    text-decoration: none;
                    border: none;
                    background: #5c91fe;
                    padding: 10px 40px;
                    font-size: 14px;
                    font-weight: 700;
                    border-radius: 1px;
                    margin-top: 15px;
                    -webkit-transition: 0.2s all;
                    transition: 0.2s all;
                }

                .notfound a:hover {
                    opacity: 0.8;
                }

                @media only screen and (max-width: 767px) {
                    .notfound .notfound-404 {
                        height: 110px;
                        line-height: 110px;
                    }
                    .notfound .notfound-404 h1 {
                        font-size: 120px;
                    }
                }

            </style>

            <!-- Google font -->
            <link href="https://fonts.googleapis.com/css?family=Montserrat:500" rel="stylesheet">
                <link href="https://fonts.googleapis.com/css?family=Titillium+Web:700,900" rel="stylesheet">

                    <!-- Custom stlylesheet -->
                    <link type="text/css" rel="stylesheet" href="css/style.css" />

                    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
                    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
                    <!--[if lt IE 9]>
                              <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
                              <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
                            <![endif]-->
                    <link rel="shortcut icon" type="image/x-icon" href="https://i.dlpng.com/static/png/401889_preview.png"    />

                    </head>

                    <body>

                        <div id="notfound">
                            <div class="notfound">
                                <div class="notfound-404">
                                    <h1>

                                        <image src="https://images.techhive.com/images/article/2016/04/error-thinkstock-100655502-primary.idge.jpg" style="width:300px;height:200px;">

                                    </h1>
                                </div>
                                <br>
                                    <h2>Oops! This Page Could Not Be Found &#128512;</p>
                                    
                                    <%
                                    if(  request.getAttribute("errorMessage") == null){
                                    %>
</h2>
                                    <p>Sorry but the page you are looking for does not exist, have been removed. name changed or is temporarily unavailable , Request wrong resource please check again </p>
                                    
                                    <%}
else {

                                    %>
                                    
<p><%=request.getAttribute("errorMessage") %> <% }%> </p>

                                    
                                    <a href="http://localhost:8070/WFX-Editor/" 

                                       onclick="return true"

                                       >Go To Homepage</a>
                            </div>
                        </div>

                    </body><!-- This templates was made by Colorlib (https://colorlib.com) -->

                    </html>
