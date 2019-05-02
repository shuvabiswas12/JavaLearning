package program3;

public class VariableArgs {
	
	public static void main(String[] args) {
		
		Name name = new Name(20, 10, 30);
		name.result();
		
	}

}

class Name {
	
	private int sum = 0;
	
	public Name(int ... num) {
		
		for (int i : num) {
			sum+=i;
		}
		
	}
	
	public void result() {
		System.out.println("Sum = "+sum);
	}
		
}
