package lesson07_oop;

import java.util.Arrays;

public class Selection {
	public static void main(String[] args) {
		// 선택 정렬
		// 회차 반복문
		// 최소값 찾기 반복문 내부

		// -최소값이 존재하는 인덱스
		// -0번째 위치의 값이 위 인덱스에 있던 값과 교환
		int[] num = { 2, 3, 1, 8, 5 };
		int min = num[0];

		for (int i = 0; i < num.length - 1; i++) {
			for (int j = 0; j < num.length - 1 - i; j++) {
				if (min < num[j]) {
					min = num[j];
					int tmp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(num));
	}
}
