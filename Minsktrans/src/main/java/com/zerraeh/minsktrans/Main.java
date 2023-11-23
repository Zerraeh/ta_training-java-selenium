package com.zerraeh.minsktrans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("http://seleniumhq.org");
        Thread.sleep(5000);
        driver.quit();
    }
}