package MinsktransTests.page;

import org.openqa.selenium.WebDriver;

public class MainPage extends AbstractPage{
    public MainPage(WebDriver driver)
    {
        super(driver);
    }

    @Override
    public AbstractPage openPage()
    {
        driver.navigate().to("https://minsktrans.by/");
        return this;
    }
}
