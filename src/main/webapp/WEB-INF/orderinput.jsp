<%@include file="//includes/header.jsp" %>
        <h1>Ordre Input</h1> 
            <form action="Control" method="POST">
                <h2>Indtast st�rrelsen p� carport</h2>
            <form name="shop" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="createorder">
                        <h3>H�jde i meter</h3>
                        <input type="number" name="height" value="5">
                        <br>
                        <h3>L�ngde i meter</h3>
                        <input type="number" name="length" value="5">
                        <br>
                        <h3>Bredde i meter</h3>
                        <input type="number" name="width" value="5">
                        <br>
                        <br>
                        <a href="FrontController?command=createorder"><button>G� til ordre</button></a>
                    </form>    
       
        
        
<%@include file="//includes/footer.jsp" %>  
