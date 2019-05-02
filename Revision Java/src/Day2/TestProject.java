package Day2;

public class TestProject {

	public static void main(String[] args) {
		
		Test test = Project.getInstance();
		test.add(10,  20);
		
		
		NewClass secondClass = new NewClass(){};
		secondClass.instanceOfNewClass();
		
		
		
		
	}

}

class Project extends Test {
	
	protected static Project project;
	

	@Override
	protected void add(int num1, int num2) {
		System.out.println("addition is = " + (num1 + num2));
		
	}
	
	public static Test getInstance() {
		
		project = new Project();
		
		return project;
	}
	
	
	
}

abstract class Test {
	
	private int number1;
	private int number2;
	
	public Test() {
		System.out.println("Test is called");
	}
	
	abstract protected void add(int num1, int num2);
	
	
	
}

abstract class NewClass {
	public void instanceOfNewClass() {
		System.out.println("This is an instance of NewClass");
	}
}
