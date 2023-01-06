package org.ssglobal.training.codes.itemA;

abstract class Shape {
	public void draw() { }
	public void color() { }
	
	class Square {
		public void draw() {
			System.out.println("Square");
		}

		public void color() {
			System.out.println("Green");
		}
	}
	
	class Triangle {
		public void draw() {
			System.out.println("Triangle");
		}

		public void color() {
			System.out.println("Blue");
		}
	}
	
	class Circle {
		public void draw() {
			System.out.println("Circle");
		}

		public void color() {
			System.out.println("Red");
		}
	}
}

