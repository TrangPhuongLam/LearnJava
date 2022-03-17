package loop_ex;

import java.util.Scanner;

public class DisplayNumberTimes {
	public static void main(String[] args) {
		//Enter a number
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		
		//Display number times
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
