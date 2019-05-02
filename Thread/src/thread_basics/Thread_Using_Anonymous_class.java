package thread_basics;

public class Thread_Using_Anonymous_class {
	
	public static void main(String[] args) {
		
		
		
//		Runnable object = new Runnable() {
//			public void run() {
//				System.out.println("New Thread Executed");
//			}
//		};
//		
//		Thread thread_1 = new Thread(object);
//		thread_1.start();
		
		
		
		/** Anonymous class Thread */
		
		Thread thread_2 = new Thread(new Runnable() {
			public void run() {
				System.out.println("Thread_2 Executed");
			}
		});
		
		
		thread_2.start();
		
		System.out.println(System.currentTimeMillis());  // Print the current time 
		
	}

}


/// Note:->  Here, is the example of anonymous class thread  


/// Note:->  Here, System.currentTimeMillis() method returns the current time of the system

