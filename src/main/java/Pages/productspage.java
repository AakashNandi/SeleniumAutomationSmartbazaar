package Pages;

import BasePage.basepage;
import Utilities.scrollutil;
import Utilities.waitutil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class productspage extends basepage {
    @FindBy(xpath= "//main[@id='main']/ul/li")
    @CacheLookup    //storing in cache memory for the search items... so that can be used easily...
    private List<WebElement> productitems;
    private By productName = By.tagName("h2");

    public productspage(){
        PageFactory.initElements(driver, this);
    }

    public void selectProduct(String expectedName){
        try{
            for(WebElement item: productitems ){
                WebElement nameElement = item.findElement(productName);
                waitutil.waitForVisible(nameElement);
                String actualName = nameElement.getText().trim();
                if(actualName.equalsIgnoreCase(expectedName)){
                    scrollutil.scrollToElement(item);
                    waitutil.waitForClickable(item);
                    item.click();
                    return;
                }
            }
        }catch (Exception e){
            throw new RuntimeException("Product not found:" +expectedName);
        }
    }
}
