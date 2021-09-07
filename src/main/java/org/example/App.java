package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //variable declaration
        double oneGallonPerNumSqFt = 350.0; //the amount of area that one gallon of paint can cover

        System.out.println("\nWhat is the length of the ceiling? "); //output #1
        Scanner ceilingLengthInput = new Scanner(System.in); //scan for the ceiling's length
        double ceilingLength = ceilingLengthInput.nextDouble();

        System.out.println("\nWhat is the width of the ceiling? "); //output #2
        Scanner ceilingWidthInput = new Scanner(System.in); //scan for the ceiling's width
        double ceilingWidth = ceilingWidthInput.nextDouble();

        double ceilingArea = ceilingLength * ceilingWidth; //calculate the area of the ceiling;
        double numMajorityOfGallonsNeeded = (double)(ceilingArea / oneGallonPerNumSqFt); //calculate the majority of the gallons needed to paint the ceiling
        int numTotalGallonsNeeded = (int) Math.ceil(numMajorityOfGallonsNeeded); //calculate the total of the gallons needed to paint the ceiling via rounding up

        System.out.println("\nYou will need to purchase " + numTotalGallonsNeeded + " gallons of paint to cover " + (int)ceilingArea + " square feet."); //output #3

    }
}
