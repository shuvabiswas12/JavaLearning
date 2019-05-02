package thread_basics;

public class Join_Method {
	
	public static void main (String[] args) throws InterruptedException {
		
		MyThreadJoin threadObject = new MyThreadJoin();
		threadObject.setName("t1");
		threadObject.start();
		
//		Thread.sleep(1);
		
		threadObject.join();
		
		
		/** 
		 *  If i use the Thread.sleep(1) then the value of variable val will not 100000.
		 *  Because, Thread.sleep(1) method pause the main thread for 1 milliseconds. 
		 *  Within that 1 milliseconds, the loop of thread 't1' doesn't fully complete.
		 *  
		 *  Thats why, join() method used in here instead of Thread.sleep(1). 
		 *  
		 *  */
		
		System.out.println(threadObject.val);
	}

}


class MyThreadJoin extends Thread {
	
	int val;
	public void run() {
		System.out.println(currentThread());
		for (int i=0; i<100000; i++) {
			val++;
			
		}		
		
	}
}


/// Note:->  join() method works until the thread 't1' doesn't finish his job fully

/// threadObject.join() pause the main thread till the new thread 't1' doesn't finished his job fully 

/// setName() method set the name of a thread

