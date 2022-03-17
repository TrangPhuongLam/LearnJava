package array;

import java.util.Arrays;

public class MaxOfEachRow {
	public static void main(String[] args) {
		//Default 2D array 3 x 3
		int[][] two_DArray = { {1, 5, 7}, {3, 1, 5}, {5, 7, 8} };
		
		maxOfEachRow(two_DArray);
		
	}
	
	public static void maxOfEachRow(int[][] two_DArray) {
		//Max of each row
		int max;
		
		for (int row = 0; row < two_DArray.length; row++) {
			max = two_DArray[0][row];
			for (int column = 1; column < two_DArray[row].length; column++) {
				max = (two_DArray[row][column] > max)? 
						two_DArray[row][column] : max;
			}
			
			System.out.println("Max of row " + (row + 1) + " is " + max);
		}
		
		System.out.println(Arrays.deepToString(two_DArray));
	}
}
