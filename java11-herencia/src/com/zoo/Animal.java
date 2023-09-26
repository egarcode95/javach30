package com.zoo;

/**
 *  Las clases abstractas son clases que no se pueden instanciar.
 *  Estas clases se utilizan como modelos(plantillas) para
 *  crear subclases concretas que se puedan instanciar.
 *  
 *  una clase abstracta se declara en la firma de la clase
 *  con la palabra reservada "abstract"
 *  
 *  La clase abstracta puede contener métodos abstractos y
 *  métodos concretos.
 *  
 *  Los métodos abstractos no tienen implementación. La implementación
 *  se debe realizar en las subclases concretas.
 *  
 *  Las clases abstractas se recomienda utilizar para
 *  clases que estén estrechamente relacionadas ( is-A )
 */
public abstract class Animal {
	
	private String name;
	private String habitat;
	private double lifespan;
	
	public Animal(String name, String habitat, double lifespan) {		
		this.name = name;
		this.habitat = habitat;
		this.lifespan = lifespan;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getHabitat() {
		return habitat;
	}

	protected void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	protected double getLifespan() {
		return lifespan;
	}

	protected void setLifespan(double lifespan) {
		this.lifespan = lifespan;
	}
	
	public String eat(String food) {
		return "El animal " + getName() + " está comiendo " + food;
	}
	
	public String eat() {
		return "El animal " + getName() + " come";
	}
	
	/**
	 *  Un método abstracto no tiene implementación, solo
	 *  la definción del método.
	 *  Termina con punto y coma.
	 *  
	 *  Si tienes un método abastracto, tienes la obligación
	 *  de hacer tu clase abstracta.
	 */
	abstract public String sleep(); 

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MyAnimal [name=");
		builder.append(name);
		builder.append(", habitat=");
		builder.append(habitat);
		builder.append(", lifespan=");
		builder.append(lifespan);
		builder.append("]");
		return builder.toString();
	}

	// agregan final al método no se permite
	// la sobreescritura en las clases heredadas
	final public String origin() {
		return "bigbang";
	}
	
//	@Override
//	public String toString() {
//		return "Animal [name=" + name + ", habitat=" + habitat + ", lifespan=" + lifespan + "]";
//	}

	

}
