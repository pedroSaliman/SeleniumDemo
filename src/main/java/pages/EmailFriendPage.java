package pages;

import org.openqa.selenium.By;

public class EmailFriendPage extends PageBase{
    private static final By Friendemail=By.xpath("//input[@id='FriendEmail']");
    private static final By personalmessage=By.xpath("//textarea[@id='PersonalMessage']");
    private static final By submit=By.xpath("//button[normalize-space()='Send email']");
    private static final By Message=By.xpath("//div[@class='result']");

    public void EmailInfo(String friendemail,String body){
        type(Friendemail,friendemail);
        type(personalmessage,body);
        click(submit);
    }
    public String EmailMessage(){
        return getText(Message);
    }
}
