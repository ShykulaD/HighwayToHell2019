package lesson5_homeTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import wrappers.BaseWrapper;

import java.util.List;

public class LiniaKinoSpareSeats extends BaseWrapper {

int freeSeats = 0;
int occupiedSeats = 0;

    @Test
    public void myTest() throws InterruptedException {
        driver.get("http://liniakino.com/showtimes/aladdin/");
        if (driver.findElement(By.xpath("//*[@id='closeButton']/b")).isDisplayed())
         {
             driver.findElement(By.xpath("//*[@id='closeButton']/b")).click();
         }
        driver.findElement(By.xpath("//*[@class='showtime-time']//li[2]/a")).click();
        Thread.sleep(2000);
        WebElement iframeElem = driver.findElement(By.cssSelector("iframe"));
        driver.switchTo().frame(iframeElem); // Switch to iframe

        List<WebElement> resultList = driver.findElements(By.cssSelector("div[id^='hseat-']"));
        for (WebElement resultItem : resultList){
            String className = resultItem.getAttribute("seat seat-occupied");
            if (className == "seat seat-occupied") {
                ++occupiedSeats;
            }
        }
        System.out.println("Occupied seats are " + occupiedSeats);
        System.out.println("Free seats are " + freeSeats);
    }
        //driver.switchTo().defaultContent(); // Switch back from iframe
    }


