package test2;

public class Casting {
	public static void main(String[] args) {

		double a = 1.1;
		double b = 1;
		double b2 = (double) 1;

		System.out.println(b);
		System.out.println(b2);

		int c = (int) 1.1;
		System.out.println(c);
		
		String f = Integer.toString(1);
		System.out.println(f);
	}
}
