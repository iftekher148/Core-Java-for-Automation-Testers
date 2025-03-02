package Day16;

import Day6.printOddEven;

public class EncapsulationBankAccout {
	
	// Variable without private
	/*
	 int bankAccountNumber; // Note: Without declare the variable as "Private" this variable can access from other 
							//class(EncapsulationBankAccoutMain) by creating object(EncapsulationBankAccout class object)
	String accountNameS;	// when declare as private, we need set & get method
	double balance;
	*/
	
	//Variable using Private
	private int bankAccountNumber; // this also called object variable of this class
	private String accountNameS;
	private double balance;
	
	//set method-- used to assing the value in the object variable
	void setbankAccountNumber(int num) { //local variable.... coming during run time 
		bankAccountNumber=num;
	}
	//get method-- retrive the value & return to the main method
	int getbankAccountNumber() {
		return bankAccountNumber;
	}
	

	// also we can use setter & getter from source
	public void setBalance(double balance) { // Why use 'this'
		this.balance = balance; // if the object variable & local variable is same , the use 'this' keyword. it will access the object memory
	}
	public double getBalance() {
		return balance;
	}
	
	
	public void setAccountNameS(String accountNameS) {
		this.accountNameS = accountNameS;
	}
	public String getAccountNameS() {
		return accountNameS;
	}
	
	
	
}
