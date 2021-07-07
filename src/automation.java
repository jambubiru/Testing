import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.net.MalformedURLException;


public class automation {

    public static void main(String args[]) throws MalformedURLException {

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.DEVICE_NAME, value: "emulator-5554");
        dc.setCapability(capabilityName: "platformName", value: "android");
        dc.setCapability(capabilityName: "appPackage", value: "com.android.calculator2");
        dc.setCapability(capabilityName: "appActivity", value: ".Calculator");

        AndroidDriver<AndroidElement> add = new AndroidDriver<AndroidElement>(new URL(spec: "http://127.0.0.1:4723/wd/hub"),dc);


        MobileElement e11 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");
        e11.click();
        MobileElement e12 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_5");
        e12.click();
        MobileElement e13 = (MobileElement) driver.findElementByAccessibilityId( using: "plus");
        e13.click();
        MobileElement e14 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_3");
        e14.click();
        MobileElement e15 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_9");
        e15.click();
        MobileElement e16 = (MobileElement) driver.findElementByAccessibilityId( using: "equals");
        e16.click();

        Assert.assertEquals(ad.findElementById("com.android.calculator2:id/result").getText(), o1: 64)
    }
}
