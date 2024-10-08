// Java program to find the perimeter of a Rectangle

import java.io.*;

class Calculator {

	// Method to calculate the perimeter of the rectangle
	// with given length and breadth
	static void perimeter(int length, int breadth)
	{
		// Calculate the 'perimeter' using the formula
		int perimeter = 2 * (length + breadth);
	
		System.out.println("The perimeter of the given rectangle of length "
			+ length + " and breadth " + breadth + " = "
			+ perimeter);
	}

	// Driver method
	public static void main(String[] args)
	{
		// Initialize a variable length that stores length of
		// the given rectangle
		int length = 10;
	
		// Initialize a variable breadth that stores breadth
		// of the given rectangle
		int breadth = 20;
	
		// Call the perimeter method on these length and
		// breadth
		perimeter(length, breadth);
	}
}
