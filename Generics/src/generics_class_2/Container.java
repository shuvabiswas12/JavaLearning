package generics_class_2;

// This is a Generic and subTyping Class

// This Container class is works as like an array. This class can input data and print that

public class Container<T> {
	
	private T[] items;
	private static final int MAX_LENGTH = 10; 
	
	private int currentIndex = 0;
	
	public Container() {
		items = (T[]) new Object[MAX_LENGTH];
	}
	
	public void addItems(T items) {
		if (currentIndex < MAX_LENGTH) {
			this.items[currentIndex++] = items;
		}
		else {
			System.out.println("-------Container is full-------");
		}
	}
	
	public T getItems(int index) {
		
		if (index > MAX_LENGTH) {
			throw new IllegalArgumentException("Index can not be larger than max....");
		}
		
		return items[index];
	}
	
	public void printAll() {
		for (int i=0; i<MAX_LENGTH; i++) {
			System.out.print(items[i]+" ");
		}
	}
	
	
	public static void main(String[] args) {
		
		Container<Integer> dataList = new Container<>();
		
		dataList.addItems(10);
		dataList.addItems(20);
		dataList.addItems(30);
		dataList.addItems(40);
		dataList.addItems(50);

		System.out.println(dataList.getItems(3));
		dataList.printAll();
		
		
	}

}
