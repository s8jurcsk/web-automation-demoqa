package com.testing.pageObjects.pages;

import org.openqa.selenium.By;

import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/radio-button")
public class RadioButtonPage extends ElementsPage {
  // Locators ----------------------------------------------------------------------------------------------------------
  // Find the selectors for all the elements
  public static By RADIO_BUTTON_TITLE;
  public static By YES_BUTTON;
  public static By NO_BUTTON;
  public static By IMPRESSIVE_BUTTON;
  //  After user selects an option, result string is shown.
  public static By SELECTED_RESULT;
  // Public methods ----------------------------------------------------------------------------------------------------
  public void waitForPageToLoad() {
    getElement(RADIO_BUTTON_TITLE).waitUntilPresent();
    logWeAreOnPage();
  }
}
