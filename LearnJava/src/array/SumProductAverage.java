package array;

public class SumProductAverage {
	public static void main(String[] args) {
		int[] demo = {2, 3, 5};
		System.out.println("Sum is " + sum(demo));
		System.out.println("Product is " + product(demo));
		System.out.println("Average is " + average(demo));
		
	}
	
	public static int sum(int[] array) {
		//sum array
			int sum = 0;
			for (int i = 0; i < array.length; i++) {
				sum += array[i];
			}
		return sum;
			
	}
	
	public static int product(int[] array) {
		//product array
			int product = 1;
			for (int i = 0; i < array.length; i++) {
				product *= array[i];
			}
		return product;
			
	}

	public static double average(int[] array) {
		//average array
			int average = sum(array)/array.length;
		return average;
		
	}

}
