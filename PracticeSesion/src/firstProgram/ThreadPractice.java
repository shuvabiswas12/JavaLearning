package firstProgram;

public class ThreadPractice {

	public static void main(String[] args) {
		
		int y = 0;
		PracticeThread thread1 = new PracticeThread();
		
		System.out.println("Main Thread is start...");
		
		thread1.start();
		
		for (int i=0; i<10; i++) {
			y+=100;
			System.out.println("Y = "+y);
			try {
				thread1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		/*try {
			thread1.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		System.out.println("Main thread is end...");
		
		System.out.println("X = "+thread1.x);
		System.out.println("Y = "+y);
		

	}

}

class PracticeThread extends Thread {
	public static long x = 0;
	@Override
	public void run() {
		
		for (int i=0; i<10; i++) {
			x+=100;
			try {
				sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("X = "+x);
		}
		
		System.out.println("End new Thread  X = "+x);
	}
}

