package de.demmer.dennis;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;


public class CalculatorTest {
	
	
	
	@Test
	public void multiplyTest() {
		Calculator c = new Calculator();
		
		int ergebnis = c.multiply(2, 5);
		int erwartet = 10;

		assertEquals(erwartet, ergebnis);

	}
	
	
	@Test
	public void addTest() {	
		Calculator c = new Calculator();
		assertEquals(10, c.add(5, 5));

	}
	
	

}
