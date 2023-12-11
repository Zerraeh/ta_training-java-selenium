package MinsktransTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MinsktransHomePage {
    private WebDriver driver;

    public MinsktransHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getBlindVersionButton() {
        return driver.findElement(By.className("bvi-open"));
    }

    public WebElement getBlindVersionCloseButton() {
        return driver.findElement(By.className("bvi-panel-close"));
    }
}
