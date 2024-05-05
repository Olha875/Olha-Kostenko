package com.example.hillel.lesson21;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;


public class CoverFrom {

  public static void main(String[] args) {
    System.setProperty("webdriver.gecko.driver", "src/main/resources/new/geckodriver2.exe");
    FirefoxOptions options = new FirefoxOptions();
    options.setBinary("C:/Program Files/Mozilla Firefox/firefox.exe");

    WebDriver driver = new FirefoxDriver(options);
    driver.manage().window().maximize();

    String pageSelect = "https://demoqa.com/automation-practice-form";

    try {
      driver.get(pageSelect);

      // Форма "Завантажити файлик"
      WebElement btnAddFile = driver.findElement(By.id("uploadPicture"));
      btnAddFile.sendKeys("C:\\Users\\user\\IdeaProjects\\hillel\\src\\main\\java\\com\\example\\hillel\\lesson21\\testFile");

      //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4)); //  WebDriverWait

      //  Поля "State" and "Сity"
      WebElement dropdown = driver.findElement(By.xpath("//*[@class=' css-1wy0on6']"));
      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropdown);
      dropdown.click();
      WebElement dropdownValue = driver.findElement(By.xpath("//*[contains(text(), 'NCR')]"));
      dropdownValue.click();
      //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Select City')]"))); // додано очікування

      WebElement dropdown2 = driver.findElement(By.xpath("//*[contains(text(),'Select City')]"));
      dropdown2.click();
      WebElement dropdownValue2 = driver.findElement(By.xpath("//*[contains(text(), 'Delhi')]"));
      dropdownValue2.click();
     // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dateOfBirthInput"))); // додано очікування

      // Форма "Календар"
      WebElement dateOfBirthInput = driver.findElement(By.id("dateOfBirthInput"));
      dateOfBirthInput.click();

      // Місяць
      WebElement monthSelect = driver.findElement(By.className("react-datepicker__month-select"));
      Select monthDropdown = new Select(monthSelect);
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
     // wait.until(ExpectedConditions.elementToBeClickable(By.id("react-select-2-option-0"))); // додано очікування
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
      //wait.until(ExpectedConditions.elementToBeClickable(inputUserLastName)); // додано очікування
      inputUserLastName.sendKeys("Summer");
      //wait.until(ExpectedConditions.elementToBeClickable(inputEmail)); /// додано очікування
      inputEmail.sendKeys("ann.summer@gmail.com");
      //wait.until(ExpectedConditions.elementToBeClickable(inputMobile)); // додано очікування
      inputMobile.sendKeys("1234567890");
      //wait.until(ExpectedConditions.elementToBeClickable(inputAddress)); // додано очікування
      inputAddress.sendKeys("Address example");
      //wait.until(ExpectedConditions.elementToBeClickable(pageCheckButton)); // додано очікування
      pageCheckButton.click();
     // wait.until(ExpectedConditions.elementToBeClickable(pageRadioButton)); // додано очікування
      pageRadioButton.click();
    } finally {
      driver.quit();
    }
  }
}