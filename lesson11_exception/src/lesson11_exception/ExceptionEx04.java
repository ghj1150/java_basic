package lesson11_exception;

public class ExceptionEx04 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			Integer.parseInt("a"); // NumberFormatException
			System.out.println(args[0]); // IndexOutOfBoundsException
			System.out.println(4 / 0); // ArithmeticException
		} catch (ArithmeticException e) {
			System.out.println(5);
		} catch (IndexOutOfBoundsException e) {
			System.out.println(6);
		} catch (Exception e) {
			System.out.println("최후의 처리");
//			e.printStackTrace();
			System.err.println(e.getClass().getName());
			System.err.println(e.getMessage());
			StackTraceElement[] elements = e.getStackTrace();
			for (StackTraceElement ste : elements) {
				System.out.println(ste.getMethodName());
			}
		}
		System.out.println(7);

	}
}
