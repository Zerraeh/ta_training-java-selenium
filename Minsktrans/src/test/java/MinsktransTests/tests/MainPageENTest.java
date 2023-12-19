package MinsktransTests.tests;

import MinsktransTests.page.MainPageEn;
import MinsktransTests.utils.FindElementUtils;
import MinsktransTests.utils.LoggingUtils;
import org.testng.Assert;
import MinsktransTests.page.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainPageENTest extends CommonConditions{
    @Test(description = "En page load test")
    public void getEnPageLoad()
    {
        LoggingUtils.log("------------------------------------------------");
        LoggingUtils.log("TEST: ");
        LoggingUtils.log("En page load test start...");

        MainPageEn mainPageEn = new MainPageEn(driver);
        mainPageEn.openPage();
        LoggingUtils.log("Main page initialized and opened");

        Assert.assertNotEquals(mainPageEn, null);
        LoggingUtils.log("------------------------------------------------");
    }
}
