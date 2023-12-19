package MinsktransTests.tests;

import MinsktransTests.page.MainPage;
import MinsktransTests.utils.FindElementUtils;
import MinsktransTests.utils.LoggingUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UniformInformationDayTest extends CommonConditions{
    final By uniformInformationDayLocator = By.xpath("//*[@id=\"content\"]/div[3]/div[1]");
    @Test(description = "Check on opening uniform information day")
    public void uniformInformationDayLoad() {
        LoggingUtils.log("------------------------------------------------");

        LoggingUtils.log("TEST: ");
        LoggingUtils.log("Uniform Information Day test start...");

        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();

        LoggingUtils.log("Main page initialized and opened");


        LoggingUtils.log("Click on redirect link");
        driver.navigate().to("https://minsk.gov.by/ru/actual/view/209/2023.shtml");
        LoggingUtils.log("Redirect complete successfully");

        LoggingUtils.log("Find Uniform Information Day unique element");
        WebElement uniformInformationDay = FindElementUtils.getWebElement(uniformInformationDayLocator, driver);
        LoggingUtils.log("Element found complete successfully");

        LoggingUtils.log("Assert check in test...");
        Assert.assertNotEquals(uniformInformationDay, null);
        LoggingUtils.log("Uniform Information Day test complete");
        LoggingUtils.log("------------------------------------------------");
    }
}
