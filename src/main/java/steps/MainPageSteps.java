package steps;

import pages.FinanceMainPage;
import pages.MainTytByPage;

public class MainPageSteps {
    MainTytByPage mainTytByPage = new MainTytByPage();

    private MainTytByPage waitForMainTytByPagetoBeLoaded(){
        return mainTytByPage.waitForMainTytByPageToBeLoaded();
    }

    public String getActiveCourse(){
        return waitForMainTytByPagetoBeLoaded()
                .getCurrentDollarCourse();
    }

    public FinanceMainPage getFinanceMainPage(){
        return mainTytByPage.getFinanceMainPage();
    }
}
