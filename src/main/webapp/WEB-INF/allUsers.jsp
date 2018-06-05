<%@include file="//includes/header.jsp" %> 
<%@page import="java.util.ArrayList"%>
<%@page import="FunctionLayer.User"%>

<style>
td, th {
    border: 2px solid #dddddd;
    text-align: left;
    padding: 8px;
}    
    
</style>

<% ArrayList<User>listen = (ArrayList<User>) request.getAttribute("allUsers");%>

<table>
                <h1>All Customers & Admins</h1>
                <% for(int i = 0; i < listen.size(); i++){
                    out.println("<tr>");
                    out.println("<th>");
                    out.println("User info: "+ "<td>" + listen.get(i)+"</td>");
                    out.println("</th>");
                    out.println("<tr>");
                }
                %>
</table>
<%@include file="//includes/back.jsp" %>
<%@include file="//includes/logout.jsp" %> 
<%@include file="//includes/footer.jsp" %> 
