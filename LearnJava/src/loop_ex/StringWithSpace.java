package loop_ex;

import java.util.Scanner;

public class StringWithSpace {
	public static void main(String[] args) {
		//Enter a string
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String string = input.nextLine();
		
		//Add space into each character
		char character;
		for (int i = 0; i < string.length(); i++) {
			character = string.charAt(i);
			System.out.print(character + " ");
		}
	}
}
