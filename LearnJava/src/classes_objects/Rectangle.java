package classes_objects;

public class Rectangle {
	private double width, height;

	public Rectangle() {
		this(1.0, 1.0);
	}

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea() {
		double area = this.width * this.height;
		return area;
	}
	
	public double getPerimeter() {
		double perimeter = 2 * (this.width + this.height);
		return perimeter;
	}

	@Override
	public String toString() {
		return "[width=" + width + ", height=" + height + "]";
	}
	
	
}
