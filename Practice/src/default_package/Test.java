package default_package;

public class Test {

	public static void main(String[] args) {
		

	}

}


class GetInterface {
	
	private static MyInterface myInterface;
	
	public static MyInterface getInterface() {
		myInterface = new MyInterface() {

			@Override
			public MyInterface createObj() {
				return myInterface;			
			}
			
			
		};
		return myInterface;
	}
	
}