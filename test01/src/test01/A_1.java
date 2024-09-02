package test01;

import java.util.Scanner;

public class A_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("점수를 입력하세요: ");
		int score = scanner.nextInt();
		
		String pass = score >= 90 ? "합격" : "불합격";
		System.out.println(pass);
	}
}
