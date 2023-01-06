package org.ssglobal.training.codes.itemB;

public class Isoceles {
	public boolean isIsoceles(int length1, int length2, int length3) {
		if (length1 == length2 && length1 == length3 && length2 == length3) {
			return false;
		} 
		
		if (length1 == length2 || length1 == length3 || length2 == length3) {
			return true;
		}

		return false;
	}

}
