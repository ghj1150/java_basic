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

		for (int i = 0; i < num.length; i++) {
			int idx = i;
			for (int j = i; j < num.length; j++) {
				if (num[idx] > num[j]) {
					idx = j;
				}
			}
			int tmp = num[idx];
			num[idx] = num[i];
			num[i] = tmp;
			System.out.println(Arrays.toString(num));
		}
	}}
