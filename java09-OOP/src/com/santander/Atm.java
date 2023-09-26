package com.santander;

public class Atm {
	
	// atributos de instancia (non-static fileds)
	double balance;
	int serialNumber;
	
	// atributos de clase (static fields)
	static int counter = 1000;
		
	/**
	 * Método constructor
	 * 
	 * El método constructor se utiliza para iniciar objetos de una clase
	 * El constructor se llama automáticamente cuando se crea una instancia
	 * de la clase utilizando la pabra reservada new.
	 * Su propósito es asignar valores iniciales a los objetos
	 * Características:
	 *  - Su nombre es idéntico al de la clase.
	 *  - No tiene un tipo de retorno explícito.
	 *  - Puede tener parámetros
	 *  - Puede ser sobrecargado
	 */
	 Atm(){
		// Constructor por default: no tiene parámetros
		// Si no se agrega algún costructor, java proporciona este método
		 System.out.println("Me estoy instanciando");
		 this.serialNumber = counter++;
	}
	 /**
	  * Método sobrecargado.
	  * Los métodos sobrecargados tienen el mismo nombre
	  * pero diferentes parámetros
	  * @param blance cantidad de dinero disponible en el cajero
	  * 
	  * this es una palabra reservada que se utiliza para hacer
	  * referencia al objeto en el que se encuentra el contexto
	  * de la ejecución.
	  * this se utiliza para referirse al objeto actual,
	  */
	Atm(double balance){	 	
		// para invocar a un costructor, se usa this y (parámetros)
		// el llamado a otro constructor debe ser la primera línea
		this();
		// balance = balanceIn;
		this.balance = balance;
		System.out.println("Tengo la cantidad de " + this.balance);
	}
	Atm(int serialNumber, double balance){
		this( balance );
		this.serialNumber = serialNumber;
	}
	// métodos de instancia
	
	// métodos de clase
	
	

}
