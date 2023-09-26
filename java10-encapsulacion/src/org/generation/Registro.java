package org.generation;

import java.util.Scanner;

public class Registro {

	public static void main(String[] args) {
		
		try {
		Scanner sc = new Scanner( System.in );
		
		System.out.print("Escribe tu nombre: ");
		String name = sc.nextLine();
		
		System.out.print("Escribe tu edad: ");
		int age = sc.nextInt();
		sc.nextLine();		
		nameVerifier(name);	
		System.out.println("Registro exitoso: " + ageVerifier( age ));
		sc.close();
		} catch (IllegalStateException e) {
			System.out.println("Por favor verifica la entrada");
			e.printStackTrace();
			System.out.println("El registro no fue exitoso");
		} catch( Exception e) {
			e.printStackTrace();
			System.out.println("No sé que sucedió, pero no se hace el registro");
		}
	}
	
	private static boolean ageVerifier ( int age) {
		if (age<18) {
			// System.out.println("No es mayor de edad");
			throw new IllegalStateException("No es mayor de edad");
			
		}
		return true;
	}
	
	private static boolean nameVerifier (String name) {
		if (name == null) 
			throw new NullPointerException("El nombre está vacío");
		else if ( name.length()< 2 ) 
			throw new IllegalArgumentException("Número de caracteres mínimo");
		
		return true;
	}

}
