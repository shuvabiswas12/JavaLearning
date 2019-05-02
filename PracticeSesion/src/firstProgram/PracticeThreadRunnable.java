package firstProgram;

public class PracticeThreadRunnable {

	public static void main(String[] args) {
		
		System.out.println("Main Thread is started...");
		Thread t1 = new Thread(new NewBeeClass());
		t1.start();
		
		/*try {
			t1.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		System.out.println("Main Thread is Ended...");

	}

}

class NewBeeClass implements Runnable {

	static int x = 0;
	@Override
	public void run() {
		System.out.println("New thread is started...");
		
		for (int i = 0; i < 10; i++) {
			x+=100;
			System.out.println("X = "+x);
			try {
				new Thread().sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("New Thread is ended. X = "+x);
		
	}
	
}