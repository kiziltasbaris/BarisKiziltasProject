import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class DropDownPage {
    public DropDownPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "dropdown")
    WebElement dropDown;


    public void dropDownMethod()  {


        Select dropDown1 = new Select(dropDown);
        boolean testPassed1 = false;
        boolean testPassed2 = false;
        dropDown1.selectByVisibleText("Option 1");
        if(dropDown1.getFirstSelectedOption().getText().equalsIgnoreCase("Option 1"))
        {
            testPassed1 = true;
        }



        dropDown1.selectByVisibleText("Option 2");
        if(dropDown1.getFirstSelectedOption().getText().equalsIgnoreCase("Option 2"))
        {
            testPassed2 = true;
        }


        Assert.assertTrue(testPassed1 && testPassed2);

    }
}
