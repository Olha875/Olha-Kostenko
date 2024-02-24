package com.example.hillel.lesson11;

public class Triangle extends Shape {

  double base; //  довжина сторони трикутника, до якої проведена висота
  double height; // Висота трикутника

  // Конструктор класу Triangle для  сторони і висоти
  public Triangle(double base, double height) {
    this.base = base;
    this.height = height;
  }

    @Override
    // метод обчислення площі трикутника,
      // що дорівнює половині добутку довжини сторони трикутника та довжини проведеної до цієї сторони висоти
    double calculateArea () {
      // Площа трикутника визначаэться за формулою S = (1/2) * a * h, де a - база, h - висота
      return (0.5) * base * height;
    }

  }
