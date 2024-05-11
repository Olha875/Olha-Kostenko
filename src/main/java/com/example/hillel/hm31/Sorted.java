package com.example.hillel.hm31;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class Sorted {

  private static final SelenideElement USERNAME_INPUT = $("#user-name");
  private static final SelenideElement PASSWORD_INPUT = $("#password");
  private static final SelenideElement LOGIN_BUTTON = $("#login-button");
  private static final SelenideElement SELECT_SORT = $(".product_sort_container");
  private static final ElementsCollection LIST_NAMES = $$(".inventory_item");


  @BeforeClass
  public static void setUp() {
    Configuration.browser = "firefox";
    Configuration.timeout = 5000;
    Configuration.browserSize = "1920x1080";

    open("https://www.saucedemo.com/v1/index.html");
    USERNAME_INPUT.setValue("standard_user");
    PASSWORD_INPUT.setValue("secret_sauce");
    LOGIN_BUTTON.click();
  }


  @Test
  public void testSortedAZ() {
    SELECT_SORT.shouldBe(visible);
    SELECT_SORT.selectOption("Name (A to Z)");
    LIST_NAMES.shouldHave(CollectionCondition.sizeGreaterThan(0));

    List<String> names = new ArrayList<>();

    for (SelenideElement nameElement : LIST_NAMES) {
      String nameText = nameElement.getText();
      names.add(nameText);
    }

    System.out.println("List A to Z :");
    names.forEach(System.out::println);

    boolean isSorted = names.stream().sorted().collect(Collectors.toList()).equals(names);
    Assert.assertTrue(isSorted, "The list is not sorted A to Z");
  }


  @Test
  public void testSortedZA() {
    SELECT_SORT.shouldBe(visible);
    SELECT_SORT.selectOption("Name (Z to A)");
    LIST_NAMES.shouldHave(CollectionCondition.sizeGreaterThan(0));

    List<String> names = new ArrayList<>();

    for (SelenideElement nameElement : LIST_NAMES) {
      String nameText = nameElement.getText();
      names.add(nameText);
    }

    System.out.println("Name (Z to A)");
    names.forEach(System.out::println);

    boolean isSorted = names.stream().sorted().collect(Collectors.toList()).equals(names);
    Assert.assertFalse(isSorted, "The list is not sorted Z to A");
  }

}



