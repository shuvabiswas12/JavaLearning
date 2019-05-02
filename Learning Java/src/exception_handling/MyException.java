package exception_handling;

public class MyException {

	public static void main(String[] args) {
		
		int number = 14;
		
		try {
			if(number > 10) {
				OurException e = new OurException();
				throw e;
			}
		}
		catch (OurException e) {
			
		}
		
		System.out.println("Program Ends");		

	}

}


class OurException extends Exception {
	
	public OurException() {
		System.out.println("number can't be larger than 10");
	}
}