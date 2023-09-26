package org.generation;

import java.util.Scanner;

public class UsoScanner {

	public static void main(String[] args) {
		// La clase scanner nos sirve para
		// escanerar un input, como puede ser la termina.

		// 1.- Crear una variable de tipo Scanner
		// 2.- Importar la clase Scanner del paquete java.util.Scanner
		Scanner myScan; // Scanner sc = new Scanner(System.in)

		// 3.- Instanciar un objeto de la clase Scanner
		// 4.- Indicar que la entrada será de System.in (consola)
		myScan = new Scanner(System.in);

		// System.out.println("Escribe tu nombre: ");
		System.out.print("Escribe tu \"nombre\": ");

		// El método nextLine lee la línea completa, incluido
		// el carácter de nueva línea (\n)
		String firstName = myScan.nextLine(); // escaner al nombre

		// Solicitar apellido
		System.out.print("Escribe tu apellido: ");
		String lastName = myScan.nextLine(); // escaner al apellido

		String fullName = firstName + " " + lastName;
		// Mostrar nombre + apellido
		System.out.println("Tu nombre completo es: " + fullName);

		// ------------- Solicitar un dato entero -------------
		
		// NextInt realiza la lectura del sig. número entero
		// y lo devuelve como un tipo int.
		// NOTA: no lee el salto de línea(/n), por lo que se recomienda
		// usar NextLine al finalizar la lectura.

		// hasNextInt devuelve true si el siguinete valor
		// a leer es un entero
		char firstChar = 'n';
		do {
			System.out.print("Escribe tu edad : ");
			if (myScan.hasNextInt()) {
				int age = myScan.nextInt();
				myScan.nextLine(); // leer salto de línea
				System.out.println("En 10 años tendrás: " + (age + 10));
				firstChar = 'n';
			} else {
				myScan.nextLine(); // consumir el texto erroneo del usuario
				System.out.println("No se introdujo la edad correctamente");
				System.out.print("¿Quieres intentar nuevamente (s/n) ? ");
				String continuar = myScan.nextLine();
				firstChar = continuar.charAt(0); // obtener la s o no
			}
		} while ( firstChar == 's' || firstChar == 'S' );


		System.out.print("Nombre mascota :");
		String pet = myScan.nextLine();
		System.out.println("Tu mascota se llama: " + pet);

		// 5.- Cerrar la instancia del objeto
		// Se liberar los recursos utilizados para
		// acceder al input.
		myScan.close();

		// Modificación desde GitHub coudeSpaces


	}

}
