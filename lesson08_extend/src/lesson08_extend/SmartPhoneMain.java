package lesson08_extend;

public class SmartPhoneMain {
	public static void main(String[] args) {
		Phone p = new Phone("전화기", "화이트", "현대");
		p.color = "빨강";
		System.out.println(p);
		p.call();
		p.receive();

		SmartPhone sp = new SmartPhone("갤럭시", "블랙", "삼성");
		System.out.println(sp);
		sp.call();
		sp.receive();
		sp.installApp();
	}
}
