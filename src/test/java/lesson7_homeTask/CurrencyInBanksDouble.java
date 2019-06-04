package lesson7_homeTask;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import wrappers.BaseWrapper;

public class CurrencyInBanksDouble extends BaseWrapper {

    private double privatUsdBuy;
    private double privatUsdSell;

    private double ukrSibUsdBuy;
    private double ukrSibUsdSell;

    private double universalUsdBuy;
    private double universalUsdSell;

    private double oschadUsdBuy;
    private double oschadUsdSell;

    private double unbuUsdBuy;

    private By privatUsd = By.xpath("//*[@class='section']/div[2]");

    private By ukrSibBankUsdBuy = By.xpath("//*[@class='currency__table']/tbody/tr[1]/td[2]");
    private By ukrSibBankUsdSell = By.xpath("//*[@class='currency__table']/tbody/tr[1]/td[3]");

    private By universalBankUsdBuy = By.xpath("//*[@class='rate table table-bordered light fl-left m-t-2']/tbody/tr[2]/td[2]");
    private By universalBankUsdSell = By.xpath("//*[@class='rate table table-bordered light fl-left m-t-2']/tbody/tr[2]/td[3]");

    private By oschadBankUsdBuy = By.xpath("//strong[@class='buy-USD']");
    private By oschadBankUsdSell = By.xpath("//strong[@class='sell-USD']");

    private By nbuUsdSell = By.xpath("//td[contains(text(),'Долар США')]//following-sibling::td");

    @Test(priority = 1)
    public void privatBank() {
        driver.get("https://www.privat24.ua");
        String privatUsdSellAndBuy = driver.findElement(privatUsd).getText();

        String privatStringToSell = privatUsdSellAndBuy.substring(0, 7);
        privatUsdSell = Double.parseDouble(privatStringToSell); // USD for selling in privatBank

        String privatStringToBuy = privatUsdSellAndBuy.substring(9, 15);
        privatUsdBuy = Double.parseDouble(privatStringToBuy); // USD for buying in privatBank

        System.out.println("privatUsdBuy is " + privatUsdBuy);
        System.out.println("privatUsdSell is " + privatUsdSell);
    }

    @Test(priority = 2)
    public void ukrSibBank() {
        driver.get("https://my.ukrsibbank.com/ru/personal/operations/currency_exchange/");
        String parseUkrSibBankUsdBuy = driver.findElement(ukrSibBankUsdBuy).getText();
        ukrSibUsdBuy = Double.parseDouble(parseUkrSibBankUsdBuy); // USD for buying in ukrSibBank bank

        String parseukrSibBankUsdSell = driver.findElement(ukrSibBankUsdSell).getText();
        ukrSibUsdSell = Double.parseDouble(parseukrSibBankUsdSell); // USD for selling in ukrSibBank bank

        System.out.println("ukrSibUsdBuy is " + ukrSibUsdBuy);
        System.out.println("ukrSibUsdSell is " + ukrSibUsdSell);
    }

    @Test(priority = 3)
    public void universalBank() {
        driver.get("https://www.universalbank.com.ua//");
        String parseUniversalBankUsdBuy = driver.findElement(universalBankUsdBuy).getText();
        universalUsdBuy = Double.parseDouble(parseUniversalBankUsdBuy); // USD for buying in universal bank

        String parseUniversalBankUsdSell = driver.findElement(universalBankUsdSell).getText();
        universalUsdSell = Double.parseDouble(parseUniversalBankUsdSell); // USD for buying in universal bank

        System.out.println("universalUsdBuy is " + universalUsdBuy);
        System.out.println("universalUsdSell is " + universalUsdSell);
    }

    @Test(priority = 4)
    public void oschadbank() {
        driver.get("https://www.oschadbank.ua/ua");
        String parseOschadBankUsdBuy = driver.findElement(oschadBankUsdBuy).getAttribute("data-buy");
        oschadUsdBuy = Double.parseDouble(parseOschadBankUsdBuy); // USD for buying in oschad bank

        String parseOschadBankUsdSell = driver.findElement(oschadBankUsdSell).getAttribute("data-sell");
        oschadUsdSell = Double.parseDouble(parseOschadBankUsdSell); // USD for buying in oschad bank

        System.out.println("oschadUsdBuy is " + oschadUsdBuy);
        System.out.println("oschadUsdSell is " + oschadUsdSell);

    }

    @Test(priority = 5)
    public void nby() {
        driver.get("https://www.bank.gov.ua/control/uk/curmetal/detail/currency?period=daily");
        String parseNbuBankUsdBuy = driver.findElement(nbuUsdSell).getText();
        unbuUsdBuy = Double.parseDouble(parseNbuBankUsdBuy); // USD for buying in NBU bank
        System.out.println("unbuUsdBuy is " + unbuUsdBuy);

    }

}
