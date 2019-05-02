package string_pool;

public class Test {

	public static void main(String[] args) {	
		String name = "Shuva";
		String name2 = name;
		String name3 = name;
		String name4 = "Ritu";
		
		name = name.concat(" Biswas");
		System.out.println(name);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(name4);

	}

}
