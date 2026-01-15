package Locators;

import Browser.browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class homepageObject extends browser {
        // static By popupclick = By.xpath("//div[@class='brave_popup__close__button']");
         static By popup = By.xpath("//div[@class='brave_popup__close__button']");
         static By search = By.xpath("//input[@class='aws-search-field']");

         public static WebElement popup(){
             WebElement element = driver.findElement(popup);
            // System.out.println("1");
             return element;
         }
//         public static WebElement popupclick(){
//             WebElement element = driver.findElement(popupclick);
//             System.out.println("2");
//             return element;
//         }

         public static WebElement search(){
             WebElement element = driver.findElement(search);
            // System.out.println("3");
             return element;
         }
}
