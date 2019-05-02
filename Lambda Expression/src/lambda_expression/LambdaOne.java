package lambda_expression;

public class LambdaOne {

	public static void main(String[] args) {
		
		double width = 3.33;
		
		// lambda expression
		Drawable drawable = () -> {
			System.out.println("Drawing!...");
		};
		drawable.draw();
		
		/* --------------------------------------------- */
		
		// this can be write it as bellow if there has single statement
		Drawable drawable2 = () -> {
			System.out.println("Drawing " + width);
		};
		drawable2.draw();
		
		
		
		
		
		
		
		/* ------------------------------------------ */
		
		/*
		 * 
		 * Drawable drawable2 = new Drawable() {
			
			@Override
			public void draw() {
				System.out.println("Drawing!...");
				
			}
		};
		drawable2.draw();
		
		*
		*/
		
		/* ------------------------------------------------ */
		
		
		
		
		
		
		
		
		
		
		/* lambda expression with multiple parameter */
		
		Addable addable = (int number1, int number2) -> (number1 + number2);
		System.out.println(addable.add(20, 30));
		
		Addable addable2 = (num1, num2) -> (num1 * num2);
		System.out.println(addable2.add(40, 2));
		
		

	}

}

interface Drawable {
	public void draw();
}

interface Addable {
	public int add(int a, int b);
}
