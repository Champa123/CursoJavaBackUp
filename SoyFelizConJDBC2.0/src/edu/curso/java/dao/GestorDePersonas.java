package edu.curso.java.dao;
import java.util.ArrayList;
import java.sql.*;


import edu.curso.java.bo.Persona;

public class GestorDePersonas {

	public void altaDePersonas (Persona persona){
		Connection connection = null;
		try{
		
		connection= DBUtil.recuperarConnection();
		String sql = "insert into personas (nombre, apellido, edad) values (?, ? , ?)";
		PreparedStatement commandoInsert = connection.prepareStatement(sql);
		commandoInsert.setString(1, persona.getNombre());
		commandoInsert.setString(2, persona.getApellido());
		commandoInsert.setInt(3, persona.getEdad());
		commandoInsert.execute();
		
		}catch (ClassNotFoundException e){
			e.printStackTrace();
		}catch (SQLException e){
		e.printStackTrace();
		}finally {
			DBUtil.cerrarConnection(connection);
	}
	}
	public void bajaDePersonas(int idPersona){
		
		Connection connection = null;
		
		try {
			connection= DBUtil.recuperarConnection();
			String sql = "delete from personas where idPersona= ?";
			PreparedStatement commandoDelete= connection.prepareStatement(sql);
			commandoDelete.setInt(1, idPersona);
			commandoDelete.execute();
					
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void actualizarPersona (int idPersona, String nombre, String apellido, int edad){
		Connection connection =null;
		Persona persona2 = null;
		try {
			connection= DBUtil.recuperarConnection();
			String sql = "update personas set nombre=?,edad=?, apellido=? where idpersona = ?";
			PreparedStatement commandoUpdate = connection.prepareStatement(sql);
			commandoUpdate.setString(1, nombre);
			commandoUpdate.setInt(2, edad);
			commandoUpdate.setString(3, apellido);
			commandoUpdate.setInt(4, idPersona);
			commandoUpdate.execute();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public Persona buscarPersonaPorId(int idPersona){
	
		Connection connection = null;
		Persona persona = null;
		try {
			connection = DBUtil.recuperarConnection();

			String sql = "Select nombre, apellido, edad from persona where idPersona= ?";
			PreparedStatement commandoInsert = connection.prepareStatement(sql);
			commandoInsert.setInt(1,idPersona);
			ResultSet resultado = commandoInsert.executeQuery();
			if (resultado.next()){
				persona = new Persona();
				persona.setApellido(resultado.getString("apellido"));
				persona.setNombre(resultado.getString("nombre"));
				persona.setEdad(resultado.getInt("Edad"));
				persona.setIdPersona(idPersona);
			}
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return persona;
		
		
	}
	public ArrayList<Persona> recuperarPersonas(){
		Connection connection= null;
		ArrayList<Persona> personas=new ArrayList<>();
		Persona persona = null;
		try {
			connection = DBUtil.recuperarConnection();
			String sql= "Select apellido, nombre, edad, idPersona from personas";
			PreparedStatement commandoSelect = connection.prepareStatement(sql);
			ResultSet resultado= commandoSelect.executeQuery();
			while (resultado.next()){
				persona=new Persona();
				persona.setApellido(resultado.getString("apellido"));	
				persona.setNombre(resultado.getString("nombre"));
				persona.setEdad(resultado.getInt("edad"));
				persona.setIdPersona(resultado.getInt("idPersona"));
				personas.add(persona);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return personas;
	}
}
