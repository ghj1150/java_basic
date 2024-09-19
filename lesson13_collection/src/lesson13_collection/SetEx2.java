package lesson13_collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetEx2 {
	public static void main(String[] args) {
		Set<Object> set = new HashSet<>();
		set.add("가");
		set.add("가");
		Member member = new Member("홍길동", 40);
		set.add(member);
		set.add(new Member("홍길동", 40));
		System.out.println(set);
		System.out.println(new String("홍길동").hashCode());

	}
}

class Member implements Comparable<Member> {
	String name;
	int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age);
//		return name.hashCode() + age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Member)) {
			return false;
		}
		Member member = (Member) obj;
		return name.equals(member.name) && age == member.age;
	}

	@Override
	public int compareTo(Member o) {
		return -name.compareTo(o.name);
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}

}
