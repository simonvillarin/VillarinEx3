package org.ssglobal.training.codes.itemA;

abstract class Shape {
	public void draw() { }
	public void color() { }
	
	final class Square {
		public void draw() {
			System.out.println("Square");
		}

		public void color() {
			System.out.println("Green");
		}
	}
	
	final class Triangle {
		public void draw() {
			System.out.println("Triangle");
		}

		public void color() {
			System.out.println("Blue");
		}
	}
	
	final class Circle {
		public void draw() {
			System.out.println("Circle");
		}

		public void color() {
			System.out.println("Red");
		}
	}
}

