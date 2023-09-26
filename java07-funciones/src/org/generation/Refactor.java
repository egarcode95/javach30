package org.generation;

import java.util.Date;

public class Refactor {

	public static void main(String[] args) {
		String result = printToConsole("Holi Crayoli", 56.78934);
		System.out.println( result );
	

	}
	
	static String printToConsole(String txt, Double number ) {
		// System.out.println(txt);
		Date date = new Date();
		// %d enteros
		// %f punto flotante
		// %s strings
		// %n salto de línea
		// %t date
		String formatTxt = String.format("%tT - %s , %10.2f %n ", date, txt, number);
		System.out.printf("%tT - %s %n", date, txt); // String.format + System.out.print
		// System.out.printf("%s - %s > %s", txt, txt, txt);
		return formatTxt;
	}

}
