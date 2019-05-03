package lesson1_homeTask;

import org.openqa.selenium.By;
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

    private String pass = "Te12345st";
    private String email = "pj.pdffiller@gmail.com";
    private By emailInput = By.cssSelector("[name='email']");
    private By passInput = By.cssSelector("[name='pass']");
    private By loginBtn = By.cssSelector("#u_0_2");
    private By messageBtn = By.xpath("//div[@*='uiToggle _4962 _1z4y _330i _4kgv']");
    private By messages = By.xpath("//*[@class='_1ijj']//span//span");


    @Test
    public void FbLastUserMessage() {

        try {
            driver.findElement(emailInput).clear();
            driver.findElement(emailInput).sendKeys(email);
            driver.findElement(passInput).clear();
            driver.findElement(passInput).sendKeys(pass);

            //Explicit wait
            WebDriverWait waitForLogin = new WebDriverWait(driver, 5);
            waitForLogin.until(ExpectedConditions.visibilityOfElementLocated(loginBtn));

            driver.findElement(loginBtn).click(); // click Submit button on Login
            driver.findElement(messageBtn).click();

            //Explicit wait
            WebDriverWait waitForMessagePopUp = new WebDriverWait(driver, 5);
            waitForMessagePopUp.until(ExpectedConditions.visibilityOfElementLocated(messages));

            String messagesList = driver.findElement(messages).getText();
            System.out.println(messagesList);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}