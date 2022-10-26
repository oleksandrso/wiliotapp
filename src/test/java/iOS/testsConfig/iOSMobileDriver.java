package iOS.testsConfig;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import static helpers.Utils.getAbsolutePath;
import static helpers.Utils.getDeviceUrl;

public class iOSMobileDriver implements WebDriverProvider {


    @Override
    public WebDriver createDriver(Capabilities capabilities) {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        //Connect to device
        desiredCapabilities.setCapability(MobileCapabilityType.UDID, "00008030-001A75193E53402E"); //iPhone
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone SE");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.IOS);

        //App actions
        desiredCapabilities.setCapability(MobileCapabilityType.APP, getAbsolutePath("src/test/resources/app/williot.ipa"));
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");

        return new IOSDriver(getDeviceUrl(), desiredCapabilities);
    }

}
