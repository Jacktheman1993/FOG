<%@include file="//includes/header.jsp" %>
        <title>Customer home page</title>
        <h1>Hello <%=request.getParameter( "email" )%> </h1>
        
        You are now logged in as a customer to FOG Carports.
        <a href="FrontController?command=orderinput"><button>Build-a-Carport</button></a>
        <a href="FrontController?command=allUserOrder" ><button>My Orders</button></a>
                <%@include file="//includes/logout.jsp" %> 
        <%@include file="//includes/footer.jsp" %> 
