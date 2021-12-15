package com.bankAccount;

public class AccountHolder {
	public static void main(String[] args) {

		// Creating two object of class Savings Account
		SavingsAccount server1 = new SavingsAccount(2000);
		SavingsAccount server2 = new SavingsAccount(3000);

		// Calculating Saving balance of server1 and server2 on 0.04 interest

		SavingsAccount.setAnnualInterestRate(0.04);
		server1.calculateMonthlyInterest(); // Calculate saving balance for server 1
		System.out.println("Server1 Balance Is: " + server1.getSavingBalance());
		server2.calculateMonthlyInterest(); // Calculate saving balance for server 2
		System.out.println("Server2 Balance Is: " + server2.getSavingBalance());

		System.out.println("-------------------------------------------");

		// Calculating Saving balance of server1 and server2 on 0.05 interest

		SavingsAccount.modifyInterestRate(0.05);
		server1.calculateMonthlyInterest(); // Calculate saving balance for server 1
		System.out.println("Server1 Balance Is: " + server1.getSavingBalance());
		server2.calculateMonthlyInterest(); // Calculate saving balance for server 2
		System.out.println("Server2 Balance Is: " + server2.getSavingBalance());

	}
}
