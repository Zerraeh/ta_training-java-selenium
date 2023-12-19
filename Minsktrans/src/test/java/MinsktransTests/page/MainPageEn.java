package MinsktransTests.page;

import org.openqa.selenium.WebDriver;
public class MainPageEn extends AbstractPage{
    public MainPageEn(WebDriver driver)
    {
        super(driver);
    }

    @Override
    public AbstractPage openPage()
    {
        driver.navigate().to("https://minsktrans.by/en/international-bus-routes/");
        return this;
    }
}
