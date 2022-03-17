package array;

import java.util.Arrays;

public class TheNumberOfOccurences {
	public static void main(String[] args) {
		int[] array = {0, 1, 1, 1, 3, 4, 0, 6 ,3, 7};
		
		printNumberOfOccurences(array);
		
//		
//		int number = 0;
//		int[] test = new int[array.length];
//		boolean isNotOccurences = true;
//		int count = 0;
//		for (int i = 0; i < array.length; i++) {
//			//Check number is not occurences over 2 times
//			System.out.println("i: " + i);
//			System.out.println(Arrays.toString(test));
//			for (int j = 0; j < count; j++) {
//				System.out.println("array i " + i + ": " + array[i]);
//				System.out.println("test j " + j + ": " + test[j]);
//				System.out.println("count: " + count);
//				if(i == 0) {
//					isNotOccurences = true;
//					break;
//				}else
//					if(array[i] == test[j]) {
//					isNotOccurences = false;
//					break;
//				}
//				
//				isNotOccurences = true;
//				
//			}
//			
//			//Add element into test array
//			
//			if (isNotOccurences == true) {
//				test[count] = array[i];
//				System.out.println(Arrays.toString(test));
//				
//				count++;
//			}
//			
//				
//			//Count number of occurences
//			System.out.println(isNotOccurences);
//			if (isNotOccurences == true) {
//				for (int j = i; j < array.length; j++) {
//					if (array[i] == array[j] ) {
//						number++;
//					}
//				}
//				System.out.println(array[i] + " is " + number);
//				System.out.println();
//				number = 0;
//			}
//			
//		}
		
  
	

	}
	
	public static int[] createArray(int number) {
		int[] array = new int[number];
		return array;
	}
	
	public static int[] addElementTestArray(
			int[] array, int countElementOfTest, int[] testArray, 
			int indexArray, boolean isNotOccurences) {
		
		//Add element into test array
		if (isNotOccurences == true) {
			testArray[countElementOfTest] = array[indexArray];
			countElementOfTest = countOccurences(countElementOfTest);
		}
		return testArray;
	}
	
	public static int countOccurences(int count) {
		count++;
		return count;
	}
	
	public static boolean isNotOccurences(
			int[] array, int countElementOfTest, int[] test, int indexArray) {
		
		boolean isNotOccurences = true;
		
		//Check number is not occurences over 2 times
		for (int j = 0; j < countElementOfTest; j++) {
			if(indexArray == 0) {
				isNotOccurences = true;
				break;
			}else
				if(array[indexArray] == test[j]) {
				isNotOccurences = false;
				break;
			}
			
			isNotOccurences = true;
				
		}
		
		return isNotOccurences;
	}
	
	public static void countNumberOfOccurences(
			int[] array, int indexArray, boolean isNotOccurences) {
		
		int numberOfOccrences = 0;
		//Count number of occurences
		if (isNotOccurences == true) {
			for (int j = indexArray; j < array.length; j++) {
				if (array[indexArray] == array[j] ) {
					numberOfOccrences++;
				}
			}
			System.out.println(array[indexArray] + " is " + numberOfOccrences);
			System.out.println();
			numberOfOccrences = 0;
		}
	}
	
	public static void printNumberOfOccurences(int[] array) {
		
		//Declare
		int[] test = new int[array.length];
		int countElementOfTest = 0;
		
		//Print number of occurences process
		for (int indexArray = 0; indexArray < array.length; indexArray++) {
			
			//Check number is not occurences over 2 times
			boolean isNotOccurences = isNotOccurences(
					array, countElementOfTest, test, indexArray);
			
			//Add element into test array
			test = addElementTestArray(
					array, countElementOfTest, test,
					indexArray, isNotOccurences);
				
			//Increment countElementOfTest
				countElementOfTest = incrementCountElementArray(
						isNotOccurences, countElementOfTest);
				
			//Count number of occurences
			countNumberOfOccurences(array, indexArray, isNotOccurences);
			
		}
	}
	
	public static int incrementCountElementArray(boolean isNotOccurences, int countElementOfTest) {
		if (isNotOccurences == true) {
			countElementOfTest = countOccurences(countElementOfTest);
		}
		return countElementOfTest;
	}
}
