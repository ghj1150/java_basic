package day2;

import java.util.Arrays;

public class ArrayCopy {
	public static void main(String[] args) {
		// arraycopy
		int[] src = { 1, 2, 3, 4 };
		int[] dest = new int[src.length * 2];
		System.arraycopy(src, 1, dest, 2, src.length - 1);

		System.out.println(Arrays.toString(dest));

		int[] result = Arrays.copyOf(src, 10);
		System.out.println(Arrays.toString(result));
	}
}
