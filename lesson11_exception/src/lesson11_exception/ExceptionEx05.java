package lesson11_exception;

public class ExceptionEx05 {
	public static void main(String[] args) {
		System.out.println("main 전");
		m1();
		System.out.println("main 후");
	}

	static void m1() {
		System.out.println("m1() 전");
		try {
			m2();
		} catch (ArithmeticException e) {
			System.out.println("arithmetic 예외 처리");
		}
		System.out.println("m1() 후");
	}

	static void m2() {
		System.out.println("m2() 전");
		try {
			m3();
		} finally {
			System.out.println("m2() 후(finally)");
		}
		System.out.println("m2() 후");
	}

	static void m3() {
		// 로직 수행
//		System.out.println(3/0);
		ArithmeticException e = new ArithmeticException("0으로 정수를 나눔");
		try {
			throw e;
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
	}
}
