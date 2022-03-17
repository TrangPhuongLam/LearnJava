package loop_ex;

import java.util.Scanner;

public class DisplayStarTriangle {
	public static void main(String[] args) {
		//Enter a number
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		
		//Display star like triangle
		for (int i = 1; i <= num; i++) {
			
			for (int j = 1; j <= num - i; j++) 
				System.out.print(" ");
			
			
			for (int j = 1; j <= 2*i -1 ; j++) 
				if (i == num) 
					System.out.print("*");		
				else 
					if (j == 1 || j == 2*i - 1)
					System.out.print("*");
					else
						System.out.print(" ");
			
			System.out.println();
		}
	}
}
