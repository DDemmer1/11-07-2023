package de.demmer.dennis;

import java.util.Iterator;

public class StringUtil {
	
	
	
	public char[] toCharArray(String input) {
		char[] charArray =  new char[input.length()];
		
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			charArray[i] = c;
		}
	
		return charArray;
	}
	

}
