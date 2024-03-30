package com.example.hillel.lesson14;


public class Pass {

  private String password;

  public Pass(String password) {
    this.password = password;
  }
  public String validatePassword() throws WeakPasswordException {

    String validation = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]+$";

    if (!password.matches(validation)) {
      return "Password validation failed: must contain at least one lowercase letter, one uppercase letter, and one digit";
    }
    if (password.length() < 8) {
      throw new WeakPasswordException("Password validation failed: Password must be at least 8 characters long");
    }
    return "Password is valid";
  }

  public static void main(String[] args) {
    String password = "Ww2";
    Pass pass = new Pass(password);
    try {
      String validationResult = pass.validatePassword();
      System.out.println(validationResult);
    } catch (WeakPasswordException e) {
      System.out.println("Fail: " + e.getMessage());
    }
  }
}
