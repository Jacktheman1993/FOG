<%-- 
    Document   : drawingsimplecarport
    Created on : 30-04-2018, 11:02:05
    Author     : Martin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
<body>

<SVG width="900" height=900>
<rect x="30" y="0" height="600" width="780"
        style="stroke:#000000; fill: none "/>
<rect x="30" y="70" height="5" width="780"
		style="stroke:#000000; fill: none "/>
<rect x="30" y="530" height="5" width="780"
		style="stroke:#000000; fill: none "/>
<line x1="85"  y1="0" x2="85"   y2="600" style="stroke:#006600;"/>
<line x1="140"  y1="0" x2="140"   y2="600" style="stroke:#006600;"/>
<line x1="195"  y1="0" x2="195"   y2="600" style="stroke:#006600;"/>
<line x1="250"  y1="0" x2="250"   y2="600" style="stroke:#006600;"/>
<line x1="305"  y1="0" x2="305"   y2="600" style="stroke:#006600;"/>
<line x1="360"  y1="0" x2="360"   y2="600" style="stroke:#006600;"/>
<line x1="415"  y1="0" x2="415"   y2="600" style="stroke:#006600;"/>
<line x1="470"  y1="0" x2="470"   y2="600" style="stroke:#006600;"/>
<line x1="525"  y1="0" x2="525"   y2="600" style="stroke:#006600;"/>
<line x1="580"  y1="0" x2="580"   y2="600" style="stroke:#006600;"/>
<line x1="635"  y1="0" x2="635"   y2="600" style="stroke:#006600;"/>
<line x1="690"  y1="0" x2="690"   y2="600" style="stroke:#006600;"/>
<line x1="745"  y1="0" x2="745"   y2="600" style="stroke:#006600;"/>
<line stroke-dasharray="5, 5"              x1="85" y1="70" x2="525" y2="530" style="stroke:#006600;"/>
<line stroke-dasharray="5, 5"              x1="85" y1="530" x2="525" y2="70" style="stroke:#006600;"/>

  <text x="280" y="20" transform="rotate(90 0,20)">
    Height
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
<line x1="850"  y1="660" x2="10"   y2="660" 
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
<line x1="10"  y1="650" x2="10"   y2="10" 
	style="stroke:#006600;
	marker-start: url(#beginArrow);
   marker-end: url(#endArrow);"/>


</SVG>

</body>
</html>

    </body>
</html>
