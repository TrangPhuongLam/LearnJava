package loop_ex;

import java.util.Scanner;

public class WhileLoopEX {
	public static void main(String[] args) {
		
		//Enter number by keyboard
		System.out.println("Enter a number between 1 to 10: ");
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
	
		
		while (num < 1 || num > 10) {
			
		//Test number 1 to 10
		 if (num < 1) {
			System.out.println("Number lesser than 1");
			
		}else if (num > 10) {
			System.out.println("Number greater than 10");
			
		}
		
		//Enter number again if number outside 1 to 10
		System.out.println("Try again");
		 num = input.nextInt();
		
		}
		
		System.out.println("Number between 1 to 10");
		
	}

}
