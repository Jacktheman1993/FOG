<%-- 
    Document   : insertdata
    Created on : 02-05-2018, 20:20:26
    Author     : Martin
--%>
<%@page import="java.sql.*"%>
<%@page import="java.util.Date"%>
<%@page import="PresentationLayer.CreateOrder"%>
<% Class.forName("com.mysql.jdbc.Driver"); %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Stranger</title>
    </head>
    <body>
        <h1>Insert data</h1>
        <%!
            %>
        <form name="createOrder" action="FrontController?command=insertdata" method="POST">
            <table border="0">
                <thead>
                    <tr>
                        <th>First Value</th>
                        <th><input type="text" name="width" value="" size="50" /></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Second Value:</td>
                        <td><input type="text" name="length" value="" size="50" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td></td>
                    </tr>
                </tbody>
            </table>
            <input type="reset" value="Clear" name="clear" />
            <input type="submit" value="Submit" name="submit" />
        </form>
    </body>
</html>
