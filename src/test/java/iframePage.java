import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class iframePage {

    public iframePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }




    public void iframePage2() {

        Driver.getDriver().findElement(By.xpath("//div[@aria-label='Close']//*[name()='svg']")).click();
        Driver.getDriver().switchTo().frame("mce_0_ifr");
        WebElement html = Driver.getDriver().findElement(By.xpath("//html"));
        WebElement body = Driver.getDriver().findElement(By.xpath("//html//body"));
        body.clear();
        body.sendKeys("My name is Baris");
        System.out.println(html.getText());
        String htmlSentence = html.getText();
        Assert.assertTrue(htmlSentence.contains("My name is Baris"));

        }

    }
