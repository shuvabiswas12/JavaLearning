package program1;

public class Inheritance {

	public static void main(String[] args) {
		
		TestNew test = new TestNew();
		System.out.println(TestNew.num);
		TestNew.num++;
		System.out.println(TestNew.num);
		test.num2++;
		System.out.println(test.num2);
		
		TestNew tNew = new TestNew();
		System.out.println("2. "+tNew.num++);
		System.out.println("2. "+tNew.num2);
		System.out.println("2. "+TestNew.num++);

	}

}

class TestNew {
	public static int num = 10;
	static String name;
	 int num2 = 20;
	
	public TestNew() {
		inIt();
	}
	
	public void inIt() {
		name = "Shuva";
	}
	
	
}