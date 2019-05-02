package setter_getter_encapsulation;

public class Encapsulation {

	public static void main(String[] args) {
		
		Student[] students = new Student[5];
		
		students[0] = new Student();
		students[0].setName("Sangeeta Nandi");
		students[0].setRoll(11);
		students[0].setDepartment("CSE");
		students[0].setCgpa(3.43f);
		students[0].setSSCPassingYear(2011);
		students[0].setHSCPassingYear(2013);
		students[0].setFemale(true);
		
		
		students[1] = new Student();
		students[1].setName("Shuva Biswas");
		students[1].setRoll(12);
		students[1].setDepartment("CSE");
		students[1].setCgpa(3.00f);
		students[1].setSSCPassingYear(2011);
		students[1].setHSCPassingYear(2013);
		students[1].setMale(true);
		
		students[2] = new Student();
		students[2].setName("Turna Das");
		students[2].setRoll(13);
		students[2].setDepartment("ECO");
		students[2].setCgpa(3.20f);
		students[2].setSSCPassingYear(2013);
		students[2].setHSCPassingYear(2015);
		students[2].setFemale(true);
		
		students[3] = new Student();
		students[3].setName("Nirupoma Paul Shuveccha");
		students[3].setRoll(14);
		students[3].setDepartment("Physics");
		students[3].setCgpa(3.60f);
		students[3].setSSCPassingYear(2010);
		students[3].setHSCPassingYear(2012);
		students[3].setFemale(true);
		
		students[4] = new Student();
		students[4].setName("Jol Rong");
		students[4].setRoll(15);
		students[4].setDepartment("CSE");
		students[4].setCgpa(3.23f);
		students[4].setSSCPassingYear(2011);
		students[4].setHSCPassingYear(2013);
		students[4].setFemale(true);
		
		for(int i=0; i<students.length; i++) {
			System.out.println("Name : "+students[i].getName()+"\nRoll : "+students[i].getRoll()+
					"\nDepartment : "+students[i].getDepartment()+"\nCGPA : "+students[i].getCgpa()+
					"\nSSC-Passing-Year : "+students[i].getSSCPassingYear()+"\nHSC-Passing_Year : "
					+students[i].getHSCPassingYear());
			
			if (students[i].isFemale() == true) {
				System.out.println("Gender : Female");
				System.out.println();
				continue;
			}
			
			if (students[i].isMale() == true) {
				System.out.println("Gender : Male");
				System.out.println();
				continue;
			}
			
		}

	}

}


// The idea of encapsulation is-- the variable of a class is must be private modifier. And must write setter() and
// getter() method to access that private variable.

class Student {
	
	//--------------------private variable----------------------
	
	private String name;
	private String department;
	private int roll;
	private float cgpa;
	private int sscPassingYear;
	private int hscPassingYear;
	private boolean male;
	private boolean feMale; 
	
	
	//---------------------setter methods-------------------------
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}
	
	public void setSSCPassingYear(int sscPassingYear) {
		this.sscPassingYear = sscPassingYear;
	}
	
	public void setHSCPassingYear(int hscPassingYear) {
		this.hscPassingYear = hscPassingYear;
	}
	
	public void setMale(boolean male) {
		this.male = male;
	}
	
	public void setFemale(boolean feMale) {
		this.feMale = feMale;
	}
	
	
	
	
	
	//----------------------getter methods------------------------
	
	public String getName() {
		return name;
	}
	
	public int getRoll() {
		return roll;
	}
	
	public float getCgpa() {
		return cgpa;
	}
	
	public int getSSCPassingYear() {
		return sscPassingYear;
	}
	
	public int getHSCPassingYear() {
		return hscPassingYear;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public boolean isMale() {
		return male;
	}
	
	public boolean isFemale() {
		return feMale;
	}
	
	
	/* here considering the boolean type variable, here must write "is" instead Of "get"
	 * because the type of male and female is boolean.  This is rule only for boolean type 
	 *  
	 *  */
}
