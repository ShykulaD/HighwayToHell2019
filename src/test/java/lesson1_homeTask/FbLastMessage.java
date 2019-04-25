package lesson1_homeTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import wrappers.BaseWrapperForFaceBook;


public class FbLastMessage extends BaseWrapperForFaceBook {

    @Test
    public void FbLastUserMessage() {

        try {
            driver.findElement(By.cssSelector("[name='email']")).clear();
            driver.findElement(By.cssSelector("[name='email']")).sendKeys("pj.pdffiller@gmail.com");
            driver.findElement(By.cssSelector("[name='pass']")).clear();
            driver.findElement(By.cssSelector("[name='pass']")).sendKeys("Te12345st");
            driver.findElement(By.cssSelector("#u_0_2")).click(); // click Submit button on Login
            driver.findElement(By.name("mercurymessages")).click();
            WebElement messagesList = driver.findElement(By.xpath("//*[@class='_1ijj']//span//span"));
            System.out.println(messagesList.getText());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
