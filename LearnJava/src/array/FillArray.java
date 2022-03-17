package array;

import java.util.Arrays;
import java.util.Scanner;

public class FillArray {
	public static void main(String[] args) {
//		fillElements(getElements());
		fillPoint(getElements());
	}
	
	public static int getElements() {
		//Enter a number of elements 1 to 20 number
		System.out.println("Enter a number of elements: ");
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		if (num < 1 || num >20) {
			System.out.println("Number over 1 to 20 number, try again: ");
			num =input.nextInt();
		}
		return num;
	}
	
	public static void fillElements(int num) {
		//Enter value for elements
		int[] fillArray = new int[num];
		int element;
		System.out.println("Enter elements: ");
		for (int i = 0; i < num; i++) {
			element = new Scanner(System.in).nextInt();
			fillArray[i] = element;
		}
		
		System.out.println("The elements is: ");
		printArray(fillArray);
		
	}
	
	public static void printArray(int[] array) {
		//Print array
		System.out.println(Arrays.toString(array));
	}
	
	public static void fillPoint(int num) {
		//Enter value for point
			Point[] fillPoint = new Point[num];
			
			for (int i = 0; i < num; i++) {
				System.out.println("Enter x and y, point " + i);
				int x = new Scanner(System.in).nextInt();
				int y = new Scanner(System.in).nextInt();
				fillPoint[i] = new Point(x, y);
			}
			
			printPoint(fillPoint);
	}
	
	public static void printPoint(Point[] pointArray) {
		//Print point array
		System.out.println("Points are: ");
		for (int i = 0; i < pointArray.length; i++) {
			System.out.print("(" + pointArray[i].getX() + 
					", " +pointArray[i].getY() + ") ");
		}
		
	}
}
