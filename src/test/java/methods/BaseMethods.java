package methods;

import driver.Driver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class BaseMethods extends Driver {
    private static Logger log = LoggerFactory.getLogger(BaseMethods.class);
    static HashMap<String, String> keyMap = new HashMap<>();

    public void click(By locator) {
        checkElement(locator);
        androidDriver.findElement(locator).click();
        log.info("Elemente tiklandi: " + locator);
    }

    public boolean isElementDisplayed(By locator) {
        return androidDriver.findElement(locator).isDisplayed();
    }

    public static boolean checkElement(By locator) {
        try {
            WebDriverWait element = new WebDriverWait(androidDriver, 30);
            element.until(ExpectedConditions.visibilityOfElementLocated(locator));
            log.info(locator + " Elementi Bulundu ");
            return true;
        } catch (Exception e) {
            log.info(locator + " Elementini Bulmak Icin 30 SN Beklendi Fakat Bulunamadı");
            return false;
        }
    }

    public void sendText(By locator, String value) {
        checkElement(locator);
        androidDriver.findElement(locator).sendKeys(value);
        log.info("Bulunan Elemente " + value + " degeri yazildi.");
    }

    public void checkText(By locator, String expText) {
        checkElement(locator);

        if (expText.equals(androidDriver.findElement(locator).getText())) {
            log.info("Elementin Text Degeri " + expText + " Degerini Iceriyor");
        } else {
            Assert.fail("Elementin Text degeri Beklenen " + expText + " Text Degerini Icermiyor");
        }
    }

    public void randomClick(By locator) {
        List<WebElement> elementList = androidDriver.findElements(locator);
        System.out.println("Total elements : " + elementList.size());

        Random rand = new Random();
        int index = rand.nextInt(elementList.size() - 1); // -1 because index will start from 0
        elementList.get(index).click();
        log.info("Bulunan Elemente Random Metodu Ile Tiklandi");
    }

    public void scrollUntilElementVisible(By locator, double scrollRate) {
        try {
            while (androidDriver.findElements(locator).size() == 0) {
                Dimension size = androidDriver.manage().window().getSize();
                int startX = size.width / 2;
                int startY = (int) (size.height * 0.8);
                int endY = (int) (size.height * scrollRate);
                new TouchAction<>(androidDriver)
                        .press(PointOption.point(startX, startY))
                        .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                        .moveTo(PointOption.point(startX, endY))
                        .release().perform();
                log.info("Scrolled down until " + locator);
            }
        } catch (Exception e) {
            log.info(e.getMessage() + locator + " could not scrolled down because element could not find!!!!");
        }
    }

    public void saveValue(String key, String val) {
        keyMap.put(key, val);

    }

    public void saverMethod(By locator, String key) {
        String savedTxt = androidDriver.findElement(locator).getText();
        saveValue(key, savedTxt);
        log.info(locator + " Elementinde Bulunan " + savedTxt + " Text Degeri " + key + " Adiyla Kaydedildi");
    }

    public String getValue(String key) {
        return keyMap.get(key).toString();
    }

    public void checkerMethod(By locator, String key) {
        String checkedTxt = androidDriver.findElement(locator).getText();
        Assert.assertEquals(getValue(key), checkedTxt);
        log.info(key + " Adiyla Kaydedilmis Text Degeri " + locator + " Icerisinde Bulunan " + checkedTxt + " Ile Karsilastirildi");

    }

    public void wait(int second) throws InterruptedException {
        Thread.sleep(second * 1000);
    }

}
