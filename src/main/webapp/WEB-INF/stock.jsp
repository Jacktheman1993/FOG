<%@include file="//includes/header.jsp" %> 
<%@page import="FunctionLayer.Materials"%>
<%@page import="java.util.ArrayList"%>

        
        <% ArrayList<Materials>listen = (ArrayList<Materials>) request.getAttribute("Stock");%>
        
        <h1>Hello here is all Materials</h1>
        <% for(int i = 0; i < listen.size(); i++){
                    out.println("Materials: " + listen.get(i)+"<br>");
                    
                }
                %>

<%@include file="//includes/footer.jsp" %>