import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class dynamicControlPage {

    public dynamicControlPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//button[normalize-space()='Remove']")
    WebElement removeButton;

	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement checkBox;

    @FindBy(xpath = "//button[normalize-space()='Add']")
    WebElement addButton;

    @FindBy(xpath = "//button[normalize-space()='Enable']")
    WebElement enableButton;

    @FindBy(xpath = "//button[normalize-space()='Disable']")
    WebElement disableButton;

    @FindBy(xpath= "//input[@type='text']")
    WebElement textBox;

    @FindBy(xpath = "//*[@id=\"message\"]")
    WebElement textMessage;


    public void controlPageMethod()
    {


        this.removeButton.click();

        // explicit wait for the add button
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(addButton));

        addButton.click();
        boolean slc=checkBox.isSelected();
        System.out.println("checkBox is selected :"+slc);

        enableButton.click();
        wait.until(ExpectedConditions.visibilityOf(textBox));

        boolean tb=textBox.isEnabled();
        System.out.println("text box is enabled :" +tb);

        disableButton.click();
        wait.until(ExpectedConditions.visibilityOf(textBox));

        boolean tb2=textBox.isDisplayed();
        System.out.println("text box is displayed :"+tb2);



/*

        // explicit wait for the message
        wait.until(ExpectedConditions.visibilityOf(message));
        // wait.until(ExpectedConditions.visibilityOf(ADD_BUTTON));

        addButton.click();
        wait.until(ExpectedConditions.visibilityOf(removeButton));

        enableButton.click();
        wait.until(ExpectedConditions.visibilityOf(message));

        boolean eb = textBox.isEnabled();
        System.out.println(eb);

        disableButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(enableButton));

*/
    }

}


