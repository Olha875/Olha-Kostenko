package com.example.hillel.lesson12;

public class Run {
  public static void main(String[] args) {
    // Створюємо об'єкт профілю користувача з початковими значеннями
    UserProfile userProfile = new UserProfile("Hanna Winter", "UY/3763/227", 33);

    // Виведемо значення профілю користувача
    System.out.println("Name: " + userProfile.getName());
    System.out.println("Tax Number: " + userProfile.getTaxNum());
    System.out.println("Age: " + userProfile.getAge());

    // Спроба змінити дані (тест буде падати)
    // Поля final, тому не можуть бути змінені після ініціалізації згідно із умовою задачі
    // userProfile.name = "Anna Summer"; // Помилка: поле name - final
    // userProfile.taxNum = "3434343"; // Помилка: поле taxNum - final
    // userProfile.age = 35; // Помилка: поле age - final і не може бути змінено
  }
}
