package org.generation;

public class Participante {
	String nombre;
	String apellido;
	int edad;
	int id;
	
	static String empresa;
	static int contador;
	
	// bloque de inicialización de atributos estáticos
	static {
		empresa = "Generation";
	}
	
	// bloque de inicialización de atributos non-static
	{
		this.nombre = "no definido";
		this.apellido = "no definido";
		this.edad = 25;
	}

	
	Participante(String nombre, String apellido){
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = contador++;
	}

	Participante(String nombre, String apellido, int edad){
		this(nombre, apellido);
		this.edad = edad;
	}
	
	
	String detalles() {
		return this.id +" - " +this.nombre +
				" " + this.apellido + ". Con edad: " + this.edad ;
	}
	
	static String detallesEmpresa() {
		return empresa + " tiene " + contador + " participantes";
	}
	

}
