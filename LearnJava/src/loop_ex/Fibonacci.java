package loop_ex;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		//Enter a number for th
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		
		//Fibonacci
		int first = 1, second = 1, result = 0;
		for (int i = 0; i <= num; i++) {
			if (i < 2) {
				System.out.println(1 + " ");
			}else if (i >= 2) {
				result = first + second;
			System.out.println(result + " ");
			first = second;
			second = result;
			}
			
			
		}
		//Print number for th
		System.out.println("Number " + num +"th is " + result);
	}
}
