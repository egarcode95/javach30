package org.generation;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListConceptos {

	public static void main(String[] args) {
		/*
		 * Array List.
		 * 
		 * Una colección List es una colección ...?
		 *  - Es una colección ordenada (respeta el orden en que se agregan)
		 *  - Se permite elementos duplicados
		 *  - Se basa en un array redimensionable que crece su tamaño,
		 *   según crece la colección de elementos.
		 *  - Esta colección es la mejor rendimiento tiene.
		 *  
		 *  Sintaxis:
		 *  ArrayList<object> varName = new ArrayList<>();
		 *  
		 * 
		 */
		
		int age = 17;
		// La clase envolvente (wrapper) de tipo int
		Integer edad = 17;
		
		// Definir una colección de datos numéricos
		ArrayList< Integer > calificaciones;
		
		// Definamos una colección de Strings
		ArrayList< String > nombres;
		
		// Definir un arreglo para nombre de libros
		ArrayList< String > books;
		books = new ArrayList<>();
		
		// Agregar elementos a un ArrayList
		// método add()
		// Los array list son de índice cero. El primer elemento es index 0
		books.add("Libro Vaquero");	
		books.add("Percy jackson");
		books.add("Cañitas");
		books.add("Quibole con tu cuerpo");
		books.add("Los ojos de mi princesa");
		books.add("El principito");
		books.add("Indigno de ser humano");
		books.add("Chambers");
		
		// Agregar elemento duplicado
		books.add("Libro Vaquero");		
		System.out.println( books );
		
		// Obtener el tamaño de mi ArrayList
		// método size()
		int sizeBooks = books.size();
		System.out.println("N. Elementos: " + sizeBooks );
		
		// Mostrar un elemento en particular
		// Indicar el n. de índice usando el método get()
		System.out.println("Citlalli recomienda: " + books.get(6) );
		
		// Remover un elemento de la colección.
		// Indicamos el índice en el método remove()
		System.out.println("Elemento removido: " + books.remove(3) );
		System.out.println( books );
		
		// Verificar si un elemento existe:
		// Usamos el método contains()
		System.out.println("Está Cañitas: " + books.contains("Cañitas"));
		System.out.println("Está Condorito: " + books.contains("Condorito"));
		
		// Iterar un colección ArrayList
		// for loop
		for (int i = 0; i < books.size() ; i++) {
			System.out.println("Libro: " + books.get(i) );			
		}
		
		// for each
		for (String book : books) {
			System.out.println("Libro a leer: " + book);			
		}
		
		// for each con una función lambda
		books.forEach(  book -> System.out.println(book)  );
		
		// Reemplazar un elemento de la colección
		// se utiliza el método set()
		books.set( 1,  "Clean code ");
		System.out.println(books);
		
		// El pase de los objetos es por referencia.
		
		// Estos pasando la referencia.
		ArrayList<String> libros = books;
		
		// para pasar los elementos de la colección
		// y sean colecciones independientes
		// se puede usar el método clone()
		ArrayList<String> lecturas = (ArrayList<String>) books.clone();
		
		// Mostrar últimos elementos
		int elementsToShow = 2;
		int collectionSize = books.size();
		int endtIndex = collectionSize - 1;
		int sizeDifference = collectionSize - elementsToShow; 
		// Para que el índice no sea negativo y no arroje una excepción.
		int stopIndex = sizeDifference > 0 ? sizeDifference : 0; 
		// Iterando
		for (int i = endtIndex; i >= stopIndex ; i--) {
			System.out.println("reversa: "  + books.get(i));
		}
	}

}
