package MinsktransTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MinsktransPage {
    private WebDriver driver;

    public MinsktransPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openInternationalBusRoutesPage() {
        driver.get("https://minsktrans.by/en/international-bus-routes/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1));
    }

    public WebElement getSearchPanel() {
        return driver.findElement(By.xpath("//*[@id='inner_page']/div/main/figure"));
    }

    public void openHomePage() {
        driver.get("https://minsktrans.by/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1));
    }

    public WebElement getBlindVersionButton() {
        return driver.findElement(By.className("bvi-open"));
    }

    public List<WebElement> getBlindVersionCloseButtons() {
        return driver.findElements(By.className("bvi-panel-close"));
    }

    @Test(description = "Check if 404 on en version slider->page")
    public void NotFoundRoutesPage() {
        WebDriver driver = new EdgeDriver();
        MinsktransPage page = new MinsktransPage(driver);

        page.openInternationalBusRoutesPage();
        WebElement searchPanel = page.getSearchPanel();

        driver.quit();
        Assert.assertNotEquals(searchPanel, null);
    }

    @Test(description = "Check multiple click on button \"Версия сайта для слабовидящих\"")
    public void MinsktransBlindModeMultipleClick() {
        WebDriver driver = new EdgeDriver();
        MinsktransPage page = new MinsktransPage(driver);

        page.openHomePage();
        WebElement blindVersionButton = page.getBlindVersionButton();

        blindVersionButton.click();
        blindVersionButton.click();
        blindVersionButton.click();

        var blindVersionCloseButtons = page.getBlindVersionCloseButtons();
        driver.quit();
        Assert.assertEquals(blindVersionCloseButtons.size(), 1);
    }
}