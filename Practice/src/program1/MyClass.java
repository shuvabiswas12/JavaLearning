package program1;

public class MyClass {

	public static void main(String[] args) {
		
		
		Student nabil = new Student();
		nabil.setGender("male");
		nabil.doPhotography(true);
		nabil.study();
		nabil.eat();
		nabil.sleep();
		System.out.println(nabil.getGender());
		
		Human engineer = new Human(true){
			
			@Override
			public void earn() {
				System.out.println("He is a programmer and he has earned 1M within a month");
			}
			
		};
		
		engineer.setGender("female");
		System.out.println(engineer.getGender());
		
		engineer.earn();
		
	}

}

class Student extends Human {
	
	public Student() {
	
		super(true);
		
		this.setStudent(true);
		this.setAge(21);
		this.setVagitarian(false);
		this.setName("I am a Student");
		
	}
	
	@Override
	public void doPhotography(boolean value) {
		if (value = true) {
			System.out.println("I have know about photography as a little");
		}
		else {
			System.out.println("I don't know about photography");
		}
	}
	
	@Override
	public void study() {
		System.out.println("He has read 6 hrs in a day");
		super.study();
	}
	
	@Override
	public void eat() {
		System.out.println("He has eating burgur");
	}
	
	@Override
	public void sleep() {
		System.out.println("He has sleept at least 4 hrs in a modnight and \n 2 hrs at day");
	}
	
}













class Human {
	
	private boolean vagitarian;
	private int age;
	private String name;
	private float height;
	private boolean student;
	private String gender;
	
	public Human(boolean value) {
		
	}
	
	public void setVagitarian(boolean value) {
		vagitarian = value;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHeight(float height) {
		this.height = height;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setStudent(boolean value) {
		student = value;
	}
	
	public int getAge() {
		return age;
	}
	
	public boolean isStudent() {
		return student;
	}
	
	public String getName() {
		return name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public float getHeight() {
		return height;
	}
	
	public boolean isVagiterian() {
		return vagitarian;
	}
	
	public void eat() {
		System.out.println("he is eating...");
	}
	
	public void sleep() {
		System.out.println("He is sleeping at lest 6 hrs daily");
	}
	
	public void earn() {
		System.out.println("He has earned 0 taka");
	}
	
	public void study() {
		System.out.println("He has read 12 hrs a day");
	}
	
	public void doPhotography(boolean value) {
		System.out.println("he has done photography well");
	}
	
}


