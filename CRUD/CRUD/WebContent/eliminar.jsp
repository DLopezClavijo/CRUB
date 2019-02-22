<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>BORRAR PRODUCTO</h2>
<form action="SrvEliminar" method="post">
	Nombre: <input type="text" name = "txtNombre" /><br>
	<input type="reset" value="limpiar" />
	<input type="submit" value="borrar" />
</form>
</body>
</html>