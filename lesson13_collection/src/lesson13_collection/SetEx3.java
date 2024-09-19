package lesson13_collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx3 {
	public static void main(String[] args) {
		// 집합
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		
		Set<Integer> origin = new HashSet<>(set);
		
		System.out.println(set);
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(2);
		set2.add(3);
		set2.add(4);
		// 교집합
		set.retainAll(set2);
		System.out.println(set);
		
		set = new HashSet<Integer>(origin);
		
		// 합집합
		set.addAll(set2);
		System.out.println(set);
		set = new HashSet<Integer>(origin);
		
		// 차집합
		set.removeAll(set2);
		System.out.println(set);
	}
}
