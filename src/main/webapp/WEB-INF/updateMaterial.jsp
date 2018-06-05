<%-- 
    Author     : Alek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UpdateMats</title>
    </head>
    <body>
        <h1>Update Materials</h1>
        
<form name="update" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="matUpdated">
                        ID:<br>
                        <input required="" type="number" name="ID" value="">
                        <br>
                        Name:<br>
                        <input required="" type="text" name="Name" value="">
                        <br>
                        Length:<br>
                        <input required="" type="number" name="Length" value="">
                        <br>
                        Stock:<br>
                        <input required="" type="number" name="Stock" value="">
                        <br>
                        Price:<br>
                        <input required="" type="number" name="Price" value="">
                        <br>
                        Description:<br>
                        <input required="" type="text" name="Description" value="">
                        <br>
                        <input type="submit" value="Update Material">
                    </form>
<%@include file="//includes/back.jsp" %>
<%@include file="//includes/logout.jsp" %> 
<%@include file="//includes/footer.jsp" %> 
