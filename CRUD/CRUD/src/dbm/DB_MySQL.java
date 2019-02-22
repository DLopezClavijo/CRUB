package dbm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_MySQL {
	
	private static String driver = "com.mysql.cj.jdbc.Driver";

	
	private static String database = "tienda";
	private static String hostname = "localhost";
	private static String port = "3306";

	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	
	public static String userName = "root";
	public static String userPass = "";


	public static Connection conectar() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Class.forName(driver).newInstance();
		Connection conn = DriverManager.getConnection(url, userName, userPass);
		return conn;
	}
	
	public static void desConectar(Connection conn) throws SQLException {
		conn.close();
	}

	public static void execDML(Connection conn, String sql) throws SQLException {
		Statement stmt = conn.createStatement();
		stmt.execute(sql);
	}
	
	public static ResultSet query(Connection conn, String strQuery) throws SQLException {
		Statement stmt = conn.createStatement();
		stmt.execute(strQuery);
		ResultSet resultado = stmt.getResultSet();
		return resultado;
	}
	
	public static void execQuery(String strQuery) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Connection conn = dbm.DB_MySQL.conectar();
		execDML(conn, strQuery);
		dbm.DB_MySQL.desConectar(conn);
	}


}
