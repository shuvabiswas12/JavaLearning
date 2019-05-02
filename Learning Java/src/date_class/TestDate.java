package date_class;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
	
	// date class

	public static void main(String[] args) {
		
		// date class show all the information
		Date date = new Date();
		System.out.println(date);
		
		
		// if i want to format a date then follow bellow this
		DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
		String newDate = dateFormat.format(date);
		System.out.println("Date is = "+newDate);

	}

}
