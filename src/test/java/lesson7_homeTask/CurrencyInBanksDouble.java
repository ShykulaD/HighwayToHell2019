package lesson7_homeTask;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import wrappers.BaseWrapper;

public class CurrencyInBanksDouble extends BaseWrapper {

    public double privatUsdSell;
    public double privatUsdBuy;

    public double ukrSibUsdBuy;
    public double ukrSibUsdSell;

    public double universalUsdBuy;
    public double universalUsdSell;

    private By privatUsd = By.xpath("//*[@class='section']/div[2]");

    private By ukrSibBankUsdBuy = By.xpath("//*[@class='currency__table']/tbody/tr[1]/td[2]");
    private By ukrSibBankUsdSell = By.xpath("//*[@class='currency__table']/tbody/tr[1]/td[3]");

    private By universalBankUsdBuy = By.xpath("//*[@class='rate table table-bordered light fl-left m-t-2']/tbody/tr[2]/td[2]");
    private By universalBankUsdSell = By.xpath("//*[@class='rate table table-bordered light fl-left m-t-2']/tbody/tr[2]/td[3]");

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
        String parseUkrSibBankUsdBuy = driver.findElement(ukrSibBankUsdBuy).getText();
        ukrSibUsdBuy = Double.parseDouble(parseUkrSibBankUsdBuy); // USD for buying in ukrSibBank bank

        String parseukrSibBankUsdSell = driver.findElement(ukrSibBankUsdSell).getText();
        ukrSibUsdSell = Double.parseDouble(parseUkrSibBankUsdSell); // USD for selling in ukrSibBank bank

    }

*/

    @Test
    public void universalBank() {
        driver.get("https://www.universalbank.com.ua//");
        String parseUniversalBankUsdBuy = driver.findElement(universalBankUsdBuy).getText();
        universalUsdBuy = Double.parseDouble(parseUniversalBankUsdBuy); // USD for buying in universal bank

        String parseUniversalBankUsdSell = driver.findElement(universalBankUsdSell).getText();
        universalUsdSell = Double.parseDouble(parseUniversalBankUsdSell); // USD for buying in universal bank
    }

}
