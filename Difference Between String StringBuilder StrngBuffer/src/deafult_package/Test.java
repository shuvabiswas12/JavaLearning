package deafult_package;

public class Test {

	public static void main(String[] args) {
		
		String name = "Shuva";
		name.concat(" Biswas");
		//String name2 = name.concat(" Biswas");
		
		StringBuilder builder = new StringBuilder("Shuva");
		builder.append(" Biswas");
		
		System.out.println(name);
		System.out.println(builder);
		
		StringBuffer buffer = new StringBuffer("Shuva Biswas");
		buffer.append(" Ritu");
		
		System.out.println(buffer);
		
		long start = System.currentTimeMillis();
		for (int i=0; i<10000; i++) {
			name.concat("Name");
		}
		
		System.out.println("string Time = " +(System.currentTimeMillis() - start) + " ms");

		
		
		long start2 = System.currentTimeMillis();
		for (int i=0; i<10000; i++) {
			builder.append(" name");
		}
		System.out.println("builer Time = " + (System.currentTimeMillis() - start2) + " ms");
		
		
		long start3 = System.currentTimeMillis();
		for (int i=0; i<10000; i++) {
			buffer.append(" Name");
		}
		System.out.println("buffer Time = " + (System.currentTimeMillis() - start3) + " ms");
		
	}
}
