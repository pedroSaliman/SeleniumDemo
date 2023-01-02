package pages;

import org.openqa.selenium.By;

public class ComparePage extends PageBase{
    private static final By Clear=By.xpath("//a[normalize-space()='Clear list']");
    private static final By Message=By.xpath("//div[@class='no-data']");
    public String Text(){
        return getText(Message);
    }

    public void RemoveProduct(){
        click(Clear);
    }
}
