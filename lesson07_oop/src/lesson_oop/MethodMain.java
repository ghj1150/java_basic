package lesson_oop;

public class MethodMain {
	public static void main(String[] args) {
		Param p = new Param();
		int result = p.add(10, 20);
		System.out.println(result);
		System.out.println(p.add(30, 40));
		System.out.println(new Param().add(40, 50));
	}
}

class Param {
	int add(int a, int b) {
		return a + b;
	}

	static int add2(int a, int b) {
		return a + b;
	}
}
