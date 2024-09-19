package lesson13_collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SetEx4 {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>((o1, o2) -> o2 - o1);

		set.add(100);
		set.add(99);
		set.add(7);
		set.add(13);
		set.add(15);

		System.out.println(set);

		Set<String> set2 = new TreeSet<>();
		set2.add("홍길동");
		set2.add("고길동");
		set2.add("새똥이");
		set2.add("개똥이");
		System.out.println(set2);

		Set<Member> members = new TreeSet<>(new Comparator<Member>() {

			@Override
			public int compare(Member o1, Member o2) {
				return o1.age - o2.age;
			}
		});
		members.add(new Member("홍길동", 40));
		members.add(new Member("홍길동", 30));
		members.add(new Member("홍길동", 20));
		members.add(new Member("홍길동", 35));

		System.out.println(members);

		// TreeSet에 저장될 자료를 만족할 조건
		// 1. Comparable 인터페이스를 구현한 객체
		// 2. 혹은 Comparator를 별도로 지정

		members = new TreeSet<>((o1, o2) -> o1.name.compareTo(o2.name));
		members.add(new Member("홍길동", 40));
		members.add(new Member("고길동", 40));
		members.add(new Member("김길동", 40));
		members.add(new Member("이길동", 40));

		System.out.println(members);

		// why?
	}
}
