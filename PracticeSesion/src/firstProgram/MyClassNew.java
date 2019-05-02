package firstProgram;

public class MyClassNew {
	
	MyInterfaces interfaces = new MyInterfaces() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
	};

}

interface MyInterfaces {
	void run();
	static void add() {
		
	}
	
	default void Subject() {
		
	}
}
