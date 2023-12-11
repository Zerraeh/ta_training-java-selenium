package MinsktransTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InternationalBusRoutesPage {
    private WebDriver driver;

    public InternationalBusRoutesPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getSearchPanel() {
        return driver.findElement(By.xpath("//*[@id='inner_page']/div/main/figure"));
    }
}
