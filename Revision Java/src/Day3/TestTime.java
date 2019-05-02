package Day3;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TestTime {

	public static void main(String[] args) {
		/*
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
		String tformatter = time.format(formatter);
		System.out.println(tformatter);*/
		
		
//		LocalTime time = LocalTime.now();
//		System.out.println(time);
//		
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
//		String tformat = time.format(formatter);
//		System.out.println(tformat);
		
		LocalDate localDate = LocalDate.now();//For reference
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("LL dd yyyy");
		String formattedString = String.valueOf(localDate.format(formatter));
		System.out.println(formattedString);

	}

}
