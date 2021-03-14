package com.testing.pageObjects.pages;

import org.openqa.selenium.By;

import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/buttons")
public class ButtonsPage extends ElementsPage {
  // Locators ----------------------------------------------------------------------------------------------------------
  public static By BUTTONS_TITLE;
  public static By DOUBLE_CLICK_ME_BUTTON;
  public static By RIGHT_CLICK_ME_BUTTON;
  public static By CLICK_ME_BUTTON;
  // A custom message is thrown each time the user clicks a specific button
  public static By DOUBLE_CLICK_MESSAGE;
  public static By RIGHT_CLICK_MESSAGE;
  public static By DYNAMIC_CLICK_MESSAGE;
  // Public methods ----------------------------------------------------------------------------------------------------
  public void waitForPageToLoad() {
    getElement(BUTTONS_TITLE).waitUntilPresent();
    logWeAreOnPage();
  }
}
