package enum_practice;

public class TestProjectEnum {
	
	public static void main(String[] args) {
		
		for (Day day : Day.values()) {
			System.out.println(day + " "+day.day + " " +day.month + " "+ day.dispAll() + " " +day.number);
		}
		
	}

}
