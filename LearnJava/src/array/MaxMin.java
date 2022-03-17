package array;

public class MaxMin {
	public static void main(String[] args) {
		int[] array = {1, 3, 0, 5, 33, -2};
		
		System.out.println("Max array is " + isMaxArray(array));
		System.out.println("MIn array is " + isMinArray(array));
		printMaxMinArray(array);
	}
	
	public static int isMaxArray(int[] array) {
		int max = array[0];
		
		for (int i = 1; i < array.length; i++) {
			max = (array[i] > max) ? array[i] : max;
			
		}
		return max;
	}
	
	public static int isMinArray(int[] array) {
		int min = array[0];
		
		for (int i = 1; i < array.length; i++) {
			min = (array[i] < min)? array[i] : min;
			
		}
		return min;
	}

	public static void printMaxMinArray(int[] array) {
		
		int max = array[0], min = array[0];
		
		for (int i = 1; i < array.length; i++) {
			max = (array[i] > max) ? array[i] : max;
			min = (array[i] < min)? array[i] : min;
			
		}
		
		System.out.println("Max is " + max);
		System.out.println("Min is " + min);
	}
}
