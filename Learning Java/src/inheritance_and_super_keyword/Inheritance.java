package inheritance_and_super_keyword;

public class Inheritance {

	public static void main(String[] args) {
		
		Nabil student1 = new Nabil();
		student1.setName("Nabil");
		student1.setAge(21);
		student1.setHeight(5.7f);
		student1.print();
		
		Aurko students2 = new Aurko();
		students2.setName("Aurko");
		students2.setAge(22);
		students2.setHeight(5.8f);
		students2.print();
		
		// here i override the method of human class in teacher object
		Human teacher = new Human() {
			
			@Override
			public void work() {
				System.out.println("We are work 8hrs in a day in office");
			}
			
			@Override
			public void sleep() {
				System.out.println("We can sleep 5 hrs in a day");
			}
			
			@Override
			public void earn() {
				System.out.println("We are earn huge money.");
			}
			
			public void eat() {
				System.out.println();
			}
			
		};
		
		teacher.setName("Diman");
		teacher.setHeight(5.8f);
		teacher.setAge(35);
		teacher.print();
	}

}

class Human {
	
	private String name;
	private int age;
	private float height;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setHeight(float height) {
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
	
	public void print() {
		
		System.out.println("--------Data--------");
		System.out.println("Name:- "+this.name+"     Age:- "+this.age+"     Height:-"+this.height);
		System.out.println();
		System.out.println();
		
	}
	
	public void work() {
		System.out.println("We eating food heavily... but we doesn't like study");
	}
	
	public void sleep() {
		System.out.println("We are sleeping a 8 hrs in a day...!");
	}
	
	public void earn() {
		System.out.println("We are not able to earn since we are still students.");
	}
	
}

class Nabil extends Human {
	
}

class Aurko extends Human {
	
}

/*----------------------------------------------------------------------------------------*/

// we can write this override method during creation of object.
// or we can create a teacher object instead of extends Human class in Teacher class.
// this can save both memory and time.

/*---------------------------------------------------------------------------------------- */

/*

class Teacher extends Human {
	
	@Override
	public void earn() {
		System.out.println("We are Earning.");
	}
	
	public void eat() {
		System.out.println("We eat vagitable.");
	}
	
	@Override
	public void sleep() {
		System.out.println("We are sleeping al least 5 hrs in a day.");
	}
}*/