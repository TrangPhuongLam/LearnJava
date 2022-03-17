package method;

import java.util.Scanner;

public class PrimeBetweenNumber {
	public static void main(String[] args) {
		System.out.println("Enter number 1 and number 2: ");
		
		arePrime(getNumber(), getNumber());
	}
	
	public static void arePrime(int start, int end) {
		String primes = "";
		for (int i = start; i <= end; i++) {
			 if (isPrime(i))
				 primes += i + " ";
				
		}
		System.out.println(primes);
	}
	
	public static boolean isPrime(int number) {
		for (int i = 2; i <= number/2; i++) {
			if (number % i == 0)
				return false;
			
		}
		return true;
	}
	public static int getNumber() {
		return new Scanner(System.in).nextInt();
	}
}
