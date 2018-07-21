package tests.currencyconverterpagetests;

import data.CurrencyData;
import data.configInformation.BasePage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import steps.FinanceMainPageSteps;
import steps.MainPageSteps;
import utils.StringUtils;
import webcomponents.Label;
import java.util.List;

public class MainPage extends BasePage {

    @Test(priority = 1, dataProviderClass = MainPageDataProvider.class, dataProvider = "Labels Visibility")
    public void testLabelsVisibility() {
        SoftAssert softAssert = new SoftAssert();
        FinanceMainPageSteps financeMainPageSteps = new FinanceMainPageSteps();
        financeMainPageSteps.waitForFinanceMainPageToBeLoaded();
        List<Label> financePageLabels = financeMainPageSteps.getRequiredLabels();
        softAssert.assertTrue(financePageLabels.get(0).isDisplayed(), "Loan Request Label is not displayed");
        softAssert.assertTrue(financePageLabels.get(1).isDisplayed(), "Cards Order Label is not displayed");
        softAssert.assertTrue(financePageLabels.get(2).isDisplayed(), "Money for Business Label is not displayed");
        softAssert.assertTrue(financePageLabels.get(3).isDisplayed(), "RKO Label is not displayed");
        softAssert.assertAll();
    }

    @Test(priority = 2, dataProviderClass = MainPageDataProvider.class, dataProvider = "Currency Converter")
    public void testCurrencyConvertver(CurrencyData currencyDataOneDollar, CurrencyData currencyDataTwoDollars) {
        MainPageSteps mainPageSteps = new MainPageSteps();
        SoftAssert softAssert = new SoftAssert();
        FinanceMainPageSteps financeMainPageSteps = new FinanceMainPageSteps();
        String activeCourse = String.valueOf(StringUtils.roundCurrencyCourse(Float
                .valueOf(mainPageSteps.getActiveCourse())));
        financeMainPageSteps.waitForFinanceMainPageToBeLoaded();
        float expectedCourse = Float.valueOf(currencyDataOneDollar.getCurrencyAmount()) * Float.valueOf(activeCourse);
        financeMainPageSteps.calculateCourseForBYN_USDpair(currencyDataOneDollar.getCurrencyAmount(), activeCourse);
        String val = financeMainPageSteps.getBYNValue();
        softAssert.assertEquals(String.valueOf(expectedCourse).substring(0,1), val,
                "BYN/USD Course calculated is not correct");
        float expectedCourse2 = Float.valueOf(currencyDataTwoDollars.getCurrencyAmount()) * Float.valueOf(activeCourse);
        financeMainPageSteps.calculateCourseForBYN_USDpair(currencyDataTwoDollars.getCurrencyAmount(), activeCourse);
        String val2 = financeMainPageSteps.getBYNValue();
        softAssert.assertEquals(String.valueOf(expectedCourse2).substring(0,1), val2,
                "BYN/USD Course calculated is not correct");
        softAssert.assertAll();
    }

}
