package com.santander;

public class AtmTest {

	public static void main(String[] args) {

		Atm cajeroA = new Atm();
		Atm cajeroB = new Atm(10_000);
		Atm cajeroC = new Atm(12, 30_000);
		Atm cajeroD = new Atm(80_000); 
		
		System.out.println( cajeroA.serialNumber); // 1000
		System.out.println( cajeroB.serialNumber); // 1001
		System.out.println( cajeroC.serialNumber); // 12
		System.out.println( cajeroD.serialNumber); // 1002
		
	}

}
