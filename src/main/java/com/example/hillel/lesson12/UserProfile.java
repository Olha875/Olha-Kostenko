package com.example.hillel.lesson12;

public class UserProfile {

  // Поля профілю користувача, які не повинні змінюватись після ініціалізації
  private final String name;
  private final String taxNum;
  private final int age;

  // Конструктор класу
  public UserProfile(String name, String taxNum, int age) {
    this.name = name;
    this.taxNum = taxNum;
    this.age = age;
  }

  // Методи для отримання інформації про користувача
  public String getName() {
    return name;
  }

  public String getTaxNum() {
    return taxNum;
  }

  public int getAge() {
    return age;
  }

}




