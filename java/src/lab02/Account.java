package lab02;

import java.util.Date;

public class Account {

	private String accountNumber;
	private String bankCode;
	private String branchCode;
	private double balance;
	private String holder;
	private String log;

	public Account(String accountNumber, String bankCode,
					String branchCode, String holder) {
		this.accountNumber = accountNumber;
		this.bankCode = bankCode;
		this.branchCode = branchCode;
		this.balance = 0;
		this.holder = holder;
		this.log = "Transactions Log for account " + accountNumber + ", Holder: " +
		holder + "\n" + "------------------------------------------------------------\n";
	}
	
	public String getIBAN() {
		return "GR11" + bankCode + branchCode + accountNumber;
	}
	
	public void printIBAN() { System.out.println( getIBAN() ); }
	
	public void printBalance() {
		System.out.println("Balance of account "+accountNumber+ " with holder : "+holder +", is = "+balance);
	}
	
	public void withdraw(double amount) {
		//If we want to put the actual date in the log:
		Date date = new Date();
		
		if(amount<=balance) {
			balance -= amount;
			log += date + ": Successfull withdraw of " + amount + " euros \n";
		} else {
			System.out.println("Not enough money!");
		}
	}
	
	public void deposit(double amount){
		//If we want to put the actual date in the log:
		Date date = new Date();
		balance += amount;
		log += date + ": Successfull deposit of " + amount + " euros \n";
	}
	
	public void printLog() {
		System.out.println("------------------------------------------------------------");
		System.out.println(log);
		System.out.println("------------------------------------------------------------");
	}

}