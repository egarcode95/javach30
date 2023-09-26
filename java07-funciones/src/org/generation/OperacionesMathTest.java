package org.generation;

public class OperacionesMathTest {

	public static void main(String[] args) {
		
		double valorPiActual = OperacionesMath.valorPi();
		System.out.println(valorPiActual);
		
		System.out.println("Raíz cuadrada de 10: " + OperacionesMath.raiz(10));
		
		// Para utilizar los métodos de instancia, hay que crear el objeto
		// Debemos instanciar la clase.
		
		// Definimos una variable del tipo OperacionesMath
		OperacionesMath operaciones;
		// Instanciar la clase OperacionesMath
		operaciones = new OperacionesMath()  ;
		operaciones.name = "uva";
		
		operaciones.sumaEnterosSinRetorno(3, 4); // 7
		operaciones.sumaEnterosSinRetorno(44, 6); // 50
		
		// Instanciar nuevamente la clase OperacionesMath
		OperacionesMath sumaNaranja = new OperacionesMath();
		sumaNaranja.name = "naranja";
		sumaNaranja.sumaEnterosSinRetorno(100, 200); // 300
		// Se recomeienda invocar métodos estáticos
		// desde la clase, no desde la instancia.
		// System.out.println( sumaNaranja.valorPi() );
		
		//==================================================
		OperacionesMath addDouble;
		addDouble = new OperacionesMath();
		addDouble.name = "Orange";
		double result = addDouble.addDouble(1.45, 1.63);
		System.out.println("Add double numbers of object" + addDouble.name + " : " + result);
		
	
		// ======= Uso de métodos sobrecargados ===========
		OperacionesMath op = new OperacionesMath();
		op.name = "operaciones";
		System.out.println(" 3 + 5 :" + op.add(3, 5)  ); // 8
		System.out.println(" 3.5 + 5.2 :" + op.add(3.5, 5.2)  ); // 8.7
		System.out.println(" '4.2' + '3.1' :" + op.add("4.2", "3.1")  ); //7.3
		
		System.out.println(" 3 + 5.1 :" + op.add( 3, 5.1)  ); // 8.1
		//System.out.println(" 3 + 5.1 :" + op.add( 3, "5.1")  ); // No se puede
		
		System.out.println( "3" + "4"  ); // "34"  
		System.out.println( 3 + 4  ); // 7  
		
		
	}

}
