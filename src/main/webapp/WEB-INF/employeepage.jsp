<%@include file="//includes/header.jsp" %>  
        
        <h1>Hello <%=request.getParameter( "email")%> </h1>
        You are now logged in as a EMPLOYEE of FOG Carports.
        <a href="FrontController?command=allOrders"><button>View all Orders</button></a>
        <a href="FrontController?command=allUsers"><button>View all Users</button></a>
        <a href="FrontController?command=stock"><button>Go to stock status</button></a>
        <a href="FrontController?command=updateMaterial"><button>Edit a Material</button></a>
                <%@include file="//includes/logout.jsp" %> 
        
        <h2>SEARCH FOR AN ORDER BY ORDERID</h2>
        
        <form id="formSearch" action="FrontController" method="post">
            <label id="labelUsername" for="idOrder">idOrder</label>
            <input type="hidden" name="command" value="orders" />
            <input required="" type="number" name="idOrder" />
            <input type="submit" value="SEARCH ORDER" />
        </form>
        
<%@include file="//includes/footer.jsp" %>  
