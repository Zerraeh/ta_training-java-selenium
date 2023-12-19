package MinsktransTests.tests;

import MinsktransTests.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import java.util.logging.Logger;


public class CommonConditions {
    protected WebDriver driver;
    protected final java.time.Duration WAIT_TIMEOUT_SECONDS = java.time.Duration.ofSeconds(10);

    @BeforeMethod
    public void setup()
    {
        driver = DriverSingleton.getDriver();
    }
    @AfterMethod(alwaysRun = true)
    public void dispose()
    {
        DriverSingleton.closeDriver();
    }
}
