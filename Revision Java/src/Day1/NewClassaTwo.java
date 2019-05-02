package Day1;

public class NewClassaTwo {
	
	public static void main(String[] args) {
		
		Student nabil = new Student("Nabil", 20, 5.6f, 116);
		Student rupa = new Student("Rupa", 21, 5.5f, 219);
		
		Display displayEverything = new Display();
		displayEverything.dispAl(nabil);
		
		System.out.println("\n\n--------------------------------------\n\n");
		
		displayEverything.dispAl(rupa);
	}

}

class Student {
	
	private String name;
	private int age;
	private float height;
	private double id;
	
	public Student() {
		
	}
	
	public Student(String name, int age, float height, double id) {
		this.setName(name);
		this.setId(id);
		this.setAge(age);
		this.setHeight(height);
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	private void setId(double id) {
		this.id = id;
	}
	
	private void setAge(int age) {
		this.age = age;
	}
	
	private void setHeight(float height) {
		this.height = height;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public float getHeight() {
		return height;
	}
	
	public double getId() {
		return id;
	}
	
}

class Display {
	
	public void dispAl(Student student) {
		System.out.println("name = "+student.getName() + " id = "+student.getId() +" age = "+student.getAge() +" height = "+student.getHeight());
		System.out.print("Thank You for searching information");
		
	}
}
