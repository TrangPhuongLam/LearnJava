package classes_objects;

import java.util.ArrayList;
import java.util.Arrays;

public class TestClient {
	public static void main(String[] args) {
		Client[] client = new Client[2];
		client[0] = new Client(1, "Alex", "01234555");
		client[1] = new Client(2, "Trang", "77777777");
		
//		client[0].addAccount(new Account(1, 2000000, 2.5));
//		client[0].addAccount(new Account(2, 2000000, 1.5));
//		
//		client[1].addAccount(new Account(2, 230000, 3));
//		client[1].addAccount(new Account(2, 230000, 3.5));
//		client[1].addAccount(new Account(2, 230000, 4));
//		System.out.println(Arrays.toString(client));
		
		//Create an ArrayList of Accounts
		ArrayList<Account> accounts = new ArrayList<Account>();
		
		Account acc1 = new Account(1, 2000000, 2.5, client[0]);
		acc1.deposit(300);
		acc1.withdraw(499);
		
		Account acc2 = new Account(2, 3333333, 1.5, client[0]);
		acc2.deposit(300);
		acc2.deposit(300);
		acc2.deposit(300);
		acc2.withdraw(499);
		
		Account acc3 = new Account(1, 2222222, 0.5, client[1]);
		acc3.deposit(300);
		acc3.deposit(300);
		acc3.withdraw(499);
		acc3.withdraw(499);
		acc3.withdraw(499);
		acc3.withdraw(499);
		
		Account acc4 = new Account(2, 4567888, 3.5, client[1]);
		acc4.withdraw(499);
		acc4.withdraw(499);
		acc4.deposit(300);
		acc4.deposit(300);
		
		Account acc5 = new Account(3, 3455777, 4.5, client[1]);
		acc5.deposit(300);
		acc5.deposit(300);
		acc5.deposit(300);
		
		
		accounts.add(acc1);
		accounts.add(acc2);
		accounts.add(acc3);
		accounts.add(acc4);
		accounts.add(acc5);
		
		//Display the number of deposit and withdraw of each account
			System.out.println(acc1.toString());
			
		
	}
}
