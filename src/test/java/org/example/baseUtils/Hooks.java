package org.example.baseUtils;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseUtils {
    @Before
    public void setUp() {
        createWebDriver();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.close();
        }
    }
}
