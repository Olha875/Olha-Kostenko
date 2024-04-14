package demoQa.test.formsTests;

import demoQa.test.baseTests.BaseTest;
import demoQa.test.baseTests.CalendarPageLocators;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pagesUI.uiTest.baseUrl.baseUrlPage;
import pagesUI.uiTest.forms.practiceFormPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FormTests extends BaseTest {

  @Test
  public void testCalendarForm() {
    String baseUrl = baseUrlPage.getDemoqaBaseUrl();
    String practiceFormUrl = practiceFormPage.getPracticeFormUrl();
    String fullUrl = baseUrl + practiceFormUrl;

    // Змінення адреси URL
    driver.get(fullUrl);

    // Клік на поле вибору дати народження
    WebElement dateOfBirthInput = driver.findElement(CalendarPageLocators.DATE_OF_BIRTH_INPUT);
    dateOfBirthInput.click();

    // Вибір місяця
    WebElement monthSelect = driver.findElement(CalendarPageLocators.MONTH_SELECT);
    Select monthDropdown = new Select(monthSelect);
    monthDropdown.selectByValue("7");

    // Вибір року
    WebElement yearSelect = driver.findElement(CalendarPageLocators.YEAR_SELECT);
    Select yearDropdown = new Select(yearSelect);
    yearDropdown.selectByValue("1900");

    // Вибір дня
    WebElement dayButton = driver.findElement(CalendarPageLocators.DAY_BUTTON);
    dayButton.click();

    // Перевірка, що поле для вибору дати народження заповнено
    assertTrue(dateOfBirthInput.getAttribute("value").length() > 0);
  }
}
