package Day16;

public class EncapsulationBankAccoutMain {

	public static void main(String[] args) {


		// Declare object
		EncapsulationBankAccout acc = new EncapsulationBankAccout();
		
		// without declare as 'Private' we can access 'EncapsulationBankAccout class variable' from other class. When declare private it shows error
		/*
		acc.bankAccountNumber=100;
		acc.accountNameS="Rock";
		acc.balance=109.46;
		*/
		
		acc.setbankAccountNumber(1000); // set this object
		int number=acc.getbankAccountNumber(); //assing in a variable. retrive this using get
		System.out.println(number);
		
		acc.setAccountNameS("Rocktim");
		String name= acc.getAccountNameS();
		System.out.println(name);
		
		acc.setBalance(194586.86);
		acc.setBalance(10000.1000); //we can update the value
		double bal=acc.getBalance();
		System.out.println(bal);
	}

}
