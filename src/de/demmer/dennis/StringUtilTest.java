package de.demmer.dennis;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringUtilTest {
	
	
	
	@Test
	public void toCharArrayTest() {
		
		StringUtil stringUtil = new StringUtil();
		
		char[] testArray= {'a','b','c'};
		
		char[] actualArray = stringUtil.toCharArray("abc");
		
		assertEquals(testArray.length, actualArray.length);
		
		
		
		boolean assertBool = true;
		
		for (int i = 0; i < testArray.length; i++) {
			if(testArray[i] != actualArray[i]) {
				assertBool = false;
			}
		}

		assertTrue(assertBool);
		
		

	}
	
	
	
	
	
	
	
	
	
	

}
