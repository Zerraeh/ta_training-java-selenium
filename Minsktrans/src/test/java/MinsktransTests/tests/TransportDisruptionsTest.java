package MinsktransTests.tests;

import MinsktransTests.page.MainPage;
import MinsktransTests.page.MainPageEn;
import MinsktransTests.utils.FindElementUtils;
import MinsktransTests.utils.LoggingUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TransportDisruptionsTest extends CommonConditions{
    final By transportDisruptionLocator = By.xpath("/html/body/header/div[1]");
    @Test(description = "Check if Transport Disruption Div has occurred")
    public void notFoundRoutesPage() {
        LoggingUtils.log("------------------------------------------------");

        LoggingUtils.log("TEST: ");
        LoggingUtils.log("Check if Transport Disruption Div test start...");

        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        LoggingUtils.log("Main page initialized and opened");

        LoggingUtils.log("Assert check if div Transport Disruption appears test");
        Assert.assertNotEquals(FindElementUtils.getWebElement(transportDisruptionLocator, driver), null);
        LoggingUtils.log("TEST check if Transport Disruption appears complete");

        LoggingUtils.log("------------------------------------------------");
    }
}
