package loop_ex;

import java.util.Scanner;

public class SequenceMaxMin {
	public static void main(String[] args) {
		//Enter a sequence of number
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		int max = num, min = num;
		while (true) {
			
			
			//Check negative value
			if (num < 0) {
				break;
			}
			
			//Max and min value
			if (num > max) {
				max = num;
			}
			if (num < min) {
				min = num;
			}
			num = input.nextInt();
		}
		
		if (min <0 && max < 0) {
			System.out.println("Don't have max and min");
		}else {
			System.out.println("Max is " + max);
		System.out.println("Min is " + min);
		}
		
	}
}
