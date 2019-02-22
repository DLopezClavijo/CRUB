<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Resultado del proceso</h2>
<%
Boolean result = (Boolean)request.getAttribute("result");
if (result){
%>
	<p style="color:blue">Proceso realizado con éxito</p>
<%} else {%>
	<p style="color:red">Proceso con error</p>
<%}%>
<br><a href="index.jsp">Volver</a>
</body>
</html>