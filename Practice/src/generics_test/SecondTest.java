package generics_test;

public class SecondTest {
	
	public static void main(String[] args) {
		
		GenericsTest<Integer, String> var2 = new GenericsTest<>(101, "myName");
		
		System.out.println(var2.getObj1());
		System.out.println(var2.getObj2());
		
		var2.showType();
		
	}

}






class GenericsTest<X, Y> {
	private X obj1;
	private Y obj2;
	
	public GenericsTest(X obj1, Y obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	public X getObj1() {
		return obj1;
	}
	
	public Y getObj2() {
		return obj2;
	}
	
	public void showType() {
		System.out.println(this.obj1.getClass().getName() + "\t "+this.obj2.getClass().getName());
	}
}
