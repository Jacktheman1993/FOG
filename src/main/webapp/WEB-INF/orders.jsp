<%@include file="//includes/header.jsp" %> 
<%@page import="FunctionLayer.Order"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                        <input required="" type="number" name="idOrder" value="">
                        <br>
                        <h3>Change order from "Processing" to "Ready to deliver"?</h3>
                        Yes<input type="radio" name="status" value="status_yes" />
                        No<input type="radio" name="status"  value="status_no" checked="checked" />
                        <input type="submit" value="Update Status">
                    </form>
<%@include file="//includes/back.jsp" %>
<%@include file="//includes/logout.jsp" %> 
<%@include file="//includes/footer.jsp" %> 
