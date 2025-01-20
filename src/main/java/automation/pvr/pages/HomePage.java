package automation.pvr.pages;

import automation.pvr.base.BaseClass;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {
    private static final Logger logger = LogManager.getLogger(HomePage.class);

    public HomePage() {
        PageFactory.initElements(driver, this);
        logger.info("Initialized HomePage elements");
    }

    @FindBy(id="com.net.pvr:id/searchBtn")
    WebElement searchButton;

    @FindBy(id="com.net.pvr:id/notify")
    WebElement notifyButton;

    @FindBy(id="com.net.pvr:id/profileBtn")
    WebElement profileButton;

    @FindBy(id="com.net.pvr:id/view7")
    WebElement loginButton;

    @FindBy(id="com.net.pvr:id/tvBook")
    WebElement bookBtn;

    public void validateSearchButton() throws InterruptedException {
        logger.info("Clicking on the Search button");
        searchButton.click();
        Thread.sleep(3000);
        logger.info("Search Movie page is displayed");
    }

    public void validateNotifyButton() throws InterruptedException {
        logger.info("Clicking on the Notify button");
        notifyButton.click();
        Thread.sleep(3000);
        logger.info("Notification page is displayed");
    }

    public void validateProfile() throws InterruptedException {
        logger.info("Clicking on the Profile button");
        profileButton.click();
        Thread.sleep(3000);
        logger.info("Clicking on the Login button");
        loginButton.click();
        Thread.sleep(3000);
        logger.info("Login page is displayed");
    }

    public void validateBooking() throws InterruptedException {
        logger.info("Clicking on the Book button");
        bookBtn.click();
        Thread.sleep(3000);
        logger.info("Booking options are available");
    }
}
