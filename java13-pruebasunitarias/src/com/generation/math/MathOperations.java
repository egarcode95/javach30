package com.generation.math;

public class MathOperations {
	private double a;
	private double b;
	
	public MathOperations( double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public double addition() {
		return a + b;
	}
	
	public double addition(double numberA, double numberB) {
		return numberA + numberB;
	}
	
	public double subtraction() {
		return a - b;
	}
	
	public double multiplication() {
		return a * b;
	}

}
