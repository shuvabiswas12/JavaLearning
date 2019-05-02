package firstProgram;

public class ArrayP {
	public static void main(String[] args) {
		int name[] = new int[10];
		name[0] = 10;
		name[1] = 20;
		name[2] = 30;
		
		for (int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}
	}

}
