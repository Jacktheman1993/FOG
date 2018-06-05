<%@include file="//includes/header.jsp" %> 
<%@page import="FunctionLayer.Materials"%>
<%@page import="java.util.ArrayList"%>


    
        <% ArrayList<Materials>listen = (ArrayList<Materials>) request.getAttribute("Stock");%>

        <h1>Current overview of all materials</h1>
<table>
    
        <% for(int i = 0; i < listen.size(); i++){
            out.println("<tr>");
            out.println("<th>");
            out.println("Materials: " + "<td>" + listen.get(i) + "</td>");
            out.println("</th>");
            out.println("<tr>");
                }
                %>

    
</table>
<%@include file="//includes/back.jsp" %>
<%@include file="//includes/logout.jsp" %> 
<%@include file="//includes/footer.jsp" %>