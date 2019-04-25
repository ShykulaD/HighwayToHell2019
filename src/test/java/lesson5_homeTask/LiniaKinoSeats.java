package lesson5_homeTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import wrappers.BaseWrapper;

import java.util.List;

public class LiniaKinoSeats extends BaseWrapper {

    private int freeSeats = 0;
    private int occupiedSeats = 0;
    private int allSeats = 0;
    private int reservedSeats = 0;

    @Test
    public void liniaKino() throws InterruptedException {

        driver.get("http://liniakino.com/showtimes/aladdin/");

        if (driver.findElement(By.xpath("//*[@id='closeButton']/b")).isDisplayed()) {
            driver.findElement(By.xpath("//*[@id='closeButton']/b")).click();
        }

        driver.findElement(By.xpath("//*[@class='showtime-time']//li[2]/a")).click();
        Thread.sleep(2000);
        WebElement iframeElem = driver.findElement(By.cssSelector("iframe"));
        driver.switchTo().frame(iframeElem); // Switch to iframe

        // For each for finding Occupied seats
        List<WebElement> occupiedSeatsList = driver.findElements(By.cssSelector("div[class$='occupied']"));
        for (WebElement occupiedSeat : occupiedSeatsList) {
            ++occupiedSeats;
        }

        // For each for finding Free seats
        List<WebElement> freeSeatsList = driver.findElements(By.cssSelector("#hall-scheme-container .seat-color1"));
        for (WebElement freeSeat : freeSeatsList) {
            ++freeSeats;
        }

        // For each for finding Reserved seats
        List<WebElement> reservedSeatsList = driver.findElements(By.cssSelector("#hall-scheme-container .seat seat-reserved"));
        for (WebElement reserveSeat : reservedSeatsList) {
            ++reservedSeats;
        }
        // For each for finding All seats
        List<WebElement> allSeatsList = driver.findElements(By.cssSelector("div[id^='hseat']"));
        for (WebElement freeSeat : allSeatsList) {
            ++allSeats;
        }

        System.out.println("Occupied seats are " + occupiedSeats);
        System.out.println("Free seats are " + freeSeats);
        System.out.println("Reserved seats are " + reservedSeats);
        System.out.println("All seats are " + allSeats);
        driver.switchTo().defaultContent(); // Switch back from iframe
    }
}


