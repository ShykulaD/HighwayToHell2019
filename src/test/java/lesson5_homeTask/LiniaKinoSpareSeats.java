package lesson5_homeTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import wrappers.BaseWrapper;

public class LiniaKinoSpareSeats extends BaseWrapper {

    @Test
    public void myTest() throws InterruptedException {
        driver.get("http://liniakino.com/showtimes/aladdin/");
        driver.findElement(By.xpath("//*[@class='showtime-time']//li[2]/a")).click();
        Thread.sleep(5000);
        WebElement iframeElem = driver.findElement(By.cssSelector("iframe"));
        driver.switchTo().frame(iframeElem); // Switch to iframe
        driver.findElement(By.cssSelector("#hseat-24701619")).click();
        Thread.sleep(5000);
        //driver.switchTo().defaultContent(); // Switch back from iframe
    }

}
