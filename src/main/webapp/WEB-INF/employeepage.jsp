<%@include file="//includes/header.jsp" %>  
        
        <h1>Hello <%=request.getParameter( "email")%> </h1>
        You are now logged in as a EMPLOYEE of our wonderful site.
        <a href="FrontController?command=order"><button>G? til ordre</button></a>
        <a href="FrontController?command=allOrders"><button>Vis alle ordrer</button></a>
        <a href="FrontController?command=allUsers"><button>Se alle Users</button></a>
        <a href="FrontController?command=insertdata"><button>G? til insert data</button></a>
        <a href="FrontController?command=stykListe"><button>Gå til stykliste data</button></a>
        <a href="FrontController?command=stock"><button>Gå til lager status</button></a>
        <a href="FrontController?command=updateMaterial"><button>Edit a Material</button></a>
        
        <h2>SEARCH ORDER</h2>
        
        <form id="formSearch" action="FrontController" method="post">
            <label id="labelUsername" for="idOrder">idOrder</label>
            <input type="hidden" name="command" value="orders" />
            <input type="number" name="idOrder" />
            <input type="submit" value="SEARCH ORDER" />
        </form>
        
<%@include file="//includes/footer.jsp" %>  
