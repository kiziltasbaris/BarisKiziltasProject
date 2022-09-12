import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage  {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "username")
    WebElement userName;

    @FindBy(id = "password")
    WebElement password;
    @FindBy(tagName = "button")
    WebElement loginButton;



    public void inputUsername(String username)
    {
        this.userName.sendKeys(username);
    }


    public void inputPassword(String password)
    {
        this.password.sendKeys(password);
    }


    public void clickLogin()
    {
        loginButton.click();
    }





}
