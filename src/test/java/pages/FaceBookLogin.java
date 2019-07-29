package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/**
 * Created by Shykulad on 24/07/2019.
 */
public class FaceBookLogin {

    public WebDriver driver;


    private By emailInput = By.cssSelector("[name='email']");
    private By passInput = By.cssSelector("[name='pass']");
    private By loginBtn = By.xpath("//label[@class='uiButton uiButtonConfirm']/input");
    private By messageBtn = By.xpath("//div[@*='uiToggle _4962 _1z4y _330i _4kgv']");
    private By messages = By.xpath("//*[@class='_1ijj']//span//span");

    private void selectElement(final By locator) {

        driver.findElement(locator);

    }

}