package day3;

import java.util.Scanner;

public class SimpleLoanPaymentCalculator {

	public static void main(String[] args) {
		System.out.println("Please input data one by one to calculate monthly payment");
		Scanner scan = new Scanner(System.in);
		System.out.println("Input your Total Loan Amount");
		double loanAmount = scan.nextDouble();
		System.out.println("Input the Annual Interest Rate");
		float interestRate = scan.nextFloat();
		
		System.out.println("Input 1 for Loan Term in Months");
		System.out.println("Input 2 for Loan Term in Years");
		
		int loanTermChoice = scan.nextInt();
		System.out.println("Input the Loan Term");
		float loanTerm = scan.nextFloat();
		
		switch(loanTermChoice) {
			case 1:
				double monthlyPayment1 = loanAmount * ( ((interestRate/100)/12)* Math.pow(1+((interestRate/100)/12),loanTerm) ) / (Math.pow( 1+((interestRate/100)/12),(loanTerm))-1);
				
				
				
				System.out.println("Your Monthly payment based on Loan Amount "+"$"+loanAmount+" "+","+"Interest Rate"+" "+interestRate+"%"+" "+"and"+" "+"Loan Term "+loanTerm+" "+"Months"+" "+"="+" $"+Math.round(monthlyPayment1));
				
				break;
				
			case 2:
				double monthlyPayment2 = loanAmount * ( ((interestRate/100)/12)* Math.pow(1+((interestRate/100)/12),loanTerm*12) ) / (Math.pow( 1+((interestRate/100)/12),(loanTerm*12))-1);
				
				
				
				System.out.println("Your Monthly payment based on Loan Amount "+"$"+loanAmount+" "+","+"Interest Rate"+" "+interestRate+"%"+" "+"and"+" "+"Loan Term "+loanTerm+" "+"Years"+" "+"="+" $"+Math.round(monthlyPayment2));
				
				break;				
				default:
					System.out.println("Cannot caluclate the payment. Invalid input provided for Loan Term unit.Please input either '1' for Months or '2' for Years.");
								}
		//Formula for Monthly loan payment = P X [r(1+r)^n / (1+r)^n -1
		// where r is monthly rate i.e. Annual rater/12 e.g. 0.06/12 when annual rate is 6%
		// where n = loan term in months i.e. loan term in years *12
		// for exponent/ power use Math.pow() method that takes 2 arguments (a,b) a to power b
		
		//double monthlyPayment = loanAmount * ( ((interestRate/100)/12)* Math.pow(1+((interestRate/100)/12),loanTerm*12) ) / (Math.pow( 1+((interestRate/100)/12),(loanTerm*12))-1);
		
		
		
		//System.out.println("Your Month payment based on Loan Amount "+"$"+loanAmount+" "+","+"Interest Rate"+" "+interestRate+"%"+" "+"and"+" "+"Loan Term "+loanTerm+" "+"Years"+" "+"="+" $"+Math.round(monthlyPayment));
		
		
	}

}
 