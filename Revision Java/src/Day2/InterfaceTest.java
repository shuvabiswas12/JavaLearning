package Day2;

public class InterfaceTest {

	public static void main(String[] args) {
		
		Cons cons = ImplementingInterface.getInstance();
		cons.printAll();
		cons.ClassName();
		Cons.printName();
		
		ImplementingInterface.calculate();
		MyTestClass.calculate();
		
		
		

	}

}

class ImplementingInterface extends MyTestClass implements Cons {

	@Override
	public void printAll() {
		System.out.println("Name = " +NAME + "Age = " + AGE);
	}
	
	public static ImplementingInterface getInstance() {
		return new ImplementingInterface();
	}
	
	
	public static void calculate() {
		System.out.println("This is Implementing Interface");
	}
	
	
	
	
}

interface Cons {
	
	public static final String NAME = "Shuva";
	public static final int AGE = 20;
	
	public abstract void printAll();
	
	public default void ClassName() {
		System.out.println(this.getClass().toString());
	}
	
	static public void printName() {
		System.out.println("name = " +NAME);
	}
}


interface Cons2 extends Cons {
	
	public void print();
}

class MyTestClass {
	public static void calculate() {
		System.out.println("The sum is 10 & 20 = " + (10+20));
	}
}