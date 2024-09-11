package lesson11_exception;

import java.io.IOException;
import java.net.MalformedURLException;

public class ExceptionEx07 {
	public static void main(String[] args) throws Exception {
		// checked exception : 일반 예외

		// unchecked exception : 런타임 예외

		try {
			m1();
		} catch (Exception e) {
			System.out.println("추가 작업");
			throw e;
		}
		System.out.println("ㄱㄴ");
	}

	static void m1() throws Exception {
		Exception ex = new Exception();
		throw ex;
	}
}

class A {
	void m() throws IOException {

	}
}

class B extends A {

	@Override
	void m() throws MalformedURLException {
	}

}
