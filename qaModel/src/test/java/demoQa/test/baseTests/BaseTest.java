package demoQa.test.baseTests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BaseTest {
  protected static WebDriver driver;

  @BeforeAll
  public static void setUp() {
    System.setProperty("webdriver.gecko.driver", "./src/main/resources/new/geckodriver2.exe");
    FirefoxOptions options = new FirefoxOptions();
    options.setBinary("C:/Program Files/Mozilla Firefox/firefox.exe");
    driver = new FirefoxDriver(options);
  }

  @AfterAll
  public static void tearDown() {
    if (driver != null) {
      driver.quit();
    }
  }
}