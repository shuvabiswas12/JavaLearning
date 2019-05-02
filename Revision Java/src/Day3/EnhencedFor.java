package Day3;

public class EnhencedFor {

	public static void main(String[] args) {
		
		int[] a = {2,4,3,76};
		
		for (int i : a) {
			System.out.println(i);
		}
		
		
		String name[] = new String[5];
		name[0] = new String("Shuva");
		name[1] = new String("Biswas");
		name[2] = new String("Sangeeta");
		name[3] = new String("Nandi");
		name[4] = new String("ABCD");
		
		/*for (int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}*/
		
		for(String nString : name) {
			System.out.println(nString);
		}
		
		
		Name [] names = new Name[5];
		names[0] = new Name("Hello");
		names[1] = new Name("Me");
		names[2] = new Name("YOu");
		names[3] = new Name("Beautiful");
		names[4] = new Name("Amaizing");
		
		for(Name n : names) {
			n.print();
		}

	}

}

class Name {
	
	private String name;
	
	public Name(String name) {
		this.name =name;
	}
	
	public void print() {
		System.out.println(this.name);
	}
}
