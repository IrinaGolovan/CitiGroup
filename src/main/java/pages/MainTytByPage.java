package pages;

import org.openqa.selenium.By;
import webcomponents.Label;
import webcomponents.Tab;

public class MainTytByPage {
    private Label tutByTab = new Label(By.xpath(".//a[contains(@title, 'TUT.BY - ')]"));
    private Label currentDollarCourse = new Label(By.cssSelector(".green"));
    private Tab financeTab = new Tab(By
            .xpath(".//ancestor::ul[@class='b-topbar-i']//*[contains(@href, 'https://finance.tut.by/#ua:top_menu')]"));

    public MainTytByPage waitForMainTytByPageToBeLoaded(){
        tutByTab.waitForElementToBeVisible(7);
        return this;
    }

    public String getCurrentDollarCourse() {
        String currentUSDcourse = currentDollarCourse.getText().trim().substring(1);
        return currentUSDcourse;
    }

    public FinanceMainPage getFinanceMainPage() {
        financeTab.waitForElementToBePresent();
        financeTab.click();
        return new FinanceMainPage();
    }

    public boolean isFinanceTabAvailable() {
        return financeTab.isDisplayed();
    }
}
