package array;

import java.util.Arrays;

public class Sum2DArray {
	public static void main(String[] args) {
		//Default 2D array 3 x 3
		int[][] two_DArray = { {1, 5, 7}, {3, 1, 5}, {5, 7, 8} };
		
		sumOfEachRow(two_DArray);
	}
	
	public static void sumOfEachRow(int[][] two_DArray) {
		//sum each array
		int sum = 0;
		for (int row = 0; row < two_DArray.length; row++) {
			for (int column = 0; column < two_DArray[row].length; column++) {
				sum += two_DArray[row][column];
			}
			System.out.println("Sum of row " + (row + 1) + " is "+ sum);
			sum = 0;
		}
		
		System.out.println(Arrays.deepToString(two_DArray));
	}
}
