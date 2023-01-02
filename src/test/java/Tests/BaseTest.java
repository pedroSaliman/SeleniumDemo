package Tests;

import Factory.FrameWorkConfig;
import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.PageBase;

import java.util.Locale;

public class BaseTest {
     WebDriver driver;
    Faker faker = new Faker(new Locale("es"));
    String email=faker.internet().safeEmailAddress();
    FrameWorkConfig config;
    @BeforeSuite
    public void setup(){
        config= ConfigFactory.create(FrameWorkConfig.class);
        driver= WebDriverManager.chromiumdriver().create();
        driver = new ChromeDriver();
        driver.get(config.url());
        driver.manage().window().maximize();


        new PageBase().setDriver(driver);





    }
    @AfterSuite
    public void TearDown(){
        driver.quit();
    }
}
