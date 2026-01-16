package Utilities;

import BasePage.basepage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class scrollutil {
        public static void scrollToElement(WebElement element){
            ((JavascriptExecutor) basepage.driver)
                    .executeScript("arguments[0].scrollIntoView(true);",element);
        }
}
