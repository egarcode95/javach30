package com.citibanamex;

import java.util.ArrayList;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * Crear una clase de cajero automático que contenga: - 2 atributos de instancia
 * > double balance > int serialNumber (cajero) - 1 contructor - encapsular los
 * atributos - generar los setters y getters
 * 
 * - método que acepte depósitos y lo suma al balance deposit() > la cantida es
 * negativa, lanzar una excepción - método que se hagan retiros y resta del
 * balance withdraw() > si la cantidad a retirar es superior al balance lanzar
 * una excepción. - Realizar las pruebas del objeto Atm en otra clase de otro
 * paquete.
 * 
 * Opcional: - Agregar un log de los depósitos y retiros > atributo private
 * ArrayList<String> log = new ArrayList<>(); > HashMap<String, Participante >
 * log = new HashMap<>();
 */

public class ATM {

	private double balance;
	private String serialNumber;
	private ArrayList<ATMLogger> log = new ArrayList<>();

	public ATM(double balance) {
		this.balance = balance;
		this.serialNumber = UUID.randomUUID().toString() ;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

//	private void setSerialNumber(String serialNumber) {
//		this.serialNumber = serialNumber;
//	}

	public void deposit(double amount) throws NegativeAmountException {
		if (amount < 0) {
			throw new NegativeAmountException("La cantidad a depositar es negativa");
		}
		log.add( ATMLogger.depositRegister(amount));
		setBalance( getBalance() + amount );		
	}

	public void withdraw(double amount) throws OverTheBalanceException {
		if (amount > balance) {
			throw new OverTheBalanceException("La cantidad a retirar excede el saldo de tu cuenta");
		}
		log.add( ATMLogger.withdrawRegister(amount));
		setBalance( getBalance() - amount );
	}

	public void printLog() {
		for (int i = 0; i < log.size(); i++) {
			System.out.println(log.get(i));
		}
	}
	
	public String printAllRegisters() {
		return log.stream()
				.map( ATMLogger -> ATMLogger.toString() )
				.collect(Collectors.joining("\n"));
	}

	public String printAllDeposit() {
		return log.stream()
				.filter(  ATMLogger -> ATMLogger.getActivity().equals("deposit") )
				.map( ATMLogger -> ATMLogger.toString() )
				.collect(Collectors.joining("\n"));
	}
}
