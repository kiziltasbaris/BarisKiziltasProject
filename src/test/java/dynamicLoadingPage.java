import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class dynamicLoadingPage {

    public dynamicLoadingPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath ="//button[normalize-space()='Start']")
    WebElement startButton;

    @FindBy(xpath = "//h4[normalize-space()='Hello World!']")
    WebElement textMessage;


    public void controlPageMethod()
    {


        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        startButton.click();
        wait.until(ExpectedConditions.visibilityOf(textMessage));



        boolean b = false;

        if (textMessage.isDisplayed()) {
            boolean text = textMessage.isDisplayed();
            System.out.println("Hello world is displayed : " + text);

        }

        if (!textMessage.isDisplayed())
        {
            System.out.println("Hello world isn't displayed : " + b);
        }
    }
    }





