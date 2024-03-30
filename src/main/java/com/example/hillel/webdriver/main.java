package com.example.hillel.webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class main {

  public static void main(String[] args) {
    System.setProperty("webdriver.gecko.driver", "src/main/resources/new/geckodriver2.exe");

    // Налаштування для використання браузера Firefox
    FirefoxOptions options = new FirefoxOptions();
    options.setBinary("C:/Program Files/Mozilla Firefox/firefox.exe");

    // Instantiate FirefoxDriver with FirefoxOptions
    WebDriver driver = new FirefoxDriver(options);

    driver.get("https://rozetka.com.ua/");

    System.out.println("Сторінка відкрита!");

    driver.quit();
  }
}