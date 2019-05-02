package program2;

public class Student {

	public static void main(String[] args) {
		
		MainStudents nabil = new MainStudents("Nabil", "01703009482", 21, 5.8f);
		nabil.printfAll(false);
	}

}

class MainStudents {
	
	private String name;
	private int age;
	private float height;
	private String phoneNo;
	
	public MainStudents () {
		name = null;
		age = 0;
		height = 0.0f;
		phoneNo = null;
	}
	
	public MainStudents (String name) {
		this();
		this.name = name;
	}
	
	public MainStudents(String name, String phoneNo) {
		this(name);
		this.phoneNo = phoneNo;
	}
	
	public MainStudents(String name, String phoneNo, int age) {
		this(name, phoneNo);
		this.age = age;
	}
	
	public MainStudents(String name, String phoneNo, int age, float height) {
		this(name, phoneNo, age);
		this.height = height;
	}
	
	public void printfAll(boolean i) {
		if (i == true) {
			System.out.println("Name = "+this.name+"\nPhone No = "+this.phoneNo+"\nAge = "+this.age+
					"\nHeight = "+this.height+"\n");
		}
		else {
			System.out.println("Name = "+this.name+"\nAge = "+this.age+
					"\nHeight = "+this.height+"\n");
		}
	}
}
