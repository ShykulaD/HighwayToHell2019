package lesson1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLastMessage {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.cssSelector("[name='email']")).clear();
        driver.findElement(By.cssSelector("[name='email']")).sendKeys("pj.pdffiller@gmail.com");
        driver.findElement(By.cssSelector("[name='pass']")).clear();
        driver.findElement(By.cssSelector("[name='pass']")).sendKeys("Te12345st");
        driver.findElement(By.id("u_0_2")).click();
        Thread.sleep(5000);
        driver.quit();
    }

}
