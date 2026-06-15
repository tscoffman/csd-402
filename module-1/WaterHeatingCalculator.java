/*
Trenten Coffman
June 14, 2026
Module 1.3 Assignment

Takes user input to calculate energy needed to heat water.
*/
import java.util.Scanner;

class WaterHeatingCalculator {
	
	public static void main (String args[]) {
		// Declarations
		Scanner input = new Scanner(System.in);
		double waterMass;
		double initialTemp;
		double finalTemp;
		double energyNeeded;
		
		// Gather input
		System.out.print("\nEnter how many kilograms of water will be heated: ");
		waterMass = input.nextDouble();
		System.out.print("\nEnter the initial temperature of the water in celcius: ");
		initialTemp = input.nextDouble();
		System.out.print("\nEnter the final temperature of the water after heating in celcius: ");
		finalTemp = input.nextDouble();
		
		// Calculate and print answer
		energyNeeded = waterMass * (finalTemp - initialTemp) * 4184;
		System.out.println("\nThe energy needed to heat " + waterMass + " kilograms of water from " + initialTemp + "C to " +
			finalTemp + "C is " + energyNeeded + " joules.");
	}
}