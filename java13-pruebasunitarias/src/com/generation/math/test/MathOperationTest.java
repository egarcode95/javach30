package com.generation.math.test;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import com.generation.math.MathOperations;

class MathOperationTest {
	MathOperations mathOp;
	
	@BeforeEach
	void setUp() {
		mathOp = new MathOperations(5, 8);
	
	}
	
	@Test
	@DisplayName("Sumatória de números")
	void testAddition() {
		assertEquals( 13, mathOp.addition() );
		assertEquals( 86, mathOp.addition(66, 20) );
		assertEquals( -40, mathOp.addition(-50, 10) );
		
	}
	
	@Test
	@DisplayName("Resta de números")
	void testSubstraction() {
		assertEquals( -3, mathOp.subtraction() );		
	}
	

}
