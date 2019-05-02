package Day3;

public class SingleTonPattern {

	public static void main(String[] args) {
		TestSingleTonPattern obj = TestSingleTonPattern.getInstance();
		System.out.println(obj.getClass().toString());
	}

}


class TestSingleTonPattern {
	
	private static TestSingleTonPattern obj = null; 
	
	private TestSingleTonPattern() {
		
	}
	
	public static TestSingleTonPattern getInstance() {
		
		if (obj == null) {
			obj = new TestSingleTonPattern();
		}
		
		return obj;
	}
}