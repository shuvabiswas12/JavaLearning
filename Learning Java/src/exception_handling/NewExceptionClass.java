package exception_handling;

public class NewExceptionClass {

	public static void main(String[] args) {
		
		int [] myArray = {2,6,8,9,35};
		
		try {
			
			System.out.println("myArray[10] = "+myArray[10]);
			
		} catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Can not find that index "+e.getMessage());
		} 
		catch (Exception e) {
			System.out.println("Can not find that index "+e.getClass());
		}
		
		finally {
			System.out.println("Thanks for using try-catch block");
		}
		
		System.out.println("Program Closed");

	}

}
