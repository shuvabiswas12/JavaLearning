package program1;

public class Block {
	static int month;
	static String day;
	static int year;
	
	static {
		month = 10;
		day = "friday";
		year = 2017;
	}
	
	static {
		System.out.println("hello...");
	}
	
	static {
		System.out.println("Your date is : ");
		printfDate();
	}
	
	static void printfDate() {
		System.out.println(day+"/"+month+"/"+year);
	}

	public static void main(String[] args) {
		Block block = new Block();
	}

}
