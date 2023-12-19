package MinsktransTests.utils;

import MinsktransTests.driver.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import java.util.List;

public class FindElementUtils {
    public static int getCountWebElementList(By locator, WebDriver driver) {
        LoggingUtils.log("FindElementUtils in process, getCountWebElementList");
        List<WebElement> webElements = driver.findElements(locator);
        return webElements.size();
    }

    public static WebElement getWebElement(By locator, WebDriver driver)
    {
        LoggingUtils.log("FindElementUtils in process, getWebElement");
        return new WebDriverWait(driver, java.time.Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(locator));
    }
}
