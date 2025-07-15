package chapter08;

public class Circle extends Shape implements ShapeInterface{ //implements interface를 호출하는 명령 여러개 호출이 가능하다.
//	String color;
	int radius;
	public static final double PI = 3.14;
	
	public Circle(String color, int radius) {
		super(color);
//		this.color = color;
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return PI * radius * radius;
	}
	
	@Override
	public void draw() {
		System.out.println(color + "원을 그린다.");
	}
}

