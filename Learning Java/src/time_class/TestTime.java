package time_class;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;

public class TestTime {
	
	// time class

	public static void main(String[] args) {
		
		LocalTime time = LocalTime.now();
		System.out.println(time);

		// formatted time
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
		String formattedTime = time.format(formatter);
		System.out.println(formattedTime);
		
	}

}
