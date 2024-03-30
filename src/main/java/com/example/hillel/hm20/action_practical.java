package com.example.hillel.hm20;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeClass;
import java.util.ArrayList;


public class action_practical {

  @BeforeClass
  public void setUp() {
    System.setProperty("webdriver.gecko.driver", "src/main/resources/new/geckodriver2.exe");

    // Налаштування
    FirefoxOptions options = new FirefoxOptions();
    options.setBinary("C:/Program Files/Mozilla Firefox/firefox.exe");

    WebDriver driver = new FirefoxDriver(options);
  }

  public static void main(String[] args) {
    WebDriver driver = new FirefoxDriver();

    // 1-ша сторінка
    driver.get("https://www.notino.co.uk/sales/");

    // Відкриття нової вкладки
    ((JavascriptExecutor) driver).executeScript("window.open()");

    // Переключення на нову вкладку
    ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
    driver.switchTo().window(tabs.get(1));

    // 2-га  сторінка
    driver.get("https://www.notino.co.uk/fragrance/");

    // Відкриття нової вкладки
    ((JavascriptExecutor) driver).executeScript("window.open()");

    // Переключення на нову вкладку
    tabs = new ArrayList<>(driver.getWindowHandles());
    driver.switchTo().window(tabs.get(2));

    // 3-тя сторінка
    driver.get("https://www.notino.co.uk/makeup/");

    // Отримання title
    String title = driver.getTitle();
    System.out.println("Title of the page: " + title);

    driver.quit();
  }
}


