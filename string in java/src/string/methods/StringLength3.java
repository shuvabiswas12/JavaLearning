package string.methods;

public class StringLength3 {
	public static String name1 = "Shuva Biswas";
	public static String name2 = "             My country is Bangladesh. It is Chittagong";
	public static void main(String[] args) {
		System.out.println(StringLength3.name1.contains("was"));
		System.out.println(StringLength3.name2.startsWith("My"));
		System.out.println(StringLength3.name1.startsWith("It"));
		System.out.println(StringLength3.name2.trim());
		System.out.println(StringLength3.name2.replace('M', 'W'));
		String name5 = StringLength3.name2.replace(name1, name2);
		System.out.println(name5);
		System.out.println(StringLength3.name2.replace("My", "Shuva"));
	}
}
