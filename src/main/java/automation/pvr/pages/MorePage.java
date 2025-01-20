package automation.pvr.pages;

import automation.pvr.base.BaseClass;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MorePage extends BaseClass {
    private static final Logger logger = LogManager.getLogger(MorePage.class);

    public MorePage() {
        PageFactory.initElements(driver, this);
        logger.info("Initialized MorePage elements");
    }

    @FindBy(id="com.net.pvr:id/moreFragment")
    WebElement moreBtn;

    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]")
    WebElement offerBtn;

    public void validateOffers() throws InterruptedException {
        logger.info("Clicking on the More button");
        moreBtn.click();
        Thread.sleep(3000);
        logger.info("Clicking on the Offers button");
        offerBtn.click();
        logger.info("Offers page is displayed");
    }
}
