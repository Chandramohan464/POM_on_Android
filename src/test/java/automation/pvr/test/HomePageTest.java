package automation.pvr.test;

import automation.pvr.base.BaseClass;
import automation.pvr.pages.HomePage;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class HomePageTest extends BaseClass {
    Logger logger = LogManager.getLogger(HomePageTest.class);
    HomePage homePage;

    @BeforeMethod
    public void setUp() throws MalformedURLException, InterruptedException {
        logger.info("Initializing the setup for HomePageTest");
        initalize();
        homePage = new HomePage();
        Thread.sleep(3000);
        logger.info("Setup completed successfully");
    }

    @Test
    public void validateSearchButtonTest() throws InterruptedException {
        logger.info("Executing validateSearchButtonTest");
        homePage.validateSearchButton();
        logger.info("Search button validation test completed");
    }

    @Test
    public void validateNotifyButtonTest() throws InterruptedException {
        logger.info("Executing validateNotifyButtonTest");
        homePage.validateNotifyButton();
        logger.info("Notify button validation test completed");
    }

    @Test
    public void validateProfileTest() throws InterruptedException {
        logger.info("Executing validateProfileTest");
        homePage.validateProfile();
        logger.info("Profile validation test completed");
    }

    @Test
    public void validateBookingTest() throws InterruptedException {
        logger.info("Executing validateBookingTest");
        homePage.validateBooking();
        logger.info("Booking validation test completed");
    }
}
