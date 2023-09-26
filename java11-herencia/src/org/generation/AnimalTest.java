
package org.generation;

import java.util.ArrayList;
import java.util.List;

import com.toy.Pet;
import com.toy.Tamagochi;
import com.zoo.*;

public class AnimalTest {

	public static void main(String[] args) {
		
		Lion simba = new Lion("Simba", 5);
		Lion mufasa = new Lion("Mufasa", 40);
		Cat nico = new Cat("Nico", false);
		Cat endora = new Cat("Endora", false);
		Cat michiSalvaje = new Cat("Michi", true);
		
		System.out.println( simba.eat("insectos, viscosos pero sabrosos") );
		System.out.println( nico.eat("croquetas de carne y jugo") );
		System.out.println( nico.eat() );

		System.out.println( mufasa );
		System.out.println( endora );
		
		ArrayList< Animal > noahsArk = new ArrayList<>();
		noahsArk.add(simba);
		noahsArk.add(mufasa);
		noahsArk.add(nico);
		noahsArk.add(endora);
		noahsArk.add(michiSalvaje);		
		showEat( noahsArk );
		
		Tamagochi pou = new Tamagochi("Pou", 5);
		
		List< Pet > mascotas = new ArrayList<>();
		mascotas.add(pou); // clase Tamagochi
		mascotas.add(nico); // clase Cat
		mascotas.add(endora); // clase Cat
		
		// Realizar un método estático que itere los elementos
		// que imprima saludo (greeting) y si es una gato
		// que ronronee (purr).
		showPet(mascotas);
		
	} // cierre de main
	
	public static void showEat( ArrayList<Animal> animals ) {
		for (Animal animal : animals) {
			System.out.println( animal.eat("cacahuates") );
			System.out.println( animal.sleep() );
			
			if ( animal instanceof Cat ) {
				System.out.println(">>>>>>>>");
				System.out.println( ((Cat)animal).purr() );
				System.out.println( ((Cat)animal).trick() );
				System.out.println( ((Cat)animal).greeting() );
				System.out.println("<<<<<<<<");
			}
		}
	}
	
	public static void showPet(List<Pet> mascotas) {
		final String MESSAGE_PET = "Mascotas"; // No se puede cambiar el valor
		for (Pet pet : mascotas) {
			System.out.println("==================");
			System.out.println(pet.greeting());
			System.out.println(pet.trick());
			if (pet instanceof Cat) {				
				System.out.println(((Cat) pet).purr());
			}
			System.out.println("=================");
		}
	}

} // cierre de clase
