package student;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class StudentMain {
	public static void main(String[] args) {
		// UI
		// Create Read Update Delete
		// 배열 길이 늘리기 + car 배열 활용
		StudentService ss = new StudentService();
		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(""));
		
		
		while (true) {
			try {
				int input = StudentUtils.next("1. 조회 2. 등록 3. 수정 4. 삭제 5. 종료", Integer.class, n -> n > 0 && n < 6,
						"1~5사이의 값을 입력하세요");
				switch (input) {
				case 1:
					ss.list();
					break;
				case 2:
					ss.add();
					ss.cloneAndSort();
					break;
				case 3:
					ss.modify();
					ss.cloneAndSort();
					break;
				case 4:
					ss.remove();
					ss.cloneAndSort();
					break;
				case 5:
					System.out.println("bye");
					return;
				default:
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("정확한 숫자를 입력하세요");
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
