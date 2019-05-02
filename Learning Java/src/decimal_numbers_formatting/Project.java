package decimal_numbers_formatting;

import java.text.DecimalFormat;

public class Project {

	public static void main(String[] args) {
		
		// formatting decimal number using printf() function
		double newNumber = 7.3344556;
		System.out.printf("number = %.2f\n" , newNumber);
				
		
		// decimal formatting class
		
		DecimalFormat decimalFormat = new DecimalFormat("0.00");
		double number = 3.8888;
		System.out.println(decimalFormat.format(number));
		
	}

}
