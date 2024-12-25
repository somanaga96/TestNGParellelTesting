package org.example.utils;

import io.qameta.allure.Allure;
import org.example.baseUtils.BaseUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;

public class AllureUtils extends BaseUtils {

    public static void allureScreenShot(String name, WebDriver driver) {
        // Capture the screenshot as a File
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try {
            // Read the screenshot file into a byte array
            byte[] screenshotBytes = Files.readAllBytes(screenshot.toPath());

            // Attach the screenshot to Allure report
            Allure.addAttachment(name, "image/png", Arrays.toString(screenshotBytes));

        } catch (IOException e) {
            // Log or rethrow exception for better error handling
            throw new RuntimeException("Failed to capture screenshot and attach to Allure report", e);
        }
    }
}
