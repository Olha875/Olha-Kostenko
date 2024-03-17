package com.example.hillel.lesson13ex1;

import org.testng.annotations.Test;

import java.util.Scanner;

public class Run {


  public static void main(String[] args) {
    BookWarehouse bookWarehouse = new BookWarehouse();

    Books Books1 = new Books("Kobzar", "UA", "02/02/2023", 345.99);
    Books Books2 = new Books("Constitution of Ukrainian", "UA", "01/02/2024", 294.99);
    Books Books3 = new Books("Tiger Trappers", "UA", "12/04/2021", 232.99);

    // Додаємо книжки
    bookWarehouse.addBook(Books1);
    bookWarehouse.addBook(Books2);
    bookWarehouse.addBook(Books3);

    // Виводимо наявні книжки
    bookWarehouse.displayBooks();

    // Збільшуємо ціну книги "Kobzar" на 10
    bookWarehouse.increasePriceForBook(Books1, 10);

    // Отримуємо нову ціну книги "Kobzar"
    double newPrice = Books1.getPrise(); // Через об'єкт Books1, який представляє книгу "Kobzar"

    // Виводимо нову ціну книги "Kobzar"
    System.out.println("New price for Kobzar: " + newPrice);

    // Вводимо у пошук назву книги, поки не введено "stop"
    String input;
    Scanner scanner = new Scanner(System.in);
    do {
      System.out.println("Enter book's name (type 'stop' to finish)");
      input = scanner.nextLine();
      if (!input.equals("stop")) {
        if (bookWarehouse.searchBook(input)) {
          System.out.println("Book '" + input + "' is in the list.");
        } else {
          System.out.println("Book '" + input + "' is not in the list.");
        }
      }
    } while (!input.equals("stop"));
  }
}



