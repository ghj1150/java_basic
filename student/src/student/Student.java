package student;
 
import java.io.Serializable;

// 학생 예제 > java beans 명세서에 맞게끔 수정
// field 는 private, method는 public
// getter, setter
// 이름은 반드시 한글
// 이름 최소 2 최대 4글자의 한글
// 점수의 범위 0~100
// 학번 중복 불허
// 중간에 오류상황 발생 시 정지 되지 않게 하기

@SuppressWarnings("serial")
public class Student implements Cloneable, Serializable {
	/**
	 * 
	 */
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int[] arr;

	public Student() {

	}

	public Student(int no, String name, int kor, int eng, int mat) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public Student(Student s) {
		setNo(s.getNo());
		name = s.name;
		kor = s.kor;
		eng = s.eng;
		mat = s.mat;
		if (s.arr != null)
			arr = s.arr.clone();
	}

	// no getter
	public int getNo() {
		return no;
	}

	// no setter
	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public String toString() {
		return String.format("%4d %4s %6d %7d %7d %7d %7.2f", no, name, kor, eng, mat, total(), avg());
	}

	public int total() {
		return kor + eng + mat;
	}

	public double avg() {
		return total() / 3d;
	}

	// 클론 연습용

	@Override
	public Student clone() {
		Student obj = null;
		try {
			obj = (Student) super.clone();
			if (arr != null)
				obj.arr = arr.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}

	// 이퀄스 연습용

	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof Student)) return false;
		Student s= (Student)obj;
		return no == s.no && name.equals(s.name);
	}
}
