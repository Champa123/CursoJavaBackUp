package edu.curso.java.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBUtil {
	
	public static Connection recuperarConexion() throws ClassNotFoundException, SQLException{
		
		String nombreDriver ="com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/ejemplo";
		
		Class.forName(nombreDriver);
		return DriverManager.getConnection(url,"root","....");
	}
	
	
	public static void cerrarConexion(Connection connection){
		if(connection != null){
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}