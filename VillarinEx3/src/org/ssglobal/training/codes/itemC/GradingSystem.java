package org.ssglobal.training.codes.itemC;

public class GradingSystem {
	public void evaluation(int testNumber, int score) {
		double weightedScore = 0;
		
		switch (testNumber) {
		case 1 -> {
			weightedScore = score * 0.10;
			break;
		} case 2 -> {
			weightedScore = score * 0.20;
			break; 
		} case 3 -> {
			weightedScore = score * 0.20;
			break;
		} case 4 -> {
			weightedScore = score * 0.15;
			break;
		} case 5 -> {
			weightedScore = score * 0.15;
			break;
		} case 6 -> {
			weightedScore = score * 0.10;
			break;
		} default -> {
			System.out.println("Test number should not be greater than 6.");
		}
		}
		System.out.println("A score of " + score + " on test " + testNumber + " gives a weighted score of " + weightedScore);
	}
	
	public static void main(String[] args) {
		GradingSystem gradingSystem = new GradingSystem();
		gradingSystem.evaluation(3, 27);
	}
}
