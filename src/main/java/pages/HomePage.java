package pages;

import com.beust.ah.A;
import org.openqa.selenium.By;

public class HomePage extends PageBase{
    private static final By RegisterButton=By.xpath("//a[normalize-space()='Register']");
    private static final By Searchbar=By.xpath("//input[@id='small-searchterms']");
    private static final By LoginButton=By.xpath("//a[normalize-space()='Log in']");
    private static final By LogoutButton=By.xpath("//a[normalize-space()='Log out']");
    private static final By acountButtonText=By.xpath("//a[@class='ico-account']");
    private static final By Currency=By.xpath("//select[@id='customerCurrency']");
    ///////////////////////////////////////////////////////////////////////////////////////////////////
    public String Text(){
        return getText(acountButtonText);
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////
    public void currencySelect(int thenumber){

        selectbyindex(e->e.selectByIndex(thenumber),Currency);

    }

    /////////////Register Click Button///////////////////
    public RegisterPage regClick(){
        click(RegisterButton);
        return new RegisterPage();
    }
    //////////////Search///////
    public SearchPage clicksearch(String product){
        type(Searchbar,product);
        clickandpressenter(Searchbar);

        return new SearchPage();
    }
    ///////////////////////////////////////////
    public Login LoginClick(){

        click(LoginButton);

        return new Login();
    }

}
