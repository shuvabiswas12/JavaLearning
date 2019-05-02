package com.shuvabiswas.string_buffer;

public class StringProgram5 {

	public static void main(String[] args) {
		
		StringBuffer stringBuffer = new StringBuffer("Shuva Biswas");
		System.out.println(stringBuffer);
		
		String string = "bangladesh";
		StringBuffer sBuffer = new StringBuffer(string);
		
		// adding another string into an older string
		stringBuffer.append(" ritu");
		System.out.println(stringBuffer);
		

		
		
		//finding string buffer length
		int length = stringBuffer.length();
		System.out.println(length);
		
		
		
		// printing string as a reverse
		stringBuffer.reverse();
		System.out.println(stringBuffer);
		
		
		// printing sbuffer string
		System.out.println(sBuffer);
		
		
		// deleting string from string buffer
		// this method works from fast index to before the last index
		sBuffer.delete(1, 5);
		System.out.println(sBuffer);
		
		
		// setLength for string. this method trim the string follows by setLength. 
		// This method works from the last to fast according to length
		sBuffer.setLength(5);
		System.out.println(sBuffer);
		
	}

}
