package org.generation;

public class CicloFor {

	public static void main(String[] args) {
		/*
		 * Sintaxis:
		 * 
		 * for ( expresiónInicial; comparación; expresiónFinal) instrucción;
		 * 
		 * 
		 * for ( expresiónInicial; comparación; expresiónFinal){ instrucciones; }
		 * 
		 */

		for (int i = 0; i < 10; i++) {
			System.out.println("Valor de i: " + i);
		}

		// Imprimir los números impares del 1 al 20.
		// 1
		// 3 ...
		// 19
		// Imprimir los numeros impares del 1 al 20
		System.out.println("Imprimiendo los numeros impares del 1 al 20");
		for (int i = 1; i < 20; i += 2) {
			System.out.println(i);
		}

		System.out.println("Imprimiendo los numeros impares del 1 al 20");
		for (int i = 1; i < 20; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

		System.out.println("Imprimiendo los numeros impares del 1 al 20");
		Loop:
		for (int i = 1; i < 20; i++) {
			if (i % 2 == 0) continue Loop;				
			System.out.println(i);			
		}

		
		
	}

}
