package lesson09_interface;

public class Complexer implements Printer, Scanner, Fax {

	@Override
	public void send(String msg) {
		System.out.println(FAX_NUMBER + "에서 " + msg + "로 FAX 송신");
	}

	@Override
	public void receive(String msg) {
		System.out.println(FAX_NUMBER + "로 " + msg + "에서 FAX 수신");
	}

	@Override
	public void scan() {
		System.out.println("스캔 실행");
	}

	@Override
	public void print() {
		System.out.println("프린트 실행");
	}
	

}
