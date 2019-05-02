package firstProgram;

public class TwoParatemeter<T, T1> {
	
	private T t1;
	private T1 t11;
	
	public TwoParatemeter(T t1, T1 t11) {
		this.t1 = t1;
		this.t11 = t11;
	}
	
	public T getT1() {
		return t1;
	}
	
	public T1 getT11() {
		return t11;
	}
	
	public void showType() {
		System.out.println("Type of T : "+t1.getClass().getName());
		
		System.out.println("Type of T : "+t11.getClass().getName());
	}

	public static void main(String[] args) {
		
		TwoParatemeter<Integer, String> paratemeter = new TwoParatemeter<Integer, String>(101, "Shuva");
		
		System.out.println(paratemeter.getT1());
		System.out.println(paratemeter.getT11());
		
		paratemeter.showType();
		
		TwoParatemeter<Integer, TwoParatemeter<Integer, String>> paratemeter2 = 
				new TwoParatemeter<Integer, TwoParatemeter<Integer, String>>(101, new TwoParatemeter<>(102, "Shuva"));
		
		System.out.println(paratemeter2.getT1());
		System.out.println(paratemeter2.getT11());
		
		paratemeter2.showType();
		

	}

}
