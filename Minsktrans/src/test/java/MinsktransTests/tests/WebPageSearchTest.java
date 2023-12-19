package MinsktransTests.tests;

import MinsktransTests.page.MainPage;
import MinsktransTests.utils.FindElementUtils;
import MinsktransTests.utils.LoggingUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class WebPageSearchTest extends CommonConditions{
    final By searchBarLocator = By.xpath("//*[@id=\"s\"]");
    final By searchButtonLocator = By.xpath("//*[@id=\"searchsubmit\"]");
    final By searchResultLocator = By.xpath("//*[@id=\"inner_page\"]/div/div/h1");

    @Test(description = "")
    public void searchInputTest()
    {
        LoggingUtils.log("------------------------------------------------");

        LoggingUtils.log("TEST: ");
        LoggingUtils.log("Webpage search test start...");

        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();

        LoggingUtils.log("Main page initialized and opened");


        WebElement searchBar = FindElementUtils.getWebElement(searchBarLocator, driver);
        WebElement searchButton = FindElementUtils.getWebElement(searchButtonLocator, driver);

        LoggingUtils.log("searchBar and searchButton found");

        searchBar.sendKeys("AAA");
        searchButton.click();
        LoggingUtils.log("Search complete");

        WebElement searchResult = FindElementUtils.getWebElement(searchResultLocator,driver);
        LoggingUtils.log("Search result found");
        LoggingUtils.log("Assert check in test...");

        Assert.assertNotEquals(searchResult,null);
        LoggingUtils.log("Webpage search test complete");
        LoggingUtils.log("------------------------------------------------");
    }
}
