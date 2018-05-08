<%@page import="java.util.ArrayList"%>
<%@include file="//includes/header.jsp" %>  
<%@page import="FunctionLayer.Order"%>
<%@page import="FunctionLayer.User"%>
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
    <h1>Top</h1>
    <svg width="<%=itemList[1]%>" height="<%=itemList[0]%>" viewbox="0 0 800 800"
         preserveAspectRatio="none">
    <rect x="50" y="0" height="600" width="700"
          style="stroke:#000000; fill: none "/>
    <line x1="85"  y1="0" x2="85"   y2="600" style="stroke:#006600;"/>
    <text x="280" y="0" transform="rotate(90 0,20)">
    Width = <%=itemList[0]%>
    </text>
    <text x="400" y="650">
    Length = <%=itemList[1]%>
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
    <line x1="800"  y1="660" x2="10"   y2="660" 
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
    <line x1="10"  y1="600" x2="10"   y2="10" 
          style="stroke:#006600;
          marker-start: url(#beginArrow);
          marker-end: url(#endArrow);"/>


    </SVG>
</div>
<div class="orderStyle">
    <h1>Side</h1>
    <svg width="1000 " height="1000" viewbox="0 0 1000 1000"
         preserveAspectRatio="none">
    <rect x="30" y="0" height="10" width="780"
          style="stroke:#000000; fill: none "/>
    <rect x="35" y="10" height="10" width="770"
          style="stroke:#000000; fill: none "/>
    <rect x="40" y="20" height="20" width="760"
          style="stroke:#000000; fill: none "/>
    <rect x="60" y="40" height="300" width="10"
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
    Height = <%=itemList[2]%> 
    </text>
    <text x="400" y="370">
    Length = <%=itemList[1]%> 
    </text>

    </SVG>
</div>
<%@include file="//includes/footer.jsp" %>  