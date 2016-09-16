import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String nombreDriver = "com.mysql.jdbc.Driver";
		String url= "jdbc:mysql://localhost:3306/sakila";
		Connection connection =null;
		try {
			Class.forName(nombreDriver);
			connection = DriverManager.getConnection(url, "root", "....");
			
		} catch (ClassNotFoundException e) {
			System.out.println("No hay driver jdbc:"+ e.getMessage());

			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Error SQL");
			e.printStackTrace();
		}finally{
			if (connection != null){
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	
			
	}

}
