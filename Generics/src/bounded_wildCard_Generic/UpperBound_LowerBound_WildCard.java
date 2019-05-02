package bounded_wildCard_Generic;

public class UpperBound_LowerBound_WildCard {
	
	
	/* upper bound wild card generic */
	public static <T extends Shape> void draw (T obj) {
		obj.draw();
	}
	
	
	public static void main(String[] args) {
		
		Circle circle = new Circle();
		Rectangle rectangle = new Rectangle();
		
		UpperBound_LowerBound_WildCard.draw(circle);
		UpperBound_LowerBound_WildCard.draw(rectangle);

		
	}

}
