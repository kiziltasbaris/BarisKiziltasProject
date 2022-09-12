import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxesPage {

    public CheckBoxesPage()
    {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//input[@type='checkbox'])[1]")
    WebElement checkBox1;
    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    WebElement checkBox2;

    public boolean checkBox1()
    {
        boolean isNotSelected = false;

        if(!checkBox1.isSelected())
        {
            isNotSelected = true;
        }

        return isNotSelected;
    }

    public boolean checkBox2()
    {
        boolean isSelected = false;

        if(!checkBox1.isSelected())
        {
            isSelected = true;
        }

        return isSelected;
    }


    public boolean checkBoxes()
    {
        boolean checkbox1 = checkBox1();
        boolean checkbox2 = checkBox2();
        boolean isPassed = checkbox1 && checkbox2;

        return isPassed;
    }


}
