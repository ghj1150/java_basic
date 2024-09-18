package lesson12_api;

import java.util.Calendar;

public class CalendarEx3 {
	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, 1);

//		int startDay = cal.get(Calendar.DAY_OF_WEEK);
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

		for (int i = 1; i <= lastDay; i++) {
			if (i > 0) {
				System.out.printf("%4d", i);
			}
			if (i % 7 == 0) {
				System.out.println();
			}
		}
	}
}
