package webcomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class DropDownList extends Element{

    public DropDownList(By by){
        super(by);
    }

    public void select(String value){
        if(findWebElement().getTagName().equals("select")){
            Select select = new Select(findWebElement());
            select.selectByValue(value);
        }else{
            clickUntilOpen("class", "dropdown-open");
            DropDownOption option = new DropDownOption(By.xpath(".//div[contains(text(),'" + value + "')]"));
            option.click();
        }
    }
}
