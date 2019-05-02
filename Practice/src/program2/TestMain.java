package program2;

public class TestMain {

	public static void main(String[] args) {
		
		Test1 test1 = new Test1();
		test1.showInTest1();
		
		Test1.StaticNestedClass srClass = new Test1.StaticNestedClass();
		srClass.showInTest2();
		
		Test1.InnerClass srClass2 = test1.new InnerClass();
		srClass2.showInTest2();
				
	}

}
