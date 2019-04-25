package wrappers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.HashMap;
import java.util.Map;

public class BaseWrapperForFaceBook {

    public WebDriver driver;

    @BeforeTest
    public void setUp() {
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
        driver.quit();
    }
}



