package loop_ex;

import java.util.Scanner;

public class ContinueBreakEx {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		
		while (true) {
		System.out.println("Enter a number between 1 and 10: ");	
			num = input.nextInt();
			if (num < 1) {
				System.out.println("Number lesser than 1!");
				System.out.println("Try again: ");
				continue;
			}else if (num > 10) {
				System.out.println("Number greater than 10!");
				System.out.println("Try again: ");
				continue;
			}
			
			System.out.println("Number is between 1 and 10!");
			break;
		}
	}
}
