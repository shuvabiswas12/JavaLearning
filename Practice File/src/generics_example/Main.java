package generics_example;

public class Main {

	public static void main(String[] args) {
		
		Circle circle = new Circle();
		Rectangle rectangle = new Rectangle();
		
		MainUperboundTest.draw(circle);
		MainUperboundTest.draw(rectangle);
		

	}

}

class MainUperboundTest {
	
	public static <T extends Shape> void draw (T obj) {
		obj.draw();
	}
}
