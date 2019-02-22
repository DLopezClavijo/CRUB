<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>INSERTAR PRODUCTO</h2>
<form action="SrvInsertar" method="post">
	Nombre: <input type="text" name = "txtNombre" /><br>
	Cantidad: <input type="number" name = "txtCantidad" /><br>
	<input type="reset" value="limpiar" />
	<input type="submit" value="insertar" />
</form>
</body>
</html>