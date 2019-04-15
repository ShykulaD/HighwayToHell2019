package lessonTest;

import wrappers.BaseWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TestExample123 extends BaseWrapper {

    @Test
    public void myTest(){
        driver.get("http://liniakino.com/showtimes/aladdin/");
        List<WebElement> elements = driver.findElements(By.xpath("//*[@class='showtime-movie']/h1/a"));
        for (WebElement element : elements) {
            System.out.println(element.getText());
        }
    }
}
