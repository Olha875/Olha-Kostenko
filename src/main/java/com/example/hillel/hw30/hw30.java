package com.example.hillel.hw30;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class hw30 {

  @Test
  public void tests() {
    Configuration.browser = "firefox";
    Configuration.timeout = 5000;
    Configuration.browserSize = "1920x1080";
    open("https://demoqa.com/automation-practice-form");

    // Завантити файл

     $("#uploadPicture").uploadFile(new File("C:\\Users\\user\\IdeaProjects\\hillel\\src\\main\\java\\com\\example\\hillel\\lesson21\\testFile"));

    // Поля "State" and "Сity"

    $x("//*[@class=' css-1wy0on6']").scrollIntoView(true).click();
    $x("//*[contains(text(), 'NCR')]").click();
    $x("//*[contains(text(),'Select City')]").click();
    $x("//*[contains(text(), 'Delhi')]").click();

    // Загальні відомості

    $("#firstName").setValue("Ann");
    $("#lastName").setValue("Black");
    $("#userEmail").setValue("test@gmail.com");
    $("label[for='gender-radio-2']").click();
    $("#userNumber").setValue("123456789");
    $x("//*[@for='hobbies-checkbox-3']/parent::*").click();
    $("#currentAddress").setValue("TestAddress");


    // Форма календар

    $("#dateOfBirthInput").click();
    $(".react-datepicker__year-select").selectOption("1900");
    $(".react-datepicker__month-select").selectOption("January");
    $(".react-datepicker__day--001").click();

    // Subjects

    $("#subjectsInput").shouldBe(visible);
    $("#subjectsInput").sendKeys("M");
    $("#react-select-2-option-0").shouldBe(visible).click();

  }

}
