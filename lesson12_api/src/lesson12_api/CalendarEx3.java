package lesson12_api;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarEx3 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); // 2024 9 19
		cal.set(Calendar.DATE, 1);
		printCal(cal);
		while (true) {
			System.out.println("1. 이전달 2. 다음달 3. 이전해 4. 다음해 5. 달 지정(검색)");
			switch (scanner.nextInt()) {
			case 1:
				cal.add(Calendar.MONTH, -1);
				break;
			case 2:
				cal.add(Calendar.MONTH, 1);
				break;
			case 3:
				cal.add(Calendar.YEAR, -1);
				break;
			case 4:
				cal.add(Calendar.YEAR, 1);
				break;
			case 5:
				System.out.println("연도 입력 > ");
				cal.set(Calendar.YEAR, scanner.nextInt());
				System.out.println("월 입력 > ");
				cal.set(Calendar.MONTH, scanner.nextInt() - 1);
				break;
			default:
				break;
			}
			printCal(cal);
		}
	}

	static void printCal(Calendar cal) {
		System.out.println(cal.get(Calendar.YEAR) + "/" + (cal.get(Calendar.MONTH) + 1));
		int lastDate = cal.getActualMaximum(Calendar.DATE);
		int startDay = cal.get(Calendar.DAY_OF_WEEK);

		for (int i = 1 - startDay + 1; i <= lastDate; i++) {
			if (i > 0) {
				System.out.printf("%4d", i);
			} else {
				System.out.print("    ");
			}
			if (i % 7 == (7 - startDay + 1) % 7) {
				System.out.println();
			}
		}
		System.out.println();
	}
}
