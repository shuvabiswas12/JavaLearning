package Day5;

public class StringOrNot {

	public static void main(String[] args) {
		
		String text = "shuva";
		int value = -1;
		
		try {
			value = Integer.parseInt(text);
			System.out.println(value);
		} catch (Exception e) {
			System.out.println("It can not convert to string");
		}
		System.out.println(value);
	}

}
