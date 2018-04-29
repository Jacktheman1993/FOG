<%-- 
    Document   : AllOrders
    Created on : 29-04-2018, 22:49:03
    Author     : simon
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="FunctionLayer.Order"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <% ArrayList<Order>listen = (ArrayList<Order>) request.getAttribute("allOrders");%>

                <h1>Orders</h1>
                <% for(int i = 0; i < listen.size(); i++){
                    out.println("New Order: " + listen.get(i));
                }
                %>
    </body>
</html>
