<%@include file="//includes/header.jsp" %>  
        
        <h1>Hello <%=request.getParameter( "email")%> </h1>
        You are now logged in as a EMPLOYEE of our wonderful site.
        <a href="FrontController?command=order"><button>G? til ordre</button></a>
        <a href="FrontController?command=allOrders"><button>Vis alle ordrer</button></a>
        <a href="FrontController?command=insertdata"><button>G? til insert data</button></a>
        <a href="FrontController?command=getdata"><button>G? til hent data</button></a>
<%@include file="//includes/footer.jsp" %>  
