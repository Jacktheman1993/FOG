<%@include file="//includes/header.jsp" %> 
<%@page import="java.util.ArrayList"%>
<%@page import="FunctionLayer.User"%>
<% ArrayList<User>listen = (ArrayList<User>) request.getAttribute("allUsers");%>

                <h1>All Customers & Admins</h1>
                <% for(int i = 0; i < listen.size(); i++){
                    out.println("All Users: " + listen.get(i)+"<br>");
                    
                }
                %>
<%@include file="//includes/footer.jsp" %> 
