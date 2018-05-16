<%@page import="java.util.ArrayList"%>
<%@include file="//includes/header.jsp" %>  
<%@page import="FunctionLayer.Order"%>
<%@page import="FunctionLayer.User"%>    
<% int shedlength = 150;
   int shedwidth = 450; 
%>
<div class="orderStyle">
    <h1>Ordre side</h1>
    <% int[] itemList = (int[]) request.getAttribute("itemlist");%>

    <h1>Your order dimensions</h1>
    <h3>Width</h3>
    = <%=itemList[0]%>
    <h3>Length</h3>
    = <%=itemList[1]%> 
    <h3>height</h3>
    = <%=itemList[2]%> 

</div>
<div class="orderStyle">
    <SVG width="760" height="600" viewBox="0 0 <%=itemList[1]%> <%=itemList[0]%> ">
    <defs>
        <marker id="beginArrow"
                markerWidth="9" markerHeight="9"
                refX="0" refY="4"
                orient="auto">
            <path d="M0,4 L8,0 L8,8 L0,4" style="fill: #000000s;"/>
        </marker>
        <marker id="endArrow"
                markerWidth="9" markerHeight="9"
                refX="8" refY="4"
                orient="auto">
            <path d="M0,0 L8,4 L0,8 L0,0" style="fill: #000000;"/>
        </marker>
    </defs>
    <line x1="20%" y1="95%" x2="70%" y2="95%"
          style="stroke:#006600;
        	    marker-start: url(#beginArrow);
               marker-end: url(#endArrow);"/>
    <text x=40% y=98% text-anchor="middle" fill="black"> Length: <%=itemList[1]%>
    </text>
    <line x1="95%" y1="10%" x2="95%" y2="80%"
          style="stroke:#006600;
	            marker-start: url(#beginArrow);
            marker-end: url(#endArrow);"/>
    <text x=97% y=50% text-anchor="middle" style="writing-mode: tb;"> Width: <%=itemList[0]%>
    </text>
    <svg width="90%" height="90%">
        <rect width="100%" height="100%" id="roof"
              style="stroke:black; fill:none"/>
        <rect x="0" y="8%" height="5" width="<%=itemList[1]%>" id="upperRem"
              style="stroke:black; fill:none"/>
        <rect x="0" y="90%" height="5" width="<%=itemList[1]%>" id="lowerRem"
              style="stroke:black; fill:none"/>
        <%for (int x = 0; x <= itemList[1]; x += 50) {%>
        <rect x="<%= x %>" y="0%" height="100%" width="5" id="rafter"
              style="stroke:black; fill:none"/>
        <%}%>
        <rect x="99%" y="0%" height="100%" width="5" id="rafter"
              style="stroke:black; fill:none"/>
        <%for (int x = 50; x <= itemList[1]; x += 325) { %>
        <rect x="<%= x %>" y="8%" height="5" width="5" id="upperPillar"
              style="stroke:black; fill:black"/>
        <rect x="<%= x %>" y="90%" height="5" width="5" id="lowerPillar"
              style="stroke:black; fill:black"/>
        <%}%>
        <%int x = 50; { %>
        <line x1="<%= x %>" y1="8%" x2="72%" y2="90%"
              style="stroke-dasharray: 2 2; stroke: blue; fill: none"/>
        <line x1="<%= x %>" y1="90%" x2="72%" y2="8%"
              style="stroke-dasharray: 2 2; stroke: blue; fill: none"/>
       <%}%>
        
    </svg>
</SVG>
<svg width="1000" height="1000" viewbox="0 0 <%=itemList[1]%> <%=itemList[0]%>"
  preserveAspectRatio="none">
<rect x="3%" y="0" height="10" width="78%"
        style="stroke:#000000; fill: none "/>
  <rect x="3.5%" y="10" height="10" width="77%"
        style="stroke:#000000; fill: none "/>
    <rect x="4%" y="20" height="20" width="76%"
        style="stroke:#000000; fill: none "/>
  <rect x="6%" y="40" height="300" width="10"
        style="stroke:#000000; fill: none "/>
  <rect x="410" y="40" height="300" width="10"
        style="stroke:#000000; fill: none "/>
    <rect x="770" y="40" height="300" width="10"
        style="stroke:#000000; fill: none "/>
<circle cx="65" cy="30" r="2"
    style="stroke:#000000;
           stroke-width: 3;
           fill: none"/>
  <circle cx="415" cy="30" r="2"
    style="stroke:#000000;
           stroke-width: 3;
           fill: none"/>
    <circle cx="775" cy="30" r="2"
    style="stroke:#000000;
           stroke-width: 3;
           fill: none"/>
  
<line x1="850"  y1="400" x2="10"   y2="400" 
	style="stroke:#000000;
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
<line x1="10"  y1="350" x2="10"   y2="10" 
	style="stroke:#000000;
	marker-start: url(#beginArrow);
   marker-end: url(#endArrow);"/>

  <text x="150" y="0" transform="rotate(90 0,20)">
    Height: <%=itemList[2]%>
  </text>
  <text x="400" y="370">
    Length: : <%=itemList[1]%>
  </text>
  
</SVG>
</div>
<%@include file="//includes/footer.jsp" %>  