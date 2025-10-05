# Bank Account (Java)

A simple object‑oriented model of bank accounts implemented in Java. It includes a base `BankAccount` and two specialized account types: `CheckingAccount` and `SavingsAccount`.

## Project Structure

```
Bank-Account-main/
├── BankAccount.java
├── CheckingAccount.java
└── SavingsAccount.java
```

## What’s Included

- **BankAccount**: base class with `getBalance()`, `deposit(amount)`, `withdraw(amount)`.
- **CheckingAccount**: extends `BankAccount`; tracks transactions and supports `deductFees()` (after a number of free transactions, fees can be applied).
- **SavingsAccount**: extends `BankAccount`; supports `addInterest()` to apply interest to the current balance.

## Getting Started

1. Ensure you have Java (JDK 8+).
2. Open a terminal in the project folder.

### Build & Run

```bash
# Compile
javac *.java

# Run (if you create Main.java like in the example below)
java Main
```

### Example Usage

Create a `Main.java` (example below), compile, and run:

```java
// Main.java — minimal demo
public class Main {
    public static void main(String[] args) {
        BankAccount base = new BankAccount(1000.0);
        base.deposit(250.0);
        base.withdraw(100.0);
        System.out.println(base); // e.g., balance=1150.0

        CheckingAccount chk = new CheckingAccount(500.0, 3, 2.0);
        chk.deposit(50.0);
        chk.withdraw(20.0);
        chk.withdraw(10.0);
        chk.withdraw(5.0);
        // Apply fees after free transactions are used
        chk.deductFees();
        System.out.println(chk);

        SavingsAccount sav = new SavingsAccount(1000.0, 0.05); // 5% interest
        sav.addInterest();
        System.out.println(sav);
    }
}

```

### Class Summaries

- **BankAccount**
  - `BankAccount(double balance)` — create with starting balance.
  - `double getBalance()` — current balance.
  - `void deposit(double amount)` — add funds.
  - `void withdraw(double amount)` — remove funds.
  - `String toString()` — human‑readable view of the account.

- **CheckingAccount** (extends `BankAccount`)
  - `CheckingAccount(double balance, int freeTransactions, double feePerTransaction)` — set an initial balance, number of free transactions, and per‑transaction fee.
  - `void deposit(double amount)` — deposit (counts toward transactions).
  - `void withdraw(double amount)` — withdraw (counts toward transactions).
  - `void deductFees()` — apply fees for transactions beyond the free limit.
  - `String toString()`

- **SavingsAccount** (extends `BankAccount`)
  - `SavingsAccount(double balance, double interestRate)` — set balance and interest rate (e.g., `0.05` for 5%).
  - `void addInterest()` — apply interest to the current balance.
  - `String toString()`

## Notes

- There is no `Main` class included in the repository; the snippet above provides a minimal example of how to instantiate and use the classes.
- Monetary amounts are represented with `double` for simplicity in this educational example.

