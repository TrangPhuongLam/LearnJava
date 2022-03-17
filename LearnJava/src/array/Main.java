package array;

public class Main {
	public static void main(String[] args) {
		double[] demo = {0, 1};
		
		System.out.println(demo);
		
		for (int i = 0; i < demo.length; i++) {
			System.out.print(demo[i] + " ");
		}
		
		char[] c = {'a', 'b'};
		System.out.println(c);
		
		System.out.println(sum(2, 4, 6, 7, 33, 44));
		
	}
	
	public static int sum(int... number) {
		int sum = 0;
		for (int i = 0; i < number.length; i++) {
			sum += number[i];
		}
		return sum;
	}
}
