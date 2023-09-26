package org.generation;

public class FizzBuzz {
	public static void main(String[] args) {
		/*
		 * Ejercicio : FizzBuzz Game: realizar el ejercicio para los números enteros del
		 * 1 al 20. Para números divisibles por 3, imprimir “Fizz”. Para números
		 * divisibles por 5, imprimir “Buzz”. Para números divisibles por 3 y 5,
		 * imprimir “FizzBuzz”. En cualquier otro caso, imprimir el número.
		 * 
		 */
		for (int i = 1; i <= 20; i++) {
			if (i % 3 == 0)
				System.out.print("Fizz");
			if (i % 5 == 0)
				System.out.print("Buzz");
			if (i % 3 != 0 && i % 5 != 0)
				System.out.print(i);
			System.out.println(); // Salto de línea
		}

		System.out.println("===========");
		String frase;
		for (int i = 1; i <= 20; i++) {
			frase = "";
			if (i % 3 == 0)
				frase = "Fizz";
			if (i % 5 == 0)
				frase += "Buzz"; // frase = frase + "Buzz";
			if (i % 3 != 0 && i % 5 != 0)
				frase = Integer.toString(i); // frase = ""+i;
			System.out.println(frase);
		}

		System.out.println("=====LU====");
		for (int i = 1; i <= 20; i++) {
			if (i % 5 == 0 && i % 3 == 0)
				System.out.println("FizzBuzz");
			else if (i % 3 == 0)
				System.out.println("Fizz");
			else if (i % 5 == 0)
				System.out.println("Buzz");
			else
				System.out.println(i);
		}

		System.out.println("=====ISAY====");
		int n = 20;
		for (int i = 1; i <= n; i++) {
			String res = "";
			if (i % 3 == 0)
				res += "fizz";
			if (i % 5 == 0)
				res += "buzz";
			if (res.length() == 0) {
				System.out.println(i);
			} else {
				System.out.println(res);
			}
		}

	}

}
