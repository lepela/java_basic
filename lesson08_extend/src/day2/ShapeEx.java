package day2;


abstract class Shape {
	String type;
	public Shape(String type) {
		this.type = type;
	}
	abstract double area();
	abstract double length();
}


public class ShapeEx {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[2];
		shapes[0] = new Circle(10);
		shapes[1] = new RectAngle(5, 5);
		for(Shape s : shapes) {
			System.out.println(s);
			System.out.println("넓이 : " + s.area() + ", 둘레 : " + s.length());
		}
	}
}



class Circle extends Shape {
	int r;
	public Circle(int r) {
		super("원");
		this.r = r;
	}
	@Override
	double area() {
		return r * r * Math.PI;
	}
	@Override
	double length() {
		return r * 2 * Math.PI;
	}
	@Override
	public String toString() {
		return "Circle [type=" + type + ", r=" + r + "]";
	}

}

class RectAngle extends Shape {
	int width, height;

	public RectAngle(int width, int height) {
		super("사각형");
		this.width = width;
		this.height = height;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return width * height;
	}

	@Override
	double length() {
		// TODO Auto-generated method stub
		return 2 * (width + height);
	}

	@Override
	public String toString() {
		return "RectAngle [width=" + width + ", height=" + height + ", type=" + type + "]";
	}
}

