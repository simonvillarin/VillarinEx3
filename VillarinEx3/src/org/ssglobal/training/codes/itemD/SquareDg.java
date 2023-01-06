package org.ssglobal.training.codes.itemD;

public class SquareDg {
	public void printDesign(int height) {
		int dash = 5;

		if (height > 9 || height < 1) {
			System.out.println("Height should not be greater than 9 or less than 1");
		} else {
			for (int i = 0; i <= height; i++) {
				if (i % 2 != 0) {
					for (int j = 0; j < dash; j++) {
						System.out.print("-");
					}
					for (int j = 0; j < i; j++) {
						System.out.print(i);
					}
					for (int j = 0; j < dash; j++) {
						System.out.print("-");
					}
					System.out.println("");
					dash--;
				}
			}
		}
	}
}
