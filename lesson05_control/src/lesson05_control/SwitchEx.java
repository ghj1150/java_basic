package lesson05_control;

public class SwitchEx {
	public static void main(String[] args) {
		// 계절 계산을 switch로 변환
		int month = 11;
		
			//	3,4,5 봄
			//	6,7,8 여름
			//	9,10,11 가을
			//	12,1,2 겨울
		switch(month/3) {
		case 1:
			System.out.println("봄");
			break;
		case 2:
			System.out.println("여름");
			break;
		case 3:
			System.out.println("가을");
			break;
		default:
			System.out.println("겨울");

//		switch(month) {
//		case 3: case 4: case 5:
//			System.out.println("봄");
//			break;
//		case 6: case 7: case 8:
//			System.out.println("여름");
//			break;
//		case 9: case 10: case 11:
//			System.out.println("가을");
//			break;
//		default :
//			System.out.println("겨울");
		}
	}
}
