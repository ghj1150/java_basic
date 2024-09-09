package day2;

public class ToString {
	public String toString() {
		return "재정의된 내용";
	}

	public void print() {
		System.out.println(super.toString());
		System.out.println(this.toString());
	}

	public static void main(String[] args) {
		// toString() : 객체의 내용을 문자열로 확인할 때 자동 호출되는 메서드
		Object object = new Object();
		System.out.println(object);
		System.out.println(object.toString());

		ToString ts = new ToString();
		System.out.println(ts);
		System.out.println(ts.toString());
		ts.print();
	}
}
