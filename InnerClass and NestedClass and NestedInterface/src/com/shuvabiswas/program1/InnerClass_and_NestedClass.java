package com.shuvabiswas.program1;

//by this way a class is capable to gain more encapsulated

public class InnerClass_and_NestedClass {
	
	public void showInMainClass() {
		System.out.println("This is main class...");
	}
	
	// static nested class because it is static class. and it can be protected or private
	public static class StaticNestedClass {
		
		public void showInStaticNestedClass() {
			System.out.println("This is static nested class...");
		}	
	}
	
	//Inner class because it is not static class. and it can be private or protected
	public class InnerClass {
		
		public void showInInnerClass() {
			System.out.println("This is Inner class...");
		}
	}
	
}
