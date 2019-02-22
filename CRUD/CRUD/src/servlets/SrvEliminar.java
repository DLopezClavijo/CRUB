package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Producto;

@WebServlet("/SrvEliminar")
public class SrvEliminar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SrvEliminar() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("txtNombre");

		Boolean exito = logic.LogicProducto.eliminar(new Producto(null, nombre, null));

		request.setAttribute("result", exito);
		request.getRequestDispatcher("resultado.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
