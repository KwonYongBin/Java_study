package chapter08;

public class Rectangle extends Shape implements ShapeInterface {
//	String color;
	int wideh;
	int height;
	
	public Rectangle(String color, int wideh, int height) { //묵시적 형 변환
		super(color);
//		this.color = color;
		this.wideh = wideh;
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return wideh * height;
	}
	
	@Override
	public void draw() {
		System.out.println(color + "사각형을 그린다.");
	}
	


}
