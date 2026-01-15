package Pages;

import Browser.browser;
import Browser.utility;
import Locators.homepageObject;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class homepage extends browser {
    public static void click(){
        try{
            wait.until(ExpectedConditions.visibilityOf((homepageObject.popup())));
            WebElement element = homepageObject.popup();
            element.click();
        }catch (Exception e){
            System.out.println("popup window");
        }
    }

    public static void enter(){
        try{
            wait.until(ExpectedConditions.visibilityOf((homepageObject.search())));
            WebElement element = homepageObject.search();
            String item_feed = utility.properties("item");
            element.sendKeys(item_feed);
            element.sendKeys(Keys.ENTER);
            Thread.sleep(2000);
            //System.out.println("Error");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
