package com.example.hillel.lesson10;

public class BankAccount {

  private int accountNumber; // Номер рахунку
  private double balance;    // Залишок на рахунку


  // Конструктор класу
  public BankAccount(int accountNumber, double initialBalance) {
    this.accountNumber = accountNumber;
    this.balance = initialBalance;
  }
  // Метод для отримання балансу
  public double getBalance() {
    return balance;

  }
  // Метод для зарахування коштів
  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println(amount + "Balance updated");
    } else {
      System.out.println("Error of balance updated");
    }
  }

  // Метод для зняття коштів
  public void cash(double amount) {
    if (amount > 0 && balance >= amount) {
      balance -= amount;
      System.out.println(amount + "Withdrawal");
    } else {
      System.out.println("Error of withdrawal");
    }

  }
}
