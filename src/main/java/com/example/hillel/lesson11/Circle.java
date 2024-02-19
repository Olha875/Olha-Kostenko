package com.example.hillel.lesson11;

public class Circle extends Shape {

  private double radius; // Радіус кола

  public Circle(double radius) {
    this.radius = radius;;
  }

  @Override
  double calculateArea() {
    return radius * radius * Math.PI;
  }

}
