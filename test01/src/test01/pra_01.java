package test01;

public class pra_01 {
	public static void main(String[] args) {
//		int sum = 0;
//		
//		for(int i = 1; i <= 100; i++) {
//			if(i%5 == 0) {
//				sum += i;
////				System.out.println(sum);
//			}
//		}
//		
//		System.out.println("5의 배수의 합계는 " + sum);

//		int evenSum = 0;
//		int oddSum = 0;
//
//		for (int i = 1; i <= 100; i++) {
//			if (i % 2 == 0) {
//				evenSum += i;
////				System.out.println("짝수의 값 " + evenSum);
//			} else {
//				oddSum += i;
////				System.out.println("홀수의 값" + oddSum);
//			}
//
//		}
//		System.out.println("짝수의 합계는 " + evenSum);
//		System.out.println("홀수의 합계는 " + oddSum);

//		for (int x = 1; x <= 6; x++) {
//			for (int y = 1; y <= 6; y++) {
//				if (x + y == 6) {
//					System.out.println("(" + x + "," + y + ")");
//				}
//			}
//		}

//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				if (i >= j)
//					System.out.print("*");
//					System.out.printf("(%d,%d)", i, j);
//			}
//			System.out.println();
//		}

//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				if (i + j <= 4)
//					System.out.print("*");
//			}
//			System.out.println();
//		}
//		for (int i = -2; i < 3; i++) {
//			for (int j = -2; j < 3; j++) {
//				if (i * j >= -1 && i * j <= 1) {
//					System.out.print("*");
//				} else {
//					System.out.print(' ');
//				}
//			}
//			System.out.println();
//		}

		boolean exit = false;
		int cnt = 0;
		while (!exit) {
			int val = (int) (Math.random() * 6 + 1);
			System.out.println("(" + val + ")");
			if (val == 6) {
				exit = true;
			}
		}
		System.out.println(cnt + "회");

	}
}
