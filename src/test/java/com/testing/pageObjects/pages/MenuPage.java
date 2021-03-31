package com.testing.pageObjects.pages;

import org.openqa.selenium.By;

import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/menu")
public class MenuPage extends WidgetsPage {
  // Locators ----------------------------------------------------------------------------------------------------------
  public static By MENU_TITLE = text("Menu");
  public static By MAIN_ITEM_1 = xpath("//div[@class='nav-menu-container']/ul/li[1]");
  public static By MAIN_ITEM_2 = xpath("//div[@class='nav-menu-container']/ul/li[2]");
  public static By MAIN_ITEM_3 = xpath("//div[@class='nav-menu-container']/ul/li[3]");
  // Might be necessary to use a xpath selector
  public static By SUB_SUB_LIST = xpath("//div[@class='nav-menu-container']/ul/li[2]/ul/li[3]");
  public static By SUB_SUB_ITEM_1 = xpath("//div[@class='nav-menu-container']/ul/li[2]/ul/li[3]/ul/li[1]");
  public static By SUB_SUB_ITEM_2 = xpath("//div[@class='nav-menu-container']/ul/li[2]/ul/li[3]/ul/li[2]");
  // Public methods ----------------------------------------------------------------------------------------------------
  public void waitForPageToLoad() {
    getElement(MENU_TITLE).waitUntilPresent();
    logWeAreOnPage();
  }
}
