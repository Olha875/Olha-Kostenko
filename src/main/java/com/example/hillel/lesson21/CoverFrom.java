package com.example.hillel.lesson21;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;

public class CoverFrom {


  @BeforeClass
  public void setUp() {

    // Налаштування
    System.setProperty("webdriver.gecko.driver", "src/main/resources/new/geckodriver2.exe");
    FirefoxOptions options = new FirefoxOptions();
    options.setBinary("C:/Program Files/Mozilla Firefox/firefox.exe");

  }

  public static void main(String[] args) {
    WebDriver driver = new FirefoxDriver();

    // Максимізація вікна
    driver.manage().window().maximize();

    String pageSelect = "https://demoqa.com/automation-practice-form";

    try {

      driver.get(pageSelect);

      // Форма "Завантажити файлик"
      WebElement btnAddFile = driver.findElement(By.id("uploadPicture"));
      btnAddFile.sendKeys("C:\\Users\\user\\IdeaProjects\\hillel\\src\\main\\java\\com\\example\\hillel\\lesson21\\testFile");
      Thread.sleep(5000);


      //  Поля "State" and "Сity"
      WebElement dropdown = driver.findElement(By.xpath("//*[@class=' css-1wy0on6']"));
      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropdown);
      dropdown.click();
      WebElement dropdownValue = driver.findElement(By.xpath("//*[contains(text(), 'NCR')]"));
      dropdownValue.click();
      Thread.sleep(5000);

      WebElement dropdown2 = driver.findElement(By.xpath("//*[contains(text(),'Select City')]"));
      dropdown2.click();
      WebElement dropdownValue2 = driver.findElement(By.xpath("//*[contains(text(), 'Delhi')]"));
      dropdownValue2.click();
      Thread.sleep(5000);


      // Форма "Календар"
      WebElement dateOfBirthInput = driver.findElement(By.id("dateOfBirthInput"));
      dateOfBirthInput.click();
      WebElement monthSelect = driver.findElement(By.className("react-datepicker__month-select"));
      Select monthDropdown = new Select(monthSelect);
      Thread.sleep(5000);
      // Місяць
      monthDropdown.selectByValue("7");
      // Рік
      WebElement yearSelect = driver.findElement(By.className("react-datepicker__year-select"));
      Select yearDropdown = new Select(yearSelect);
      yearDropdown.selectByValue("1900");
      // День
      WebElement dayButton = driver.findElement(By.xpath("//div[@aria-label='Choose Wednesday, August 1st, 1900']"));
      dayButton.click();


      // Форма "Subject"
      WebElement subjectInput = driver.findElement(By.id("subjectsInput"));
      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", subjectInput);
      subjectInput.sendKeys("M");
      Thread.sleep(5000);
      WebElement mathsOption = driver.findElement(By.id("react-select-2-option-0"));
      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", mathsOption);
      mathsOption.click();


      // Інше
      WebElement inputUserName = driver.findElement(By.id("firstName"));
      WebElement inputUserLastName = driver.findElement(By.id("lastName"));
      WebElement inputEmail = driver.findElement(By.id("userEmail"));
      WebElement inputMobile = driver.findElement(By.id("userNumber"));
      WebElement inputAddress = driver.findElement(By.id("currentAddress"));
      WebElement pageCheckButton = driver.findElement(By.xpath("//*[@for='hobbies-checkbox-3']/parent::*"));
      WebElement pageRadioButton = driver.findElement(By.xpath("//*[@for='gender-radio-2']/parent::*"));

      inputUserName.sendKeys("Ann");
      Thread.sleep(5000);

      inputUserLastName.sendKeys("Summer");
      Thread.sleep(5000);

      inputEmail.sendKeys("ann.summer@gmail.com");
      Thread.sleep(5000);

      inputMobile.sendKeys("1234567890");
      Thread.sleep(5000);

      inputAddress.sendKeys("Address example");
      Thread.sleep(5000);

      pageCheckButton.click();
       Thread.sleep(5000);

      pageRadioButton.click();
      Thread.sleep(5000);


    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    finally {

      driver.quit();

    }

  }
}
