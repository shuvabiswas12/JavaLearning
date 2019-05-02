package numbers_decimal;

public class Project2 {
	
	// decimal -> binary
	// decimal -> octal
	// decimal -> hexadecimal

	public static void main(String[] args) {
		
		int decimalNumber = 10;
		
		// decimal into binary
		String num = Integer.toBinaryString(decimalNumber);
		System.out.println("Binary form of 10 is = "+num);
		
		
		// decimal into octal
		String num2 = Integer.toOctalString(decimalNumber);
		System.out.println("Octal form of 10 is = "+num2);
		
		
		// decimal into hexadecimal
		String num3 = Integer.toHexString(decimalNumber);
		System.out.println("Hexadecimal form of 10 is = "+num3);

	}

}
