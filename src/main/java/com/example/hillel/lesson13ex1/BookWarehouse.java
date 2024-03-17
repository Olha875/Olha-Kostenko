package com.example.hillel.lesson13ex1;

import java.util.ArrayList;
import java.util.List;

public class BookWarehouse {
  private List<Books> bookOperations;

  public BookWarehouse() {
    this.bookOperations = new ArrayList<>();
  }

  public void addBook(Books book) {
    bookOperations.add(book);
  }

  public List<Books> getBookOperations() {
    return bookOperations;
  }

  public boolean containsBook(String bookName) {
    for (Books book : bookOperations) {
      if (book.getBookName().equals(bookName)) {
        return true;
      }
    }
    return false;
  }

  // Метод для збільшення ціни книги
  public void increasePriceForBook(Books book, double amount) {
    for (Books b : bookOperations) {
      if (b.equals(book)) {
        b.setPrise(b.getPrise() + amount);
        return;
      }
    }
    System.out.println("Book '" + book.getBookName() + "' not found in the list.");
  }

  // Метод для пошуку книги за назвою
  public boolean searchBook(String bookName) {
    for (Books book : bookOperations) {
      if (book.getBookName().equals(bookName)) {
        return true;
      }
    }
    return false;
  }

  // Метод для виведення всіх книг на складі
  public void displayBooks() {
    for (Books book : bookOperations) {
      System.out.println(book);
    }
  }

}

