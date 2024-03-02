package com.example.hillel.lesson13ex1;

public class Books {


  public final String bookName;
  private final String manufacture;
  private final String date;
  public double prise;

  // Додаємо конструктор для параметрів
  public Books(String bookName, String manufacture, String date, double prise ) {
    this.bookName = bookName;
    this.manufacture = manufacture;
    this.date = date;
    this.prise = prise;
  }

  public void setPrise(double prise) {
    this.prise = prise;
  }

  public String getManufacture() {
    return manufacture;
  }

  public String getDate() {
    return date;
  }

  public double getPrise() {
    return prise;
  }


  public String getBookName() {
    return bookName;
  }

  @Override
  public String toString() {
    return "BookShop{" +
        "bookName='" + bookName + '\'' +
        ", manufacture='" + manufacture + '\'' +
        ", date='" + date + '\'' +
        ", prise=" + prise +
        '}';
  }
}





