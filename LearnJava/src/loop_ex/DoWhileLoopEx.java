package loop_ex;

import java.util.Scanner;

public class DoWhileLoopEx {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int num;
	System.out.println("Enter a number between 1 and 10: ");
	do {
		 num = input.nextInt();
		 if (num < 1) {
			System.out.println("Number lesser than 1");
		}else if (num > 10) {
			System.out.println("Number greater than 10");
		}
		 System.out.println("Try again: ");
	} while (num < 1 || num > 10);
	
	System.out.println("Number between 1 and 10");
	}
	
	
}
