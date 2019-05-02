package firstProgram;

public class HelloClass {

	public static void main(String[] args) {
		
		HelloClassTwo two = new HelloClassTwo();
		
		System.out.println(Thread.currentThread().getName());
		
		
		Thread thread = new Thread(two, "Thread One...");
		thread.start();
		System.out.println(thread.getName());
		
		thread = Thread.currentThread();
		System.out.println(thread.getName());
		
		
	}

}

class HelloClassTwo extends Thread {
	@Override
	public void run() {
		for (int i=0; i<5; i++) {
			System.out.println("I = "+i);
			try {
				sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("New thread has benn fineshied");
	}
}
