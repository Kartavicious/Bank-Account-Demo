/*
	Chapter 10:	Account program
	Programmer: Michael Kartavich
	Date: 11/4/2018
	Filename:	BankAcctDemoMRK.java
	Purpose: Demonstrates account.java
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class BankAcctDemoMRK {
  public static void main (String[] args) {
	  int acctID;
	  double acctBalance, annIntRate, withAmt, depAmt;
	  Scanner input = new Scanner(System.in);
	  DecimalFormat twoDigits = new DecimalFormat("$###,###.00");
	  DecimalFormat percent = new DecimalFormat("##.00%");

	  System.out.println("   Bank Account Balance");
	  System.out.println();

	  System.out.print("Enter your account id: ");
	  acctID = input.nextInt();
	  System.out.println();

	  System.out.print("Enter your current Balance: ");
	  	  acctBalance = input.nextDouble();
	  System.out.println();

	  System.out.print("Enter your annual interest rate: ");
	  	  annIntRate = input.nextDouble();
	  System.out.println();

	  System.out.print("Enter any withdrawals: ");
	  	  	  withAmt = input.nextDouble();
	  System.out.println();

	  System.out.print("Enter any deposits: ");
	  	  	  depAmt = input.nextDouble();
	  System.out.println();


    Account checkAcct = new Account(acctID, acctBalance);
    checkAcct.setAnnualInterestRate(annIntRate);

    checkAcct.withdraw(withAmt);
    checkAcct.deposit(depAmt);
    System.out.println("Balance for account # " +  checkAcct.getId() + " is " +twoDigits.format(checkAcct.getBalance()));

    System.out.println("Monthly interest is " + twoDigits.format(checkAcct.getMonthlyInterest()));

    System.out.println("This account was created at " +
      checkAcct.getDateCreated());
      System.out.println();
      System.out.println();

      System.out.println("Annual interest rate is " + percent.format(checkAcct.getAnnualInterestRate()));






  }
}
