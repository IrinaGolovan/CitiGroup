package steps;

import pages.FinanceMainPage;
import pages.MainTytByPage;
import webcomponents.Label;
import java.util.LinkedList;
import java.util.List;

public class FinanceMainPageSteps {

    FinanceMainPage financeMainPage = new FinanceMainPage();
    MainTytByPage mainTytByPage = new MainTytByPage();

    public FinanceMainPage waitForFinanceMainPageToBeLoaded(){
        return mainTytByPage
                .getFinanceMainPage()
                .waitForFinanceMainPageToBeLoaded();
    }

    public float calculateCourseForBYN_USDpair(String USD_value, String course){
        return financeMainPage
                .typeIntoUSDCurrencyInputBox(USD_value)
                .calculateCorrectCourseForBYN(Float.parseFloat(course), Float.parseFloat(USD_value));
    }

    public String getBYNValue(){
        return financeMainPage.getBYNCurrencyInputBoxValue();
    }

    public List<Label> getRequiredLabels(){
        List<Label> labels = new LinkedList();
        labels.add(financeMainPage.getLoanRequestLabel());
        labels.add(financeMainPage.getCardsRequestLabel());
        labels.add(financeMainPage.getMoneyForBusinessLabel());
        labels.add(financeMainPage.getRkoRequestLabel());
        return labels;
    }

}
