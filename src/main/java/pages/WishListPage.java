package pages;

import org.openqa.selenium.By;

public class WishListPage extends PageBase{
    private static final By Quantity=By.xpath("//input[@class='qty-input']");
    private static final By Total=By.xpath("//span[@class='product-subtotal']");
    private static final By removeButton=By.xpath("//button[@class='remove-btn']");
    private static final By Message=By.xpath("//div[@class='no-data']");
    private static final By UpButton=By.xpath("//button[@id='updatecart']");
    ///////////////////////////////////////
    public String TheTotal(){
        return getText(Total);
    }
    /////////////////////////////////
    public String finalMessage(){
        return getText(Message);
    }








    //////////////////

    public void wishUpdate(String NumberOfQuantity){
        find(Quantity).clear();
        type(Quantity,NumberOfQuantity);
        click(UpButton);



    }
    ///////////////////////////////
    public void remove(){
        click(removeButton);
    }
}
