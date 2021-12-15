package com.bankAccount;

public class AccountHolder {
	public static void main(String[] args) {

		// Creating two object of class Savings Account
		SavingsAccount sever1 = new SavingsAccount(2000);
		SavingsAccount sever2 = new SavingsAccount(3000);

		// Calculating Saving balance of sever1 and sever2 on 0.04 interest

		SavingsAccount.setAnnualInterestRate(0.04);
		sever1.calculateMonthlyInterest(); // Calculate saving balance for sever 1
		System.out.println("Sever1 Balance Is: " + sever1.getSavingBalance());
		sever2.calculateMonthlyInterest(); // Calculate saving balance for sever 2
		System.out.println("Sever2 Balance Is: " + sever2.getSavingBalance());

		System.out.println("-------------------------------------------");

		// Calculating Saving balance of sever1 and sever2 on 0.05 interest

		SavingsAccount.modifyInterestRate(0.05);
		sever1.calculateMonthlyInterest(); // Calculate saving balance for sever 1
		System.out.println("Sever1 Balance Is: " + serer1.getSavingBalance());
		sever2.calculateMonthlyInterest(); // Calculate saving balance for sever 2
		System.out.println("Sever2 Balance Is: " + sever2.getSavingBalance());

	}
}
