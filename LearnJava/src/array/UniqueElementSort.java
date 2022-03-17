package array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


public class UniqueElementSort {
	public static void main(String[] args) {
		//uniqueNumberSort();
		uniqueNumberSortWayTwo();
		
	
	}
	
	public static int getNumber() {
		int number = new Scanner(System.in).nextInt();
		return number;
	}
	
	public static ArrayList<Integer> creatBlankArrayList(){
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		return arrayList;
	}
	
	public static ArrayList<Integer> enterNumberList(int numberEnter){
		
		//Enter number
		ArrayList<Integer> enterNumber = creatBlankArrayList();
		System.out.println("Enter " + numberEnter + " number: ");
		for (int i = 0; i < numberEnter; i++) {
			int number = new Scanner(System.in).nextInt();
			enterNumber.add(number);
			
		}
		return enterNumber;
	}
	
	public static ArrayList<Integer> uniqueNumberList(ArrayList<Integer> enterNumberList){
		//unique number in list
		int count = 0;
		ArrayList<Integer> uniqueNumber = new ArrayList<Integer>();
		ArrayList<Integer> copyEnterNumberList = copyArrayList(enterNumberList);
		
		for(Integer elementNumber : enterNumberList) {
			for(Integer compareNumber : copyEnterNumberList) {
				if (elementNumber == compareNumber) {
					count++;
				}
			}
			
			if (count == 1) {
				uniqueNumber.add(elementNumber);
				copyEnterNumberList.remove(elementNumber);
			}else {
				copyEnterNumberList.remove(elementNumber);
			}
			count = 0;
		}
		
	return uniqueNumber;
	
	}
	
	public static ArrayList<Integer> copyArrayList(ArrayList<Integer> arrayList){
		
		ArrayList<Integer> copyArrayList = new ArrayList<Integer>();
		for(Integer number : arrayList) {
			copyArrayList.add(number);
		}
		
		return copyArrayList;
	}
	
	public static void uniqueNumberSort() {
		//Enter number
		System.out.println("How many number you want enter?");
		int numberEnter = getNumber();
		
		//Enter number list
		ArrayList<Integer> enterNumberList = enterNumberList(numberEnter);
		System.out.println(enterNumberList);
		//Unique number list
		ArrayList<Integer> uniqueNumber = uniqueNumberList(enterNumberList);
		Collections.sort(uniqueNumber);
		System.out.println("Unique number list: " + uniqueNumber);
	}
	
	public static void uniqueNumberSortWayTwo() {
		//Enter number
		System.out.println("How many number you want enter?");
		int numberEnter = getNumber();
		
		//Unique number list
		ArrayList<Integer> uniqueNumberList = new ArrayList<Integer>();
		
		System.out.println("Enter " + numberEnter + " number: ");
		
		for (int i = 0; i < numberEnter; i++) {
			int number = new Scanner(System.in).nextInt();
			if (!uniqueNumberList.contains(number)) {
				uniqueNumberList.add(number);
			}
		}
		
		//Sort unique number list
		Collections.sort(uniqueNumberList);
		System.out.println("Unique number list: " + uniqueNumberList);
	}
}
