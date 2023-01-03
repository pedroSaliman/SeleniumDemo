package pages;

import org.openqa.selenium.By;

public class SearchPage extends PageBase{
    private static final By productlink=By.xpath("//h2[@class='product-title']//a[contains(text(),'Apple MacBook Pro 13-inch')]");
    private static final By asusproductlink=By.xpath("//h2[@class='product-title']//a[contains(text(),'Asus N551JK-XO076H Laptop')]");
    public ProductPage clicktoproductpage(){
        click(productlink);
        return new ProductPage();
    }
    public ProductPage clickasus(){
        click(asusproductlink);
        return new ProductPage();
    }
}
