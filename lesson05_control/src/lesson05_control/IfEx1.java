package lesson05_control;

public class IfEx1 {
	public static void main(String[] args) {
		double rand = Math.random();	// 0 ~ 0.9999999999999
//		int score = 70;
		int score = (int)(rand * 101);
		System.out.println("시험 시작");
		System.out.println("점수 :: " + score);
		if(score >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		System.out.println("시험 끝");
	}
}
