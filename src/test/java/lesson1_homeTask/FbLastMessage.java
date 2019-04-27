package lesson1_homeTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import wrappers.BaseWrapperForFaceBook;

/*
1. Открыть браузер
2. Открыть https://www.facebook.com/
3. Ввести логин(емейл) в поле для ввода логина
4. Ввести пароль в поле для ввода пароля
5. Нажать кнопку “Вход”
6. Открыть сообщения
7. Взять текст последнего сообщения (самое свежее)
8. Вывести в консоль последнее сообщение
*/

public class FbLastMessage extends BaseWrapperForFaceBook {

    @Test
    public void FbLastUserMessage() {

        try {
            driver.findElement(By.cssSelector("[name='email']")).clear();
            driver.findElement(By.cssSelector("[name='email']")).sendKeys("pj.pdffiller@gmail.com");
            driver.findElement(By.cssSelector("[name='pass']")).clear();
            driver.findElement(By.cssSelector("[name='pass']")).sendKeys("Te12345st");

            //Explicit wait
            WebDriverWait waitForLogin = new WebDriverWait(driver, 1);
            waitForLogin.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#u_0_2")));

            driver.findElement(By.cssSelector("#u_0_2")).click(); // click Submit button on Login
            driver.findElement(By.name("mercurymessages")).click();

            //Explicit wait
            WebDriverWait waitForMessagePopUp = new WebDriverWait(driver, 22);
            waitForMessagePopUp.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='_1ijj']//span//span")));

            WebElement messagesList = driver.findElement(By.xpath("//*[@class='_1ijj']//span//span"));
            System.out.println(messagesList.getText());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}