<%@include file="//includes/header.jsp" %>
        <title>Customer home page</title>
        <h1>Hello <%=request.getParameter( "email" )%> </h1>
        
        You are now logged in as a customer of our wonderful site.
        <a href="FrontController?command=carportdrawing"><button>G? til tegning af carport</button></a>
        <a href="FrontController?command=orderinput"><button>Lav din bestilling</button></a>
        <a href="FrontController?command=getdata"><button>G? til hent data</button></a>
        <a href="FrontController?command=allUserOrder" ><button>Mine Ordre</button></a>
        <%@include file="//includes/footer.jsp" %> 
