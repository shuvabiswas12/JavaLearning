package lambda_expression;

public class Passing_Multiple_Statement {

	public static void main(String[] args) {
		
		Speakable speakable = (String message) -> {
			String message1 = " hello world";
			String message2 = " Another message";
			
			return message + message1 + message2;
		};
		
		System.out.println(speakable.speak("here it goes..."));

			
	}

}


interface Speakable {
	String speak(String message);
}