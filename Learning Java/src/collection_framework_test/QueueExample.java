package collection_framework_test;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	
	public static void main (String[] args) {
		Queue queue = new LinkedList<>();
		
		queue.add("101");
		queue.add("102");
		queue.add("103");
		queue.add("104");
		
		System.out.println(queue);
		
		queue.remove();
		System.out.println(queue);
		
		System.out.println(queue.size());
	}

}
