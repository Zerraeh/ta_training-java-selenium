package MinsktransTests.tests;

import MinsktransTests.page.MainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import MinsktransTests.utils.*;

public class BVIMultipleClickTest extends CommonConditions{
    final By bviOpen = By.className("bvi-open");
    final By bviClose = By.className("bvi-panel-close");
    int count = 3;

    @Test(description = "Check multiple clicks on button \"Версия сайта для слабовидящих\"")
    public void minsktransBlindModeMultipleClick() {
        LoggingUtils.log("------------------------------------------------");

        LoggingUtils.log("TEST: ");
        LoggingUtils.log("BVI test start...");

        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();

        LoggingUtils.log("Main page initialized and opened");


        LoggingUtils.log("clickBlindVersionButtonMultipleTimes of "+count);

        clickBlindVersionButtonMultipleTimes(count);

        LoggingUtils.log("Complete successfully");


        LoggingUtils.log("Assert check in BVI");
        Assert.assertEquals(FindElementUtils.getCountWebElementList(bviClose, driver), count);
        LoggingUtils.log("BVI test complete");
        LoggingUtils.log("------------------------------------------------");
    }

    public void clickBlindVersionButtonMultipleTimes(int count) {
        WebElement blindVersionButton = FindElementUtils.getWebElement(bviOpen, driver);
        for (int i = 0; i < count; i++) {
            blindVersionButton.click();
        }
    }

}
