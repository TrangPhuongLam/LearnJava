package loop_ex;

public class Ex1_PrintEvenNumber {
	public static void main(String[] args) {

	//Print even number increment
		//Run 1 to 100
		System.out.println("Even number increment: ");
		for (int i = 0; i <= 100; i++) {
			//Print even number
			if (i % 2 ==0) {
				System.out.print(i + " ");
			}
		}
		
	
		//Print even number decrement
				//Run 1 to 100
		System.out.println();
		System.out.println("Even number decrement: ");
				for (int i = 100; i >= 0; i--) {
					//Print even number
					if (i % 2 ==0) {
						System.out.print(i + " ");
					}
				}
	}
}
