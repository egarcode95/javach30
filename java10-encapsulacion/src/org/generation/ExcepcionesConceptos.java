package org.generation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExcepcionesConceptos {

	public static void main(String[] args) {
		/*
		 * Una excepción es una situación no esperada
		 * durante la ejecución de un programa.
		 * 
		 * Existen dos tipos de excepciones
		 * 
		 * A) checked Exceptions: Son excepciones que se heredan
		 * de la clase Exceptions. Se tiene que declarar la excepción
		 * en la firma del método o manejar la excepción con 
		 * el bloque try-catch.
		 * 
		 * B) unchecked Exceptions: Son excepciones que se heredan
		 * de la clase RuntimeException. No se está obligado
		 * a procesarlas. Es opcional el uso de try-catch o
		 * declar la excepción en la firma del método.
		 * 
		 * Las excepciopnes de Error, son arrojadas por la JVM, son
		 * errores de los que no se pueden recuperar.
		 * 
		 * Manejo de excepciones con try-catch
		 * 
		 * sintaxis:
		 *   try {
		 *   
		 *   }
		 *   catch ( exception e){
		 *   
		 *   }
		 *   finally {
		 *   
		 *   }
		 *   
		 *   try: contendrá las sentencias que pudiera generar una excepción
		 *   catch: se ejecutará si ocurre una excepción en el bloque try
		 *   finally: se ejecutará al finalizar el bloque try o catch
		 *   
		 *   El stacktrace de una excepción es el conjunto
		 *   de mensajes desde el origen de la excepción
		 *   hasta la última clase que recibe la excepción.
		 * 
		 */
		
		// Arithmetic exception
		System.out.println("Inicio del programa");
		double division;
		int[] myArray = {4,7,2};
		
		try {
			
			division = 10/5;
			System.out.println("Resultado: " + division );
			System.out.println("Valor en índice 10 " + myArray[1] ); // 7			
			readFileWithException();
			// readFile();
			
		} catch(ArithmeticException e ) {
			// System.out.println(e.toString());
			System.out.println("Dentro del bloque catch");
			e.printStackTrace();			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Te pasaste de índice");
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			System.out.println("No te pases nico");
			e.printStackTrace();
		} finally {
			System.out.println("Fin del programa");			
		}
			

	}
	
	static void readFile() {
		File file = new File("myfile.text");
		try {
			Scanner myReader = new Scanner ( file );
		} catch (FileNotFoundException e) {
			System.out.println("Nel, no está tu archivo");
			e.printStackTrace();
		}
	}

	static void readFileWithException() throws FileNotFoundException {
		File file = new File("myfile.text");
		Scanner myReader = new Scanner ( file );

	}

}
