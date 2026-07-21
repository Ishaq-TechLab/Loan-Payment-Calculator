# 💰 Java Simple Loan Payment Calculator

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=openjdk" alt="Java">
  <img src="https://img.shields.io/badge/IDE-Eclipse-blue?style=for-the-badge&logo=eclipseide" alt="Eclipse">
  <img src="https://img.shields.io/badge/Project-Console%20Application-success?style=for-the-badge" alt="Project">
  <img src="https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge" alt="Status">
</p>

## 📖 Overview

The **Simple Loan Payment Calculator** is a console-based Java application that calculates the **estimated monthly loan payment** using the standard **loan amortization formula**.

Users enter:

* 💵 Loan Amount
* 📈 Annual Interest Rate
* 📅 Loan Term (Months or Years)

The application then calculates and displays the estimated monthly payment.

This project is ideal for beginners learning Java fundamentals, user input, mathematical calculations, and decision-making using `switch` statements.

---

## ✨ Features

* 💰 Enter total loan amount
* 📊 Enter annual interest rate
* 📅 Choose loan term in **Months** or **Years**
* 🧮 Calculates monthly payment automatically
* ⚡ Uses the standard loan amortization formula
* ❌ Handles invalid menu selections
* 💻 Simple console interface

---

## 🛠 Technologies Used

| Technology          | Purpose                  |
| ------------------- | ------------------------ |
| ☕ Java              | Programming Language     |
| 📥 Scanner          | User Input               |
| 🔀 Switch Statement | Menu Selection           |
| ➗ Math.pow()        | Exponential Calculations |
| 🖥 Console          | User Interface           |

---

## 📂 Project Structure

```text
day3/
└── SimpleLoanPaymentCalculator.java
```

---

## 🚀 How It Works

1. 💵 Enter the total loan amount.
2. 📈 Enter the annual interest rate.
3. 📅 Choose the loan term format:

   * **1** → Months
   * **2** → Years
4. ⌨️ Enter the loan duration.
5. 🧮 The application calculates the monthly payment.
6. 📄 The estimated payment is displayed.

---

## 📐 Loan Payment Formula

The calculator uses the standard amortization formula:

[
\textbf{Monthly Payment} =
P \times
\frac{r(1+r)^n}
{(1+r)^n-1}
]

Where:

| Symbol | Description                                    |
| ------ | ---------------------------------------------- |
| **P**  | Loan Amount (Principal)                        |
| **r**  | Monthly Interest Rate (Annual Rate ÷ 12 ÷ 100) |
| **n**  | Total Number of Monthly Payments               |

---

## 🖥 Sample Output (Loan Term in Years)

```text
Please input data one by one to calculate monthly payment

Input your Total Loan Amount
250000

Input the Annual Interest Rate
5

Input 1 for Loan Term in Months
Input 2 for Loan Term in Years

2

Input the Loan Term
30

Your Monthly payment based on Loan Amount $250000.0, Interest Rate 5.0% and Loan Term 30.0 Years = $1342
```

---

## 🖥 Sample Output (Loan Term in Months)

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

---

## ❌ Invalid Input Example

```text
Input 1 for Loan Term in Months
Input 2 for Loan Term in Years

3

Cannot calculate the payment.
Invalid input provided for Loan Term unit.
Please input either '1' for Months or '2' for Years.
```

---

## 📸 Application Screenshot

After uploading a screenshot to your repository, display it like this:

```markdown
![Loan Payment Calculator](images/loan-payment-calculator.png)
```

Example project structure:

```text
SimpleLoanPaymentCalculator/
│── README.md
│── images/
│     └── loan-payment-calculator.png
│── src/
│     └── day3/
│            └── SimpleLoanPaymentCalculator.java
```

---

## ▶️ Running the Application

### Compile

```bash
javac day3/SimpleLoanPaymentCalculator.java
```

### Run

```bash
java day3.SimpleLoanPaymentCalculator
```

---

## 📚 Concepts Demonstrated

* ☕ Java Fundamentals
* 📥 User Input (`Scanner`)
* 🔀 `switch` Statements
* ➗ Financial Calculations
* 📈 Interest Rate Calculations
* 🧮 `Math.pow()` Method
* 💻 Console Applications

---

## 💡 Future Enhancements

* 🎯 Format currency to two decimal places.
* 📊 Display the total interest paid.
* 📅 Generate a complete amortization schedule.
* 🔄 Allow multiple calculations without restarting.
* ✅ Validate negative and invalid input values.
* 🖥 Build a graphical user interface using Java Swing or JavaFX.
* 📄 Export payment details to a text or PDF file.

---

## 📋 Example Inputs

| Loan Amount | Interest Rate | Term      | Monthly Payment |
| ----------- | ------------- | --------- | --------------: |
| $10,000     | 6%            | 36 Months |           ~$304 |
| $250,000    | 5%            | 30 Years  |         ~$1,342 |
| $50,000     | 7%            | 5 Years   |           ~$990 |

---

## 📝 Notes

* Annual interest rate should be entered as a percentage (e.g., **5** for **5%**).
* Loan term may be entered in **months** or **years**.
* Monthly payment is rounded to the nearest whole dollar using `Math.round()`.
* Invalid menu selections are handled gracefully.

---

## 👨‍💻 Author

Ishaq Taj
QA Automation Engineer | Java | Selenium | Test Automation
