package lesson06_array;

import java.util.Scanner;

public class Exer {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 1. 모두의 마블
		// 주사위 두개를 굴려서 이동한 거리를 계산
		// 더블일 경우 한번 더 굴린다(두 숫자가 다르면 끝). 총 이동 거리를 출력
//		int sum = 0;
//		for(;;) {
//			int a = (int) (Math.random() * 6) + 1;
//			int b = (int) (Math.random() * 6) + 1;
//
//			sum += a + b;
//			System.out.println(a);
//			System.out.println(b);
//			if(a != b) {
//				break;
//			}
//		}
//		System.out.println(sum);

//		 2. 두 수를 입력받아(정수) 두 숫자 사이의 정수의 합
//		 ex) 3, 5 : 3 + 4 + 5 // 10, 3
//		int sum = 0;
//		System.out.println("숫자를 입력하세요:");
//		int a = scanner.nextInt();
//		int b = scanner.nextInt();
////		int a = 5;
////		int b = 3;
//
//		if (a > b) {
//			int tmp = a;
//			a = b;
//			b = tmp;
//		}
//		for (int i = a; i <= b; i++) {
//			sum += i;
//		}
//		System.out.println("두 숫자 사이의 정수의 합 " + sum);

		// 3. 자연수 두개 입력, 두수의 최대 공약수 구하기
		// 12 18 >> 6
		// 12 : 1,2,3,4,6,12
		// 18 : 1,2,3,6,9,18
		// 두 수의 공약수 1,2,3,6
//		int a, b = 0;
//		int result = 0;
//		System.out.println("숫자를 입력하세요");
//		a = scanner.nextInt();
//		b = scanner.nextInt();

//		for (int i = 1; i <= a; i++) {
//			for (int j = 1; j <= b; j++) {
//				if (a % i == 0 && b % j == 0 && i == j) {
////					System.out.println(j);
//					result = i;
//				}
//			}
//		}

//		boolean flag = true;
//		while (flag) {
//			int tmp = a % b;
////			System.out.printf("%d %d %d\n", a, b, tmp);
//			a = b;
//			b = tmp;
//			if (tmp == 0) {
//				flag = false;
//				System.out.println(a);
//			}
//		}
////		System.out.println(result);

//		System.out.println("=============");
//		outer: 
//			for (int i = a; i <= a * b; i += a) {
//				for (int j = b; j <= a * b; j += b) {
//					if (i == j) {
//						System.out.println(j);
//						break outer;
//				}
//			}
//		}
//		System.out.println("=============");

		// 4. 소수 여부 확인
		// 소수의 조건 : 약수가 1과 자신만 존재 //2,3,5,7,11,13,17,19 //4,6,8,9,10,12,14,15,16,18 X
		// 2%1 = 0 2%2 = 0 3%1 = 0 3%2 = 1 3%3 = 0 4%1 = 0 4
		// ex ) 10 소수가 아닙니다.

		boolean flag = true;
		int num = 0;
		int count = 0;
		System.out.println("숫자를 입력하세요:");
		num = scanner.nextInt();

//		for (int i = 1; i <= num; i++) {
//			System.out.printf("%d : %d\n", i, num % i);
//			if (num % i == 0) {
//				count++;
//			}
//		}
//		if (count == 2) {
//			System.out.println("소수입니다");
//		} else {
//			System.out.println("소수가 아닙니다");
//		}
//		flag = true;
//		for (int i = 2; i < num; i++) {
//			if (num % i == 0) {
//				flag = false;
//				break;
//			}
//		}
//		System.out.println(num + "은 " + (flag ? "소수" : "소수아님"));

		// 5. 회문수 여부 구하기
		// 123321 : 회문수, 12345 : 회문수 아님
		System.out.println("====================");
		int result = 0;
		int tmp = num;

		while (tmp != 0) {
// 			 System.out.println(tmp);
//			 System.out.println(tmp % 10);
//			result += tmp % 10;
			result = result * 10 + tmp % 10;
			tmp /= 10;
		}
		System.out.println(result == num ? "회문수" : "아님");

		System.out.println(num == result);
	}
}
