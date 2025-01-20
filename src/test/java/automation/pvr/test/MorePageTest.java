package automation.pvr.test;

import automation.pvr.base.BaseClass;
import automation.pvr.pages.MorePage;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class MorePageTest extends BaseClass {
    Logger log = LogManager.getLogger(HomePageTest.class);
    MorePage more;

    @BeforeMethod
    public void setUp() throws MalformedURLException, InterruptedException {
        log.info("Initializing the test setup...");
        initalize();
        more = new MorePage();
        log.info("MorePage object created successfully.");
        Thread.sleep(3000);
    }

    @Test
    public void validateOffersTest() throws InterruptedException {
        log.info("Starting the validateOffers test...");
        more.validateOffers();
        log.info("validateOffers test executed successfully.");
        Thread.sleep(3000);
    }
}
