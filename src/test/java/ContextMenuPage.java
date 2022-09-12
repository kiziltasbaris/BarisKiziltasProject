import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContextMenuPage {
    public ContextMenuPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "hot-spot")
    WebElement contextMenu;



    public boolean verifyAlertMessage()
    {
        boolean isPassed = false;
        Actions actions = new Actions(Driver.getDriver());
        actions.contextClick(contextMenu).perform();
        if(Driver.getDriver().switchTo().alert().getText().contains("selected a context"))
        {
            isPassed = true;
        }

        return isPassed;
    }


}
