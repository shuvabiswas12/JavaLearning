package thread_basics;

public class RunnableThread {
	
	public static void main(String[] args) throws InterruptedException {
		B b = new B();
		
		// 'Runnable' class doesn't contains start() method
		// so start a new thread, create an object of 'Thread' class and 
		// pass the object of 'Runnable' class to the constructor of 'Thread' class
		
		Thread thread_1 = new Thread(b);  // passing the object of 'B' class because 'B' class implements the Runnable class
		thread_1.start();  // now start the thread using the object of 'Thread' class
		
		for (int i=0; i<10; i++) {
			System.out.println("Main Thread - Runnable class");
			Thread.sleep(500);
		}
	}
	

}


class C {
	void print() {
		for (int i=0; i<10; i++) {
			System.out.println("Inherit from Class A");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


class B extends C implements Runnable {
	
	public void run() {
		print();
	}
	
}



/// Note:- Runnable class doesn't contains start() method

