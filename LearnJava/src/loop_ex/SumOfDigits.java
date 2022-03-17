package loop_ex;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		//Enter a number
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		
		//Take digits
		
//		int sum = 0;
//		int digits;
//		for (int i = 0; i < num; i++) {
//			if (i == 0) {
//				digits = num % 10;
//				sum += digits;
//				continue;
//			}
//			digits = (num / (int)Math.pow(10, i)) % 10;
//			sum += digits;
//			
//			if (digits == 0) {
//				break;
//			}
//		}
		
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num /= 10;
			
		}
		//Sum of digits
		System.out.println("Sum of digits: " + sum);
	}
}
