package org.example.baseUtils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.qameta.allure.Step;

public class Hooks extends BaseUtils {
    @Before
    @Step("Open the website")
    public void setUp() {
        if (driver != null) {
            driver.quit();
        }
        createWebDriver();
    }

    @After
    @Step("Close the website")
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
