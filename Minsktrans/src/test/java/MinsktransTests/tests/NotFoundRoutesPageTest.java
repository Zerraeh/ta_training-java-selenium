package MinsktransTests.tests;
import MinsktransTests.page.*;

import MinsktransTests.utils.FindElementUtils;
import MinsktransTests.utils.LoggingUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NotFoundRoutesPageTest extends CommonConditions{
    final By notFoundElementLocator = By.xpath("//*[@id='inner_page']/div/main/figure");
    @Test(description = "Check if 404 on en version slider->page")
    public void notFoundRoutesPage() {
        LoggingUtils.log("------------------------------------------------");

        LoggingUtils.log("TEST: ");
        LoggingUtils.log("Check if 404 on en version page test start...");

        MainPageEn mainPageEn = new MainPageEn(driver);
        mainPageEn.openPage();

        LoggingUtils.log("Main page initialized and opened");
        LoggingUtils.log("Assert check it 404 test");
        Assert.assertNotEquals(FindElementUtils.getWebElement(notFoundElementLocator, driver), null);
        LoggingUtils.log("TEST check if 404 complete");

        LoggingUtils.log("------------------------------------------------");
    }
}
