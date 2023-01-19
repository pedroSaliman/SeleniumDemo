package pages;

import org.openqa.selenium.By;

public class ReviewPage extends PageBase{
    private static final By tittl=By.xpath("//input[@id='AddProductReview_Title']");
    private static final By text=By.xpath("//textarea[@id='AddProductReview_ReviewText']");
    private static final By check=By.xpath("//input[@id='addproductrating_3']");
    private static final By submit=By.xpath("//button[normalize-space()='Submit review']");
    private static final By Message=By.xpath("//div[@class='result']");


    public void AddReviewInfo(String theTittle,String BodyText){
        type(tittl,theTittle);
        type(text,BodyText);
        click(check);
        click(submit);
    }

    public String ReviewMessage(){
        return getText(Message);
    }
}
