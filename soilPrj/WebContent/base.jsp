<!DOCTYPE html>
<html lang="Shift_JIS">
    <head>
         <title>${title}</title>
    </head>
    <body>
    	<form method="POST" action="/SoilServlet">
    	<div id="header">
    		<jsp:include page="${pageHeader}.jsp" />
    	</div>
		<div id="contents">
			<jsp:include page="${pageContents}.jsp" />
		</div>
		<div id="footer">
			<jsp:include page="${pageFooter}.jsp" />
		</div>    
		</form>
    </body>
</html>