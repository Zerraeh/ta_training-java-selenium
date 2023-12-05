package MinsktransTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.time.Duration;

public class WebDriverMinsktransTest {

    @Test (description = "Check if 404 on en version slider->page")
    public void NotFoundRoutesPage()
    {
        WebDriver driver = new EdgeDriver();
        driver.get("https://minsktrans.by/en/international-bus-routes/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1));

        WebElement searchPanel = driver.findElement(By.xpath("//*[@id='inner_page']/div/main/figure"));

        driver.quit();
        Assert.assertNotEquals(searchPanel, null);
    }
    @Test (description = "Check multiple click on button \"Версия сайта для слабовидящих\"")
    public void MinsktransBlindModeMultipleClick()
    {
        WebDriver driver = new EdgeDriver();
        driver.get("https://minsktrans.by/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1));

        WebElement blindVersionButton = driver.findElement(By.className("bvi-open"));

        blindVersionButton.click();
        blindVersionButton.click();
        blindVersionButton.click();

        var blindVersionCloseButtons = driver.findElements(By.className("bvi-panel-close"));
        driver.quit();
        Assert.assertEquals(blindVersionCloseButtons.stream().count(), 1);
    }
}
