import Pages.homepage;
import Pages.itempage;
import Pages.productspage;
import dataprovider.searcheddataprovider;
import org.testng.annotations.Test;

public class GetProductPriceTest extends basetest{
    @Test(dataProvider = "productData", dataProviderClass = searcheddataprovider.class)
    public void searchAndPrice(String searchKey, String productName){
        homepage hp=new homepage();
        itempage ip=new itempage();
        productspage pp=new productspage();

        hp.opensite("https://www.smartbazaar.co.uk/");
      //  hp.closepopup();
        hp.search(searchKey);

        pp.selectProduct(productName);

        String price = ip.getProductPrice();
        System.out.println("product Price: " +price);
    }
}
