package lesson5_homeTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class LiniaKinoShowtimes {

    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("http://liniakino.com/showtimes/aladdin/");
    }

    @Test
    public void myTest(){
        List<WebElement> elements = driver.findElements(By.xpath("//*[@class='showtime-movie']/h1/a"));
        for (WebElement element : elements) {
            System.out.println(element.getText());
        }
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}



