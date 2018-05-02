<%@include file="//includes/header.jsp" %> 
<%@page import="java.util.ArrayList"%>
<%@page import="FunctionLayer.Order"%>
<% ArrayList<Order>listen = (ArrayList<Order>) request.getAttribute("allOrders");%>

                <h1>Orders</h1>
                <% for(int i = 0; i < listen.size(); i++){
                    out.println("New Order: " + listen.get(i)+"<br>");
                    
                }
                %>
<%@include file="//includes/footer.jsp" %> 
