<%@include file="//includes/header.jsp" %> 
        <title>Customer home page</title>
        <h1>Hello <%=request.getParameter( "email" )%> </h1>
        You are now logged in as a customer of our wonderful site.
        <a href="FrontController?command=order"><button>G? til mine ordre</button></a>
        <a href="FrontController?command=carportdrawing"><button>G? til tegning af carport</button></a>
        <a href="FrontController?command=orderinput"><button>G? til bestilling</button></a>
        <a href="FrontController?command=insertdata"><button>G? til insert data</button></a>
        <a href="FrontController?command=getdata"><button>G? til hent data</button></a>
<%@include file="//includes/footer.jsp" %> 
