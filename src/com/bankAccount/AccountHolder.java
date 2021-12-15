package com.bankAccount;

public class AccountHolder {
	public static void main(String[] args) {

		// Creating two object of class Savings Account
		SavingsAccount saver1 = new SavingsAccount(2000);
		SavingsAccount saver2 = new SavingsAccount(3000);

		// Calculating Saving balance of saver1 and saver2 on 0.04 interest

		SavingsAccount.setAnnualInterestRate(0.04);
		saver1.calculateMonthlyInterest(); // Calculate saving balance for saver 1
		System.out.println("Saver1 Balance Is: " + saver1.getSavingBalance());
		saver2.calculateMonthlyInterest(); // Calculate saving balance for saver 2
		System.out.println("Saver2 Balance Is: " + saver2.getSavingBalance());

		System.out.println("-------------------------------------------");

		// Calculating Saving balance of saver1 and saver2 on 0.05 interest

		SavingsAccount.modifyInterestRate(0.05);
		saver1.calculateMonthlyInterest(); // Calculate saving balance for saver 1
		System.out.println("Saver1 Balance Is: " + saver1.getSavingBalance());
		saver2.calculateMonthlyInterest(); // Calculate saving balance for saver 2
		System.out.println("Saver2 Balance Is: " + saver2.getSavingBalance());

	}
}
