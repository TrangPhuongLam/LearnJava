package loop_ex;

import java.util.Scanner;

public class DisplayStarRectangle {
	public static void main(String[] args) {
		//Enter a number
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		
		//Display star rectangle
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	
}
