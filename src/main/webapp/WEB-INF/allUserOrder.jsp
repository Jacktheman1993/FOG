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
<h1><%=request.getAttribute("email")%> Mine Ordre </h1>
<% ArrayList<Order>listen = (ArrayList<Order>) request.getAttribute("allUserOrder");%>
<table>
                <% for(int i = 0; i < listen.size(); i++){
                    out.println("<tr>");
                    out.println("<th>");
                    out.println("Order Nummer: " + "<td>" + listen.get(i) + " <a href=´FrontController?command=stykListe´><button>Se Stykliste</button></a></td>");
                    out.println("</th>");
                    out.println("<tr>");
                }
                %>
</table>
                <%@include file="//includes/footer.jsp" %> 