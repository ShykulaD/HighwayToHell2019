package lesson8;

import org.testng.annotations.Test;
import wrappers.BaseWrapper;

public class Test_auto extends BaseWrapper {


    @Test
    public void firstTest() throws InterruptedException {
        driver.get("https://stackoverflow.com/questions/218384/what-is-a-nullpointerexception-and-how-do-i-fix-it");
        Thread.sleep(3000);
    }

    @Test
    public void secondTest() throws InterruptedException {
        driver.get("https://www.imdb.com/title/tt0111161/");
        Thread.sleep(3000);
    }
}
