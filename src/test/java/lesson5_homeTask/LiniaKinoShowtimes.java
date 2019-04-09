package lesson5_homeTask;

import lesson5.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class LiniaKinoShowtimes extends BaseTest {
    @Test
    driver.get("http://liniakino.com/showtimes/aladdin/");
    List<WebElement> row = driver.findElements(By.xpath("//*[@class='showtime-movie']//h1//a"));
    System.out.println(row.getText());


}
