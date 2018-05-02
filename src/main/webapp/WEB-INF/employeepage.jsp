<%@include file="//includes/header.jsp" %>  
        
        <h1>Hello <%=request.getParameter( "email")%> </h1>
        You are now logged in as a EMPLOYEE of our wonderful site.
        <a href="FrontController?command=order"><button>Gå til ordre</button></a>
        <a href="FrontController?command=allOrders"><button>Vis alle ordrer</button></a>
<%@include file="//includes/footer.jsp" %>  
