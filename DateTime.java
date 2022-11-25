package praticando;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTime {
	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2022-11-25");
		LocalDateTime d05 = LocalDateTime.parse("2022-11-25T11:23:55");
		Instant d06 = Instant.parse("2022-11-25T11:23:55Z");
		Instant d07 = Instant.parse("2022-11-25T11:23:55-03:00");
		
		LocalDate d08 = LocalDate.parse("25/11/2022", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("25/11/2022 18:15", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		
		LocalDate d10 = LocalDate.of(2022, 7, 25);
		LocalDateTime d11 = LocalDateTime.of(2022, 11, 25, 17, 34);
		System.out.println(d01);
		System.out.println(d02);
		System.out.println(d03);
		System.out.println(d04);
		System.out.println(d05);
		System.out.println(d06);
		System.out.println(d07);
		System.out.println(d08);
		System.out.println(d09);
		System.out.println(d10);
		System.out.println(d11);
		sc.close();
		
	}
}
