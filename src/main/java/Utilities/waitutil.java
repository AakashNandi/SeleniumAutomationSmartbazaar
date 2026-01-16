package Utilities;

import BasePage.basepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class waitutil {
    public static WebDriverWait wait = new WebDriverWait(basepage.driver, Duration.ofSeconds(10));

    public static void waitForVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitForClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
