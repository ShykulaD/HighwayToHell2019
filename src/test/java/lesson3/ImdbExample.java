package lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class ImdbExample {

        private WebDriver driver;

        @BeforeTest
        public void setUp() {
            driver = new ChromeDriver();
            driver.get("https://www.imdb.com/chart/top");
        }

        @Test
        public void myTest() {
            List<WebElement> elements = driver.findElements(By.xpath("//*[@class='titleColumn']//a"));
            for (WebElement element : elements) {
                System.out.println(element.getText());
            }
        }

        @AfterTest
        public void tearDown() {
            driver.quit();
        }
    }



