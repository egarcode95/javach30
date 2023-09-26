package com.zoo;

/**
 *  Para aplicar la herencia, en la definición de la clase
 *  agregamos la palabra reservada 'extends' e indicamos
 *  el nombre de la clase superior.
 *  
 *  Para conocer si estamos aplicando adecuadamente la
 *  herencia, podríamos preguntarnos con "is-a".
 */
public abstract class Mammals extends Animal {
	
	private String hairColor;
	
	protected Mammals(String name, String habitat, double lifespan , String hairColor) {
		super(name, habitat, lifespan); // inicializando contructor de Animal.class
		this.hairColor = hairColor;		
	}

	protected String getHairColor() {
		return hairColor;
	}

	protected void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}
	
	/*
	 *  Sobreescritura de métodos (Override)
	 *  
	 *  Para que un método sea sobreescrito, este debe tener la misma
	 *  firma del método de la clase superior. La sobreescritura permite
	 *  personalizar el comportamiento heredado.
	 *  
	 *  @Override: Anotación que indica que el método está sobreescribiendo
	 *  el comportamiento de una método de la clase heredada.
	 *  Su propósito es hacer una validación en tiempo de
	 *  compilación para asegurarse que la subclase está
	 *  sobreescribiendo correctamente y coincide
	 *  con la firma del método.
	 *  
	 */
	@Override
	public String eat(String food) {
		return "El mamífero " + super.getName() + " está comiendo " + food;
	}

}
