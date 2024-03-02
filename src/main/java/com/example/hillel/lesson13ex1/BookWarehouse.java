package com.example.hillel.lesson13ex1;

import java.util.ArrayList;
import java.util.List;

public class BookWarehouse {
  List<Books> bookOperations;

  public BookWarehouse()
  {
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

  // метод для виводу книжок
  public void displayBooks() {
    for (Books book : bookOperations) {
      System.out.println(book);
    }

  }
}

