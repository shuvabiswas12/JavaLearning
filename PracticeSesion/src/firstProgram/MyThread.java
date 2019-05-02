package firstProgram;

public class MyThread {

	public static void main(String[] args) {
		System.out.println("Main Thread is started...");
		
		T1 obj = new T1();
		
		System.out.println(obj.isAlive());
		obj.setDaemon(true);
		
		obj.start();
		
		System.out.println(obj.isAlive());
			
		System.out.println("Main Thread is ended and x = "+obj.x);
	
	}

}

class T1 extends Thread {
	long x;
	@Override
	public void run() {
		for (int i=0; i<100000; i++) {
			x++;
		}
	System.out.println("New thread is ended. and x = "+x);
	}
	
}