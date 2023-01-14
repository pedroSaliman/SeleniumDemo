package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class TestCases extends BaseTest{


    @Test
    public void Register(){
        new HomePage().regClick().RegisterProcess(config.fname(),config.lname(),  email, config.company(),config.password(),config.confirm());
        Assert.assertTrue(new MyAccountPage().message().contains("complete"));
    }
    ///////////////////////////////////////////////////////////////////
    @Test(dependsOnMethods = {"Register"})
    public void Log(){
        new HomePage().LoginClick().LogIn(email, config.password());
        Assert.assertEquals(new HomePage().Text(),"My account");

    }

    ///////////////////////////////////////////////////////////////////////////

    @Test(dependsOnMethods = {"Log"})
    public void changeCurrency(){
        new HomePage().currencySelect(config.thenumber());
        new HomePage().clicksearch(config.product()).clicktoproductpage();
        Assert.assertTrue(new ProductPage().Price().contains("€"));

    }
/////////////////////////////////////////////////

    @Test(dependsOnMethods = {"changeCurrency"})
    public void Search(){
        new HomePage().clicksearch(config.product()).clicktoproductpage();
        Assert.assertTrue(new ProductPage().message().contains("Apple MacBook"));
    }
    ///////////////////////////////////////////////////////
    @Test(dependsOnMethods = {"Search"})
    public void WishCase(){
        new ProductPage().clicktowish().wishUpdate(config.numberofproduct());
        Assert.assertEquals(new WishListPage().TheTotal(),"€4644.00");
        new WishListPage().remove();
        Assert.assertEquals(new WishListPage().finalMessage(),"The wishlist is empty!");
    }
    //////////////////////////////////////////////////////////
    @Test(dependsOnMethods = {"WishCase"})
    public void CompareCase(){
        new HomePage().clicksearch(config.product()).clicktoproductpage().CompareProduct();
        new HomePage().clicksearch(config.anotherproduct()).clickasus().CompareProduct();
        new ComparePage().RemoveProduct();
        Assert.assertTrue(new ComparePage().Text().contains("have no items"));
    }

}
