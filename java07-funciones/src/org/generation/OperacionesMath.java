package org.generation;

public class OperacionesMath {
	
	// atributos de instancia ( non-static fields)
	String name;
	// atributos de clase (static fields)	
	
	// métodos de instancia	
	 void sumaEnterosSinRetorno(int a , int b  ){
		System.out.println("Resultado de "+ name +" : " + ( a + b));	
	}
	 
	// método de instancia que calcule la suma de 2 números double.
	// el retorno debe ser double
	 double addDouble(double a, double b) {
			return a + b;
		}
	 
	 int addInt(int a, int b) {
		 return a + b;
	 }
	 
	 // Sobrecarga de métodos ( overload method)
	 // Métodos con el mismo nombre, pero diferentes parámetros
	 
	 // Métodos con el mismo nombre pero que realizan operaciones diferentes.
	 double add ( double a, double b) {
		 System.out.println("Método que recibe 2 double");
		 return a + b;
	 }

	 double add ( double a, double b, double c) {
		 System.out.println("Método que recibe 2 double");
		 return a + b;
	 }
	 
	 int add ( int a, int b) {
		 System.out.println("Método que recibe 2 int");
		 return a + b;
	 }
	 
	 double add ( String a, String b) {
		 System.out.println("Método que recibe 2 String");
		 return Double.parseDouble(a) + Double.parseDouble(b);
	 }
	 
	 
	
	 
	 
	// ============= métodos de clase (static methods) ==========
	/* Los métodos estáticos se relacia la clase en lugar de las
	 * instancias.
	 * Se puede invocar sin tener que instanciar un objeto.
	 * 
	 */
	static double valorPi(){
		double pi = Math.PI;
		return pi;
	}
	
	// Hacer un método estático que reciba 1 parámetro
	// y retorne la raíz cuadrada de ese valor.
	static double raiz(double num) {
		return Math.sqrt(num);
	}
	

}
