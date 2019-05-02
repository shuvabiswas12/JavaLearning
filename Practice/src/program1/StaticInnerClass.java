package program1;

import program1.OuterClass2.InnerClass2;

public class StaticInnerClass {

	public static void main(String[] args) {
		
		OuterClass2 outerClass2 = new OuterClass2();
		outerClass2.setNum1(60);
		outerClass2.printNum1();

		InnerClass2 innerClass2 = new OuterClass2.InnerClass2();
		innerClass2.setNum2(90);
		innerClass2.printNum2();
		
	}

}

class OuterClass2 {
	static private int num1;
	
	public void setNum1(int x) {
		num1 = x;
	}
	
	static protected int getNum1() {
		return num1;
	}
	
	public void printNum1() {
		System.out.println("Num1 = "+this.getNum1());
	}
	
	static class InnerClass2 {
		private int num2;
		
		public void setNum2(int x) {
			num2 = x;
		}
		
		protected int getNum2() {
			return num2;
		}
		
		public void printNum2() {
			System.out.println("Num2 = "+this.getNum2());
			System.out.println("Num1 = "+getNum1());
		}
	}
}