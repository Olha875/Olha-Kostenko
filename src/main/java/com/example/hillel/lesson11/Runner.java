package com.example.hillel.lesson11;

public  class Runner {

  public static void main(String[] args) {

    double radius = 2.0; //  радіус кола
    Circle circle = new Circle(radius); // Створення об'єкту кола з вказаним радіусом
    double area = circle.calculateArea(); // Обчислення площі кола
    System.out.println("Площа кола: " + area);


    // Визначення сторін трикутника
     double base = 2.0;
    double height = 2.0;
    // Створення об'єкту трикутника з вказаними сторонами
    Triangle triangle = new Triangle(base, height);
    // Обчислення площі трикутника
    double triangleArea = triangle.calculateArea();
    System.out.println("Площа трикутника: " + triangleArea);


    // Визначення сторін прямокутника
    double sideA = 2.0;
    double sideB = 2.0;
    // Створення об'єкту прямокутника з вказаними сторонами
    Rectangle rectangle = new Rectangle(sideB, sideA);
    // обчислення площі прямокутника
    double RectangleArea = rectangle.calculateArea();
    System.out.println("Площа прямокутника: " + RectangleArea);
  }

}

