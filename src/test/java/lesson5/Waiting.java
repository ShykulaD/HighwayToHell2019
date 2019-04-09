package lesson5;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Waiting extends BaseTest {
    @Test
    public void he() {
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get("https://google.com");
    }

}
