<%-- 
    Document   : getdata
    Created on : 02-05-2018, 20:20:39
    Author     : Martin
--%>
<%@page import="java.sql.*"%>
<%@page import="java.util.Date"%>
<% Class.forName("com.mysql.jdbc.Driver"); %>
<%@page import="FunctionLayer.Order"%>
<%@page import="FunctionLayer.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>GET DATA HERE</title>
    </head>
    <body>
        <h1>Heres the data</h1>
        <% Order ord = (Order)request.getAttribute("order" );%>
        <h2>Width:  <%=ord.getLength()%> </h2>
        <h2>Length: <%=ord.getWidth()%> </h2>
    </body>
</html>
