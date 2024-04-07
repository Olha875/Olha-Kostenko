package com.example.hillel.lesson22;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.FluentWait;
import java.time.Duration;
import java.util.function.Function;

public class TestProgressBar2 {

  public static void main(String[] args) {
    // Налаштування
    System.setProperty("webdriver.gecko.driver", "src/main/resources/new/geckodriver2.exe");
    FirefoxOptions options = new FirefoxOptions();
    options.setBinary("C:/Program Files/Mozilla Firefox/firefox.exe");
    WebDriver driver = new FirefoxDriver(options);
    driver.manage().window().maximize();
    driver.get("https://demoqa.com/progress-bar");

    // Пошук елементів прогрес-бару та кнопки "Старт"
    WebElement progressBar = driver.findElement(By.id("progressBar"));
    WebElement startButton = driver.findElement(By.id("startStopButton"));

    // Натискання на кнопку "Старт"
    startButton.click();

    // Налаштування часу очікування та інтервалу перевірки
    Duration durationTimeout = Duration.ofSeconds(10);
    Duration durationPolling = Duration.ofSeconds(2);

    // Створення FluentWait
    FluentWait<WebDriver> wait = new FluentWait<>(driver)
        .withTimeout(durationTimeout)
        .pollingEvery(durationPolling)
        .ignoring(NoSuchElementException.class);

    // Перевірка зміни значення progressBarValue
    WebElement progressBarValue;
    progressBarValue = wait.until(new Function<WebDriver, WebElement>() {
      public WebElement apply(WebDriver driver) {
        return progressBar.findElement(By.xpath("//*[@aria-valuenow]"));
      }
    });

//    try {
//      Thread.sleep(10000); // 10 секунд
//    } catch (InterruptedException e) {
//      e.printStackTrace();
//    }

    // Отримання та виведення значення прогрес-бару
    String progressValueAfterTenSeconds = progressBarValue.getAttribute("aria-valuenow");
    System.out.println("Значення прогрес-бару:" + progressValueAfterTenSeconds);

    // Закриття браузера
    driver.quit();
  }
}