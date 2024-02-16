package com.example.hillel.lesson10;

public class Customer {

  public static void main(String[] args) {

    // об'єкти рахунків клієнта, перша  та друга  карточки
    BankAccount bankAccountCurrent = new BankAccount(32332553, 200.0);
    SavingsAccount bankAccountSavings = new SavingsAccount(33256789, 130.0, 2); // Передаємо відсоткову ставку для картки Savings

    // Створюємо клієнта та додаємо рахунки
    Customer customer = new Customer();
    customer.addAccount(bankAccountCurrent);
    customer.addAccount(bankAccountSavings);

    // Перевірка початкових балансів рахунків
    System.out.println("Початковий баланс поточного рахунку: " + bankAccountCurrent.getBalance());
    System.out.println("Початковий баланс рахунку збережень: " + bankAccountSavings.getBalance());

    // операції внесення грошей  deposit та зняття cash для поточного рахунку
    bankAccountCurrent.deposit(80);
    bankAccountCurrent.cash(10);

    // операції внесення та зняття  для рахунку із збереженнями із урахуванням відцоткової ставки
    bankAccountSavings.deposit(30);
    bankAccountSavings.cash(10);

    // Перевірка кінцевих балансів рахунків
    System.out.println("Кінцевий баланс поточного рахунку: " + bankAccountCurrent.getBalance());
    System.out.println("Кінцевий баланс рахунку збережень: " + bankAccountSavings.getBalance());
  }

  // Метод для додавання рахунку клієнту
  public void addAccount(BankAccount account) {
  }

}
