package oopInterface;

public class Rect
	   extends Shape
	   implements Drawable, Movable {

	@Override
	public void draw() {
		System.out.println("사각형 그리기");
	}

	@Override
	public void move() {
		System.out.println("사각형 이동");
	}

}// end of class
