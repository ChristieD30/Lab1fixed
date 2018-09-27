package main;

import java.util.Scanner;

public class Lab1 {

	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int numOne = 0;
		int numTwo = 0; 
		int hundreds = 0;
		int tens = 0;
		int ones =0;
		int hundreds2 = 0;
		int tens2 = 0;
		int ones2 =0;
		int hundreds3 = 0;
		int tens3 = 0;
		int ones3 = 0;
		
		//Promt user to enter the first number
		System.out.println("We are going to compare two number with three digits.");
		System.out.println("Please enter the first number.");
		numOne = input.nextInt();
		System.out.println(numOne);
		
		//Error message if number has more or less than three digits
		if (numOne >= 1000 || numOne<= 99) {
			System.out.println("Error! Number does not fit the three digits, try again.");
			
			//Have user start program over
			System.out.println("Please start again, enter a three digit number");
			
			//Starts the program back to entering the first number
			numOne=input.nextInt();
		}
		
		 
			
		//Going to figure out the digits for numOne
        hundreds = numOne % 10;
        numOne /= 10;
        tens = numOne % 10;
        numOne /= 10;
        ones = numOne % 10;

		
		//Promt user to input second value
		System.out.println("Please enter the second number.");
		numTwo = input.nextInt();
		System.out.println(numTwo);
		
		
		//Going to figure out the digits for numTwo
		 hundreds2 = numTwo % 10;
	        numTwo /= 10;
	        tens2 = numTwo % 10;
	        numTwo /= 10;
	        ones2 = numTwo % 10;
        
	    // Compare the different digits from each number
        hundreds3 = hundreds + hundreds2;
        tens3 = tens + tens2;
        ones3 = ones +ones2;
        		
        		
       // if else statement to get the correct output
        if (hundreds3 == tens3 && ones3 == tens3) {
        	System.out.println("True, the sums of each digit are equal.");
        }
        else {
        	System.out.println("False,the sums of each digit are not equal.");
        }
		
		input.close();
	}

}
