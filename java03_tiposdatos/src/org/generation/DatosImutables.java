package org.generation;

public class DatosImutables {
	
	public static void main(String[] args) {
		// Dato inmutable: No se puede modificar
		int nCuentaBancaria = 678;
		nCuentaBancaria = 999;
		
		// Los Strings son objetos especiales que son inmutables
		String nombre = "Mario";
		String participante = "Victoria";
		participante = new String("Mario");
		
		// if ( participante == "Mario"  ) compara las referencias
		if ( participante.equals("Mario")  ) // comparando el contenido
			System.out.println("Los nombres son iguales");
		else
			System.out.println("Los nombres son diferentes");
		
		
		
	}

}
