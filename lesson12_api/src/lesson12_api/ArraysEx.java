package lesson12_api;

import java.util.Arrays;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.stream.IntStream;

public class ArraysEx {
	public static void main(String[] args) {
		String[] arr = { "홍길동", "이순신", "강감찬", "김유신" };
		Arrays.sort(arr, (o1, o2) -> -o1.compareTo(o2));
		System.out.println(Arrays.toString(arr));

		BiFunction<String, String, Integer> bi = (o1, o2) -> -o1.compareTo(o2);
		int[] arr2 = new int[10];
		Arrays.fill(arr2, 5);
		Arrays.fill(arr2, new Random().nextInt(6) + 1);
		System.out.println(Arrays.toString(arr2));
		int[] arr3 = IntStream.rangeClosed(1, 6).limit(5).toArray();
		System.out.println(Arrays.toString(arr3));
	}
}
