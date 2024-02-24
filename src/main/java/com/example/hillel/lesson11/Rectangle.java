package com.example.hillel.lesson11;

public class Rectangle  extends Shape {

  double sideA;// Сторона прямокутника A
  double sideB; // Сторона прямокутника B

  // Конструктор класу Triangle для сторін прямокутника A, B
  public Rectangle (double sideA, double sideB) {
    this.sideA = sideA;
    this.sideB = sideB;
  }


  @Override
    // Перевизначений метод для обчислення площі прямокутника
  double calculateArea() {
    // Площуа прямокутника за формулою S =a*b
    return sideA*sideB;
  }

}
