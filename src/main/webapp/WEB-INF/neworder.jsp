<%@page import="java.util.ArrayList"%>
<%@include file="//includes/header.jsp" %>  
<%@page import="FunctionLayer.Order"%>
<%@page import="FunctionLayer.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
        <h1>Ordre side</h1>
        <% int[] itemList = (int[]) request.getAttribute("itemlist");%>

                <h1>Your order dimensions</h1>
                <h3>Width</h3>
                <%=itemList[0]%>
                <h3>Length</h3>
                <%=itemList[1]%> 
                <h3>height</h3>
                <%=itemList[2]%> 
            
<%@include file="//includes/footer.jsp" %>  
