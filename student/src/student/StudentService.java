package student;

import static student.StudentUtils.*;

import java.util.Arrays;

// Logic 기능수행
public class StudentService {
	Student[] students = new Student[5];
	int cnt;

	{
		students[cnt++] = new Student(1, "새똥이", 80, 90, 100);
		students[cnt++] = new Student(2, "개똥이", 77, 66, 77);

	}

	// 학생 등록
	void add() {
//		int no = StudentUtils.nextInt("학번");
//		String name = StudentUtils.nextLine("이름");
//		int kor = StudentUtils.nextInt("국어 점수");
//		int eng = StudentUtils.nextInt("영어 점수");
//		int mat = StudentUtils.nextInt("수학 점수");
		int no = nextInt("학번");
		String name = nextLine("이름");
		int kor = nextInt("국어");
		int eng = nextInt("영어");
		int mat = nextInt("수학");

		if (cnt == students.length) {
			students = Arrays.copyOf(students, students.length * 2);
		}
		students[cnt++] = new Student(no, name, kor, eng, mat);

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
		// 1. 학번 입력
		// 2. 학번을 통한 탐색(배열) >> 학생
		Student s = findByNo();
		// 3. 이름, 국어, 영어, 수학 점수 변경
		if (s == null) {
			System.out.println("입력한 학번은 존재하지 않습니다.");
			return;
		}
		s.name = nextLine("이름");
		s.kor = nextInt("국어");
		s.eng = nextInt("영어");
		s.mat = nextInt("수학");

	}

	// 학생 삭제
	void remove() {
		Student s = findByNo();
		// 3. 이름, 국어, 영어, 수학 점수 변경
		if (s == null) {
			System.out.println("입력한 학번은 존재하지 않습니다.");
			return;
		}

		for (int i = 0; i < cnt; i++) {
			if (students[i] == s) {
				// 삭제
				System.arraycopy(students, i + 1, students, i, cnt-- - i - 1);
				break;
			}
		}
	}

	Student findByNo() {
		Student student = null;
		int no = nextInt("학번");
		for (int i = 0; i < cnt; i++) {
			if (students[i].no == no) {
				student = students[i];
			}
		}
		return student;
	}
}