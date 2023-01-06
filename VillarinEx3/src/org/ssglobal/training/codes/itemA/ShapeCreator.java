package org.ssglobal.training.codes.itemA;

public class ShapeCreator extends Shape {
	public void createSquare() {
		Square square = new Square();
		square.draw();
		square.color();
	}

	public void createTriangle() {
		Triangle triangle = new Triangle();
		triangle.draw();
		triangle.color();
	}
	
	public void createCircle() {
		Circle circle = new Circle();
		circle.draw();
		circle.color();
	}
}


