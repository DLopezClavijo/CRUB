package logic;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Producto;

public class LogicProducto {

	public static Boolean insertar(Producto producto) {
		Boolean result = false;
		try {
			String strQuery = "INSERT INTO producto (nombre, cantidad) VALUES ('" + producto.getNombre() + "'," + producto.getCantidad() + ")";
			dbm.DB_MySQL.execQuery(strQuery);
			result = true;
		} catch (Exception e) {
			result = false;
		}
		return result;
	}

	public static Boolean eliminar(Producto producto) {
		Boolean result = false;
		try {
			Connection conn = dbm.DB_MySQL.conectar();
			String sql = "DELETE FROM producto WHERE nombre LIKE '"+ producto.getNombre() + "'";
			dbm.DB_MySQL.execDML(conn, sql);
			dbm.DB_MySQL.desConectar(conn);
			result = true;
		} catch (Exception e) {
			result = false;
		}
		return result;
	}

	public static List<Producto> getListaProductos() {
		List<Producto> lst = new ArrayList<Producto>();
		try {
			String strQuery = "SELECT * FROM producto ORDER BY nombre ASC";
			
			Connection conn = dbm.DB_MySQL.conectar();

			ResultSet filas = dbm.DB_MySQL.query(conn, strQuery);
			while(filas.next()) {
				Producto p = new Producto();
				p.setIdProducto(filas.getInt("idProducto"));
				p.setNombre(filas.getString("nombre"));
				p.setCantidad(filas.getInt("cantidad"));
				lst.add(p);
			}

			dbm.DB_MySQL.desConectar(conn);
		} catch(Exception e) {

		}
		return lst;
	}

}