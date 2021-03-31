package com.testing.pageObjects.pages;

import org.openqa.selenium.By;

import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/tool-tips")
public class ToolTipsPage extends WidgetsPage {
  // Locators ----------------------------------------------------------------------------------------------------------
  public static By TOOL_TIPS_TITLE = text("Tool Tips");
  public static By HOVER_ME_TO_SEE_BUTTON = css("button[id='toolTipButton']");
  public static By HOVER_ME_TO_SEE_FIELD = css("input[id='toolTipTextField']");
  public static By CONTRARY = text("Contrary");
  // Might be necessary to use a specific xpath selector
  public static By SECTION_11032 = text("1.10.32");
  public static By BUTTON_TOOL_TIP = text("You hovered over the Button");
  public static By TEXT_FIELD_TOOL_TIP = text("You hovered over the text field");
  public static By CONTRARY_TOOL_TIP = text("You hovered over the Contrary");
  public static By SECTION_TOOL_TIP = text("You hovered over the 1.10.32");
  // Public methods ----------------------------------------------------------------------------------------------------
  public void waitForPageToLoad() {
    getElement(TOOL_TIPS_TITLE).waitUntilPresent();
    logWeAreOnPage();
  }
}
