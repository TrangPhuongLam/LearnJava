package loop_ex;

import java.util.Scanner;

public class DisplayStarTimes {
	public static void main(String[] args) {
		//Enter a number
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		
		//Display star times
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num - i; j++) {
				System.out.print(" ");
				
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
