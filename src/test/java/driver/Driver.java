package driver;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.AfterSuite;
import com.thoughtworks.gauge.BeforeScenario;
import com.thoughtworks.gauge.BeforeSuite;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {

    public static AndroidDriver androidDriver;

    @BeforeScenario
    public void startDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appPackage", "com.dmall.mfandroid");
        capabilities.setCapability("appActivity", "com.dmall.mfandroid.activity.base.SplashActivity");
        capabilities.setCapability("platformName", "Android");

        androidDriver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        androidDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @AfterScenario
    public void closeDriver() {
        if (androidDriver != null) {
            androidDriver.quit();
        }
    }
}
