package firstProgram;

public class MyData<E> {
	
	private E e1;
	
	
	public MyData(E e1) {
		this.e1 = e1;
	}
	
	public E getE1() {
		return e1;
	}

	public void showType() {
		System.out.println("Type of T is "+e1.getClass().getName());
	}

	public static void main(String[] args) {
		
		String name = "Shuva Biswas";
		MyData<String> data = new MyData<String>(name);
		
		System.out.println(data.getE1());
		data.showType();

	}

}
