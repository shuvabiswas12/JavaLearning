package generics_test;

public class Test<T> { // here T means type
	
	private T obj;
	
	public Test(T obj) {
		this.obj = obj;
	}
	
	public void showType() {
		System.out.println(obj.getClass().getName());
	}
	
	public T getObj() {
		return obj;
	}
	
	
	public static void main(String[] args) {
		Test<Integer> var = new Test<>(88);
		System.out.println(var.getObj());
		
		var.showType();
	}

}
