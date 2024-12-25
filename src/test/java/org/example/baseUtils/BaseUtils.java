package org.example.baseUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseUtils {
    static WebDriver driver;

    public void initializePageObjects(Object page) {
        PageFactory.initElements(driver, page);
    }

    public void createWebDriver() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }
}
