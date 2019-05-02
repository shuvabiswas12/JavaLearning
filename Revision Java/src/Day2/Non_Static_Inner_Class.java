package Day2;

public class Non_Static_Inner_Class {

	public static void main(String[] args) {
		
		OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
		innerClass.printX();
		innerClass.printY();
		OuterClass outerClass = new OuterClass();
		outerClass.print();
		 
	}

}


class OuterClass {
	static int y = 10;
	
	static class InnerClass {
		static int x = 20;
		
		static public void printY() {
			System.out.println("Y = "+y);
		}
		
		static public void printX() {
			System.out.println("X = "+x);
		}
	}
	
	public void print() {
		System.out.println("y = "+y);
	}
}