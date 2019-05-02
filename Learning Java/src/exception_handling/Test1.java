package exception_handling;

public class Test1 {

	public static void main(String[] args) {
		
		int num1 = 100;
		int res = 0;
		
		
		try {
			res = 100/0;
		}
		catch (Exception e) {
			System.out.println("100 cannot divide by zero");
		}
		

		System.out.println("result = "+res);
	}

}
