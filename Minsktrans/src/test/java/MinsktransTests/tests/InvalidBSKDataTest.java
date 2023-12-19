package MinsktransTests.tests;

import MinsktransTests.model.User;
import MinsktransTests.page.MainPage;
import MinsktransTests.page.MainPageBy;
import MinsktransTests.service.UserCreator;
import MinsktransTests.utils.FindElementUtils;
import MinsktransTests.utils.LoggingUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class InvalidBSKDataTest extends CommonConditions{
    final By bskEmailLocator = new By.ByClassName("//*[@id=\"id1\"]");
    final By bskPasswordLocator = new By.ByClassName("//*[@id=\"id2\"]");
    final By bskSendLocator = new By.ByClassName("//*[@id=\"loginForm\"]/div[3]/input");
    @Ignore
    @Test
    public void invalidBSKInsert()
    {
        User testUser = UserCreator.withCredFromProperty();
        LoggingUtils.log("------------------------------------------------");
        LoggingUtils.log("TEST: ");
        LoggingUtils.log("En page load test start...");

        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        LoggingUtils.log("Main page initialized and opened");
        driver.navigate().to("https://minsktrans.by/erip/login?0");
        LoggingUtils.log("Redirrect");

        WebElement bskEmailInput = FindElementUtils.getWebElement(bskEmailLocator, driver);
        WebElement bskPasswordInput = FindElementUtils.getWebElement(bskPasswordLocator, driver);
        WebElement bskSendInput = FindElementUtils.getWebElement(bskSendLocator, driver);

        bskEmailInput.sendKeys(testUser.getEmail());
        bskPasswordInput.sendKeys(testUser.getPassword());
        bskSendInput.click();

    }
}
