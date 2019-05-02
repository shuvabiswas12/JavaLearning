package firstProgram;

public class ThreadOne extends MyClass{
	
	@Override
	public void process() throws InterruptedException {
		for (int i=0; i<10; i++) {
			System.out.println("2...");
			Thread.sleep(200);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		Thread thread = new Thread(new OurClass());
		thread.start();
		
		ThreadOne threadOne = new ThreadOne();
		threadOne.process();
		
		/*OurClass ourClass = new OurClass();
		
		Thread thread2 = new Thread(ourClass);
		thread2.start();*/
		 
	}

}

class MyClass {
	int i=0;
	public void process() throws InterruptedException {
		for (i=0; i<10; i++) {
			System.out.println("1...");
			Thread.sleep(1000);
		}
	}
}

class OurClass extends MyClass implements Runnable {

	@Override
	public void run() {
		try {
			super.process();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
