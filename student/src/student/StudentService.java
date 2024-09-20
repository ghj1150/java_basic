package student;

import static student.StudentUtils.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Logic 기능수행
public class StudentService {
//	private Student[] students = new Student[5];
	private List<Student> students = new ArrayList<Student>();
//	private Student[] totalSortedStudents;
	private List<Student> totalSortedStudents;
//	private Student[] noSortedStudents;
	private List<Student> noSortedStudents;
//	private Student[] nameSortedStudents;
	private List<Student> nameSortedStudents;

//	private int cnt;

	{
		students.add(new Student(1, "새똥이", 80, 90, 100));
		students.add(new Student(2, "개똥이", 77, 66, 77));
		students.add(new Student(3, "새똥이", 80, 90, 100));
		students.add(new Student(4, "개똥이", 77, 66, 77));
//		students[cnt++] = new Student(1, "새똥이", 80, 90, 100);
//		students[cnt++] = new Student(2, "개똥이", 77, 66, 77);
//		students[cnt++] = new Student(3, "새똥이", 80, 90, 100);
//		students[cnt++] = new Student(4, "개똥이", 77, 66, 77);

//		totalSortedStudents = students.clone();
		cloneAndSort();

	}

	// 학생 등록
	public void add() {
//		int no = StudentUtils.nextInt("학번");
//		String name = StudentUtils.nextLine("이름");
//		int kor = StudentUtils.nextInt("국어 점수");
//		int eng = StudentUtils.nextInt("영어 점수");
//		int mat = StudentUtils.nextInt("수학 점수");
		int no = next("학번", Integer.class, null, "중복되지 않는 학번을 입력하세요");
//		if (findBy(no) != null) {
//			throw new RuntimeException("중복되지 않는 학번을 입력하세요");
//		}
		String name = checkName(next("이름", String.class, null, ""));
		int kor = next("국어", Integer.class, n -> n > 0 && n <= 100, "잘못입력");
		int eng = next("영어", Integer.class, n -> n > 0 && n <= 100, "잘못입력");
		int mat = next("수학", Integer.class, n -> n > 0 && n <= 100, "잘못입력");

//		if (cnt == students.length) {
//			students = Arrays.copyOf(students, students.length * 2);
//		}
		students.add(new Student(no, name, kor, eng, mat));

	}

	// 학생 목록 조회
	public void list() {
//		System.out.println("list()");
		int input = next("1. 입력순 2. 학번순 3. 이름순 4. 석차순", Integer.class, n -> n > 0 && n <= 4, "잘못입력");
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
//			System.out.println(students[i]);
			System.out.println(tmp.get(i));
		}
	}

	// 학생 이름, 점수 수정
	public void modify() {
		// 1. 학번 입력
		// 2. 학번을 통한 탐색(배열) >> 학생
		Student s = findBy(next("학번", Integer.class, null, ""));
		// 3. 이름, 국어, 영어, 수학 점수 변경
		if (s == null) {
			System.out.println("입력한 학번은 존재하지 않습니다.");
			return;
		}
		String name = next("이름", String.class, str -> str.matches("^[가-힣]{2,4}"), "정확한 이름의 조건을 입력하세요");
//			char[] chs = name.toCharArray();
////			String s = new String(chs);
//			if (chs.length < 2 || chs.length > 4) {
//				return false;
//			}
//			for (char c : chs) {
//				if (c < '가' || c > '힣') {
//					return false;
//				}
//			}
//			return true;
//		}, "정확한 이름의 조건을 입력하세요");
		int kor = next("국어", Integer.class, n -> n > 0 && n <= 100, "잘못입력");
		int eng = next("영어", Integer.class, n -> n > 0 && n <= 100, "잘못입력");
		int mat = next("수학", Integer.class, n -> n > 0 && n <= 100, "잘못입력");
		s.setName(name);
		s.setKor(kor);
		s.setEng(eng);
		s.setMat(mat);

	}

	// 학생 삭제
	public void remove() {
		Student s = findBy(nextInt("학번"));
		// 3. 이름, 국어, 영어, 수학 점수 변경
		if (s == null) {
			System.out.println("입력한 학번은 존재하지 않습니다.");
			return;
		}

		students.remove(s);

//		for (int i = 0; i < students.size(); i++) {
//			if (students.get(i) == s) {
//				// 삭제
//				System.arraycopy(students, i + 1, students, i, cnt-- - i - 1);
//				break;
//			}
//		}
	}

	private Student findBy(int no) {
		Student student = null;
//		int no = nextInt("학번");
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

	String checkName(String name) {
		char[] chs = name.toCharArray();
//		String s = new String(chs);
		if (chs.length < 2 || chs.length > 4) {
			throw new RuntimeException("이름은 2글자에서 4글자 사이로 입력하세요");
		}
		for (char c : chs) {
			if (c < '가' || c > '힣') {
				throw new RuntimeException("한글로 구성된 이름으로 작성하세요");
			}
		}
		return name;

	}

	/**
	 * 범위에 대한 탐색 start 이상, end 이하의 조건을 만족하지 않을 경우 예외 발생
	 * 
	 * @param num   검증 대상 숫자
	 * @param start 시작 값
	 * @param end   종료 값
	 * @return 원래의 값
	 */
//	int checkRange(int num, int start, int end) throws RangeException {
//		if (num < start || num > end) {
//			throw new RangeException(start, end);
//		}
//		return num;
//	}
//
//	int checkRange(int num) throws RangeException {
//		return checkRange(num, 0, 100);
//	}

	// 정렬
	public void cloneAndSort() {
		noSortedStudents = new ArrayList<Student>(students);
		nameSortedStudents = new ArrayList<Student>(students);
		totalSortedStudents = new ArrayList<Student>(students);

//		noSortedStudents.sort((o1, o2) -> o2.getNo() - o1.getNo());

		noSortedStudents.sort((o1, o2) -> o1.getNo() - o2.getNo());

		nameSortedStudents.sort((o1, o2) -> o1.getName().hashCode() - o2.getName().hashCode());
		totalSortedStudents.sort((o1, o2) -> o2.total() - o1.total());
//		sort(0, noSortedStudents);
//		sort(1, nameSortedStudents);
////		sort(2, totalSortedStudents);
	}

//	private void sort(int type, Student[] target) {
//		Student[] arr = target;
//		// 회차 반복
//		for (int i = 0; i < students.size() - 1; i++) {
//			// 비교 반복
//			for (int j = 0; j < students.size() - 1 - i; j++) {
//				// 값 비교 자리 교환
//				boolean condition = false;
//				switch (type) {
//				case 0:
//					condition = arr[j].getNo() > arr[j + 1].getNo();
//					break;
//				case 1:
//					condition = arr[j].getName().compareTo(arr[j + 1].getName()) > 0;
//					break;
//				case 2:
//					condition = arr[j].total() < arr[j + 1].total();
//					break;
//				default:
//					break;
//				}
//				if (condition) {
//					Student tmp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = tmp;
//				}
//			}
//
//		}
////		System.out.println(Arrays.toString(arr));
//	}
}
