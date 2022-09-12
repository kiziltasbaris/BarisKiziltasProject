import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class AlertPage {


    public AlertPage() {
        PageFactory.initElements(Driver.getDriver(), this);
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void alertMethod()  {

        /*Click for JS Alert
        Test Clicks on JS Alert Button.
        Test asserts alert message.
         */

       WebElement clickJsAlert= Driver.getDriver().findElement(By.xpath("//button[text()='Click for JS Alert']"));
        clickJsAlert.click();
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.getText();
        String actual=Driver.getDriver().switchTo().alert().getText();
        String expected="I am a JS Alert";
        Assert.assertEquals(actual,expected,"It is not matched.");

       /*  Click for JS Confirm
         Test clicks on JS confirm Button and clicks ok on alert.
         Test asserts the alert message

        */

        WebElement clickJsConfirm=Driver.getDriver().findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        clickJsConfirm.click();
        Alert alert1=Driver.getDriver().switchTo().alert();
        System.out.println(alert1.getText());
        String actualJsConfirm=Driver.getDriver().switchTo().alert().getText();
        String expectedJsConfirm="I am a JS Confirm";
        Assert.assertEquals(actualJsConfirm,expectedJsConfirm,"It's not matched");
        alert1.accept();

        /*
        Test clicks on JS Prompt Button and types a message on Prompt.
        Test asserts that the alert message contains the typed message.
         */

        WebElement clickJsPrompt = Driver.getDriver().findElement(By.xpath("//button[text()='Click for JS Prompt']"));
        clickJsPrompt.click();
        Alert alert2=Driver.getDriver().switchTo().alert();
        System.out.println("The message displayed on alert : " + alert2.getText());
        alert2.sendKeys("Hello I'm Neo.");
        alert2.accept();

        String result =Driver.getDriver().findElement(By.xpath("//p[@id='result']")).getText();
        System.out.println(result);

        if (result.contains("Hello I'm Neo."))
        {
            System.out.println("code works");
        }

        else
        {
            System.out.println("Please try again.");
        }

    }
}
