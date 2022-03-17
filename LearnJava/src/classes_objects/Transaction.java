package classes_objects;

import java.util.Date;

public class Transaction {
	private char type; //'D' (Deposit), 'W' (Withdrawal)
	private double amount, balance; //Balance after transaction
	private Date date;
	private String description;
	public Transaction(char type, double amount, double balance, String description) {
		super();
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
		
		date = new Date();
	
	}
	public char getType() {
		return type;
	}
	
	
	
	
}
