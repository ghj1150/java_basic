package lesson12_api;

import java.util.Arrays;

public class StringEx {
	public static void main(String[] args) {
		String str = "abcdeabcded";
		System.out.println(str.charAt(3));
//		System.out.println(str.charAt(100));
//		System.out.println(str.charAt(-3));
		
		System.out.println(str.equals(new String("abcdeabcded")));;
		
		System.out.println(str.indexOf("b"));
		System.out.println(str.indexOf("b", 3));
		System.out.println(str.lastIndexOf("b", 3));
		System.out.println(str.lastIndexOf("b"));
		
//		substring
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 7));
		
//		첫번째 만나는 "c"문자열에서 마지막 만나는 "d"문자열까지 문자열 자르기
		System.out.println(str.substring(str.indexOf("c"), str.lastIndexOf("d")));
		
		System.out.println(str.toUpperCase().toLowerCase());
		
		String s = "   [ 안녕하세요 ]    ";
		System.out.println(s.trim().replaceAll(" ", ""));
		
		System.out.println(str.endsWith("ed"));
		System.out.println(str.endsWith("cd"));
		System.out.println(str.indexOf("cd"));
		
		System.out.println(str.replaceFirst("a", "f"));
		
		System.out.println(Arrays.toString(str.split("")));
		System.out.println(Arrays.toString(str.split("b")));
		
		System.out.println("abc".compareTo("abc"));
		System.out.println("abc".compareTo("ace"));
		System.out.println("abc".compareTo("aae"));
		
//		
		
	}
}
