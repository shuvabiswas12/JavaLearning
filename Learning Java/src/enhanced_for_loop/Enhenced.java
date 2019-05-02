package enhanced_for_loop;

public class Enhenced {

	public static void main(String[] args) {
 
		/*int[] ar = {3,6,2,8,9};
		
		for(int i : ar) {
			System.out.println(i);
		}*/
		
		
		/*String name[] = new String[5];
		name[0] = new String("Shuva");
		name[1] = new String("Biswas");
		name[2] = new String("Sangeeta");
		name[3] = new String("Ananya");
		name[4] = new String("Shuveccha");
		
		for(String i : name) {
			System.out.println(i);
		}*/
		
		
		/*Name[] name = new Name[5];
		
		name[0] = new Name("Shuva");
		name[1] = new Name("Biswas");
		name[2] = new Name("Sangeeta");
		name[3] = new Name("Ananya");
		name[4] = new Name("Shuveccha");
		
		for(Name i : name) {
			i.print();
		}
		*/
		
		Name[] names = {new Name("Shuva"), new Name("Biswas"), new Name("Sangeeta"), new Name("Ananya"), new Name("Shuveccha")};
		
		for(Name i : names) {
			i.print();
		}

	}

}


class Name {
	String name;
	
	Name(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println(this.name);
	}
}
