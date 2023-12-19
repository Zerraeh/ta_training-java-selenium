package MinsktransTests.tests;

import MinsktransTests.page.MainPage;
import MinsktransTests.page.MainPageEn;
import MinsktransTests.utils.FindElementUtils;
import MinsktransTests.utils.LoggingUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RouteRedirrectionTest extends CommonConditions{
    final By routePageUniqueElementLocator = By.xpath("/html/body/div[1]/div/div/a[2]");
    @Test(description = "Route page redirection test")
    public void getRoutePageLoad()
    {
        LoggingUtils.log("------------------------------------------------");
        LoggingUtils.log("TEST: ");
        LoggingUtils.log("En page load test start...");

        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        LoggingUtils.log("Main page initialized and opened");

        driver.navigate().to("https://minsktrans.by/lookout_yard/Home/Index/minsk#/routes/bus");
        LoggingUtils.log("Redirection complete");


        Assert.assertNotEquals(FindElementUtils.getWebElement(routePageUniqueElementLocator,driver), null);
        LoggingUtils.log("------------------------------------------------");
    }
}
