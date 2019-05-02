package static_inner_class;

public class MainClass {

	public static void main(String[] args) {
		
		OuterClass.x = 10;
		
		// object of Inner Class
		OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
		innerClass.add();

	}

}

class OuterClass { 
	public static int x; // this should be static since this is used in a static method
	
	// we can use "private" access modifier instead of "public" or "default" in  inner class
	
	/*
	 *    private class InnerClass {
			  int y;
		 }  
	 */
	
	
	// static inner class
	static class InnerClass {
		static int y; // this variable should be static cause static method can- 
		// -access only static variable only.
		
		
		static public void add() {
			y+=10;
			print();
		}
		
		// this method should be static because static method can access only a static method
		static public void print() {
			System.out.println(y+x);
		}
	}
	
}
