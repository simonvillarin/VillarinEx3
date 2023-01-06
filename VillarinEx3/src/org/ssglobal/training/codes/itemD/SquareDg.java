package org.ssglobal.training.codes.itemD;

public class SquareDg {
	public void printDesign(int height) {
		byte dash = 5;

		if (height > 9 || height < 1) {
			System.out.println("Height should not be greater than 9 or less than 1");
		} else {
			for (byte i = 0; i <= height; i++) {
				if (i % 2 != 0) {
					for (byte j = 0; j < dash; j++) {
						System.out.print("-");
					}
					for (byte j = 0; j < i; j++) {
						System.out.print(i);
					}
					for (byte j = 0; j < dash; j++) {
						System.out.print("-");
					}
					System.out.println("");
					dash--;
				}
			}
		}
	}
}
