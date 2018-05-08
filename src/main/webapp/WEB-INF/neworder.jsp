<%@page import="java.util.ArrayList"%>
<%@include file="//includes/header.jsp" %>  
<%@page import="FunctionLayer.Order"%>
<%@page import="FunctionLayer.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
        <h1>Ordre side</h1>
        <% int[] itemList = (int[]) request.getAttribute("itemlist");%>

                <h1>Your order dimensions</h1>
                <h3>Width</h3>
                <%=itemList[0]%>
                <h3>Length</h3>
                <%=itemList[1]%> 
                <h3>height</h3>
                <%=itemList[2]%> 
                

<SVG width="1000" height=1000>
<rect x="30" y="0" height="<%=itemList[0]%>" width="<%=itemList[1]%>"
        style="stroke:#000000; fill: none "/>

  <text x="280" y="20" transform="rotate(90 0,20)">
    Width
  </text>
  <text x="400" y="650">
    Length
  </text>
<defs>
    <marker id="beginArrow" 
    	markerWidth="9" markerHeight="9" 
    	refX="0" refY="4" 
    	orient="auto">
        <path d="M0,4 L8,0 L8,8 L0,4" style="fill: #000000s;" />
    </marker>
    <marker id="endArrow" 
    	markerWidth="9" markerHeight="9" 
    	refX="8" refY="4" 
    	orient="auto">
        <path d="M0,0 L8,4 L0,8 L0,0" style="fill: #000000;" />
    </marker>
</defs>
<line x1="<%=itemList[1]%>"  y1="660" x2="10"   y2="660" 
	style="stroke:#006600;
	marker-start: url(#beginArrow);
   marker-end: url(#endArrow);"/>
<defs>
    <marker id="beginArrow" 
    	markerWidth="9" markerHeight="9" 
    	refX="0" refY="4" 
    	orient="auto">
        <path d="M0,4 L8,0 L8,8 L0,4" style="fill: #000000s;" />
    </marker>
    <marker id="endArrow" 
    	markerWidth="9" markerHeight="9" 
    	refX="8" refY="4" 
    	orient="auto">
        <path d="M0,0 L8,4 L0,8 L0,0" style="fill: #000000;" />
    </marker>
</defs>
<line x1="10"  y1="<%=itemList[0]%>" x2="10"   y2="10" 
	style="stroke:#006600;
	marker-start: url(#beginArrow);
   marker-end: url(#endArrow);"/>


</SVG>

            
<%@include file="//includes/footer.jsp" %>  
