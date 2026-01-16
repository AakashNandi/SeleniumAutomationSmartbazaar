package Pages;


import BasePage.basepage;
import Utilities.waitutil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage extends basepage {
    @FindBy(xpath = "//div[@class='brave_popup__close__button']")
    private WebElement popup;

    @FindBy(xpath = "//input[@name='s']")
    private WebElement searchBox;

    public homepage(){     //constructor
        PageFactory.initElements(driver,this);
    }

    public void opensite(String url){
        driver.get(url);
    }

//    public void closepopup(){
//       // waitutil.waitForClickable(popup);
//        popup.click();
//    }

    public void search(String item){
        waitutil.waitForVisible(searchBox);
        searchBox.sendKeys(item, Keys.ENTER);
    }
}
