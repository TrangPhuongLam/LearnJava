package classes_objects;

import java.util.ArrayList;
import java.util.Date;

public class Account {
	private int id;
	private double balance, annualInterestRate;
	private Date dateCreated;
	private Client client;
	private ArrayList<Transaction> transactions;
	
	public Account(int id, double balance, double annualInterestRate, Client client) {
		super();
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.client = client;
		
		this.transactions = new ArrayList<>();
		dateCreated = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
	
	public int countTransactions(char type) {
		int count = 0;
		for(Transaction transaction : this.transactions) {
			if (type == transaction.getType()) {
				count++;
			}
		}
		return count;
	}
	public boolean withdraw(double amount) {
		if (this.balance > amount) {
			this.balance -= amount;
			this.transactions.add(new Transaction('W', amount, 
					this.balance, "Withdrawn"));
			return true;
			
		}
		return false;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
		this.transactions.add(new Transaction('D', amount, 
				this.balance, "Deposit"));
	}

	@Override
	public String toString() {
		String s = "id=" + this.id + ", balance=" + this.balance +
				", annualInterestRate=" + this.annualInterestRate
				+ ", dateCreated=" + this.dateCreated + "\n" + 
				"withdraw= " + countTransactions('W') + 
				", deposit= " + countTransactions('D');
		
		return s;
	}
	
	
}
