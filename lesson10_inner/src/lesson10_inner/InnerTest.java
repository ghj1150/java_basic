package lesson10_inner;

public class InnerTest {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		Outer.SInner sInner = new Outer.SInner();
	}
}

class Outer {
	int i;
	static int si;
	
	class Inner {
		int i2;
		static int si2;
		{
			System.out.println(i);
			System.out.println(si);
		}
	}
	static class SInner {
		int i3;
		static int si3;
		{
//			System.out.println(i);
			System.out.println(i3);
		}
	}
}
