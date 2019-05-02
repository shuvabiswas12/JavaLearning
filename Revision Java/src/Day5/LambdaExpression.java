package Day5;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpression {

	public static void main(String[] args) {
	/*	
	int width = 10;
	TestLambda lambda = (String massage) -> {
		System.out.println("drawing "+massage);
	};
	
	lambda.draw("Hello");
	
	Testing lTesting =(int a, int b) -> (a+b);
	
	System.out.println(lTesting.add(10,  20));
	
	Testing testing = (int num, int num2) -> {
		return num+num2;
	};
	
	System.out.println(testing.add(40,  80));
	
	TestNew testNew = (a, b) -> (90+20);
	
	Os os = massage -> {
		return "Hello"+massage;
	};*/
		
		
		List<String> list = new ArrayList<>();
		
		list.add("Shuva");
		list.add("Biswas");
		list.add("Chittagong");
		list.add("Bangladesh");
		
		list.forEach((n) -> System.out.println((n)));
}

}

interface TestLambda {
	void draw(String name);
}

interface Testing {
	int add(int a, int b);
}

interface TestNew {
	int div(int a, int o);
}

interface Os {
	String deal(String massage);
}