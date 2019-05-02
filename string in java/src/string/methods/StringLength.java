package string.methods;

public class StringLength {
	public static String myFirstName="Shuva";
	public static String myLastName="Biswas";
	public static String myNickName="Ritu";
	
	public static void main(String[] args) {
		String name1 = StringLength.myFirstName.concat(" ");
		String name2 = name1.concat(StringLength.myLastName);
		String name3 = name2.concat(" ");
		String name4 = name3.concat(StringLength.myNickName);
		System.out.println(name4);
		
		String sub1 = name4.substring(6);
		System.out.println(sub1);
		String sub2 = sub1.substring(7, 11);
		System.out.println(sub2);
		
		int len1 = StringLength.myFirstName.length();
		int len2 = StringLength.myLastName.length();
		int len3 = StringLength.myNickName.length();
		System.out.println(len1);
		System.out.println(len2);
		System.out.println(len3);
		System.out.println(name4.length());
		
		char ch1 = StringLength.myFirstName.charAt(3);
		char ch2 = StringLength.myLastName.charAt(3);
		char ch3 = StringLength.myNickName.charAt(3);
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		
		String string = name4.toUpperCase();
		System.out.println(string);
		String string2 = string.toLowerCase();
		System.out.println(string2);
		
		
	}
	

}
