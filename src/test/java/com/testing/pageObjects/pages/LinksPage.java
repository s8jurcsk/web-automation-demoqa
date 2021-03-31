package com.testing.pageObjects.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


/**
 * @run
 *    Scenario: Links
 *      When I click "Links option"
 *      And  I double click "Created"
 *      Then "Created Message" should be "visible"
 *      And  I double click "Moved"
 *      Then "Moved Message" should be "visible"
 *      And  I double click "Forbidden"
 *      Then "Forbidden Message" should be "visible"
 *      And  I double click "Not Found"
 *      Then "Not Found Message" should be "visible"
 */
@DefaultUrl("/links")
public class LinksPage extends ElementsPage {
  // Locators ----------------------------------------------------------------------------------------------------------
  public static By LINKS_TITLE = text("Links");
  public static By CREATED_LINK = id("created");
  public static By MOVED_LINK = id("moved");
  public static By FORBIDDEN_LINK = id("forbidden");
  public static By NOT_FOUND_LINK = id("invalid-url");
  public static By LINK_MESSAGE = id("linkResponse");

  public void waitForPageToLoad() {
    getElement(LINKS_TITLE).waitUntilPresent();
    logWeAreOnPage();
  }
}
