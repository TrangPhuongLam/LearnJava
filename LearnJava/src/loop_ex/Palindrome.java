package loop_ex;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		//Enter a string
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String string = input.nextLine();
		
		//Check palindrome
//			//Reverse a string
//				String reverse = "";
//				for (int i = string.length() - 1; i >= 0; i--) {
//					reverse += string.charAt(i);
//					
//				}
//				
//			if (string.equals(reverse)) {
//				System.out.println(reverse + ", This is a palindrome!");
//			}else {
//				System.out.println("This is not a palindrome!");	
//			}
		boolean isPalindrome = true;
			for (int i = 0, j = string.length() - 1; 
					i < j; i++, j--) {
				if (string.charAt(i) == string.charAt(j)) {
					continue;
				}
				
				isPalindrome = false;
					break;
				
			}
			
			System.out.println(isPalindrome? "Palindrome" : "Not palindrome");
	}
}
