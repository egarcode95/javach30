package org.generation;

public class ArrayConceptos {

	public static void main(String[] args) {
		/*
		 *  Las variables de tipo array se definen con corchetes []
		 *  Los corchetes pueden ir antes o después de la variable
		 *  ej. int[] myArray;
		 *      int myArray[]
		 *  
		 *  Para los array se debe asignar la cantidad de elementos
		 *  que contendrá.
		 *  Una vez definido, el arreglo no púede cambiar su tamaño
		 *      
		 *      
		 */
		
		// arreglo de 4 elementops de tipo int
		int[] codigoColores = new int[4]; // instanciando objeto de tipo array
		
		// arreglo de 4 elementos de tipo String
		String nombreColores[] = new String[4];
		
		// Agregar elementos en un array
		// indicar dentro del corchete el n. deíndice
		// los arrays son indice cero: el primer elemento es el ídice 0
		
		nombreColores[0] = "Azul";
		codigoColores[0] = 0x00_00_ff; // RGB 0,0,255
		
		// Agregar el color amarillo, negro, naranja
		nombreColores[1] = "Amarillo";
		codigoColores[1] = 0xFF_FF_00; // RGB 255, 255, 0
		
		nombreColores[2] = "Negro";
		codigoColores[2] = 0x00_00_00; // RGB 0, 0, 0
		
		nombreColores[3] = "Naranja";
		codigoColores[3] = 0xFF_80_00; // RGB 255, 128, 0
		
		// Si agrego un elemento en un índice que no exista
		// se genera una excepción: ArrayIndexOutOfBoundsException
		// nombreColores[5] = "Aqua";
		
		for (int i = 0; i < nombreColores.length; i++) {
			String txt = String
					.format("El color %s tiene el código #%06X",
							nombreColores[i], codigoColores[i]  );
			
			System.out.println( txt );			
		}
		
		// Iterando con un for each
		for (String nombreColor : nombreColores ) {
			System.out.println("Color: " + nombreColor);
		}
		
		// Inicializar un array. Se utiliza {}
		String[] frutas = {"Uva", "Fresa", "Manzana"};
		
		// Instanciar un arreglo de 2 dimensiones
		                                // Feliz Cumpleaños
		String[][] participantes = new String[3][5];
		

	}

}
