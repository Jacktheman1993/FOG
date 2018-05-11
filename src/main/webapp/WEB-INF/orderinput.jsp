<%@include file="//includes/header.jsp" %>
<h1>Ordre Input</h1> 
<h2>Indtast størrelsen på carport</h2>
<form name="orderinput" action="FrontController" method="POST">
    <input type="hidden" name="command" value="neworder">
    <h3>Width in cm (min 400, max 1000)</h3>
    <input type="number" name="width" value="500" maxlength="1000" minlength="400">
    <br>
    <h3>Length in cm (min 400, max 2000)</h3>
    <input type="number" name="length" value="500" maxlength="2000" minlength="400">
    <br>
    <h3>Height in cm (min 200, max 300)</h3>
    <input type="number" name="height" value="200" maxlength="300" minlength="200">
    <br>
    <br>
    <a href="FrontController?command=neworder"><button>Bestil ordre</button></a>
</form>
<br>
<form method="post" action="mailto:cph-aa264@cphbusiness.dk" >
    <input type="submit" value="Send Email" />
</form>



<%@include file="//includes/footer.jsp" %>  
