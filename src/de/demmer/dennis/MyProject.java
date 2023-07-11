package de.demmer.dennis;

import java.util.Iterator;

public class MyProject {
	
	
	public static void main(String[] args) {
		
		
		//...
		
		
		StringConverter stringConverter = new StringConverter();
		
		char[] myCharArray = stringConverter.toCharArray(new MyStringUtilImpl(), "abc");
		
		
		
		//...
		
		for (int i = 0; i < myCharArray.length; i++) {
			System.out.println(myCharArray[i]);
		}
		
		
	}

}
