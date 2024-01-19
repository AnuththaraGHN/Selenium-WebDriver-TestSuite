import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class UserRegistrationTest {

    WebDriver driver;

    @BeforeTest
    public void setUp() {
        // Set up WebDriver with SSL certificate acceptance capabilities
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);

        // Set the path to your chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");

        // Initialize ChromeDriver with options
        driver = new ChromeDriver(options);
    }

    @Test
    public void testUserRegistration() {
        // Your test code remains unchanged
    }

    @AfterTest
    public void tearDown() {
        // Close the browser
        driver.quit();
    }

    // Utility method to take screenshots
    private void takeScreenshot(String fileName) {
        try {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File("C:\\Users\\MY PC\\Pictures\\" + fileName + ".png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
