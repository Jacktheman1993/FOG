<%-- 
    Document   : stock
    Created on : May 11, 2018, 12:19:51 PM
    Author     : Alek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%=request.getParameter( "email")%></h1>
        <h2><% int[] stockList = (int[]) request.getAttribute("stocklist");%></h2>
    
            <h3>Lager ID & Stock</h3>
    = <%=stockList[0]%>
    <%=stockList[1]%>
    
    </body>
</html>
