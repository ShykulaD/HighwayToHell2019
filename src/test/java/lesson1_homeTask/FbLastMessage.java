package lesson1_homeTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FbLastMessage {

    public static void main(String[] args) throws InterruptedException {

        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.cssSelector("[name='email']")).clear();
        driver.findElement(By.cssSelector("[name='email']")).sendKeys( "pj.pdffiller@gmail.com");
        driver.findElement(By.cssSelector("[name='pass']")).clear();
        driver.findElement(By.cssSelector("[name='pass']")).sendKeys("Te12345st");
        driver.findElement(By.id("u_0_2")).click(); // click Submit button on Login
        driver.findElement(By.name("mercurymessages")).click();
        Thread.sleep(3000);
        WebElement messagesList = driver.findElement(By.xpath("//*[@class='_1ijj']//span//span"));
        List<WebElement> rows = messagesList.findElements(By.xpath("//*[@class='_1ijj']//span//span"));
        System.out.println(rows.get(0).getText());


        driver.quit();
    }

}
