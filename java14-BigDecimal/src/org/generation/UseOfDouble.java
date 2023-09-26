package org.generation;
/**
 *  Ejemplo de la pérdida de precisión con double.
 *  
 *  Si no se tuviera una pérdida de precisión:
 *   ciclo  |    price   |    funds   | itemsBought
 *    -           -           1.00         0
 *    1          0.10         0.90         1
 *    2          0.20         0.70         2
 *    3          0.30         0.40         3 
 *    4          0.40         0.00         4
 *    
 *    Al usar el tipo double en la tercer ciclo
 *    se tiene la cantidad de funds = 0.3999999999999999
 *    por lo que no cumple con la condición funds >= price (4.00)
 */
public class UseOfDouble {

	public static void main(String[] args) {
		double funds = 1.00;
		int itemsBought = 0;
		
		for (double price = 0.10; funds >= price; price += 0.10) {
			funds -= price;
			itemsBought++;
		}
		
		System.out.println(itemsBought + " items bought."); // 3
		System.out.println("Change: $" + funds); // 0.3999999999999999

	}

}
