package lesson7_homeTask;

import org.openqa.selenium.By;
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


public class kismiaAutoTest extends BaseWrapper {

    @BeforeTest
    public void getTempEmail() {
        driver.get("https://tempail.com/en/");
        String tempEmail = driver.findElement(By.xpath("//*[@id='eposta_adres']")).getAttribute("value");
    }


    @Test
    public void LogIn() {
        driver.get("https://kismia.com/");

    }

}
