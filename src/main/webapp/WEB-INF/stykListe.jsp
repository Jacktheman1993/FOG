<%@include file="//includes/header.jsp" %> 
<%@page import="FunctionLayer.Materials"%>
<%@page import="FunctionLayer.LineItems"%>
<%@page import="FunctionLayer.Order"%>
<%@page import="java.util.ArrayList"%>

<style>
td, th {
    border: 2px solid #dddddd;
    text-align: left;
    padding: 8px;
}    
    
</style>


    
        <% ArrayList<LineItems>listen = (ArrayList<LineItems>) request.getAttribute("stykListe");%>

        <h1>Here is bill for your ordre</h1>
<table>
    
        <% for(int i = 0; i < listen.size(); i++){
            out.println("<tr>");
            out.println("<th>");
            out.println("Bill: " + "<td>" + listen.get(i) + "</td>");
            out.println("</th>");
            out.println("<tr>");
                }
                %>

    
</table>
<%@include file="//includes/footer.jsp" %>