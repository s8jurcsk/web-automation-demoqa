package com.testing.pageObjects.pages;

import org.openqa.selenium.By;

import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/buttons")
public class ButtonsPage extends ElementsPage {
  // Locators ----------------------------------------------------------------------------------------------------------
  public static By BUTTONS_TITLE = text("Text Box");
  public static By DOUBLE_CLICK_ME_BUTTON = text("Double Click Me");
  public static By RIGHT_CLICK_ME_BUTTON = text("Right Click Me");
  public static By CLICK_ME_BUTTON = text("Click Me");
  // A custom message is thrown each time the user clicks a specific button
  public static By DOUBLE_CLICK_MESSAGE = id("doubleClickMessage");
  public static By RIGHT_CLICK_MESSAGE = id("rightClickMessage");
  public static By DYNAMIC_CLICK_MESSAGE = id("dynamicClickMessage");
  // Public methods ----------------------------------------------------------------------------------------------------
  public void waitForPageToLoad() {
    getElement(BUTTONS_TITLE).waitUntilPresent();
    logWeAreOnPage();
  }
}
