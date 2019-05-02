package static_block;

public class StaticBlock {
	
	public int x;
	public static int y;
	
	// static block 1
	static {
		//this is show error. because an static block can only access static variable.
		//x=10;
		
		// this is correct
		y = 10;
		System.out.println("This is static block 1");
	}
	
	// static block 2
	static {
		System.out.println("Y = "+y+" This is static block 2");
	}

	public static void main(String[] args) {
		
		// static blocks are executed at first time in a program. 
		// if static blocks are present in any program, then thats blocks are executed at first time.
		// static block are executed before the main method in any program.
		
		System.out.println("This is from main method");

	}
	
	
	// static block 3
	static {
		System.out.println("This is static block 3");
	}
	
	public static void input() {
		
		// this is show error. Because an static method can access only static variable
	    // x = 20;
		
		// so, here X should be a static variable
	}

}
