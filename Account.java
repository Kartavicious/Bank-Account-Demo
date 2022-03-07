/*Chapter 10
Programmer: Michael Kartavich
Date: 11/4/2018
Filename: AccountMRK.java
Purpose: Creates necessary objects/methods to run bank demo.
*/

import java.lang.Math;
import java.util.*;

public class Account{

	//Creates private variables
	private int id;
	private double balance;
	private double annualInterestRate;
	private java.util.Date dateCreated;

//Account constructor
public Account(int id, double balance) {
this.id = id;
this.balance = balance;
dateCreated = new java.util.Date();
}

//acess id method
public int getId() {
	return id;
}

//access balance method
public double getBalance() {
	return balance;
}

//access interest rate method
public double getAnnualInterestRate() {
	return annualInterestRate;
}

//set interest rate method
public void setAnnualInterestRate (double annualInterestRate) {
	this.annualInterestRate = annualInterestRate;
}

//date created method
public java.util.Date getDateCreated() {
	return dateCreated;
}

//get monthly interest rate method
public double getMonthlyInterest() {
	double monthlyInterest = (balance * annualInterestRate) / 12;
	return monthlyInterest;
}

//withdraw method
public void withdraw(double amt) {
	balance = balance - amt;
}

//deposit method
public void deposit(double amt) {
	balance = balance + amt;
}
}
