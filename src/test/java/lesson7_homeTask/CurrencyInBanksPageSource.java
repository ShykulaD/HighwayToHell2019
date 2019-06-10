package lesson7_homeTask;

import org.testng.annotations.Test;
import wrappers.BaseWrapper;

public class CurrencyInBanksPageSource extends BaseWrapper {


    //Go to privatBank & get currency
    @Test(priority = 1)
    public void privatBank() {
      //  driver.getPageSource("https://www.privat24.ua");
    }

}