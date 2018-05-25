<%-- 
    Document   : orders
    Created on : 23-05-2018, 12:02:07
    Author     : Martin
--%>

<%@page import="FunctionLayer.Order"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Searched Orders</title>
    </head>
    <body>
        <h1>Showing searched orders</h1>
        
        <%
            Order order1 =  ((Order)request.getAttribute("orders"));
            
            
            
                out.println("<p>Order found!</p>");
                out.println("<p>");
                
                out.print("Order ID: " + order1.getIDorder()+"<br>");
                out.print("Height: " + order1.getHeight()+"<br>");
                out.print("Length: " + order1.getLength()+"<br>");
                out.print("Width: " + order1.getWidth()+"<br>");
                out.print("Order Status: " + order1.isStatus()+"<br>");
                out.print("Shed: " + order1.isShed()+"<br>");
                
                
            
        %>
        
        <h1>Change Status on Order</h1>
        
<form name="status" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="UpdateStatus">
                        Order ID:<br>
                        <input type="number" name="idOrder" value="">
                        <br>
                        <h3>Change order from "Processing" to "Ready to deliver"?</h3>
                        Yes<input type="radio" name="status" value="status_yes" />
                        No<input type="radio" name="status"  value="status_no" checked="checked" />
                        <input type="submit" value="Update Status">
                    </form>
        
        <a href="index.jsp">BACK TO LOGIN PAGE</a>
    </body>
</html>
