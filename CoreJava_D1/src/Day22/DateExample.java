package Day22;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateExample {

	public static void main(String[] args) {
		 LocalDate localDate = LocalDate.now();
		 System.out.println(localDate);
		 
		 LocalTime localTime = LocalTime.now();
		 System.out.println(localTime);
		 
		 LocalDateTime localDateTime = LocalDateTime.now();
		 System.out.println(localDateTime);

	}

}
