package tests.currencyconverterpagetests;

import data.CurrencyData;
import data.TestsData;
import org.testng.annotations.DataProvider;

public class MainPageDataProvider extends TestsData{

    @DataProvider(name = "Labels Visibility")
    public static Object[][] testLabelsVisibility(){

        return new Object[][]{{}};
    }

    @DataProvider(name = "Currency Converter")
    public static Object[][] testCurrencyConvertver(){
        CurrencyData currencyDataOneDollar = new CurrencyData();
        currencyDataOneDollar.setCurrencyAmount(TestsData.getOneDollar());
        CurrencyData currencyDataTwoDollars = new CurrencyData();
        currencyDataTwoDollars.setCurrencyAmount(TestsData.getTwoDollars());
        return new Object[][]{{currencyDataOneDollar, currencyDataTwoDollars}};
    }
}
