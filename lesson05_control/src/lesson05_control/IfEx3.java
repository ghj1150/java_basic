package lesson05_control;

public class IfEx3 {
	public static void main(String[] args) {
		//	자격증 시험, 과락
		//	세 과목
		
		//	세 과목 평균이 60 이상이면 합격
		//	단, 개별 과목이 40 미만이면 불합격
		int score1 = 80, score2 = 90, score3= 30;
		int avg = (score1+score2+score3)/3;
		
		//System.out.println(avg);
		
		//	적절한 조건
		if(avg >= 60 && score1 >=40 && score2 >=40 && score3 >=40) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		//	합격 여부 출력
		
	}
}
