package lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ImdbExample {

    public class SeleniumPractice {

        public WebDriver driver;

        @BeforeTest
        public void setUp(){
            driver = new ChromeDriver();
        }

        @Test
        public void myTest(){
            driver.get("https://www.imdb.com/chart/top");
            list<WebElement> titles = driver.findElement(By.XPath("//*[@class='titleColumn']//a"));
            for(WebElement element : titles) {
                System.out.println(element.getText());
            }

        /*    driver.get("https://www.imdb.com/chart/top");
            list<WebElement> titles = driver.findElement(By.XPath("//*[@class='titleColumn']//a"));
            for(WebElement element : titles) {
                System.out.println(element.getAttribute("href"));
            }*/

          /*  driver.get("https://www.imdb.com/chart/top");
            list<WebElement> title = driver.findElement(By.XPath("//*[@class='titleColumn']//a"));
            for(WebElement element : title) {
                System.out.println(element.getAttribute("href"));*/
            }



        }







        @AfterTest
        public void tearDown(){
            driver.quit();
        }
    }

}
