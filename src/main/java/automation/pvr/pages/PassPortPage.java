package automation.pvr.pages;

import automation.pvr.base.BaseClass;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PassPortPage extends BaseClass {
    private static final Logger logger = LogManager.getLogger(PassPortPage.class);

    public PassPortPage() {
        PageFactory.initElements(driver, this);
        logger.info("Initialized PassPortPage elements");
    }

    @FindBy(id="com.net.pvr:id/privilegeFragment")
    WebElement passportBtn;

    public void validatePassportPage() throws InterruptedException {
        logger.info("Waiting before interacting with Passport button");
        Thread.sleep(3000);
        logger.info("Clicking on the Passport button");
        passportBtn.click();
        Thread.sleep(3000);
        logger.info("Passport page is displayed");
    }
}