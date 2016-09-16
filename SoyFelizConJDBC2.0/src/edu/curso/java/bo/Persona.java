package edu.curso.java.bo;

public class Persona {
	private int idPersona;
	private String nombre;
	private String apellido;
	private int edad;
	
	public int getIdPersona() {
		return idPersona;
	}
	
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	
	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idPersona;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (idPersona != other.idPersona)
			return false;
		return true;
	}
	
	

}
