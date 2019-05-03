package lesson7_homeTask;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import wrappers.BaseWrapper;




/*
Для регистрации пользователей используйте временные почтовые ящики. Например - https://tempail.com/

Написать тесты для сайта с помощью TestNG + Selenium (для сайта https://kismia.com/) :

1. Тест на логин
2. Тест на отправку сообщения
3. Тест на изменение в настройках пола и возраста
*/

public class KismiaAutoTest extends BaseWrapper {

    private String userName = "Andrii";
    private By email = By.xpath("//*[@id='eposta_adres']");
    private By newReg = By.xpath("//*[@class='screen__greeting__button js-switchSignPage']");
    private By selectMaleGender = By.xpath("//*[@class='home-page-form__gender-radio__input js_genderField js_field']");
    private By userNameField = By.xpath("//*[@class='home-page-form__input js_nameField js_field']");
    private By submitReg = By.cssSelector(".home-page-form__submit--reg");
    private By loginEmail = By.xpath("home-page-form__input js_emailField js_field");


    @BeforeTest
    public String getTempEmail() {
        driver.get("https://tempail.com/en/");
        String tempEmail = driver.findElement(email).getAttribute("value");
        return tempEmail;
    }


    @Test
    public void logIn() throws InterruptedException {

        driver.get("https://kismia.com/");
        driver.findElement(newReg).click(); // new Reg
         Thread.sleep(3000);
     //   WebDriverWait explicitWait = new WebDriverWait(driver, 5);
     //   explicitWait.until(ExpectedConditions.presenceOfElementLocated(selectMaleGender));

        driver.findElement(selectMaleGender).click();


        driver.findElement(userNameField).sendKeys(userName);
        driver.findElement(submitReg).click();
        Thread.sleep(3000);
        driver.findElement(loginEmail).sendKeys(getTempEmail());
        Thread.sleep(3000);

    }

}
