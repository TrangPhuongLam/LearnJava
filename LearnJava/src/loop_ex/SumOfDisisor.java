package loop_ex;

import java.util.Scanner;

public class SumOfDisisor {
	public static void main(String[] args) {
		//Enter a number
		System.out.println("Enter a number: ");
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		//Sum of disisor
		int sum = 0;
		for (int i = 1; i <= (num/2); i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		
		System.out.println("Sum of disisor: " + sum);
	}
}
