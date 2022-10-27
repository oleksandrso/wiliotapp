package android.testConfig;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import static helpers.Utils.getDeviceUrl;
import static io.appium.java_client.remote.MobileCapabilityType.DEVICE_NAME;

public class AndroidMobileDriver implements WebDriverProvider {
    @Override
    public WebDriver createDriver(Capabilities capabilities) {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        //Connect to device
//      desiredCapabilities.setCapability(MobileCapabilityType.UDID, "P7RO8L85MBVW6XMJ"); //Poco M4 Pro
        desiredCapabilities.setCapability(DEVICE_NAME, "Emulator-5554");
        desiredCapabilities.setCapability("platformName", "android");
        return new AndroidDriver(getDeviceUrl(), desiredCapabilities);
    }

}
