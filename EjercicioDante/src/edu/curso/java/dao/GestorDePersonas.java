package edu.curso.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import edu.curso.java.bo.Persona;

public class GestorDePersonas {

	public void altaDePersonas(Persona persona){
		Connection connection=null;
		String sql = "INSERT INTO personas (nombre, apellido, edad) VALUES (?,?,?)";
		try {
			connection=DBUtil.recuperarConexion();
			PreparedStatement comandoInsert = connection.prepareStatement(sql);
			comandoInsert.setString(1, persona.getNombre());
			comandoInsert.setString(2, persona.getApellido());
			comandoInsert.setInt(3, persona.getEdad());
			comandoInsert.execute();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			DBUtil.cerrarConexion(connection);
		}
	}
	
	public void actualizarPersona(Persona persona){
		
	}
	
	public void bajaPersona(Persona persona){
		
	}
	
	public void buscarPorID(int idPersona){
		
	}
}
