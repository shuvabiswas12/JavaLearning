package Day1;import java.awt.image.RescaleOp;

public class CopyConstructor {

	public static void main(String[] args) {
		
		/*Teacher sipraMem = new Teacher("Shipra", "20,000", 28) {
			
			@Override
			public void sleepTime() {
				super.sleepTime();
				
				System.out.println("He is a lazy person after all");
			}
			
			@Override
			public void totalWorksTime() {
				// TODO Auto-generated method stub
				super.totalWorksTime();
				
				System.out.println("this is overrided method...");
			}
		};
		
		System.out.println(sipraMem.getName() + " "+sipraMem.getAge() + " " + sipraMem.getSalary());
		sipraMem.sleepTime();
		sipraMem.totalWorksTime();*/
		
		Onirudh tOnirudh = new Onirudh("Shipra", "20,000", 28);
		tOnirudh.sleepTime();
		tOnirudh.totalWorksTime();
		tOnirudh.newMethod();
		tOnirudh.calculation();
		System.out.println(tOnirudh.getName() + " "+tOnirudh.getAge() + " " + tOnirudh.getSalary());
		
		
		
		

	}

}


class Teacher {
	
	private String name;
	private int age;
	private String salary;
	int res;
	
	
	public Teacher() {
		System.out.println("This is from teacher constructor");
	}
	
	public Teacher(String name, String salary, int age) {
		this.setName(name);
		this.setAge(age);
		this.setSalary(salary);
	}
	
	public void calculation() {
		int a = 10;
		int b = 20;
		res = a+b;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age =age;
	}
	
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSalary() {
		return salary;
	}
	
	public int getAge() {
		return age;
	}
	
	
	public void sleepTime() {
		System.out.println("He works at least 8 hrs a day");
	}
	
	@Deprecated
	public void totalWorksTime() {
		System.out.println("total works time");
	}
}





class Onirudh extends Teacher {
	
	public Onirudh() {
		super();
	}
	
	public Onirudh(String name, String salary, int age) {
		super(name, salary, age);
		
	}

	@Override
	public void sleepTime() {
		System.out.println("This is inheritance");
	}
	
	@Override
	public void totalWorksTime() {
		System.out.println("This is working time");
	}
	
	public void newMethod() {
		System.out.println("This is new method");
	}
	@Override
	public void calculation() {
		super.calculation();
		
		int result = 60;
		System.out.println(result + super.res );
	}
	
}