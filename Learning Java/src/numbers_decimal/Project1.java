package numbers_decimal;

public class Project1 {
	
	// binary -> decimal
	// octal -> decimal
	// hexadecimal -> decimal

	public static void main(String[] args) {
		
		//  binary into decimal
		String num = "1010";
		Integer decimal = Integer.parseInt(num, 2);
		System.out.println("Decimal form is = "+decimal);

		
		// octal into decimal
		String num2 = "476";
		Integer octal = Integer.parseInt(num2, 8);
		System.out.println("Octal form is = "+octal);
		
		
		// hexadecimal into decimal
		String num3 = "A";
		Integer hexadeciaml = Integer.parseInt(num3, 16);
		System.out.println("Hexadecimal form is = "+hexadeciaml);
		
	}

}
