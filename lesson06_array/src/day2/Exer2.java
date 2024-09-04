package day2;

public class Exer2 {
	public static void main(String[] args) {
		// 1. 지폐, 동전 세기
		int money = 123456;
		// 123456 	50000*2		23456
		//  23456  	10000*2		 3456
		//   3456  	 5000*0 	 3456
		//   3456	 1000*3       456
		//    456     500*0		  456
		//    456     100*4	       56
		//     56      50*1	        6
		//		6      10*0         6
		//      6       5*1         1
		//      1       1*1         0
		
		
		int[] units = {50000,10000,5000,1000,500,100,50,10,5,1};
		int[] counts = new int[10];
		// {2,2,0,3,0,4,1,0,1,1}
		
		for(int i = 0; i < units[i]; i++) {
			if(money % units[i] != 0 ) {
				money -= units[i]; 
				

//			System.out.println(money);
			}
		}
		
		
		
		
		// 2. Scanner 사용하여 사람 이름을 입력 받기
		// 입력 글자중 q를 입력하면 입력 종료
		// 사람이름들을 문자열 배열 만들어서
		// 프로그램 종료직전 확인
		
	}
}
