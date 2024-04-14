package demoQa.test.baseTests;
import org.openqa.selenium.By;

public class CalendarPageLocators {
  public static final By DATE_OF_BIRTH_INPUT = By.id("dateOfBirthInput");
  public static final By MONTH_SELECT = By.className("react-datepicker__month-select");
  public static final By YEAR_SELECT = By.className("react-datepicker__year-select");
  public static final By DAY_BUTTON = By.xpath("//div[@aria-label='Choose Wednesday, August 1st, 1900']");
}