package entities;

public class Account {
	
	private String numAccount;
	private Client client;
	private double balance;
	
	public Account() {
	}
	
	public Account(String numAccount, Client client, double initialBalance) {
		this.numAccount = numAccount;
		this.client = client;
		this.balance = initialBalance;
	}
	
	public String getNumAccount() {
		return numAccount;
	}
	
	public void setNumAccount(String numAccount) {
		this.numAccount = numAccount;
	}
	
	public Client getClient() {
		return client;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}	

}