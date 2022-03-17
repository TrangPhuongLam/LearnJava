package loop_ex;

import java.util.Scanner;

public class ReverseOfString {
	public static void main(String[] args) {
		//Enter a string
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String string = input.nextLine();
		
		//Reverse a string
		
		String reverse = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			reverse += string.charAt(i);
			
		}
		System.out.print(reverse);
	}
}
