package aaa;

public abstract class Cylinder extends Shape {
	private int r, h;
	
	
	public Cylinder(int r, int h) {
		super("원기둥");
		this.r = r;
		this.h = h;
	}

	@Override
	double area() {
		return 2 * Math.PI * r * r + 2 * Math.PI * r * h;
	}

	@Override
	double volume() {
		return r * r * h * Math.PI;
	}

	@Override
	public String toString() {
		return "Cylinder [r=" + r + ", h=" + h + "]";
	}
	
	
}
