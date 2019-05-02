package autoBoxing_unBoxing;

public class Main {

	public static void main(String[] args) {
		
		/* ---------autoBoxing means   primitive type -> reference type
		==================================================================-------*/
		
		/*------------There is two way to autoBoxing---------*/
		
		
		// way 1
		int number = 10; // primitive type 
		Integer x = Integer.valueOf(number); // wrapper class or reference type and this is autoBoxing
		System.out.println(" autoBoing Value = "+x);
		
		
		
		
		// way 2
		int numberTwo = 20; // primitive type
		// the compiler automatically put Integer.valueOf() method in this section. 
		Integer newNumber = numberTwo; // converting primitive type into reference type and this is autoBoxing
		System.out.println(" autoBoing Value = "+newNumber);
		
		
		/*=====================================================================================*/
		
		
		
		/*--------unBoxing means    reference type ->  primitive type 
		------------------------------------------------------------------*/
		
		/*------------There is two way to unBoxing---------*/
		
		
		// way 1
		Double d = new Double(20.00); // reference type
		double num2 = d.doubleValue(); // converting reference to primitive type this is called unBoxing
		System.out.println(" unBoxing Value = "+num2);
		
		
		// way 2
		Double d2 = new Double(30.33);
		// the compiler automatically put d2.doubleVaue() method in this section
		double y = d2; // converting reference to primitive type this is called unBoxing
		System.out.println(" unBoxing value = "+y);
		
		
		
	}

}
