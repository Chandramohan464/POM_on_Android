package automation.pvr.base;

import io.appium.java_client.android.AndroidDriver;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {
    public static AndroidDriver driver;
    public static Logger logger = LogManager.getLogger(BaseClass.class);

    public void initalize() throws MalformedURLException, InterruptedException {
        logger.info("Initializing DesiredCapabilities for the Android driver");
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("appium:deviceName", "emulator-5554");
        logger.info("Set deviceName to emulator-5554");

        capabilities.setCapability("platformName", "Android");
        logger.info("Set platformName to Android");

        capabilities.setCapability("appium:appPackage", "com.net.pvr");
        logger.info("Set appPackage to com.net.pvr");

        capabilities.setCapability("appium:appActivity", "com.net.pvr.ui.home.HomeActivity");
        logger.info("Set appActivity to com.net.pvr.ui.home.HomeActivity");

        capabilities.setCapability("appium:platformVersion", "8.1.0");
        logger.info("Set platformVersion to 8.1.0");

        logger.info("Creating AndroidDriver instance and connecting to Appium server");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        logger.info("Started the automation of PVR Cinemas");
        Thread.sleep(5000);
    }
}
