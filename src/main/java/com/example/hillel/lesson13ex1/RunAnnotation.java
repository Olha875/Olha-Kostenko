package com.example.hillel.lesson13ex1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RunAnnotation {

  // Додаємо анотації
  @BeforeMethod
  public void setUp() {
    System.out.println("Початок тесту");
  }

  // Додаємо анотації
  @AfterMethod
  public void tearDown() {
    System.out.println("Тест завершено");
  }

  // Тест для додавання книги "Кобзар" та виводу оновленого інфо по всім
  @Test(dataProvider = "addBook")
  public void testAddBook_Kobzar(String bookName, String date, double price) {
    BookWarehouse bookWarehouse = new BookWarehouse();
    Books Books1 = new Books(bookName, "UA", date, price);
    bookWarehouse.addBook(Books1);
    bookWarehouse.displayBooks();
  }

  // Тест для додавання книги "Конституція України" та виводу оновленого інфо по всім
  @Test(dataProvider = "addBook")
  public void testAddBook_Constitution(String bookName, String date, double price) {
    BookWarehouse bookWarehouse = new BookWarehouse();
    Books Books2 = new Books(bookName, "UA", date, price);
    bookWarehouse.addBook(Books2);
    bookWarehouse.displayBooks();
  }

  // Тест для додавання книги "Тигролови" та виводу оновленого інфо по всім
  @Test(dataProvider = "addBook")
  public void testAddBook_TigerTrappers(String bookName, String date, double price) {
    BookWarehouse bookWarehouse = new BookWarehouse();
    Books Books3 = new Books(bookName, "UA", date, price);
    bookWarehouse.addBook(Books3);
    bookWarehouse.displayBooks();
  }

  // Тест для збільшення ціни книг
  @Test(dataProvider = "addBook")
  public void testIncreasePrice(String bookName, String date, double price) {
    BookWarehouse bookWarehouse = new BookWarehouse();
    Books book = new Books(bookName, "UA", date, price);
    bookWarehouse.addBook(book);
    bookWarehouse.increasePriceForBook(book, 10);
    double newPrice = book.getPrise(); // Отримуємо нову ціну після збільшення
    System.out.println("Нова ціна для " + bookName + ": " + newPrice);
  }

  // Провайдер даних для всіх тестів
  @DataProvider
  public Object[][] addBook() {
    return new Object[][]{
        {"Kobzar", "02/02/2023", 345.99},
        {"Constitution of Ukrainian", "01/02/2024", 294.99},
        {"Tiger Trappers", "12/04/2021", 232.99},
    };
  }
}