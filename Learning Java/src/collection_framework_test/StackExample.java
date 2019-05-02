package collection_framework_test;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack stack = new Stack<>();
		stack.push("Hello world");
		stack.push("I am From Bagladesh");
		stack.push("I am a Student");
		
		System.out.println(stack);
		System.out.println(stack.size());
		
		stack.pop();
		System.out.println(stack);

	}

}
