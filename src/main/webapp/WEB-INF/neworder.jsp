<%@page import="java.util.ArrayList"%>
<%@include file="//includes/header.jsp" %>  
<%@page import="FunctionLayer.Order"%>
<%@page import="FunctionLayer.User"%> 

<% boolean shed = false; %>

<div class="orderStyle">
    <h1>Sketch of carport</h1>
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
        
        
        <%int x = 50; double y = (itemList[1] * 0.64) + 55; { %>
        <line x1="<%= x %>" y1="8%" x2="<%= y %>" y2="90%"
              style="stroke-dasharray: 2 2; stroke: blue; fill: none"/>
        <line x1="<%= x %>" y1="90%" x2="72%" y2="8%"
              style="stroke-dasharray: 2 2; stroke: blue; fill: none"/>
       <%}%>
       
       <%if (shed == true) { int shedp = 50; %>
        <rect x="<%= shedp %>" y="8%" height="5" width="5" id="upperPillar"
              style="stroke:black; fill:black"/>
        <rect x="<%= shedp %>" y="90%" height="5" width="5" id="lowerPillars"
              style="stroke:black; fill:black"/>
        <rect x="72%" y="8%" height="83%" width="25%" id="shed"
              style="stroke:red; fill:none"/>
        
        <%}
        else
        for (int shedpp = 50; shedpp <= itemList[1]; shedpp += 250) { %>
        <rect x="<%= shedpp %>" y="8%" height="5" width="5" id="upperPillar"
              style="stroke:black; fill:black"/>
        <rect x="<%= shedpp %>" y="90%" height="5" width="5" id="lowerPillar"
              style="stroke:black; fill:black"/>
        <%}%>
    </svg>
</SVG>
<svg width="760" height="400" viewbox="0 0 <%=itemList[1]%> <%=itemList[0]%>"
  preserveAspectRatio="none">
<rect x="3%" y="0" height="10" width="<%=itemList[1]%>" id="Rooflayertop"
        style="stroke:#000000; fill: none "/>
  <rect x="3.5%" y="10" height="10" width="99%" id="Rooflayermid"
        style="stroke:#000000; fill: none "/>
    <rect x="4%" y="20" height="20" width="98%" id="Rooflayerbot"
        style="stroke:#000000; fill: none "/>
        <%if (shed == true) { int z = 70; %>
        <rect x="<%= z %>" y="40" height="70%" width="5" id="firstPillar"
              style="stroke:black; fill:none"/>
        <rect x="70%" y="40" height="70%" width="30%" id="shedfromside"
              style="stroke:black; fill:lightgrey"/>
         <%}
        else
        for (int z = 70; z <= itemList[1]; z += 300) { %>
        <rect x="<%= z %>" y="40" height="70%" width="5" id="sideviewPillars"
              style="stroke:black; fill:none"/>
        <%}%>
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
<line x1="20%" y1="95%" x2="90%" y2="95%"
          style="stroke:#006600;
        	    marker-start: url(#beginArrow);
               marker-end: url(#endArrow);"/>
    <text x=50% y=98% text-anchor="middle" fill="black"> Length: <%=itemList[1]%>
    </text>
    <line x1="110%" y1="20%" x2="110%" y2="80%"
          style="stroke:#006600;
	            marker-start: url(#beginArrow);
            marker-end: url(#endArrow);"/>
    <text x=110% y=50% text-anchor="middle" style="writing-mode: tb;"> Height: <%=itemList[2]%>
    </text>
  
</SVG>
</div>
<%@include file="//includes/footer.jsp" %>  