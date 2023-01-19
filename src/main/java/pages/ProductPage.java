package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage extends PageBase{
    private static final By Result=By.xpath("//h1[normalize-space()='Apple MacBook Pro 13-inch']");
    private static final By AddToWish=By.xpath("//button[text()='Add to wishlist' and @data-productid ='4']");
    private static final By alertwish=By.xpath("//a[normalize-space()='wishlist']");
    private static final By TextOfCurrency=By.xpath("//span[text()=' €1548.00 ']");
    private static final By compareLink=By.cssSelector("div[class='compare-products'] button[type='button']");
    private static final By AlertCompare=By.xpath("//a[normalize-space()='product comparison']");
    private static final By AddReview=By.xpath("//a[normalize-space()='Add your review']");
    private static final By EmailFriend=By.xpath("//button[normalize-space()='Email a friend']");
    public EmailFriendPage clickEmail()
    {
        click(EmailFriend);
        return new EmailFriendPage();
    }
    ////////////////////////////////////
    public ReviewPage clickToReview()
    {
        click(AddReview);
        return new ReviewPage();
    }
////////////////////////////////////////////////
    public ComparePage CompareProduct(){
        click(compareLink);
        wait(AlertCompare);
        click(AlertCompare);
        return new ComparePage();
    }


    public String Price(){
        return getText(TextOfCurrency);
    }


    public String message(){

        return getText(Result);
    }
    public WishListPage clicktowish(){


        click(AddToWish);
        wait(alertwish);
        click(alertwish);
        return new WishListPage();
    }

}
