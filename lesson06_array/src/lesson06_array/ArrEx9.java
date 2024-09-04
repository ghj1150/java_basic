package lesson06_array;

import java.util.Arrays;

public class ArrEx9 {
	public static void main(String[] args) {
//		System.out.println("첫번째 값 :" + args[0]);
//		System.out.println("두번째 값 :" + args[1]);

		int[] arr = { 1, 2, 3, 4 };
		System.out.println(arr);
		int[] arr2 = new int[arr.length * 2]; // {1,2,3,4,5,0,0,0,0,0)
		System.out.println(arr2);
		
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}

//		System.out.println(Arrays.toString(arr2));

		arr = arr2;
		System.out.println(arr);
		
//		System.out.println(Arrays.toString(arr));
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.print(arr2[i]);
//		}
		// 객체 : object 변수
	}
}
