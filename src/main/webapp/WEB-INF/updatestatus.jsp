<%@include file="//includes/header.jsp" %> 
        <h1>Status on order Updated to:</h1>
        
        <% Boolean stat = ((Boolean)request.getAttribute("statusBool"));
        
        if(stat)
        out.print("True");
        else
        out.print("False");
        %>
<%@include file="//includes/logout.jsp" %> 
<%@include file="//includes/footer.jsp" %> 
