package com.zoo;

import com.toy.Pet;

/**
 * Para agregar una interfaz, utilizamos la palabra reservada
 * "implements" seguida de las interfaces que se implementarán.
 */
public final class Cat extends Feline implements Pet {
	
	private boolean wild;

	public Cat(String name, boolean wild) {
		super(name, "savannah", 30, "beige");
		this.wild = wild;	
	}

	public boolean isWild() {
		return wild;
	}

	public void setWild(boolean wild) {
		this.wild = wild;
	}

	public String purr() {
		return "purr purr purrrrrs";
	}
	

	@Override
	public String eat(String food) {
		return "El ser supremo " + super.getName() + " come " + food;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append( super.toString()  );		
		builder.append("\n\tCat [wild=");
		builder.append( isWild() );
		builder.append(", hasNightVision=");
		builder.append(hasNightVision());
		builder.append(", HairColor=");
		builder.append(getHairColor());
		builder.append("]");
		return builder.toString();
	}

	@Override
	public String sleep() {
		return "El gato duerme 23 h.";
	}
	
	@Override
	public String trick() {
		return "Tiro el control de la TV y me limpio las patas";
	}

	@Override
	public String greeting() {
		return "Arrodillate ante mi ser inferior";
	}

	// No se puede sobreescribir un método final
//	@Override
//	public String origin() {
//		return "extraterrestres";
//	}

}
