package day2;

public class Init {
	private static Init init = new Init();
	public Init() {
		System.out.println("초기화");
	}

	public static void main(String[] args) {

	}

	static int fact(int i) {
		if (i == 1) {
			return 1;
		}

		return fact(i - 1) * i;
	}
}
