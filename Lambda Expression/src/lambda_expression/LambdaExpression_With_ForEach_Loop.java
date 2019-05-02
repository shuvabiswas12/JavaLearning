package lambda_expression;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpression_With_ForEach_Loop {

	public static void main(String[] args) {
		
		List<String> nameList = new ArrayList<>();
		
		nameList.add("Dano");
		nameList.add("Piano");
		nameList.add("LG");
		nameList.add("Sony XB-450 ap");
		
		// lambda expression with for each loop
		nameList.forEach(
				
				(name) -> System.out.println(name)
				
			);
		
		
		
		
		/*
		
		for (String name : nameList) {
			System.out.println(name);
		}
		
		*/

	}

}
