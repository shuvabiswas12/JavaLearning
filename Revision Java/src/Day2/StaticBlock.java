package Day2;

public class StaticBlock {
	
	public static int number;
	

	public static void main(String[] args) {
		MyTest2 obj = new MyTest2();
		obj.data();

	}

}

class MyTest2 {
	
	public static int p;
	
	static {
		System.out.println("This is first static block");
	}
	
	static {
		System.out.println("This is second static block");
	}
	
	static {
		System.out.println("This is third static block");
	}
	
	public MyTest2() {
		System.out.println("This is constructor");
		
	}
	
	public void data() {
		System.out.println("This is data... :-)");
	}
	
	public void inti() {
		
	}
}
