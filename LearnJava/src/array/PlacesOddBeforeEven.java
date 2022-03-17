package array;

import java.util.Arrays;

public class PlacesOddBeforeEven {
	public static void main(String[] args) {
		//Default array with odd, even
		int[] array = {9, 1, 8, 4, 7, 6, 3, -2, -1};
		
		printOddBeforeEvenNumber(array);
		printEvenBeforeOddNumber(array);
		
//		//Create array blank
//		int[] test = new int[array.length];
//		
//		//Find odd and even
//		//Sort odd before even
//		int count = 0;
//		
//		
//		for (int i = 0; i < array.length; i++) {
//			if(array[i] % 2 != 0) { //Odd number
//				test[count] = array[i];
//				count++;
//			}
//		}
//		
//		//Sort number odd with increment
//		Arrays.sort(test, 0, count);
//		
//		int evencount = count;
//		for (int i = 0; i < test.length; i++) {
//			if(array[i] % 2 == 0) { //Even number
//				test[count] = array[i];
//				count++;
//			}
//		}
//		
//		//Sort number even with increment
//		Arrays.sort(test, evencount, test.length);
//		
//		//Print
//		System.out.println(Arrays.toString(test));
		
	}
	
	public static int[] createTestArray(int[] array) {
		int[] test = new int[array.length];
		return test;
	}
	
	public static int incrementCount(int count) {
		count++;
		return count;
	}
	
	public static int[] sortOddNumber(
			int[] array, int count, 
			int[] test, int start, int end) {
		
		//Odd number
		for (int i = 0; i < array.length; i++) {
			if(array[i] % 2 != 0) { 
				test[count] = array[i];
				count++;
			}
		}
		
		//Sort number odd with increment
		Arrays.sort(test, start, end);
		
		return test;
	}
	
	public static int countOddNumber(
			int[] array, int count, 
			int[] test) {
		
		//Odd number
		for (int i = 0; i < array.length; i++) {
			if(array[i] % 2 != 0) { 
				test[count] = array[i];
				count++;
			}
		}
		return count;
	}
	
	public static int[] sortEvenNumber(
			int[] array, int count, 
			int[] test, int start, int end) {
		
		//Even number
		for (int i = 0; i < test.length; i++) {
			if(array[i] % 2 == 0) { 
				test[count] = array[i];
				count++;
			}
		}
		
		//Sort number even with increment
		Arrays.sort(test, start, end);
		
		return test;
	}
	
	public static int countEvenNumber(
			int[] array, int count, 
			int[] test) {
		
		//Even number
		for (int i = 0; i < test.length; i++) {
			if(array[i] % 2 == 0) { 
				test[count] = array[i];
				count++;
			}
		}
		return count;
	}
	
	public static int copyCount(int count) {
		int copyCount = count;
		return copyCount;
	}

	public static void printOddBeforeEvenNumber(int[] array) {
		//Create array blank
		int[] test = createTestArray(array);
		
		//Find odd and even
		//Sort odd before even
		int count = 0;
		int oddcount = countOddNumber(array, count, test);
		//Odd number
		test = sortOddNumber(array, count, test, 0, oddcount);
		
		//Even number
		int evencount = copyCount(oddcount);
		test = sortEvenNumber(
				array, evencount, test, evencount, array.length);
		
		//Print 
		System.out.println("Array sort odd before even: " + Arrays.toString(test));
	}
	
	public static void printEvenBeforeOddNumber(int[] array) {
		//Create array blank
		int[] test = createTestArray(array);
		
		//Find odd and even
		//Sort odd before even
		int count = 0;
		int evencount = countEvenNumber(array, count, test);
		//Even number
		test = sortEvenNumber(array, count, test, 0, evencount);
		
		//Even number
		int oddcount = copyCount(evencount);
		test = sortOddNumber(
				array, oddcount, test, oddcount, array.length);
		
		//Print 
		System.out.println("Array sort even before odd: " + Arrays.toString(test));
	}
}
