package program2;

public class Test1 {
	
	public int value = 1;
	
	public void showInTest1() {
		System.out.println("Test1 class");
	}
	
	
	
	protected static class StaticNestedClass {
		
		public int value2 = 2;
		
		public void showInTest2() {
			System.out.println("Test2 class");
		}
	}
	
	
	
	public class InnerClass extends StaticNestedClass {
		public int value3 = 14;
		@Override
		public void showInTest2() {
			
			System.out.println("Test3 class inherired class");
			
			super.showInTest2();
		}
	}
}
