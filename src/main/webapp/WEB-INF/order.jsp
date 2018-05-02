<%@include file="//includes/header.jsp" %>  
<%@page import="FunctionLayer.Order"%>
<%@page import="FunctionLayer.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
        <h1>Mine Ordre</h1>
        <% Order ord = (Order)request.getAttribute("order" );%>
            <h2>Nye Ordre</h2>
            <h2>Ordre id: <%=ord.getIdOrder()%> </h2>
            <h2>Dato: <%=ord.getOrderDate()%> </h2>
            <h2>Total pris: <%=ord.getPriceTotal() %> </h2>
            <br>
            <h2>Gamle Ordre</h2>
            <h2></h2>
            
<%@include file="//includes/footer.jsp" %>  
