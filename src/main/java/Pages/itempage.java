package Pages;


import BasePage.basepage;
import Utilities.waitutil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class itempage extends basepage {
    @FindBy(xpath = "//p[@class='price']/span/bdi")
    private WebElement priceText;

    public itempage(){
        PageFactory.initElements(driver,this);
    }

    public String getProductPrice(){
        waitutil.waitForVisible(priceText);
        return priceText.getText();
    }
}
