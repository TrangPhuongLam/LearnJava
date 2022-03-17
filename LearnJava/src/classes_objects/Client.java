package classes_objects;

import java.util.ArrayList;

public class Client {
	private int id;
	private String name, phone;
	private ArrayList<Account> accounts;
	public Client(int id, String name, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		accounts = new ArrayList<Account>();
	}
	
	public boolean addAccount(Account account) {
		if (account.getAnnualInterestRate() != 0 &&
				account.getBalance() != 0 && account.getId() != 0) {
			this.accounts.add(account);
			return true;
		}
		return false;
	}
	
	public boolean removeAccount(int accountId) {
		for(Account account : this.accounts) {
			if (account.getId() == accountId) {
				this.accounts.remove(account);
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		String s = "id = " + this.id + ", name = " + this.name + ", "
				+ "phone = " + this.phone +"\n";
		for (Account account : this.accounts) {
			s += account.toString() + "\n";
		}
		System.out.println();
		return s;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
