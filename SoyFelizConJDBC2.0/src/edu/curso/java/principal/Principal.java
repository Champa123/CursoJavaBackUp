package edu.curso.java.principal;

import java.util.ArrayList;

import edu.curso.java.bo.Persona;
import edu.curso.java.dao.GestorDePersonas;

public class Principal {

	public static void main(String[] args) {
		
		Persona persona = new Persona();
		persona.setNombre("Juan");
		persona.setApellido("Perez");
		persona.setEdad(42);
		
		GestorDePersonas gestorDePersonas = new GestorDePersonas();
		gestorDePersonas.altaDePersonas(persona);
		
		//gestorDePersonas.actualizarPersona(3, "juan", "Gutierrez", 52);
		//gestorDePersonas.bajaDePersonas(3);
		ArrayList<Persona> personas= gestorDePersonas.recuperarPersonas();
		for (Persona persona2 : personas) {
			System.out.println(persona2);
		}
	}

}
