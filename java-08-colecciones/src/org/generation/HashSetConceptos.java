package org.generation;

import java.util.HashSet;

public class HashSetConceptos {

	public static void main(String[] args) {
		/*
		 * Una colección de tipo set es una colección NO ordenada.
		 *  - No se permiten elemntos duplicados
		 *  - cualquier elemento duplicado no se insertará
		 *  
		 *  Sintaxis:
		 *    HashSet<Object> varName = new HashSet<>();
		 */
		
		// Definir una colección HashSet
		HashSet<String> paises = new HashSet<>();
		
		// Agregamos valores con add()
		paises.add("México");
		paises.add("Alemania");
		paises.add("Genovia");
		paises.add("Wakanda");
		paises.add("El Salvador");
		
		System.out.println( paises );
		
		// Agregando elementos duplicados
		paises.add("Genovia");
		paises.add("Genovia");
		paises.add("Genovia");

		System.out.println( paises );
		
		// Mostrando el taño del arreglo
		System.out.println("N. elementos: " + paises.size());
		
		// Verificando si existe un elemento
		System.out.println("Existe Alemania: " + paises.contains("Alemania"));
		System.out.println("Existe USA: " + paises.contains("USA"));
		
		// Removemos un elemento
		System.out.println("Eliminado: " + paises.remove("Wakanda"));
		System.out.println( paises );
		
		// iteramos la colección
		for (String pais : paises) {
			System.out.println(pais);
		}

	}

}
