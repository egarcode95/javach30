package org.generation;

public class Variables {

	public static void main(String[] args) {
		// Esto es un comentario de línea.
		/*
		 * Esto es un comentario de bloque
		 */
		// TODO comenzar un comentario con to do genera
		// que este comentario parezca en la lista de tareas.
		
		/*
		 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html
		 * Reglas para el nombre de variables:
		 * - Se distingue entre minúsculas y mayúsculas
		 * - Se puede utilizar cualquier caracter unicode de letras y dígitos
		 * - Las variables pueden comenzar:
		 *  > una letra ej. myVar
		 *  > signo de dolar ej. $myVar
		 *  > caracter de subrayado ej. _myVar
		 *  
		 *  Se recomienda la convención camelCase
		 */
		
		// declarando una variable
		// sintaxis:   tipoDeDato nombreVariableEnCamelCase
		int $myVar; // es válido, pero no se recomiendo
		int _myVar; // es válido, pero no se recomienda
		//mint #myVar; // no es válido
		int myVarEnESpañol; // es válido, pero no se recomienda, de preferencia nombres en inglés
		// int 5comentarios; // no es válido;
		int sinC0m3nt4r105; // es válido, se recomienda claridad en el nombre.
		// int myVar#; // no es válido.
		
		/*
		 * En Java tendrémos los sig. tipos de variables
		 * 
		 * Variables de instancia (Non static fields): atributos de los objetos
		 * Variables de clase (Static fields): atributos de la clase.
		 * Variables locales (local variables): variables dentro de funciones(métodos)
		 * Parámetros (parameters): Son las variables que se encuentran en la firma de los métodos. 
		 * 
		 */
		
		//=========================================================================
		/*
		 * Tipos de datos en Java
		 * - Objetos
		 * - 8 Datos primitivos:
		 *   > byte (números enteros 8 bits)
		 *   > short (números enteros 16 bits)
		 *   > int (números enteros 32 bits)
		 *   > long (números enteros 64 bits)
		 *   > float (números flotantes, punto decimal 32 bits)
		 *   > double (números flotantes, punto decimal 64 bits)
		 *   > boolean ( valores booleanos: true, false)
		 *   > char ( caracter unicode 'e' )      
		 */
		
		// El tipo byte es de 8 bits, almacena datos numéricos positivos.
		byte myVarByte = 10; // no se puede almacenar valores que no estén el rango, como el valor 300
		
		// Para obtener el rango de valores que pue almacenar 2^8 = 256
		// Obtener el valar máximo y mínimo del tipo byte
		// Usamos la clase envolvente (wrapper) del tipo byte
		System.out.println("byte max value: " +  Byte.MAX_VALUE ); // 127
		System.out.println("byte min value: " +  Byte.MIN_VALUE ); // -128
		
		// El tipo short es de 16 bits, almacena datos numéricos enteros 2^16 = 65535
		short myVarShort = 500;
		System.out.println("short max value: " +  Short.MAX_VALUE ); // 32767
		System.out.println("short min value: " +  Short.MIN_VALUE ); // -32768
		
		// El tipo int es de 32 bits, almacena datos numéricos enteros
		// Este tipo de dato es el más utilizado.
		int myVarInt = 10000;
		// La clase envolvente del tipo int es Integer
		System.out.println("int max value: " +  Integer.MAX_VALUE ); // 2147483647
		System.out.println("int min value: " +  Integer.MIN_VALUE ); // -2147483648
		
		// El tipo long es de 64 bits, almacena datos numéricos enteros
		long myVarLong = 1_000_000;
		System.out.println("long max value: " +  Long.MAX_VALUE ); // 9223372036854775807
		System.out.println("long min value: " +  Long.MIN_VALUE ); // -9223372036854775808
		
		/*
		 *  Nota:
		 *  Las literales numéricas (ej. 579 ) enteras en Java son de int.
		 *  Las literales numéricas (ej. 2.56) de punto flotante son de tipo double.
		 *  
		 *  Para indicar que una literal numérica es de tipo long, hay que indicar
		 *  la literal con la letra "L" o "l", de preferencia la "L".
		 *  Para indicar que una literal numérica es de tipo float, hay que indicar
		 *  la literal con la letra "f".
		 *  
		 */
		
		int maxValueInt = 2_147_483_647;
		long maxValueLong = 9223372036854775801L;
		
		// -------------- Tipo de datos de punto flotante ----------------------
		// El tipo float es de 32 bits, almacena datos numéricos de punto flotante
		float myVarFloat = (float)125.34; // 125.34f
		
				
		System.out.println("float max value: " +  Float.MAX_VALUE ); // 3.4028235E38
		System.out.println("float min value: " +  Float.MIN_VALUE ); // 1.4E-45
		
		// el tipo double es de 64 bits, almacena datos numéricos de punto flotante
		double myVarDouble = 125.34;
		System.out.println("double max value: " +  Double.MAX_VALUE ); // 1.7976931348623157E308
		System.out.println("double min value: " +  Double.MIN_VALUE ); // 4.9E-324
		
		// --------------- Conversión de tipos de datos -------------------------
		
		byte coquita600ml = 60;
		// upcasting
		short coquita2000ml = coquita600ml;
		// downcasting
		short pozoleGrande = 259;
		byte pozoleBurbuja = (byte)pozoleGrande;
		System.out.println( pozoleBurbuja ); // ?3
		
		
		// --------------- Datos primitivos boolean y char ----------------------
		
		// El tipo boolean almacena valores true o false
		boolean myVarBoolean = true;
		
		// El tipo char almacena 1 caracter de la tabla unicode.
		// Se define la literal entre apostrofes ej. 's'.
		// El dato de tipo char es de 16 bits, 0 al 65535
		
		char inicialMascotaAna = 'A'; // le perrita se llama Acura
		// podemos definir un char por su código unicode o su valor numérico
		char letraL = '\u004C'; // utilzo el caracter de escap \ y la letra u (unicode)
		System.out.println("Letra L: " + letraL );
		char letraM = 77 ;
		System.out.println("Letra M: " + letraM );
		
		// ---------------- Formas de representar un número ---------------------		
		System.out.println("Representación decimal: " + 26); //26
		System.out.println("Representación hexadecimal: " + 0x1A); //26
		System.out.println("Representación binária: " + 0b00011010 ); // 26
		
		// Para las literales numéricas se opuede usar el _ para
		// separar los números.
		// No se puede escribir _ al inicio o final de la literal _34_
		// No se puede escribir _ junto a un punto decimal 2_._3
		// No se puede escribir _ antes de la f o L para float o Large 23_f
		int numeroSeparados = 12_582;
		
		// ----------------- Conversión de tipos de datos ---------------------
		
		// convertir de string a números
		byte edadMascota = Byte.parseByte("10");
		byte eldobleDeEdad = (byte) (edadMascota * 2);
		
		// convertir números a String
		String edadPersona = String.valueOf( 88 );
		
		// obtener la longitud de un string
		System.out.println( edadPersona.length()  ); // 2
		 
		// obteniendo el primer caracter de un string
		char segundoCaracter = "luca".charAt(1);
		System.out.println( segundoCaracter ); // u
		
		// ----------------- Operadores numéricos ---------------------------
		int opA = (int)5.2;
		System.out.println( opA );
		
		int opB = 6;
		int suma = opA + opB;
		int resta = opA - opB;
		int multiplica = opA * opB;
		int multConDouble = (int) (opA * opB * 0.5 );
		System.out.println( multConDouble); // 15
		
		double resultDouble = opA * opB * 0.5;
		
		int division = opA / opB; // 5/6= 0.83  el valor se trunca a 0
		System.out.println( division ); // 0
		// Se pierden los decimales por que int/int = int
		double divisionDouble = opA / opB;
		System.out.println( divisionDouble ); // 0.0
		// hacer un casting
		double divisionDoubleConCasting = (double)opA / opB;
		System.out.println( divisionDoubleConCasting ); // 0.83
		int residuo = opA % 2 ; // 1
		System.out.println("5 % 2: " + residuo );
		
		// --------------- Preincremento, predecremento, postincremento, postdecremento-----------
		
		int valorInicial = 10;
		System.out.println("Preincremento  " + ++valorInicial ); // 11, valorInicial = 11
		System.out.println("Postincremento " + valorInicial++ ); // 11, valorInicial = 12
		System.out.println("Valor final " + valorInicial ); // 12
		
		int edad = 33;
		System.out.println("Predecremento " + --edad); // 32, edad = 32
		System.out.println("Postdecremento " + edad--); // 32, edad = 31
		System.out.println("Valor final " +  edad ); // 31
		
		// ---------------- Operadores comparativos --------------------------
		// El resultado de cualquier comparación es booleano
		// <, <=, >, >=, ==, !=
		int numEmpleados = 1_000;
		System.out.println("Empleados > 1000 " +  ( numEmpleados > 1000 )); // false
		System.out.println("Empleados >= 1000 " +  ( numEmpleados >= 1000 )); // true
		System.out.println("Empleados == 1000 " +  ( numEmpleados == 1000 )); // true
		System.out.println("Empleados != 1000 " +  ( numEmpleados != 1000 )); // false 
		
		boolean esMayor = numEmpleados > Integer.parseInt("1000");
		// esMayor = 100 > 50 > 2; Este tipo de op no se puede realizar
		
		// --------------- Operadores lógicos -------------------------------
		// && retorna true si ambos operadores son true
		// || retorna true si cualquiera de sus operados es true
		// !  invierte el resultado booleano
		
		int empleados = 1_000;
		System.out.println("empleados > 0 && empleados < 2000 " +
						  (empleados > 0 && empleados < 2000) ); // true
		
		System.out.println("empleados > 0 || empleados < 250 " +
				(empleados > 0 || empleados < 250) ); // true  
		
		boolean a = true;
		boolean b = false;
		boolean c = true;
		
		System.out.println(  (a && b) || ( a && c)  ); // true
		System.out.println(  a || b || c && a  ); // true 
		System.out.println(   !( a || b ) && (!a || c )   ); // false 
		System.out.println(  a || b && c || a && b  ); // true
		
		// -----------------------División por cero ------------------
		// se realiza una excepción en tiempo de ejecución.
		// int divisionPorCero = 45/0; //  / by zero
		
		
		// --------- Condicional if ----------------------------------
		int numParticipantes = 34;
		boolean esChVIP = true;
		
		if( numParticipantes < 10 ) 
			System.out.println("Hay pocas personas");
		else if (numParticipantes >= 10 && numParticipantes < 20)
			System.out.println("Hay varias personas");
		else if ( esChVIP )
			System.out.println("Puro VIP pariente");
		else 
			System.out.println("Llenamos el foro sol");
		
		// ------- Consideraciones para la condicional if -------------
		// Los objetos (Strings) se compara la referencia con ==
		// Para comparar String lo correcto es utilizar el métodos
		// equals()
		
		String nombreParticipante = new String("Manuel");
		
		// if ( nombreParticipante == "Manuel" ) No se debe comparar de esta forma
		if ( nombreParticipante.equals("Manuel") )
			System.out.println("El nombre es igual al de Manuel");
		else
			System.out.println("El nombre es diferente");
		
		// -------- Condicional switch -------------------------
		
		int mesNacimiento = 12;
		String txtMes;
		
		switch ( mesNacimiento ) {
		case 1:
			txtMes = "Enero";
			break;
		case 2:
			txtMes = "Febrero";
		    break;
		case 3, 4, 5, 6, 7, 8, 9 , 10, 11, 12:
			txtMes = "Si lo sé, pero al rato te digo";
			break;
		default:
			txtMes = "El mes es inválido";		
			
		}
		System.out.println("Mes: " + txtMes);
		
		String numCohorte = "30";
		// La condicional switch utiliza el método
		// .equals para comparar strings.
		switch ( numCohorte ) {
		case "30":
			System.out.println("Hoy tendremos entrevistas");
			break;
		case "31":
			System.out.println("Están en la semana 3");
			break;
		default:
			System.out.println("No tengo registrado el dato");
		}


	}

}
