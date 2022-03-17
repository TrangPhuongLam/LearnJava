package loop_ex;

import java.util.Scanner;

public class Exceeds100 {
	public static void main(String[] args) {
		//User enter sequence of number
		Scanner input = new Scanner(System.in);
		
		
		//sum of numbers
		int sum =0;
		while (sum <= 100) {
			System.out.println("Enter a number: ");
			sum += input.nextInt();
			
			if (sum > 100) {
				break;
			}
		}
		//Done when sum exceeds 100
		System.out.println("Sum is " + sum);
		System.out.println("Done");
	}
}
