package aaa;

public abstract class Circle extends Shape  {
	// 하나의 배열관리
	// 원		length 둘레계산 area 넓이계산
	// 사각형
	// 원기둥	area 넓이계산 volume 부피계산
	// 육면체
	// 접근제한자 public,private
	// lesson07.day2.Circle
	// lesson08.day2.ShapeEx
	private int r;
	
	public Circle(int r){
		super("원");
		this.r = r;
	}

	@Override
	double area() {
		return r * r * Math.PI;
	}

	@Override
	double length() {
		return 2 * r * Math.PI;
	}

	@Override
	public String toString() {
		return "Shape [r=" + r + "]";
	}
	
	
}
