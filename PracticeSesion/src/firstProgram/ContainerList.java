package firstProgram;

public class ContainerList<T> {
	
	private T[] items;
	private static final int  MAX_LENGTH = 10;
	
	private int currentIndex = 0;

	public ContainerList() {
		items = (T[]) new Object[MAX_LENGTH];
	}
	
	public void addItems(T items) {
		if (currentIndex < MAX_LENGTH) {
			this.items[currentIndex++] = items;
		}
		else {
			System.out.println("-----Container is full-----");
		}
	}
	
	public T getItem(int index) {
		if (index > MAX_LENGTH) {
			throw new IllegalArgumentException("Exeded the max value...");
		}
		return items[index];
	}
	
	public void printAll() {
		for (int i=0; i<MAX_LENGTH; i++) {
			System.out.println(items[i]);
		}
	}
	
	public static void main(String[] args) {
		
		ContainerList<Integer> dataInt = new ContainerList<>();
		
		dataInt.addItems(10);
		dataInt.addItems(20);
		dataInt.addItems(30);
		dataInt.addItems(40);
		dataInt.addItems(50);
		
		int value = dataInt.getItem(2);
		System.out.println(value);
		
		dataInt.printAll();
	}
	
}
