package lesson06_array;

public class Info {
	public static void main(String[] args) {
		// 배열 : 하나의 변수로 여러 데이터를 저장
		// 타입[] 변수명; // 타입 변수명[];
		int num;
		int[] arr = new int[5];
		double[] arr2;
		String[] strings;

		// 기본값 0 false
		// String str = null;

//		System.out.println(arr);
		int[] arr3;
		arr3 = new int[5];
		// 순번 index

		// arr[0] arr[1] arr[2] arr[3] arr[4]

//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);

		arr[0] = 10;
		arr[1] = 20;
		arr[3] = 30;

		for (int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}

		// 배열의 선언
		// 길이를 통한 초기화
		// 값을 통한 초기화

		String[] strs = { "홍길동", "이순신", "김유신" };
		System.out.println(strs[1]);

		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}

	}
}
