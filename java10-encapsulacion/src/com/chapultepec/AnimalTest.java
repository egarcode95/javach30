package com.chapultepec;

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal perro = new Animal("Layla", "Blanco", "Perro");
		
		// No se pueden acceder a atributos encapsulados
		// System.out.println( perro.nombre );
		// System.out.println( perro.especie );
		
		// Para acceder a los valores de los atributos
		// lo hacemos con los métodos get
		System.out.println( perro.getNombre() );
		System.out.println( perro.getColor() );
		System.out.println( perro.getEspecie() );
		
		// Para establecer un nuevo valor
		// accedemos al método set
		perro.setNombre("Solovino");
		System.out.println( perro.getNombre() );

	}

}
