<%-- 
    Document   : hardcodedstykliste
    Created on : 15-05-2018, 11:41:20
    Author     : Martin
--%>

<%@page import="FunctionLayer.Order"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hardcoded Stykliste</title>
    </head>
    <body>
        <h1>Samlet antal varer i denne ordre:</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>OrderID</th>
                    <th>MaterialsID</th>
                    <th>Antal</th>
                    <th>Pris</th>
                    <th>Tekst</th>
                    <th>Type</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>1</td>
                    <td>1</td>
                    <td>4</td>
                    <td>400</td>
                    <td>3meter</td>
                    <td>Stolper</td>
                </tr>
                <tr>
                    <td>1</td>
                    <td>2</td>
                    <td>8</td>
                    <td>800</td>
                    <td>2meter</td>
                    <td>Spær</td>
                </tr>
                <tr>
                    <td>1</td>
                    <td>3</td>
                    <td>2</td>
                    <td>300</td>
                    <td>Pakke af 200</td>
                    <td>Skruer</td>
                </tr>
                <tr>
                    <td>1</td>
                    <td>4</td>
                    <td>6</td>
                    <td>1000</td>
                    <td>6meter</td>
                    <td>Tagbeslag</td>
                </tr>
            </tbody>
        </table>

    </body>
</html>
