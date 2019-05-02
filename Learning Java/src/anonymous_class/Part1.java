package anonymous_class;

/* This program is for normal class only */

public class Part1 {

	public static void main(String[] args) {
		
		// this is anonymous class
		
		Human student = new Human(){
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
				print();
			}
			
			
			// this method has not found by the obj of Human() class. because this method has not in the Human() class. 
			public void print() {
				System.out.println("This is another class from a anonymous class");
			}
		};
		
		student.eat();
		student.work();
		student.sleep();
		
		
		/*
		 * if a method has been created in anonymous class then that method can not find by the obj. of that class.
		 * 
		 * so, if i want to execute that method then that method should be the Overrided method. Otherwise it hasn't find by that obj.
		 * 
		 * */
		

	}

}

class Human {
	public void eat(){
		
	}
	
	public void sleep() {
		
	}
	
	public void getUp() {
		
	}
	
	public void work() {
		
	}
}


/*class Student extends Human {
	
}*/