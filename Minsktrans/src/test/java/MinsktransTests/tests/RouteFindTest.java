package MinsktransTests.tests;

import MinsktransTests.page.MainPage;
import MinsktransTests.page.MainPageEn;
import MinsktransTests.utils.FindElementUtils;
import MinsktransTests.utils.LoggingUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RouteFindTest extends CommonConditions{
    final By searchBarLocator = By.xpath("/html/body/div[2]/div/div[2]/div[3]/input");
    final By searchResultLocator = By.xpath("//*[@id=\"routeList\"]/a/h3");
    @Test
    public void RouteInsertTest() {
        LoggingUtils.log("------------------------------------------------");
        LoggingUtils.log("TEST: ");
        LoggingUtils.log("En page load test start...");

        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        LoggingUtils.log("Main page initialized and opened");

        driver.navigate().to("https://minsktrans.by/lookout_yard/Home/Index/minsk#/routes/bus");
        LoggingUtils.log("Redirection complete");

        WebElement searchBar = FindElementUtils.getWebElement(searchBarLocator, driver);
        LoggingUtils.log("SearchBar Found");

        searchBar.sendKeys("133");
        WebElement searchResult = FindElementUtils.getWebElement(searchResultLocator, driver);

        Assert.assertNotEquals(searchResult, null);
    }
}
