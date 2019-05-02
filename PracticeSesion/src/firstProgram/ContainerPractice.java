package firstProgram;

public class ContainerPractice<T> {
	
	private static  int MAX_LENGTH = 10;
	private int currentPossition = 0;
	private T[] obj;
	
	public ContainerPractice() {
		this.obj = (T[]) new Object[MAX_LENGTH];
	}
	
	public void addValue(T value) {
		if (currentPossition < MAX_LENGTH) {
			obj[currentPossition++] = value;
		}
		else {
			System.out.println("----Limitation Out----");
		}
	}
	
	public T getValue(int index) {
		if (index > MAX_LENGTH) {
			throw new IllegalArgumentException("Limitation has been out....");
		}
		return obj[index];
	}
	
	public void printAllObj() {
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
	}
	
	public static void main(String[] args) {
		
		ContainerPractice<Integer> practice = new ContainerPractice<>();
		
		practice.addValue(10);
		practice.addValue(20);
		practice.addValue(30);
		practice.addValue(40);
		
		System.out.println(practice.getValue(3));
		
		practice.printAllObj();
	}

}
