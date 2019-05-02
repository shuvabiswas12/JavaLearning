package com.shuvabiswas.program1;

public class TestClass {

	public static void main(String[] args) {
		
		// creating object of main class
		InnerClass_and_NestedClass obj1 = new InnerClass_and_NestedClass();
		obj1.showInMainClass();
		
		
		
		// creating object of static nested class
		InnerClass_and_NestedClass.StaticNestedClass srClass = new InnerClass_and_NestedClass.StaticNestedClass();
		srClass.showInStaticNestedClass();
		
		
		
		// creating object of inner class
		InnerClass_and_NestedClass.InnerClass srClass2 = obj1.new InnerClass();
		srClass2.showInInnerClass();
		
		
	}

}
