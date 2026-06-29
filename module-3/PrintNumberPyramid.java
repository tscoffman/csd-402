/*
Trenten Coffman
June 28, 2026
Module 3.2 Assignment

Prints a pyramid of numbers
*/
public class PrintNumberPyramid {
	
	public static void main(String[] args) {
		int spaces = 20;
		String numberString = "";
		
		System.out.println();
		
		// for loop for each output line
		for (int i = 0; i < 7; i++) {
			// for loop for pre-spaces
			for (int j = 0; j < spaces; j++) {
				numberString += " ";
			}
			
			int number = 1;
			
			// ascending
			for (int j = 0; j < i + 1; j++) {
				if (j > 0) {
					numberString += " ";
				}
				numberString += number;
				number *= 2;
			}
			number /= 4;
			
			// descending
			for (int j = 0; j < i; j++) {
				numberString += " ";
				numberString += number;
				number /= 2;
			}
			
			System.out.printf("%-40s@", numberString); // I looked up how to do this
			spaces -= 2;
			numberString = "";
			System.out.println();
		}
	}
}