<%-- 
    Document   : updateMaterials
    Created on : May 23, 2018, 12:15:14 PM
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
        <h1>Update Materials</h1>
        
<form name="update" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="matUpdated">
                        ID:<br>
                        <input type="number" name="ID" value="2">
                        <br>
                        Name:<br>
                        <input type="text" name="Name" value="test test">
                        <br>
                        Length:<br>
                        <input type="number" name="Length" value="360">
                        <br>
                        Stock:<br>
                        <input type="number" name="Stock" value="237">
                        <br>
                        Price:<br>
                        <input type="number" name="Price" value="199">
                        <br>
                        Description:<br>
                        <input type="text" name="Description" value="hej simon">
                        <br>
                        <input type="submit" value="Update Material">
                    </form>
        
    </body>
</html>
