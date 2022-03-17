package method;

import java.util.Scanner;

public class getName_age_user {
	public static void main(String[] args) {
		System.out.println("Enter your name: ");
		System.out.println(getName());
		System.out.println("Enter your age: ");
		System.out.println(getAge());
	}
	
	public static String getName() {
		return new Scanner(System.in).nextLine();
	}
	
	public static long getAge() {
		
		return new Scanner(System.in).nextLong();
	}
}
