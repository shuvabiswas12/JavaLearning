package program1;

public class TestingClass {

	public static void main(String[] args) {
		
		OuterClass outerClass = new OuterClass();
		outerClass.setX(20);
		outerClass.printX();
		
		
		OuterClass.InnerClass innerClass = outerClass.new InnerClass();
		innerClass.setY(40);
		innerClass.printY();
	}

}

class OuterClass {
	private int x;
	
	public void setX(int x) {
		this.x = x;
	}
	
	protected int getX() {
		return x;
	}
	
	public void printX() {
		System.out.println("X = "+x);
		System.out.println("Outer Class Method");
	}
	
	class InnerClass {
		private int y;
		
		public void setY(int y) {
			this.y = y;
		}
		
		protected int getY() {
			return y;
		}
		
		public void printY() {
			System.out.println("Y = "+y);
			System.out.println("Inner Class Mathod");
			System.out.println("X = "+x); // from outer class
		}
		
	}
	
}