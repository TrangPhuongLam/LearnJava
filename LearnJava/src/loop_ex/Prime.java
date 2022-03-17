package loop_ex;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		//Enter a number 
		System.out.println("Enter a number: ");
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		//Check number is positive
		//Find divisors
		int sum = 0;
		for (int i = 2; i <= (num/2); i++) {
			if (num % i == 0) {
				sum++;
			}
		}
		//Find prime
		if (sum == 0) {
			System.out.println(num + " is prime");
			
		}else {
			System.out.println(num + " is not prime");
		}
	}
}
