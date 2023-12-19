package MinsktransTests.page;

import org.openqa.selenium.WebDriver;

public class MainPageBy extends AbstractPage{
    public MainPageBy(WebDriver driver)
    {
        super(driver);
    }

    @Override
    public AbstractPage openPage()
    {
        driver.navigate().to("https://minsktrans.by/by/galoynaya/");
        return this;
    }
}
