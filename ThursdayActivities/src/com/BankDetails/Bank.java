package com.BankDetails;

public class Bank {

	private String firstName;
	private String lastName;
	private int accountNumber;
	private double balance;
	
	
	
	Bank()
	{
		super();
	}
	
	Bank(String firstName,String lastName,int accountNumber,double balance)
	{
	   this.firstName=firstName;
	   this.lastName=lastName;
	   this.accountNumber=accountNumber;
	   this.balance=balance;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	
}
