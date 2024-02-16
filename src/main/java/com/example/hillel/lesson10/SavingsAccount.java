package com.example.hillel.lesson10;

//Спеціалізований клас для збереження, який наслідує BankAccount.
  public class SavingsAccount extends BankAccount{
  private double interestRate; // Відсоткова ставка

  public SavingsAccount(int accountNumber, double initialBalance, double interestRate) {
    super(accountNumber, initialBalance);
    this.interestRate = interestRate;
  }

  @Override
  public void cash(double amount) {
    double amountWithInterest = amount * (1 + interestRate / 100);
    super.cash(amountWithInterest);
  }

}
