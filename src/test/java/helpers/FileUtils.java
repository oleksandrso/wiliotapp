package helpers;

import java.io.File;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class FileUtils {
    public static String getAbsolutePath(String filePath) {
        File file = new File(filePath);
        assertTrue(file.exists(), file + " not found");
        return file.getAbsolutePath();
    }
}
