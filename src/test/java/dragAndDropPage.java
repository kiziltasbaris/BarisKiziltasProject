import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class dragAndDropPage {

    public dragAndDropPage()
    {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "column-a")
    WebElement columnA;
    @FindBy(id = "column-b")
    WebElement columnB;

    public void dragAndDropMethod(){

        Actions action = new Actions(Driver.getDriver());
        action.dragAndDrop(columnA, columnB).build().perform();
        String str = Driver.getDriver().findElement(By.xpath("//div//div[2]/header")).getText();
        Assert.assertTrue(str.equals("B"),"its not matched.");

    }



}
