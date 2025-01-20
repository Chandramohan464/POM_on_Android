package automation.pvr.test;

import automation.pvr.base.BaseClass;
import automation.pvr.pages.PassPortPage;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class PassportPageTest extends BaseClass {
    Logger log = LogManager.getLogger(HomePageTest.class);
    PassPortPage passPort;

    @BeforeMethod
    public void setUp() throws MalformedURLException, InterruptedException {
        log.info("Initializing the test setup...");
        initalize();
        passPort = new PassPortPage();
        log.info("PassPortPage object created successfully.");
        Thread.sleep(3000);
    }

    @Test
    public void validatePassportPageTest() throws InterruptedException {
        log.info("Starting the validatePassportPage test...");
        passPort.validatePassportPage();
        log.info("validatePassportPage test executed successfully.");
        Thread.sleep(3000);
    }
}
