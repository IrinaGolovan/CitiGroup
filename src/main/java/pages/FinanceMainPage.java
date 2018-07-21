package pages;

import org.openqa.selenium.By;
import webcomponents.InputBox;
import webcomponents.Label;

public class FinanceMainPage {
    private Label FinanceByLabel = new Label(By
            .xpath(".//ancestor::div[@class='logo']//*[contains(@href, 'source=finance.tut.by')]"));
    private InputBox bynCurrencyInputBox = new InputBox(By.xpath(".//input[@data-currency='BYN']"));
    private InputBox usdCurrencyInputBox = new InputBox(By.xpath(".//input[@data-currency='USD']"));
    private InputBox eurCurrencyInputBox = new InputBox(By.xpath(".//input[@data-currency='EUR']"));
    private InputBox rubCurrencyInputBox = new InputBox(By.xpath(".//input[@data-currency='RUB']"));
    private Label loanRequestLabel = new Label(By.xpath("//a[contains(@href, '//finance.tut.by/credit_order/')]"));
    private Label cardsRequestLabel =
            new Label(By.xpath("//a[contains(@href, 'https://finance.tut.by/karty/') and contains(@data-ua-hash, 'data-ua-hash=”finance.tut.by')]"));
    private Label moneyForBusinessLabel =
            new Label(By.xpath("//a[contains(@href, '//finance.tut.by/credits/business/') and contains(@data-ua-hash, 'data-ua-hash=”finance.tut.by_main_center')]"));
    private Label rkoRequestLabel =
            new Label(By.xpath("//a[contains(@href, '//finance.tut.by/zayavka-na-rko') and contains(@data-ua-hash, 'data-ua-hash=”finance.tut.by_main_center')]"));

    public FinanceMainPage waitForFinanceMainPageToBeLoaded(){
        FinanceByLabel.waitForElementToBeVisible(3);
        return this;
    }

    public FinanceMainPage typeIntoBYNCurrencyInputBox(String value){
        bynCurrencyInputBox.clear();
        bynCurrencyInputBox.typeText(value);
        return this;
    }

    public FinanceMainPage typeIntoUSDCurrencyInputBox(String value){
        usdCurrencyInputBox.clear();
        usdCurrencyInputBox.typeText(value);
        return this;
    }

    public FinanceMainPage typeIntoEURCurrencyInputBox(String value){
        eurCurrencyInputBox.clear();
        eurCurrencyInputBox.typeText(value);
        return this;
    }

    public FinanceMainPage typeIntoRUBCurrencyInputBox(String value){
        rubCurrencyInputBox.clear();
        rubCurrencyInputBox.typeText(value);
        return this;
    }

    public String getBYNCurrencyInputBoxValue() {
        bynCurrencyInputBox.waitForElementToBeVisible(2);
        return bynCurrencyInputBox.getValue();
    }

    public String getUSDCurrencyInputBoxValue() {
        return usdCurrencyInputBox.getText().trim();
    }

    public String getEURCurrencyInputBoxValue() {
        return eurCurrencyInputBox.getText().trim();
    }

    public String getRUBCurrencyInputBoxValue() {
        return rubCurrencyInputBox.getText().trim();
    }

    public void clearBYNCurrencyInputBox(){
        bynCurrencyInputBox.clear();
    }

    public void clearUSDCurrencyInputBox(){
        usdCurrencyInputBox.clear();
    }

    public void clearEURCurrencyInputBox(){
        eurCurrencyInputBox.clear();
    }

    public void clearRUBCurrencyInputBox(){
        rubCurrencyInputBox.clear();
    }

    public boolean isLoanRequestLabelVisible(){
        return loanRequestLabel.isDisplayed();
    }

    public boolean isCardsRequestLabelLabelVisible(){
        return cardsRequestLabel.isDisplayed();
    }

    public boolean isMoneyForBusinessLabelVisible(){
        return moneyForBusinessLabel.isDisplayed();
    }

    public boolean isRKORequestLabelVisible(){
        return rkoRequestLabel.isDisplayed();
    }

    public float calculateCorrectCourseForBYN(float course, float currencyAmount){
        return course * currencyAmount;
    }

    public Label getLoanRequestLabel() {
        return loanRequestLabel;
    }

    public Label getCardsRequestLabel() {
        return cardsRequestLabel;
    }

    public Label getMoneyForBusinessLabel() {
        return moneyForBusinessLabel;
    }

    public Label getRkoRequestLabel() {
        return rkoRequestLabel;
    }
}
