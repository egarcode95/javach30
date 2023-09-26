package org.generation;

import java.util.HashMap;

public class HashMapConceptos {

	public static void main(String[] args) {
		/*
		 * Una colección Map, es una ralación clave(key): valor (value)
		 * que forma una tabla de datos
		 * 
		 *  - Nos funciona mejor para encontrar elementos
		 *  
		 *  Sintaxis:
		 *  HashMap< key, value > varName = new HashMap<>();
		 */
		
		// Instanciar la clase HashMap
		HashMap < String, String > cars;
		HashMap < Integer, String > students = new HashMap<>();
		
		// Agregamos valores a la colección, put()
		students.put( 236723, "David");
		students.put( 232356, "Anneth");
		students.put( 236333, "Leonardo");
		students.put( 236663, "Esteban");
		students.put( 236234, "Aline");
		students.put( 666666, "Leonardo");
		students.put( 111, "Manuel");
		
		// Reemplazamos un elementos
		students.put( 236663, "Norma");
		
		System.out.println(students);
		
		// mostramos un elemento, get(key)
		System.out.println("Tiene exceso de amonestaciones " + students.get(666666) );
		
		// Removiendo un elemento, remove(key)
		System.out.println("Dar de baja " + students.remove(111) );
		System.out.println(students);
		
		// Iterar la colección con sus keys
		for (int matricula : students.keySet()) {
			System.out.println(matricula + " - " + students.get(matricula));		
		}
		
		// Iterar la colección con sus valores
		for (String student : students.values() ) {
			System.out.println( student );
		}
		
		

		
	}

}
