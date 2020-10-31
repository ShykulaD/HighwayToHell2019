package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseWrapper {

    public WebDriver driver;

    @BeforeTest
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-geolocation");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    public boolean explicitWait(By Locator, int time) {
        try {
            WebDriverWait explicitWait = new WebDriverWait(driver, time);
            explicitWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Locator));
            return true;
        } catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }

    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
