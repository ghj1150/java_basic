package aaa;

public abstract class Cube extends Shape {
	private int width, height, high;

	public Cube(int width, int height) {
		super("육면체");
		this.width = width;
		this.height = height;
	}

	@Override
	double area() {
		return width * height * 6;
	}

	@Override
	double volume() {
		return width * height * high;
	}

	@Override
	public String toString() {
		return "Cube [width=" + width + ", height=" + height + "]";
	}

}
