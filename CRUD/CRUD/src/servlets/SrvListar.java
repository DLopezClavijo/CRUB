package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Producto;

@WebServlet("/SrvListar")
public class SrvListar extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public SrvListar() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Producto> lista = logic.LogicProducto.getListaProductos();
		request.setAttribute("lstProductos", lista);
		request.getRequestDispatcher("listar.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}