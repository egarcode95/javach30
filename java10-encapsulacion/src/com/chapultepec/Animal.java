package com.chapultepec;

/**
 * Encapsulación:  Controlar el acceso a los atributos o métodos
 *  utilizando modificadores de acceso: public, protected, default
 *  o private. Esto nos ayuda a mantener los datos seguros
 *  y controlados.
 */
public class Animal {
	private String nombre;
	private String color;
	private String especie;
	private boolean active;
	
	public Animal(String nombre, String color, String especie){
		this.nombre = nombre;
		this.color = color;
		this.especie = especie;
	}
	
	// métodos setters y getters para controlar los 
	// atributos encapsulados
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre(){
		return this.nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getEspecie() {
		return especie;
	}

	protected void setEspecie(String especie) {
		this.especie = especie;
	}
	
	// Para lo booleanos se recomienda utilizar
	// is o has en lugar de set
	public boolean isActive() {
		return this.active;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	
	
	
}
