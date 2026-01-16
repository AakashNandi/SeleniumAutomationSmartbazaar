package dataprovider;

import Utilities.ExceReader;
import org.testng.annotations.DataProvider;

public class searcheddataprovider {
    @DataProvider(name="productData")
    public static Object[][] productData(){
        return ExceReader.getData("src/test/feed/testData/TD.xlsx","Products");
    }
}
