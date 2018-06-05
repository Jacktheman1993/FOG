<%@include file="//includes/header.jsp" %>
<h1>Build-A-Carport</h1> 
<h2>Please specify each dimension for the size of your carport</h2>
<form name="orderinput" action="FrontController" method="POST">
    <input type="hidden" name="command" value="neworder">
    <h3>Width in cm (min 400, max 1000)</h3>
    <input type="number" name="width" value="600" maxlength="1000" minlength="400">
    <br>
    <h3>Length in cm (min 400, max 2000)</h3>
    <input type="number" name="length" value="780" maxlength="2000" minlength="400">
    <br>
    <h3>Height in cm (min 200, max 300)</h3>
    <input type="number" name="height" value="200" maxlength="300" minlength="200">
    <br>
    <h3>Would you like a shed for your carport?</h3>
    Yes<input type="radio" name="shed" value="shed_yes" />
    No<input type="radio" name="shed"  value="shed_no" checked="checked" />
    <br>
    <a href="FrontController?command=neworder"><button>Confirm Order</button></a>
</form>
<br>
<form method="post" action="mailto:cph-aa264@cphbusiness.dk" >
    <input type="submit" value="Send Email" />
</form>

<%@include file="//includes/back.jsp" %>
<%@include file="//includes/logout.jsp" %> 
<%@include file="//includes/footer.jsp" %>  
