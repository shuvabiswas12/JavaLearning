package Day3;

import java.text.DecimalFormat;

public class TestDecimalNumber {
	
	public static void main(String[] args) {
		
		// octal -> decimal
		// binary -> decimal
		// hexadecimal -> decimal
		
		/*
		String number = "1010";
		Integer decimal = Integer.parseInt(number, 2);
		System.out.println(decimal);
		
		String number2  = "476";
		Integer octal = Integer.parseInt(number2, 8);
		System.out.println(octal);
		
		String number3 = "A";
		Integer hexadecimal = Integer.parseInt(number3, 16);
		System.out.println(hexadecimal);
		
		
		String num = Integer.toBinaryString(76);
		System.out.println(num);
		
		String num2 = Integer.toHexString(12);
		System.out.println(num2);
		
		String num3 = Integer.toOctalString(345);
		System.out.println(num3);*/
		
		
		
		
		
		
		// ------------------------------------------------------------------------- //
		
		DecimalFormat format = new DecimalFormat("0.00");
		double num = 3.989898;
		System.out.println(format.format(num));
		
		
		
		System.out.printf("format = %.2f", num);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
