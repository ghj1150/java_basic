package lesson05_control;

import java.util.Scanner;

public class WhileEx2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int sum = 0; // 초기화
		boolean flag = true; // 반복여부
		while (flag) {
			System.out.println("더할 숫자를 입력하세요 > ");
			String input = scanner.nextLine();
			int num = Integer.parseInt(input);
			sum += num;
			if (num == 0) {
				flag = false;
				//break;
			}
		}
		System.out.println("합계 : " + sum);
		scanner.close();

	}
}
