package exception_handling;

public class Test2 {

	public static void main(String[] args) {
		int i = 150;
		
		
		try {
			if (i>100) {
				throw new Exception();
			}
		}
		catch (Exception e) {
			System.out.println("Number cann't be larger than 100");
		}
		
		System.out.println("Program ends");

	}

}
