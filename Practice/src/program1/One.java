package program1;

interface Calculator {
	
	public static final int num1 = 12;
	public static final int num2 = 12;
	
	public abstract int add (int a, int b);
	
	interface DoOperation {
		
		public abstract int sub(int a, int b);
		
		int add(int a, int b);

		static void div() {
			System.out.println(num1/num2);
		}
	}
	
	interface Home {
		
		public abstract void addiion();
		
		default void task() {
			System.out.println(num1/num2);
		}
	}
}



public class One implements Calculator.DoOperation{
	
	public static int a = 15;
	
	One get() {
		return this;
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

}

class Two extends One implements Calculator.Home{
	
	public static int b = 20;
	
	Two get() {
		System.out.println("b = "+b);
		return this;
	}
	
	public void show() {
		System.out.println("welcome to coverient return type...");
	}

	@Override
	public void addiion() {
		// TODO Auto-generated method stub
		
	}
}

interface Drawable {
	
	public static final int area = 20;
	public abstract void draw();
	
	static void area() {
		System.out.println("main");
	}
	
	default void drawable() {
		System.out.println("main");
	}
	
}