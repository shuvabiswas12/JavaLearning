package string.methods;

public class StringLength2 {
	public static String name1 = "Shuva";
	public static String name2 = "Biswas";
	public static String name3 = "Bangladesh is My Country";
	public static String name4 = "shuva";
	public static String name5 = "Shuva";
	public static void main(String[] args) {
		System.out.println(StringLength2.name1.indexOf('u'));
		System.out.println(StringLength2.name2.indexOf('i', 2));
		System.out.println(StringLength2.name3.indexOf("is", 10));
		System.out.println(StringLength2.name3.indexOf("is"));
		
		if(StringLength2.name1 == StringLength2.name5)
			System.out.println("They are equals...");
		else
			System.out.println("Not Equals...");
		
		if(StringLength2.name1.equalsIgnoreCase(StringLength2.name4))
			System.out.println("Equals...");
		else
			System.out.println("Not Equals...");
		
		
	}

}
