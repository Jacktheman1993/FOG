<%-- 
    Document   : stock
    Created on : May 11, 2018, 12:19:51 PM
    Author     : Alek
--%>

<%@page import="FunctionLayer.Materials"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <% ArrayList<Materials>listen = (ArrayList<Materials>) request.getAttribute("Stock");%>
        
        <h1>Hello here is all Materials</h1>
        <% for(int i = 0; i < listen.size(); i++){
                    out.println("Materials: " + listen.get(i)+"<br>");
                    
                }
                %>
    
    
    </body>
</html>
