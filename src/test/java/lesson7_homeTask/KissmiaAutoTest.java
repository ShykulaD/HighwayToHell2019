package lesson7_homeTask;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import wrappers.BaseWrapper;

import java.util.ArrayList;

public class KissmiaAutoTest extends BaseWrapper {

    /*
    Для регистрации пользователей используйте временные почтовые ящики. Например - https://tempail.com/
    Написать тесты для сайта с помощью TestNG + Selenium (для сайта https://kismia.com/):
    1. Тест на логин
    2. Тест на отправку сообщения
    3. Тест на изменение в настройках пола и возраста
    */
    private String tempEmailAdress = "https://www.mohmal.com/en/inbox";
    private String userName = "Andrii";
    private String password = "qweasd1234567890";
    private String tempEmail;

    private By email = By.xpath("//*[@id='email']/div");
    private By newReg = By.xpath("//*[@class='screen__greeting__button js-switchSignPage']");
    private By selectMaleGender = By.xpath("//*[@class='home-page-form__gender-radio__input js_genderField js_field']");
    private By userNameField = By.xpath("//*[@class='home-page-form__input js_nameField js_field']");
    private By submitReg = By.cssSelector(".home-page-form__submit--reg");
    private By loginEmail = By.xpath("//div[@class='js_secondStep']//input");
    private By passWordSearch = By.xpath("//*[@class='home-page-form__input js_passwordField js_field']");
    private By submitLogin = By.xpath("//*[@class='home-page-form__submit home-page-form__submit--reg js_submit']");

    //DropDown Id's on Personal info page
    private By openBirthDayDropDown = By.xpath("//*[@id='bday_day']");
    private By openMonthDayDropDown = By.xpath("//*[@id='bday_month']");
    private By openYearDayDropDown = By.xpath("//*[@id='bday_year']");

    private By buttonForward = By.xpath("//div[@class='btn-holder']/button");
    private By saveForLater = By.xpath("//*[@class='js-skip-upload-photo-step']");

    private By cookies = By.xpath("//button[@class='cookies-popup__btn']");

    private By tempEmailPars = By.xpath("//*[@class='unseen']//i");
    private By openRegLink = By.xpath("//a[contains(text(), 'Вход на сайт')] | //div[@class='button-container']/a");

    @BeforeTest
    public String getTempEmail() {
        driver.get(tempEmailAdress);
        tempEmail = driver.findElement(email).getText();
        return tempEmail;
    }

    @Test(priority = 1)
    public void logIn() throws InterruptedException {

        driver.get("https://kismia.com/");
        driver.findElement(newReg).click(); // new Reg

        if (driver.findElement(cookies).isDisplayed()) {
            driver.findElement(cookies).click();
        }

        explicitWait(selectMaleGender, 10);
    //  Thread.sleep(3000);
        //   WebDriverWait explicitWait = new WebDriverWait(driver, 5);
        //   explicitWait.until(ExpectedConditions.presenceOfElementLocated(selectMaleGender));
        driver.findElement(selectMaleGender).click();
        driver.findElement(userNameField).sendKeys(userName);
        driver.findElement(submitReg).click();

    }

    @Test(priority = 2)
    public void authentication() {
        //   Thread.sleep(4000);
        driver.findElement(loginEmail).click();
        driver.findElement(loginEmail).sendKeys(tempEmail);

        driver.findElement(passWordSearch).click();
        driver.findElement(passWordSearch).sendKeys(password);
        driver.findElement(submitLogin).click();

    }

    @Test(priority = 3)
    public void changingPersonalInfo() throws InterruptedException {

        Select birthdayDaySelect = new Select(driver.findElement(openBirthDayDropDown));
        birthdayDaySelect.selectByValue("08");

        Select birthdayMonthSelect = new Select(driver.findElement(openMonthDayDropDown));
        birthdayMonthSelect.selectByValue("02");

        Select birthdayYearSelect = new Select(driver.findElement(openYearDayDropDown));
        birthdayYearSelect.selectByValue("1993");

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 1000);"); // Scroll to the buttom of the page

        driver.findElement(buttonForward).click();
        driver.findElement(saveForLater).click(); // Photo upload later

        Thread.sleep(15000);

    }

    @Test(priority = 4)
    public void changingPersonalInfo2() throws InterruptedException {

        JavascriptExecutor jse2 = (JavascriptExecutor) driver;
        jse2.executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get(tempEmailAdress);

        driver.findElement(tempEmailPars).click(); // finding day dropDown
        driver.findElement(openRegLink).click(); // selecting B-day from dropDown

        Thread.sleep(20000);

    }

}
