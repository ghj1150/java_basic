package student;

import static student.StudentUtils.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

// Logic 기능수행
@SuppressWarnings("unchecked")
public class StudentService {
	private List<Student> students = new ArrayList<Student>();
	private List<Student> totalSortedStudents;
	private List<Student> noSortedStudents;
	private List<Student> nameSortedStudents;

	{

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.ser"))) {
			students = (List<Student>) ois.readObject();
		} catch (FileNotFoundException e) {
			students.add(new Student(1, "새똥이", 80, 90, 100));
			students.add(new Student(2, "개똥이", 77, 66, 77));
			students.add(new Student(3, "새똥이", 80, 90, 100));
			students.add(new Student(4, "개똥이", 77, 66, 77));
			System.out.println("파일 검색 실패, 초기화 더미 데이터 처리 완료");
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();

		}

		cloneAndSort();

	}

	// 학생 등록
	public void add() {

		int no = next("학번", Integer.class, n -> findBy(n) == null, "중복되지 않는 학번을 입력하세요");
		String name = next("이름", String.class, str -> str.matches("^[가-힣]{2,4}"), "올바른 이름을 입력하세요(한글, 2~4글자)");
		int kor = next("국어", Integer.class, i -> i >= 0 && i <= 100, "0이상 100이하의 값을 입력하세요");
		int eng = next("영어", Integer.class, i -> i >= 0 && i <= 100, "0이상 100이하의 값을 입력하세요");
		int mat = next("수학", Integer.class, i -> i >= 0 && i <= 100, "0이상 100이하의 값을 입력하세요");

		students.add(new Student(no, name, kor, eng, mat));

	}

	// 학생 목록 조회
	public void list() {

		int input = next("1. 입력순 2. 학번순 3. 이름순 4. 석차순", Integer.class, n -> n > 0 && n <= 4, "1이상 4이하의 값을 입력하세요");
		List<Student> tmp = null;
		switch (input) {
		case 1:
			tmp = students;
			break;
		case 2:
			tmp = noSortedStudents;
			break;
		case 3:
			tmp = nameSortedStudents;
			break;
		case 4:
			tmp = totalSortedStudents;
			break;
		default:
			break;
		}
		System.out.println("학번   이름   국어   영어   수학   총점   평균");
		System.out.println("==============================================");
		for (int i = 0; i < tmp.size(); i++) {
			System.out.println(tmp.get(i));
		}
	}

	// 학생 이름, 점수 수정
	public void modify() {
		// 1. 학번 입력
		// 2. 학번을 통한 탐색(배열) >> 학생

		Student s = findBy(next("학번", Integer.class, n -> findBy(n) != null, "입력한 학번은 존재하지 않습니다."));

		String name = next("이름", String.class, str -> str.matches("^[가-힣]{2,4}"), "정확한 이름의 조건을 입력하세요");

		int kor = next("국어", Integer.class, i -> i >= 0 && i <= 100, "0이상 100이하의 값을 입력하세요");
		int eng = next("영어", Integer.class, i -> i >= 0 && i <= 100, "0이상 100이하의 값을 입력하세요");
		int mat = next("수학", Integer.class, i -> i >= 0 && i <= 100, "0이상 100이하의 값을 입력하세요");
		s.setName(name);
		s.setKor(kor);
		s.setEng(eng);
		s.setMat(mat);

	}

	// 학생 삭제
	public void remove() {

		Student s = findBy(next("학번", Integer.class, n -> findBy(n) != null, "입력한 학번은 존재하지 않습니다."));

		students.remove(s);

	}

	private Student findBy(int no) {
		Student student = null;
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getNo() == no) {
				student = students.get(i);
			}
		}
		return student;
	}

	/**
	 * 학생이름 유효성 검증, 이름은 반드시 한글, 최소 2 최대 4글자의 한글
	 * 
	 * @param name 학생의 이름
	 */

	/**
	 * 범위에 대한 탐색 start 이상, end 이하의 조건을 만족하지 않을 경우 예외 발생
	 * 
	 * @param num   검증 대상 숫자
	 * @param start 시작 값
	 * @param end   종료 값
	 * @return 원래의 값
	 */

	// 정렬
	public void cloneAndSort() {
		noSortedStudents = new ArrayList<Student>(students);
		nameSortedStudents = new ArrayList<Student>(students);
		totalSortedStudents = new ArrayList<Student>(students);

		noSortedStudents.sort((o1, o2) -> o1.getNo() - o2.getNo());

		nameSortedStudents.sort((o1, o2) -> o1.getName().hashCode() - o2.getName().hashCode());
		totalSortedStudents.sort((o1, o2) -> o2.total() - o1.total());

		// 저장 호출
		save();

	}

	public void save() {
		try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("data.ser"))) {
			stream.writeObject(students);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
