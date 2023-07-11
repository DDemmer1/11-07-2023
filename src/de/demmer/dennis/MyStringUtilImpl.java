package de.demmer.dennis;

public class MyStringUtilImpl implements IStringUtil{

	
	
	
	
	@Override
	public char[] convertToArray(String input) {

		char[] charArray =  new char[input.length()];
		
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			charArray[i] = c;
		}
	
		
		
		return charArray;
	}
	
	
	
	

}
