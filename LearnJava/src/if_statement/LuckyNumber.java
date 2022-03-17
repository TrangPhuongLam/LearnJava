package if_statement;

import java.util.Scanner;

public class LuckyNumber {
public static void main(String[] args) {
	System.out.println("Enter your number with 4 : " );
	Scanner input = new Scanner(System.in);
	
	int enterNum = input.nextInt();
	
	int fourthNum = (enterNum) % 10; 
	int thirdNum = (enterNum / 10) % 10;
	int secondNum = (enterNum / 100) % 10;
	int firstNum = (enterNum / 1000) % 10;
	
	switch ((firstNum + secondNum) - (thirdNum + fourthNum)) {
	case 0:
		System.out.println("Lucky Number");
		break;

	default:
		System.out.println("Bad luck");
		break;
	}
}
}
