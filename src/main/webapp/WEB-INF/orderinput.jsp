<%@include file="//includes/header.jsp" %>
        <h1>Ordre Input</h1> 
                <h2>Indtast størrelsen på carport</h2>
            <form name="orderinput" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="neworder">
                        <h3>Width in cm</h3>
                        <input type="number" name="width" value="5">
                        <br>
                        <h3>Length in cm</h3>
                        <input type="number" name="length" value="5">
                        <br>
                        <h3>Height in cm</h3>
                        <input type="number" name="height" value="5">
                        <br>
                        <br>
                        <a href="FrontController?command=neworder"><button>Bestil ordre</button></a>
                    </form>    
       
        
        
<%@include file="//includes/footer.jsp" %>  
