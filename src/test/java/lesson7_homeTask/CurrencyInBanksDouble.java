package lesson7_homeTask;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import wrappers.BaseWrapper;

public class CurrencyInBanksDouble extends BaseWrapper {

    public double privatUsdSell;
    public double privatUsdBuy;

    public double ukrSibUsdBuy;
    public double ukrSibUsdSell;

    private By privatUsd = By.xpath("//*[@class='section']/div[2]");
    private By ukrSibBankUsdBuy = By.xpath("//*[@class='currency__table']/tbody/tr[1]/td[2]");
    private By ukrSibBankUsdSell = By.xpath("//*[@class='currency__table']/tbody/tr[1]/td[3]");

/*
    @Test
    public void privatBank() {
        driver.get("https://www.privat24.ua");
        String privatUsdSellAndBuy = driver.findElement(privatUsd).getText();

        String privatStringToSell = privatUsdSellAndBuy.substring(0, 7);
        privatUsdSell = Double.parseDouble(privatStringToSell); // USD for selling in privatBank

        String privatStringToBuy = privatUsdSellAndBuy.substring(9, 15);
        privatUsdBuy = Double.parseDouble(privatStringToBuy); // USD for buying in privatBank

        System.out.println("privatBankTest is finished");
    }
    */
/*

    @Test
    public void ukrSibBank()  {
        driver.get("https://my.ukrsibbank.com/ru/personal/operations/currency_exchange/");
        String parseukrSibBankUsdBuy = driver.findElement(ukrSibBankUsdBuy).getText();
        ukrSibUsdBuy = Double.parseDouble(parseukrSibBankUsdBuy); // USD for buying in ukrSibBank bank

        String parseukrSibBankUsdSell = driver.findElement(ukrSibBankUsdSell).getText();
        ukrSibUsdSell = Double.parseDouble(parseukrSibBankUsdSell); // USD for selling in ukrSibBank bank

    }

*/

}
