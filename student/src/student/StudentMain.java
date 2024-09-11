package student;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		// UI
		// Create Read Update Delete
		// 배열 길이 늘리기 + car 배열 활용
		StudentService ss = new StudentService();
		while (true) {
			try {
				int input = StudentUtils.nextInt("1. 조회 2. 등록 3. 수정 4. 삭제 5. 종료");
				switch (input) {
				case 1:
					ss.list();
					break;
				case 2:
//					try {
						ss.add();
						break;
//					if(num < 0 || num > 100)	{
//						throw new RangeException(0, 100);
//					}
//					} catch (Exception e) {
//						System.out.println("0이상 100이하의 값을 입력하세요");
//					}
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
			} catch (Exception e) {
				System.out.println("잘못입력하였습니다");
			}
		}
	}
}
