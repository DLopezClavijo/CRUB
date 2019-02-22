package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Producto;

@WebServlet("/SrvInsertar")
public class SrvInsertar extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public SrvInsertar() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("txtNombre");
		Integer cantidad = Integer.parseInt(request.getParameter("txtCantidad"));

		Boolean exito = logic.LogicProducto.insertar(new Producto(null, nombre, cantidad));

		request.setAttribute("result", exito);
		request.getRequestDispatcher("resultado.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}