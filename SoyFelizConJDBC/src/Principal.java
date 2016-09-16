import java.sql.*;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String nombreDriver = "com.mysql.jdbc.Driver";
		String url= "jdbc:mysql://localhost:3306/sakila";
		Connection connection =null;
		try {
			Class.forName(nombreDriver);
			connection = DriverManager.getConnection(url, "root", "....");
			Statement consulta = connection.createStatement();
			String sql ="select actor_id, last_name, first_name from actor";
			ResultSet resultado = consulta.executeQuery(sql);
			while (resultado.next() == true) {
				System.out.println("Id: "+ resultado.getInt("actor_id"));
				System.out.println("Nombre: "+ resultado.getString("first_name"));
				System.out.println("Apellido: "+ resultado.getString("last_name"));
			}
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
