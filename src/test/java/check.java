import Browser.browser;
import Browser.utility;
import Pages.homepage;

public class check {
        public static void main(String[] args) throws Exception{
            String browserData = utility.properties("browser");
            browser.openBrowser(browserData);
            browser.navigate("Smartbazaar - Home");
           // Thread.sleep(2000);
            homepage.click();
            homepage.enter();
            Thread.sleep(4000);
            browser.closeBrowser();;
        }

}
