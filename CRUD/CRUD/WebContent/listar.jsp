<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.util.List, model.Producto" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Listado de Productos</h2>
<%
List<Producto> listado = (List<Producto>)request.getAttribute("lstProductos");
if(listado.size()==0) {
	out.print("<p style='color:red'>No hay productos.</p>");
} else {
	out.print("<table border='1'>");
	for(Producto p : listado){
		out.print("<tr>");
			out.print("<td>" + p.getIdProducto() + "</td>");
			out.print("<td>" + p.getNombre()     + "</td>");
			out.print("<td>" + p.getCantidad()   + "</td>");
		out.print("</tr>");
	}
	out.print("</table>");
}
%>
<br><a href="index.jsp">Volver</a>
</body>
</html>