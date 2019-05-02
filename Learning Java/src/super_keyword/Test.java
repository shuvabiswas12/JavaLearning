package super_keyword;

public class Test {

	public static void main(String[] args) {
		
		Arnob arnob = new Arnob("Arnob", 25, 5.6f, true, false);
		arnob.print();

	}

}

class Student {
	
	private String name;
	public int age = 21;
	private float height;
	private boolean girlFriend, boyFriend;
	
	/*public Student() {
		
	}*/
	
	public Student(String name, int age, float height, boolean girlFriend, boolean boyFriend) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.girlFriend = girlFriend;
		this.boyFriend = boyFriend;
	}
	
	public void print() {
		System.out.println("Name= "+this.name+"\nAge= "+this.age+"\nHeight= "+this.height);
		if (boyFriend == true) {
			System.out.println("I have a boyfriend");
		}
		else {
			System.out.println("I have a girlfriend");
		}
		
		System.out.println();
	}
	
	public void study() {
		System.out.println("I love to Study");
	}
	
	public void sleep() {
		System.out.println("I have sleeped 5 hrs in a day");
	}
	
	public void eat() {
		System.out.println("I have eat vagitable not meet");
	}
	
	public void earn() {
		System.out.println("I have earned in online");
	}
}

class Arnob extends Student {

	public Arnob(String name, int age, float height, boolean girlFriend, boolean boyFriend) {
		super(name, age, height, girlFriend, boyFriend);
		
	}
	
	@Override
	public void earn() {
		super.earn();
	}
	
	@Override
	public void study() {
		super.study();
	}
	
	public void print() {
		System.out.println(super.age);
	}
}