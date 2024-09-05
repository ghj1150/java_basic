package lesson_oop;

public class Member {
	int age;
	String addr;
	String name;
	String tel;
	
	int kor;
	int eng;	
	int math;	
	
	int total() {
		return kor + eng + math;
	}
}
