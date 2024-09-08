package student;

import java.util.Arrays;

// Logic 기능수행
public class StudentService {
	Student[] students = new Student[5];
	int cnt;

	{
//		students[cnt++] = new Student(1, "새똥이", 80, 90, 100);
//		students[cnt++] = new Student(2, "개똥이", 77, 66, 77);

	}

	// 학생 등록
	void add() {
		int no = StudentUtils.nextInt("학번");
		String name = StudentUtils.nextLine("이름");
		int kor = StudentUtils.nextInt("국어 점수");
		int eng = StudentUtils.nextInt("영어 점수");
		int mat = StudentUtils.nextInt("수학 점수");

		students[cnt++] = new Student(no, name, kor, eng, mat);

		if (students.length == cnt) {
			students = Arrays.copyOf(students, students.length * 2);
		}

	}

	// 학생 목록 조회
	void list() {
//		System.out.println("list()");
		System.out.println("학번   이름   국어   영어   수학   총점   평균");
		System.out.println("==============================================");
		for (int i = 0; i < cnt; i++) {
			System.out.printf("%4d %4s %6d %6d %6d %6d %5.2f\n", students[i].no, students[i].name, students[i].kor,
					students[i].eng, students[i].mat, students[i].total(), students[i].avg());
		}
	}

	// 학생 이름, 점수 수정
	void modify() {
//		System.out.println("수정하기");
		int no = StudentUtils.nextInt("수정할 학번");
		String name = StudentUtils.nextLine("이름");
		int kor = StudentUtils.nextInt("국어");
		int eng = StudentUtils.nextInt("영어");
		int mat = StudentUtils.nextInt("수학");
		
		for(int i = 0; i< students.length; i++) {
			students[i] = 
		}
		
		

	}

	// 학생 삭제
	void remove() {
//		System.out.println("삭제하기");
		int no = StudentUtils.nextInt("삭제할 학번");
//		if() {
//			cnt--;
//		}
		
	}
}
