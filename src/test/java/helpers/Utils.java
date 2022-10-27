package helpers;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertTrue;
public class Utils {
    public static String getAbsolutePath(String filePath) {
        File file = new File(filePath);
        assertTrue(file.exists(), file + " not found");
        return file.getAbsolutePath();
    }

    public static URL getDeviceUrl() {
        try {
            return new URL(System.getProperty("appiumUrl","http://127.0.0.1/"));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
