<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

	<head>
    <title>Name Collector</title>
	</head>

	<body>
	    <hr>
		<h4>Enter your name so that we can customize a greeting just for you!</h4> 
		<!-- [*] Had to modify action name to match the default name that gets made by convention. -->
		<s:form action="annotated-hello-world">
    	<s:textfield name="name" label="Your name"/>
    	<s:submit/>
		</s:form>
		<hr>
	</body>
	
</html>
