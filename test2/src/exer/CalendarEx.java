package exer;

import java.time.LocalDate;

public class CalendarEx {
	public static void main(String[] args) {

		LocalDate ld = LocalDate.now();
		ld = ld.plusDays(-ld.getDayOfMonth() + 1);
		int startDay = ld.getDayOfWeek().getValue();
		int lastDay = ld.lengthOfMonth();

		System.out.printf("%3s %2s %2s %2s %2s %2s %2s", "일", "월", "화", "수", "목", "금", "토");

		for (int i = 1 - startDay; i <= lastDay; i++) {
			if (i > 0) {
				System.out.printf("%4d", i);
			} else {
				System.out.printf("%4c", ' ');
			}
			if (i % 7 == 7 - startDay) {
				System.out.println();
			}
		}
	}
}
