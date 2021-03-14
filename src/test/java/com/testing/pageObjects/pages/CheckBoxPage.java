package com.testing.pageObjects.pages;

import java.util.Map;

import org.openqa.selenium.By;

import io.cucumber.datatable.DataTable;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/checkbox")
public class CheckBoxPage extends ElementsPage {
  // Locators ----------------------------------------------------------------------------------------------------------

  // The button that looks like "Pluss sign"
  public static By EXPAND_BUTTON;
  // Self explanatory
  public static By CHECK_BOX_TITLE;
  // Find selector for each checkbox
  public static By COMMANDS;
  public static By ANGULAR;
  public static By CLASSIFIED;
  public static By EXCEL_FILE;
  // After user selects different options, a string is shown to user containing ALL the selected options.
  public static By RESULT;
  // Public methods ----------------------------------------------------------------------------------------------------
  public void waitForPageToLoad() {
    getElement(CHECK_BOX_TITLE).waitUntilPresent();
    logWeAreOnPage();
  }

  public Boolean validateSelectedResults(DataTable data){
    for (Map<String, String> map : dataToMap(data)) {
      info("Validating item: " + map.get("Item"));
      if(!getElement(RESULT).getText().contains(map.get("Item"))) return false;
    }
    return true;
  }
}
