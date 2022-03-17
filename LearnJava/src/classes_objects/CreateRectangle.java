package classes_objects;

import java.util.Arrays;
import java.util.Scanner;

public class CreateRectangle {
	public static void main(String[] args) {
		//User create rectangle 
		Scanner input = new Scanner(System.in);
		System.out.println("How many do you want create rectangle?");
		
		int numberRectangle = input.nextInt();
		
		Rectangle[] rectangleArray = new Rectangle[numberRectangle];
		
		//User add width, height for rectangle (Y/n)
		
		for (int i = 0; i < rectangleArray.length; i++) {
			System.out.println("Do you want add width, height? Y/n?");
			char anwser = input.next().charAt(0);
			
			switch (anwser) {
			case 'y':
				System.out.println("Enter width and height: ");
				rectangleArray[i] = new Rectangle(
						input.nextDouble(), input.nextDouble());
				System.out.println();
				break;

			case 'n':
				rectangleArray[i] = new Rectangle();
				break;
				
			default:
				break;
			}
		}
		
		//Print rectangle 
		for (int i = 0; i < rectangleArray.length; i++) {
			System.out.println("Rectangle " + (i + 1) +
					" is " + rectangleArray[i].toString());
		}
		
	}
}
