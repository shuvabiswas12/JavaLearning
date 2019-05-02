package thread_basics;

public class DaemonThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		MyDaemonThread object = new MyDaemonThread();
		
		object.setDaemon(true);  // now this 'thread-0' is a daemon thread 
		
		object.start();
		
		System.out.println(object.isAlive()); //  isAlive() returns a boolean value 
		
		System.out.println(object.x);
		
		System.out.println("Main thread ended");
	}

}


class MyDaemonThread extends Thread {
	
	int x;
	public void run() {
		for (int i=0; i<100000; i++) {
			x++;
		}
		
		System.out.println("MydaemonThread ended");
	}
}



/// Note:->  isAlive() method returns a boolean value (true or false)


/// Non-Daemon Thread:->  By default a thread is a non-daemon thread which is called a user thread also
/// 			      If the main thread is over then a non-daemon thread can be run. 
///                   Thats why it is called a non-daemon thread


/// setDaemon():->  By using this method a thread can be a daemon thread. setDaemon(boolean value) method takes a 
///                 boolean value ( true or false). 
///                 if setDaemon(true) then it is daemon thread.
///                 if setDaemon(false) then it is a non-daemon thread.


