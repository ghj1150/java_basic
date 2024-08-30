package lesson04_operator;

public class OpEx7 {
	public static void main(String[] args) {
		int score = 50;
		String pass = score >= 60 ? "합격" : "불합격";
		System.out.println(pass);

		int num = 70;

		// 짝수 , 홀수
		String dd = (num % 2 == 0) ? "짝수" : "홀수";
		System.out.println(dd);
		
		char ch = 'A';
		char ch2 = (char)(ch + 1);
		
		// 산술 형 상승 : int보다 작은 숫자 타입을 이항 연산 시 int
		System.out.println(ch2);
		
		//int double char boolean
		
		//byte, short, char
		byte b = Byte.MAX_VALUE;
		byte b1 = 1;
		byte b2 = (byte)(b - b1) ;	//126
		System.out.println(b2);
		
		int i = 300;
		byte b3 = (byte)i;
		
		System.out.println(i);
		System.out.println(b3);
		
		// '0' : 48, 'A' : 65, 'a' : 97, '가' : 44032
		System.out.println((char)('가'+1));
		
		// unicode에 완성형 한글의 글자 갯수 구하기
		System.out.println('힣' - '가' + 1);
		
		
		System.out.println("==========================");
		
		int cnt = 0;
		for(ch = '가' ; ch < '까' ; ch++) {
			System.out.print(ch);
			cnt++;
		}
		System.out.println(cnt);
		
		//사과 123개 상자당 10개씩 들어갑니다.
		//몇개의 상자가 필요합니까?
		
		int apple = 123;
		int box = 10;
		int num2 = apple % box == 0 ? apple / box :  apple/ box +1;
	//  int num2 = (apple + 9) / box;
		System.out.println(num2);
		
		//소수점 자르기(반올림)
		// 3.141592
		double pi = 3.141592;
		System.out.println(pi * 1000);
		System.out.println((int)(pi * 1000 + 0.5) / 1000d);
		
	}
}
