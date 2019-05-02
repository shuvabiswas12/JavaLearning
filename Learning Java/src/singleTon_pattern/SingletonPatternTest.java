package singleTon_pattern;

public class SingletonPatternTest {

	public static void main(String[] args) {
		
		SingleTonPattern pattern = SingleTonPattern.getInstance();
		

	}

}

/*
				----------------------------SingleTon Pattern----------------------------
					1. constructor can be private
					2. and this is called singleton pattern
					3. to make object that class it is required to write other method
					4. the method have to static 

-------------------------------------------------------------------------------------------------------
*/
class SingleTonPattern {
	
	private static SingleTonPattern obj = null;
	
	private SingleTonPattern () {
		
	}
	
	public static SingleTonPattern getInstance () {
		
		if (obj == null) {
			obj = new SingleTonPattern();
		}
		
		return obj;
	}
	
}
