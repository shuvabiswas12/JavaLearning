package enumeration_test_1;

public class EnumTest {
	
	private Day day;
	
	public EnumTest(Day day) {
		this.day = day;
	}

	public void displayDate() {
		if (this.day == Day.SATURDAY) {
			System.out.println("This is Saturday");
		}
		else if (this.day == Day.SUNDAY) {
			System.out.println("This is Sunday");
		}
		else if (this.day == Day.MONDAY) {
			System.out.println("This is Monday");
		}
		else if (this.day == Day.FRIDAY) {
			System.out.println("This is Friday");
		}
		else if (this.day == Day.WEDNESDAY) {
			System.out.println("This is Wednesday");
		}
		else if (this.day == Day.THURSDAY) {
			System.out.println("This is Thursday");
		}
		else {
			System.out.println("This is Thusday");
		}
	}
	
	
	public static void main(String[] args) {
		
		EnumTest enumTest = new EnumTest(Day.SATURDAY);
		enumTest.displayDate();
		
		EnumTest enumTest2 = new EnumTest(Day.FRIDAY);
		enumTest2.displayDate();
		
		EnumTest enumTest3 = new EnumTest(Day.MONDAY);
		enumTest3.displayDate();
		

	}

}


