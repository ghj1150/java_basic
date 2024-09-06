package student;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		// UI
		// Create Read Update Delete
		// 배열 길이 늘리기 + car 배열 활용
//		Scanner scanner = new Scanner(System.in);
//		StudentService ss = new StudentService();
		StudentUtils.nextInt("1. 조회 2. 등록 3. 수정 4. 삭제 5. 종료");
		while (true) {
			System.out.println("1. 조회 2. 등록 3. 수정 4. 삭제 5. 종료");
			int input = StudentUtils.nextInt("1. 조회 2. 등록 3. 수정 4. 삭제 5. 종료");
			switch (input) {
			case 1:
				ss.list();
				break;
			case 2:
				ss.add();
				break;
			case 3:
				ss.modify();
				break;
			case 4:
				ss.remove();
				break;
			case 5:
				System.out.println("bye");
				return;
			default:
				break;
			}
		}
	}
}
