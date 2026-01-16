import Pages.homepage;
import Pages.itempage;
import Pages.productspage;
import org.testng.annotations.Test;

public class GetProductPriceTest extends basetest{
    @Test
    public void searchAndPrice(){
        homepage hp=new homepage();
        itempage ip=new itempage();
        productspage pp=new productspage();

        hp.opensite("https://www.smartbazaar.co.uk/");
        hp.closepopup();;
        hp.search("rice");

        pp.selectProduct("Shree Krishna Premium Basmati Rice (5kg)");

        String price = ip.getProductPrice();
        System.out.println("product Price: " +price);
    }
}
