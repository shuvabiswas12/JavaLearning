package firstProgram;

public class StringPratice {
	public static void main(String[] args) {
		String string = "      Bangladesh     ";
		String string2 = "shuva biswas";
		
		System.out.println(string.trim());
		
		System.out.println(string2.charAt(3));
		
		System.out.println(string2.indexOf('a'));
		
		System.out.println(string2.lastIndexOf("s"));
		
		System.out.println(string2.lastIndexOf('s', 10));
		
		System.out.println(string2.codePointAt(11));
		
		System.out.println(string2.replace('s', 'r'));
		
		String[] strings = string2.split(" ");
		
		for (String string3 : strings) {
			System.out.println(string3);
		}
	}

}
