package anonymous_class;

/* This program is for interface only */

public class Part2 {

	public static void main(String[] args) {
		
		// this is anonymous class
		
		Student students = new Student() {
			
			@Override
			public void eat() {
				System.out.println("I eat vagitable all time");
			}

			@Override
			public void sleep() {
				System.out.println("I sleep 5 hrs in a day");
				
			}

			@Override
			public void work() {
				System.out.println("I do not like to study");
				
			}

			@Override
			public void earn() {
				System.out.println("I am not still earn");
				print();
				
			}
			
			public void print() {
				System.out.println("I am a student");
			}
			
			
			
			/*
			 * if a method has been created in anonymous class then that method can not find by the obj. of that class.
			 * 
			 * so, if i want to execute that method then that method should be call inside from the Overrided method.
			 * 
			 * */
			
		};
		
		students.sleep();
		students.eat();
		students.work();
		students.earn();

	}

}

interface Student {
	
	public abstract void eat();
	public abstract void sleep();
	public abstract void work();
	public abstract void earn();
}
