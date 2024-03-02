package com.example.hillel.lesson13ex1;

import java.util.List;

public class UpdPrise {
  private List<Books> bookOperationsUpd;

  public UpdPrise(List<Books> books) {
    this.bookOperationsUpd = books;
  }

  public void increasePriceForKobzar(double amount) {
    for (Books book : bookOperationsUpd) {
      if (book.getBookName().equals("Kobzar")) {
        book.setPrise(book.getPrise() + amount);
      }
    }
  }
}