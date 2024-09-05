package lesson07_oop;

public class MemberMain {
	Member member = new Member();
	int a = 10;
	public static void main(String[] args) {
		
		Member m = new Member(); // 어제
		m.age = 10;
		m.kor = 90;
		m.eng = 60;
		m.math = 80;
		System.out.println(m.total());
		
		Member m2 = new Member(); // 오늘
		m2.kor = 80;
		m2.eng = 90;
		m2.math = 100;
		System.out.println(m2.total());
		Member m3 = m;
		
//		클래스, 인터페이스, 배열 타입
//		객체(변수)
//		=
//		new Member() : 인스턴스

		if (m == m3) {
			System.out.println("m, m2는 같은 객체");
		} else {
			System.out.println("m, m2는 다른 객체");
		}
		
		MemberMain mm = new MemberMain();
		MemberMain mm2 = new MemberMain();
	}
}
