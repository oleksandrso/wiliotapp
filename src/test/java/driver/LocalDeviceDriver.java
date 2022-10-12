package driver;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static helpers.FileUtils.getAbsolutePath;

public class LocalDeviceDriver implements WebDriverProvider {
    public static URL getDeviceUrl() {
        try {
            return new URL("http://127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public WebDriver createDriver(Capabilities capabilities) {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        //Connect to device
        desiredCapabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        desiredCapabilities.setCapability("platformName", "android");
        //App actions
//        desiredCapabilities.setCapability(MobileCapabilityType.APPLICATION_NAME,"Wiliot App");
//        desiredCapabilities.setCapability("appPackage","com.wiliot.wiliotapp");
//        desiredCapabilities.setCapability("appActivity","com.wiliotapp.ui.main.MainActivity");
//        desiredCapabilities.setCapability("noReset", "false");
//        desiredCapabilities.setCapability("fullReset", "true");
//        desiredCapabilities.setCapability(MobileCapabilityType.APP, getAbsolutePath("src/test/resources/apk/wiliot.apk"));-изза того что сразу открывается браузер - не отрабатывает правильно драйвер


        return new AndroidDriver(getDeviceUrl(), desiredCapabilities);
    }

}
