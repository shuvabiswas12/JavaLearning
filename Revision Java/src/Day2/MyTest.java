package Day2;

public class MyTest {

	public static void main(String[] args) {
		
		Poly m = new Poly(){};
		m.print();
	
		My my = new My() {};
		my.print();

		
		System.out.println(m == my);
		System.out.println(m.getClass().toString());
		System.out.println(my.getClass().toString());
	}

}


