<%@include file="//includes/header.jsp" %> 
<%@page import="FunctionLayer.Materials"%>
<%@page import="java.util.ArrayList"%>

<style>
td, th {
    border: 2px solid #dddddd;
    text-align: left;
    padding: 8px;
}    
    
</style>


    
        <% ArrayList<Materials>listen = (ArrayList<Materials>) request.getAttribute("Stock");%>

        <h1>Hello here is all Materials</h1>
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
<%@include file="//includes/footer.jsp" %>