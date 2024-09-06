package day2;

public class CircleMain {
	public static void main(String[] args) {
//		Circle circle = new Circle(5);
//		circle.printRound();
//		circle.printArea();

		new Circle().setR(5).printArea().printRound().setR(10).printArea().printRound();

	}
}
