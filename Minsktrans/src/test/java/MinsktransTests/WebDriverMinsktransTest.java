package MinsktransTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class WebDriverMinsktransTest {

    @Test(description = "Check if 404 on en version slider->page")
    public void NotFoundRoutesPage() {
        WebDriver driver = new EdgeDriver();
        InternationalBusRoutesPage routesPage = new InternationalBusRoutesPage(driver);

        driver.get("https://minsktrans.by/en/international-bus-routes/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1));

        Assert.assertNotEquals(routesPage.getSearchPanel(), null);

        driver.quit();
    }

    @Test(description = "Check multiple clicks on button \"Версия сайта для слабовидящих\"")
    public void MinsktransBlindModeMultipleClick() {
        WebDriver driver = new EdgeDriver();
        MinsktransHomePage homePage = new MinsktransHomePage(driver);

        driver.get("https://minsktrans.by/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1));

        homePage.getBlindVersionButton().click();
        homePage.getBlindVersionButton().click();
        homePage.getBlindVersionButton().click();

        Assert.assertEquals(homePage.getBlindVersionCloseButton().isEnabled(), true);

        driver.quit();
    }
}
