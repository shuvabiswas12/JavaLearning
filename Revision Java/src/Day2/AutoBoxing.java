package Day2;

public class AutoBoxing {

	public static void main(String[] args) {
		
		
		// auto boxing
		int num1 = 10;
		Integer number = num1;
		System.out.println(number);
		
		int num2 = 30;
		Integer number2 = Integer.valueOf(num2);
		System.out.println(number2);
		
		
		// un boxing
		Integer number3 = new Integer(20);
		int num3 = number3.intValue();
		System.out.println(num3);
		
		Integer number4 = new Integer(50);
		int num4 = number4;
		System.out.println(num4);
		
		// String -> primitive type
		String num = "30";
		int numNew = Integer.parseInt(num);
		System.out.println(numNew);
		
		// primitive type -> string
		int numnum = 60;
		String numNum = Integer.toString(numnum);
		System.out.println(numNum);
	}

}



