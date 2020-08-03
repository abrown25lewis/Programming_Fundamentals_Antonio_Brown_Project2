/* Class: Programming Fundamentals 
 * Name: Antonio Brown 
 * Assignment: Programming Assignment 1
 * Date: 8/2/2020
 */

import java.util.Scanner;

public class Figures {

	// This method will print the option for a box
	static void printBox(int size) {

		int bc, br = 0;

		for (bc = 1; bc <= size; bc++) {

			for (br = 1; br <= size; br++) {

				System.out.print("X");
			}
			System.out.print("\n");
		}
	}

	//This method will print the diamond option
	static void printDiamond(int size) {
		
		int dc, dr, middle = 0;
		
		size = size + 1;
		
		middle = (size / 2);
		
	for (dc = 1; dc <= middle; dc++) {
			
			for (dr = 1; dr <= (middle - dc); dr++) {
				
				System.out.print(" ");
				
			}
			
			if (dc == 1) {
				
				System.out.print("XX");
				
			} 
			
			else {
				
				System.out.print("X");

				for (dr = 1; dr <= 2 * dc - 2; dr++) {
					
					System.out.print(" ");
					
				}
				
				System.out.print("X");
			}
			
			System.out.print("\n");
			
		}
		
	for (dc = middle + 1; dc < size; dc++) {
			
			for (dr = 1; dr <= dc - middle; dr++) {
				
				System.out.print(" ");
			}
			
			if (dc == size - 1) {
				
				System.out.print("XX");
				
			} 
			
			else {
				
				System.out.print("X");

		for (dr = 1; dr <= 2 * (size - dc) - 2; dr++) {

					System.out.print(" ");
					
				}
		
				System.out.print("X");
				
			}
			
			System.out.print("\n");
		}
	}

	// This method will print the option X
	static void printX(int size) {
		
		int xc,xr = 0;
		
		for (xc = 1; xc <= size; xc++) {
			
			for (xr = 1; xr <= size; xr++) {
				
				if (xr == xc) {
					
					System.out.print("X");
					
				} 
				
				else if (xr == size - (xc - 1)) {
					
					System.out.print("X");
					
				} 
				
				else {
					
					System.out.print(" ");
				}

			}
			
			System.out.println(" ");
		}
	}

	// This method will quit out of the menu
	static void quit() {

		System.out.println("\nGood bye !");
		System.exit(0);

	}

	// This holds the main method
	public static void main(String[] args) {

		// Declaring my variables size and menuchoice
		int size, menuchoice;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\nEnter the size of the figure(odd number):");
		
		size = scan.nextInt();
		
		while (size % 2 == 0) {
			
			// Initiates input for figure size and loops until the valu is odd
			System.out.print("\nInvalid figure size-must be an odd number");
			System.out.print("\nEnter the size of the figure:");
			size = scan.nextInt();

		}
		
		do {
			
			// Prints out menu and grabs user input choice
			System.out.print("\nMENU: \n1.Print Box \n2.Print diamond \n3.Print X \n4.Quit Program");
			System.out.print("\n Please select an option:");
			System.out.print("\n");
			
			
			// swtich based on user input
			menuchoice = scan.nextInt();
			switch (menuchoice) {
			case 1:
				printBox(size);
				break;
			case 2:
				printDiamond(size);
				break;
			case 3:
				printX(size);
				break;
			case 4:
				quit();
				break;
			default:
				System.out.println("Invalid option");
			}

		} while (menuchoice != 4);

	}

}