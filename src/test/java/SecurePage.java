import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecurePage {
    public SecurePage()
    {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "\"//div[@id='flash']\"")
    WebElement bannerMessage;


    public boolean verifyBannerMessage()
    {
        String bannerMessage = Driver.getDriver().findElement(By.xpath("//div[@id='flash']")).getText();
        boolean invalid = true;

        if(!bannerMessage.contains("You logged into"))
        {
            invalid = false;
        }


        return invalid;
    }

}
