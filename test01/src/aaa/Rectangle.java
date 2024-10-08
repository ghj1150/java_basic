package aaa;

public abstract class Rectangle extends Shape {
	private int width, height;

	public Rectangle(int width, int height) {
		super("사각형");
		this.width = width;
		this.height = height;
	}

	@Override
	double area() {
		return width * height;
	}

	@Override
	double length() {
		return 2 * (width + height);
	}

	@Override
	public String toString() {
		return "Shape [width=" + width + ", height=" + height + "]";
	}
	
	

}
