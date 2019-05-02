package autoBoxing_unBoxing;

public class Test {

	// conversion between string and primitive type
	
	public static void main(String[] args) {
		
		// primitive type to string
		// this section use toString() method.
		int num = 10;
		String number = Integer.toString(num);
		System.out.println("Value in String = "+number);
		
		
		// string to primitive type
		// this section use parseInt() parseDouble() etc. method.
		String value = "10.00";
		float value2 = Float.parseFloat(value);
		System.out.println("value = "+value2);
		
		// string to primitive type
		String value3 = "49.33";
		double x = Double.valueOf(value3);
		System.out.println("Value = "+x);

	}

}
