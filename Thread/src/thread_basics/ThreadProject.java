package thread_basics;

public class ThreadProject {
	
	public static void main(String[] args) throws InterruptedException {
		
		A thread_1 = new A();  // read this line -> main thread 
		thread_1.start();  // read this line -> main thread and Start an another thread called thread_1   
		
		for (int i=0; i<10; i++) {
			System.out.println("1");
			Thread.sleep(500);  // pause for 0.1 seconds
		}
		
	}

}

class A extends Thread {
	
	@Override
	public void run() {
		try {
			print();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void print() throws InterruptedException {
		
		for (int i=0; i<10; i++) {
			System.out.println("2");
			Thread.sleep(500);
		}
	}
}


/// Note:- The Thread class contains two methods named start() and run().
/// start() -> this method start a thread
/// run() -> this method run a thread which is start by using start() method


// Thread.sleep(milli_seconds) -> this line can pause a thread for moments. 


/// By using thread we can perform many task parallel mode at a time.
