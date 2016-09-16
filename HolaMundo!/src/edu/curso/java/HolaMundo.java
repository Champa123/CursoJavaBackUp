package edu.curso.java;

public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola mundo");
		
		String nombre ="java es el mejor lenguaje de programacion del mundo";
		int longitud = nombre.length();
		System.out.println("Tamaño "+ longitud);
		String upper= nombre.toUpperCase();
		System.out.println("UpperCase "+ upper);
		String replace= nombre.replace(" ", "@");
		System.out.println("Remplazando los espacios"+replace);
		String [] palabras= nombre.split(" ");
		System.out.println("palabras"+ palabras); 
		for (String palabra : palabras) {
			System.out.println(palabra);
			
		}
	}

}
