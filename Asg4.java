/**
* Developer - Logan Laine Class - CMIS 141/6382 Date 14SEP2022	Instructor - Professor Rowson
* Program prompts the user for a starting number to print and outputs a rectangular 
* pattern using nested for-loops. After the rectangular pattern, the program prompts the user 
* for a number of rows and outputs a triangle pattern nested for-loops.
*/

import java.util.Scanner; 
public class Asg4 {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		int n;

		System.out.print("Enter the value of n: ");
		n = stdin.nextInt();
		System.out.println();
		
		for (int row = 1; row <= n; row++)    { //Loop for upper left 
			int column;
			for (column = 1; column <= n; column++) {
				if (row < column)  //if-else to determine & print rows & columns
					System.out.print(n-row + 1 + " ");
				else
					System.out.print(n-column + 1 + " ");  
				
			}  
			for (column = n - 1; column >= 1; column--) { //Loop for upper right
				if (row < column)  //if-else to determine & print rows & columns
					System.out.print(n-row + 1 + " ");
				else
					System.out.print(n-column + 1 + " ");
				
			}
			System.out.println();
			
		}
		for (int row1 = n - 1; row1 >= 1; row1--)    { //Loop for bottom left
			int column1;
			for (column1 = 1; column1 <= n; column1++) {
				if (row1 < column1)  //if-else to determine & print rows & columns
					System.out.print(n-row1 + 1 + " ");
				else
					System.out.print(n-column1 + 1 + " ");
				
			}
			for (column1 = n - 1; column1 >= 1; column1--) { //Loop for bottom right
				if (row1 < column1)  //if-else to determine & print rows & columns
					System.out.print(n-row1 + 1 + " ");
				else
					System.out.print(n-column1 + 1 + " ");
				
			}
			System.out.println();
			
		}
		
		System.out.println();
		int r;
		System.out.print("Enter the number of rows: "); 
		r = stdin.nextInt();
		System.out.println();
		
		for (int row = 1; row <= r; row++)    { //Loop for triangle
			int column;
			for (column = 1; column <= r; column++) {
				if (row < column)
					System.out.print(" ");
				else if (row == column)
					System.out.print(row + " ");
				else
					System.out.print(column + " ");
				
			}
			System.out.println();
			
		}
		stdin.close();
		
	}
	
}