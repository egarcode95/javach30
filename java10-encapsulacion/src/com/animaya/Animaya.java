package com.animaya;

import com.chapultepec.Animal;

public class Animaya {

	public static void main(String[] args) {
		
		// Para poder instanciar mi clase, el constructor
		// debe tener el modificador public ya que esta clase
		// no está en el mismo paquete, ni es una clase heredada.
		Animal tolok = new Animal("django", "verde", "reptil");
		
		tolok.setNombre("Juana");
		// tolok.setEspecie("felino");
		
		System.out.println( tolok.getNombre() );
		System.out.println( tolok.getColor() );

	}

}
