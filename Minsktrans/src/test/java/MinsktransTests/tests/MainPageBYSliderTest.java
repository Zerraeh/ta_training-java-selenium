package MinsktransTests.tests;

import MinsktransTests.page.MainPage;
import MinsktransTests.page.MainPageBy;
import MinsktransTests.page.MainPageEn;
import MinsktransTests.utils.FindElementUtils;
import MinsktransTests.utils.LoggingUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainPageBYSliderTest extends CommonConditions{
    final By sliderLocator = new By.ByClassName("slider-home");
    @Test(description = "BY page load test and slider check")
    public void getEnPageLoad()
    {
        LoggingUtils.log("------------------------------------------------");
        LoggingUtils.log("TEST: ");
        LoggingUtils.log("En page load test start...");

        MainPageBy mainPageBy = new MainPageBy(driver);
        mainPageBy.openPage();
        LoggingUtils.log("Main page initialized and opened");

        Assert.assertEquals(FindElementUtils.getWebElement(sliderLocator, driver), null);
        LoggingUtils.log("------------------------------------------------");
    }
}
