package student;

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
		int no = StudentUtils.nextInt("학번");
	}

	// 학생 목록 조회
	void list() {
//		System.out.println("list()");
		System.out.println("학번   이름   국어   영어   수학   총점   평균");
		System.out.println("==============================================");
		for(int i = 0; i<cnt; i++) {
			System.out.printf("%4d %4s %6d %6d %6d %6d %5.2f\n",
					students[i].no,
					students[i].name,
					students[i].kor,
					students[i].eng,
					students[i].mat,
					students[i].total(),
					students[i].avg()
				);
		}
	}

	// 학생 이름, 점수 수정
	void modify() {
		System.out.println("modify()");
	}

	// 학생 삭제
	void remove() {
		System.out.println("remove()");
	}
}
