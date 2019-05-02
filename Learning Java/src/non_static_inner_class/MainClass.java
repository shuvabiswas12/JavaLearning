package non_static_inner_class;

public class MainClass {

	public static void main(String[] args) {
		
	// -------object of inner class-------------- 
		
	/*
	 *  OuterClass outerClass = new OuterClass();
		OuterClass.InnerClass innerClass = outerClass.new InnerClass();		*/
		
		// we can write those two line in one line like below---
		OuterClass.InnerClass innerClass2 = new OuterClass().new InnerClass();
		innerClass2.setY(20);
		innerClass2.print();
		
		
	//---------Object of outer class---------------
		OuterClass outerClass2 = new OuterClass();
		outerClass2.setX(10);
		outerClass2.print();

	}

}

class OuterClass {
	int x;
	
	
	
	// inner class or non static inner class
	class InnerClass {
		int y;
		
		// setter method or mutator method 
		public void setY(int y) {
			this.y = y;
		}
		
		public void print() {
			System.out.println(y);
		}
	}
	
	
	// setter method or mutator method
	public void setX(int x) {
		this.x = x;
	}
	
	public void print() {
		System.out.println(x);
	}
	
}
