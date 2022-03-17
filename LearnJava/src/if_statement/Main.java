package if_statement;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Enter your number: " );
		Scanner input = new Scanner(System.in);
		
		int num1 = input.nextInt();
		char op = input.next().charAt(0);
		double num2 = input.nextDouble();
		
	
		
		switch (op) {
		case '+':
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			break;
			
		case '-':	
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			break;
			
		case '*':
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
			break;
			
		case '/':
			if (num2 == 0) {
				System.out.println("Math error because divide with 0");
			}else {
				System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
			}
			
			break;
			
		default:
			System.out.println("None");
			break;
			
		}
		
//		if (number % 2 == 0) {
//			System.out.println("This is even number.");
//		}else {
//			System.out.println("This is odd number.");
//		}
	}
	
	

}
