<%@include file="//includes/header.jsp" %>
        <h1>Hello World!</h1>
        
        <form name="login" action="FrontController" method="POST">
            <input type="hidden" name="command" value="login">
            <p>Indtast leverings addresse</p>
            <input type="text" name="address" value=" N�rgaardsvej 30">
            <p>Indtast telefon nummer</p>
            <input type="text" name="nummer" value="36 15 45 04" />
            <br>
            <br>
            <input type="submit" value="Submit">
                 </form>   
              
            <form action="Control" method="POST">
                <h2>Indtast st�rrelsen p� carport</h2>
            <form name="shop" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="createorder">
                        <h3>H�jde i meter</h3><br>
                        <input type="number" name="height" value="5">
                        <br>
                        <h3>L�ngde i meter</h3><br>
                        <input type="number" name="length" value="5">
                        <br>
                        <h3>Bredde i meter</h3><br>
                        <input type="number" name="width" value="5">
                        <br>
                        <br>
                        <a href="FrontController?command=createorder"><button>G� til ordre</button></a>
                    </form>    
       
        
        
<%@include file="//includes/footer.jsp" %>  
