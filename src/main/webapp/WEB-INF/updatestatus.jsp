<%-- 
    Document   : updatestatus
    Created on : 25-05-2018, 11:14:49
    Author     : Martin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Status</title>
    </head>
    <body>
        <h1>Status on order Updated to:</h1>
        
        <% Boolean stat = ((Boolean)request.getAttribute("statusBool"));
        
        if(stat)
        out.print("True");
        else
        out.print("False");
        %>
    </body>
</html>
