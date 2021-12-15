package com.bankAccount;

public class SavingsAccount {

	// Initialize two variable
	static double annualInterestRate;
	private double savingBalance;

	// Initializing constructor for saving balance value
	public SavingsAccount(double savingBalance) {
		super();
		this.savingBalance = savingBalance;
	}

	// getter and setter for variables
	public double getSavingBalance() {
		return savingBalance;
	}
	
	public static void setAnnualInterestRate(double annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate;
	}

	// Calculating Monthly interest
	public double calculateMonthlyInterest() {
		double monthlyInterest = (savingBalance * annualInterestRate) / 12;
		savingBalance = savingBalance + monthlyInterest;
		return savingBalance;
	}

	// Setting annual interest rate
	public static void modifyInterestRate(double annualInterestRate1) {
		annualInterestRate = annualInterestRate1;
	}

}
