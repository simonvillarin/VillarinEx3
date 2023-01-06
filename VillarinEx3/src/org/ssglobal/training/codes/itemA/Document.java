package org.ssglobal.training.codes.itemA;

abstract class Printable {
	public String studentName;
	public int age;
	public String homeAddress;
	
	public void printName() {
		System.out.println("Student name: " + studentName);
		System.out.println("Age: " + age);
		System.out.println("Home Address: " + homeAddress);
	}
}

class Letter extends Printable {
	public void accessProps() {
		printName();
	}
}


class Student extends Printable {
	public void accessProps() {
		printName();
	}
}