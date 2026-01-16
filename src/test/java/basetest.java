import Utilities.driverutil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class basetest {
        @BeforeMethod
    public void setUp(){
            driverutil.initDriver();
        }

        @AfterMethod
    public void teardown(){
            driverutil.quitDriver();
        }
}
