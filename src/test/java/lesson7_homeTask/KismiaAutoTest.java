package lesson7_homeTask;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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
    private String password = "Te12345st";
    private String tempEmail;

    private By email = By.xpath("//*[@id='eposta_adres']");
    private By newReg = By.xpath("//*[@class='screen__greeting__button js-switchSignPage']");
    private By selectMaleGender = By.xpath("//*[@class='home-page-form__gender-radio__input js_genderField js_field']");
    private By userNameField = By.xpath("//*[@class='home-page-form__input js_nameField js_field']");
    private By submitReg = By.cssSelector(".home-page-form__submit--reg");
    private By loginEmail = By.xpath("//div[@class='js_secondStep']//input");
    private By passWordSearch = By.xpath("//*[@class='home-page-form__input js_passwordField js_field']");
    private By submitLogin = By.xpath("//*[@class='home-page-form__submit home-page-form__submit--reg js_submit']");


    private By openBirthDayDropDown = By.xpath("//*[@id='bday_day']");
    private By selectBdAyDay = By.xpath("//*[@id='bday_day']/option[9]");

    private By openMonthDayDropDown = By.xpath("//*[@id='bday_month']");
    private By selectBdAyMonth = By.xpath("//*[@id='bday_month']/option[3]");

    private By openYearDayDropDown = By.xpath("//*[@id='bday_year']");
    private By selectBdAyYear = By.xpath("//*[@id='bday_year']/option[10]");

    private By buttonForward = By.xpath("//*[@class='btn-holder']/button");
    private By saveForLater = By.xpath("//*[@class='js-skip-upload-photo-step']");



    @BeforeTest
    public String getTempEmail() {
        driver.get("https://tempail.com/en/");
        tempEmail = driver.findElement(email).getAttribute("value");
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
        Thread.sleep(4000);
        driver.findElement(loginEmail).click();
        driver.findElement(loginEmail).sendKeys(tempEmail);

        driver.findElement(passWordSearch).click();
        driver.findElement(passWordSearch).sendKeys(password);
        driver.findElement(submitLogin).click();
        Thread.sleep(4000);

        driver.findElement(openBirthDayDropDown).click(); // finding day dropDown
        driver.findElement(selectBdAyDay).click(); // selecting B-day from dropDown

        driver.findElement(openMonthDayDropDown).click(); // finding month dropDown
        driver.findElement(selectBdAyMonth).click(); // selecting B-month from dropDown

        driver.findElement(openYearDayDropDown).click(); // finding year dropDown
        driver.findElement(selectBdAyYear).click(); // selecting B-year from dropDown

        Thread.sleep(5000);

        driver.findElement(buttonForward).click(); //
        driver.findElement(saveForLater).click(); // Photo upload later

    }

}
