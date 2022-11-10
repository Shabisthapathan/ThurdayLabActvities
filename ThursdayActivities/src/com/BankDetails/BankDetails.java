package com.BankDetails;

public class BankDetails {
	private Bank[]account;
	private int entry;
	
	BankDetails()
	{
		account=new Bank[5];
	}
	
	public void checkBalance(Bank input)
	{
		if(entry<account.length)
		{
			account[entry]=input;
			entry++;
			if(input.getBalance()<(999))
				System.out.println("Low Balance Account is: --"+ input.getFirstName()+input.getLastName()+":"+input.getAccountNumber()+":"+input.getBalance()+":");
		}
	}
	public static void main(String[] args) {
		
		Bank b1=new Bank("Shabistha","pathan",123456,898);
		Bank b2=new Bank("Shaistha","pathan",8980797,9897);
		Bank b3=new Bank("Salauddin","pathan",90838,123.89);
		Bank b4=new Bank("Rahmath","unnisa",29790479,178.676);
		Bank b5=new Bank("MD.","Fazil",89809,887587);
		
		BankDetails myBank=new BankDetails();
		
		
		myBank.checkBalance(b1);
		myBank.checkBalance(b2);
		myBank.checkBalance(b3);
		myBank.checkBalance(b4);
		myBank.checkBalance(b5);

	}

}
