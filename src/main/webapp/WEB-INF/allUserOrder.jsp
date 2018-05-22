<%@page import="PresentationLayer.FrontController"%>
<%@include file="//includes/header.jsp" %> 
<%@page import="java.util.ArrayList"%>
<%@page import="FunctionLayer.Order"%>

<style>
td, th {
    border: 2px solid #dddddd;
    text-align: left;
    padding: 8px;
}    
    
</style>

<% ArrayList<Order>listen = (ArrayList<Order>) request.getAttribute("allUsersOrders");%>

<table>
                <h1>Mine Orders</h1>
                <% for(int i = 0; i < listen.size(); i++){
                    out.println("<tr>");
                    out.println("<th>");
                    out.println("Order Nummer: " + "<td>" + listen.get(i) + "</td>");
                    out.println("</th>");
                    out.println("<tr>");
                }
                %>
</table>
                <%@include file="//includes/footer.jsp" %> 