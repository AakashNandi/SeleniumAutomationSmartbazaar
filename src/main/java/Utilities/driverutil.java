package Utilities;


import BasePage.basepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverutil {
    public static void initDriver(){
        basepage.driver = new ChromeDriver();
        basepage.driver.manage().window().maximize();
    }

    public static WebDriver getDriver(){
        return basepage.driver;
    }

    public static void quitDriver(){
        if(basepage.driver != null){
            basepage.driver.quit();
        }
    }

}
