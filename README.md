# Java Simple Loan Payment Calculator

## Overview

The **Loan Payment Calculator** is a console-based Java application that calculates the estimated monthly payment for a loan using the standard loan amortization formula. Users provide the loan amount, annual interest rate, and loan term (in either months or years), and the program calculates the monthly payment.

This project demonstrates user input, mathematical calculations, `switch` statements, and the use of Java's `Math.pow()` method.

## Features

* Accepts loan amount from the user
* Accepts annual interest rate
* Supports loan terms entered in:

  * Months
  * Years
* Calculates estimated monthly loan payment
* Uses the standard loan amortization formula
* Displays an informative payment summary
* Handles invalid loan term selections

## Technologies Used

* Java
* `Scanner` class for user input
* `switch` statement
* `Math.pow()` method
* Console-based application

## Project Structure

```text
day3/
└── SimpleLoanPaymentCalculator.java
```

## How It Works

1. The user enters the total loan amount.
2. The user enters the annual interest rate (percentage).
3. The program asks whether the loan term will be entered in:

   * `1` – Months
   * `2` – Years
4. The user enters the loan term.
5. The application calculates the monthly payment using the loan amortization formula.
6. The estimated monthly payment is displayed.

## Loan Payment Formula

The program uses the standard amortization formula:

```text
Monthly Payment = P × [ r(1 + r)^n ] ÷ [ (1 + r)^n − 1 ]
```

Where:

* **P** = Loan amount (principal)
* **r** = Monthly interest rate (Annual Interest Rate ÷ 12 ÷ 100)
* **n** = Total number of monthly payments

If the loan term is entered in years, the program converts it to months by multiplying by 12.

## Example Output (Loan Term in Years)

```text
Please input data one by one to calculate monthly payment

Input your Total Loan Amount
250000

Input the Annual Interest Rate
5

Input 2 for Loan Term in Years
2

Input the Loan Term
30

Your Monthly payment based on Loan Amount $250000.0, Interest Rate 5.0% and Loan Term 30.0 Years = $1342
```

## Example Output (Loan Term in Months)

```text
Please input data one by one to calculate monthly payment

Input your Total Loan Amount
10000

Input the Annual Interest Rate
6

Input 1 for Loan Term in Months
1

Input the Loan Term
36

Your Monthly payment based on Loan Amount $10000.0, Interest Rate 6.0% and Loan Term 36.0 Months = $304
```

## Invalid Input Example

```text
Input 1 for Loan Term in Months
Input 2 for Loan Term in Years

3

Cannot calculate the payment. Invalid input provided for Loan Term unit. Please input either '1' for Months or '2' for Years.
```

## How to Run

### Compile

```bash
javac day3/SimpleLoanPaymentCalculator.java
```

### Run

```bash
java day3.SimpleLoanPaymentCalculator
```

## Learning Concepts Demonstrated

* Java variables and data types
* User input using the `Scanner` class
* `switch` statements
* Mathematical calculations
* Financial formulas
* Exponents using `Math.pow()`
* Console input and output
* Basic input validation

## Possible Improvements

* Format the monthly payment to two decimal places using `DecimalFormat` or `String.format()`.
* Handle zero-interest loans separately to avoid division by zero in the formula.
* Validate negative or invalid user input.
* Display the total payment over the life of the loan.
* Calculate total interest paid.
* Generate an amortization schedule.
* Allow users to perform multiple calculations without restarting the program.
* Create a graphical user interface (GUI) using Java Swing or JavaFX.

## Notes

* Interest rate should be entered as an annual percentage (for example, `5` for 5%).
* Loan term can be entered in either months or years.
* The displayed monthly payment is rounded to the nearest whole dollar using `Math.round()`.

## Author

Created as a Java practice project to demonstrate user input, mathematical computations, financial calculations, and control flow using `switch` statements.

