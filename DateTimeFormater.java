package praticando;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTimeFormater {
	public static void main(String[] args) {
		//docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html

		LocalDate d01 = LocalDate.parse("2022-11-25");
		LocalDateTime d02 = LocalDateTime.parse("2022-07-25T01:45:23");
		Instant d03 = Instant.parse("2022-11-25T02:35:15Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		System.out.println("d01 -> " + d01.format(fmt1));
		System.out.println("d01 -> " + fmt1.format(d01));
		System.out.println("d01 -> " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("d02 -> " + d02.format(fmt1));
		System.out.println("d02 -> " + d02.format(fmt2));
		
		System.out.println("d03 -> " + fmt3.format(d03));
		
		
		
	}
}
