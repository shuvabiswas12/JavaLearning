package enumeration_test_2;

public enum Human {
	
	Sakib(20, "Student"),
	Nabil(23, "Software Eng."),
	Nirupoma(19, "Employee");
	
	private int age;
	private String occupation;
	
	private Human(int age, String occupation) {
		this.age = age;
		this.occupation = occupation;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getOccupation() {
		return this.occupation;
	}
	
	
}
