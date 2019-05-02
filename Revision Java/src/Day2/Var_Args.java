package Day2;

public class Var_Args {

	public static void main(String[] args) {
		
		TestVarArgs testVarArgs = new TestVarArgs();
		testVarArgs.info(20,  10, 20, 40, 50);
		

	}

}

class TestVarArgs {
	int i=0, sum = 0;
	
	public void info(int a, int ... b) {
		System.out.println("length = "+b.length);
		
		for( ; i<b.length; i++) {
			sum += sum +b[i];
		}
		System.out.println("Result = "+sum);
	}
	
}
