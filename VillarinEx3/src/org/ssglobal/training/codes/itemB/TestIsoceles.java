package org.ssglobal.training.codes.itemB;

public class TestIsoceles {

	public static void main(String[] args) {
		Isoceles isoceles = new Isoceles();
		
		System.out.println(isoceles.isIsoceles(2, 4, 4));
		System.out.println(isoceles.isIsoceles(1, 5, 6));
		System.out.println(isoceles.isIsoceles(3, 7, 3));
		System.out.println(isoceles.isIsoceles(8, 2, 8));
		System.out.println(isoceles.isIsoceles(9, 9, 9));
	}

}
