package Factory;

import org.aeonbits.owner.Config;

@Config.Sources(value = "file:E:/seleniumprojects/gitendtoend/SeleniumEndToEnd/src/test/java/resources/FrameWorkConfig.properties")
public interface FrameWorkConfig extends Config {
    String url();
    String fname();
    String lname();
    String email();
    String telephone();
    String password();
    String confirm();
    String product();
    String changepassword();
    String anotherproduct();
    String company();
    String numberofproduct();
    String currency();
    int thenumber();
    String browser();
    String anotherbrowser();
    String tittlereview();
    String text();
    String friendemail();
    String bodytext();

}
