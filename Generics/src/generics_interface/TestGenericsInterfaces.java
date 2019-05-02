package generics_interface;

public class TestGenericsInterfaces  {
	
	public static void main (String[] args) {
		
		/*
		 *
				TestInterfaces interfaces = new TestInterfaces();
				int value = interfaces.compareString("Shuva", "Biswas");
				
				System.out.println("Value = " + Math.abs(value));
		
		*
		*/
		
		
		GenericsInterfaces<String> interfaces = new TestInterfaces();
		int value = (Math.abs(interfaces.compareString("Shuva", "Sangeeta")));

		System.out.println(value);
		
		
		
	
		
	}

}


class TestInterfaces implements GenericsInterfaces<String> {

	@Override
	public int compareString(String name1, String name2) {
		
		return name1.length() - name2.length();
	}
	
}