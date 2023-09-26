package org.generation.app.entity;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*
 *  @Component es una anotación genérica que se utiliza
 *  para indicar que la clase es componente de Spring
 *  y debe ser gestionada por el contenedor
 *  de inversión de control (IoC).
 *  
 *  @Component se aplica a una clase para que Spring
 *  la detecte automáticamente y la registre como un bean
 *  en el contexto de la aplicación.
 *  
 *  @Qualifer se usa para resolver ambiguedades cuando
 *  hay varios objetos(beans) del mismo tipo en
 *  el contexto de la aplicación y se necesita especificar
 *  el bean que se debe inyectar.
 *  
 *  Bean: Es un objeto administrado por el contenedor de Spring.
 * 
 */


@Component
@Qualifier("customerVIP")
public class CustomerVIP extends Customer {
	
	{
		System.out.println("Se inicializa objeto Customer VIP");
	}
	
	@Override
	public void setFirstName( String firstName) {
		super.setFirstName("Hola guapura: " + firstName);
	}
	
}
