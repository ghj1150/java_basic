package lesson12_api;

public class WrapperEx {
	public static void main(String[] args) {
		Integer i1 = 10; // boxing
		Integer i2 = new Integer(20); // boxing
		Integer i3 = new Integer("30"); // boxing
		
		System.out.println(i1 + i2 + i3); // unboxing
		
		Integer i4 = 20;
		
		System.out.println(i2 == i4);
		System.out.println(i2.equals(i4));
		System.out.println(i2.intValue() == i4.intValue());

		Long l1 = 10L;
		System.out.println(l1);
		Long l2 = i1.longValue();
		System.out.println(l2);
		
		Character c1 = 65;
		System.out.println(c1);
		
		// 문자열 > wrapper 객체
		l2 = Long.valueOf("10");
		// wrapper > 문자열
		String str = l2.toString();
		
		// 기본형 > wrapper
		l2 = Long.valueOf(10L);
		// wrapper > 기본형
		long l3 = l2.longValue();
		
		// 기본형 > 문자열
		str = String.valueOf(l3);
		// 문자열 > 기본형
		l3 = Long.parseLong(str);
		
		double d = Double.parseDouble(str);
		
		System.out.println(Integer.parseInt("FF", 16));
		System.out.println(Integer.toBinaryString(255));
		System.out.println(Integer.toOctalString(255));
		System.out.println(Integer.toHexString(255));
		
		int i = 0xFF;
		char ch = 0xAC00;
		char ch2 = '\uAC00';
		System.out.println(ch2);
		
	}
}
