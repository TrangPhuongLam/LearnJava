package array;

import java.util.ArrayList;
import java.util.Scanner;


public class MenuOptionsArrayList {
	public static void main(String[] args) {
		
		menuOption();
		
	}
	
	public static void displayMenu() {
		System.out.println("Menu:");
		System.out.println("1. Add elements");
		System.out.println("2. Remove elements");
		System.out.println("3. Display elements");
		System.out.println("4. Exit");
	
	}
	
	public static void menuOption() {
		
		displayMenu();
		//Chose options
		int exit = 0;
		ArrayList<Integer> List = new ArrayList<Integer>();
		
		while (exit != 4) {
			System.out.println("Enter a number your chose:");
			
			Scanner input = new Scanner(System.in);
			int chose = input.nextInt();
			
			
			switch (chose) {
			case 1:
				//Add
				System.out.println("Add a number: ");
				List.add(input.nextInt());
				System.out.println("Added!");
				System.out.println();
				break;
	
			case 2:
				//Remove
				System.out.println("Remove a number: ");
				int number = input.nextInt();
				if (List.contains(number)) {
					List.remove(Integer.valueOf(number));
					System.out.println("Removed!");
				}else {
					System.out.println("Not exit " + number + 
							". Can't remove");
					
				}
				System.out.println();
				break;
	
			case 3:
				//Display
				System.out.println("Display all number: ");
				System.out.println(List);
				System.out.println();
				break;
	
			case 4:
				//Exit
				System.out.println("Exit! Goodbye!");
				exit = 4;
				break;
				
			default:
				break;
			}
		}
	}
}
