package com.testing.pageObjects.pages;

import org.openqa.selenium.By;

import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/radio-button")
public class RadioButtonPage extends ElementsPage {
  // Locators ----------------------------------------------------------------------------------------------------------
  // Find the selectors for all the elements
  public static By RADIO_BUTTON_TITLE = text("Text Box");
  public static By YES_BUTTON = text("Yes");
  public static By NO_BUTTON = css("[class*='custom-control-input disabled']");
  public static By IMPRESSIVE_BUTTON = text("Impressive");
  //  After user selects an option, result string is shown.
  public static By SELECTED_RESULT = css("[class*='mt-3']");
  // Public methods ----------------------------------------------------------------------------------------------------
  public void waitForPageToLoad() {
    getElement(RADIO_BUTTON_TITLE).waitUntilPresent();
    logWeAreOnPage();
  }
}
