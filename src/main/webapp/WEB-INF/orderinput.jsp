<%-- 
    Document   : orderinput
    Created on : Apr 30, 2018, 11:03:33 AM
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
        <h1>Hello World!</h1>
        
        <form name="login" action="FrontController" method="POST">
            <input type="hidden" name="command" value="login">
            <p>Indtast leverings addresse</p>
            <input type="text" name="address" value=" Nørgaardsvej 30">
            <p>Indtast telefon nummer</p>
            <input type="text" name="nummer" value="36 15 45 04" />
            <br>
            <br>
            <input type="submit" value="Submit">
                 </form>   
              
            <form action="Control" method="POST">
                <p>Indtast størrelsen på carport</p>
            <form name="shop" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="createorder">
                        Højde i meter<br>
                        <input type="number" name="height" value="5">
                        <br>
                        Længde i meter<br>
                        <input type="number" name="length" value="5">
                        <br>
                        Bredde i meter<br>
                        <input type="number" name="width" value="5">
                        <br>
                        <br>
                        <a href="FrontController?command=createorder"><button>Gå til ordre</button></a>
                    </form>    
       
        
        
    </body>
</html>
