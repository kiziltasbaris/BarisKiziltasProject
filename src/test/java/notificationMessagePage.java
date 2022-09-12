import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class notificationMessagePage {

    public notificationMessagePage() {PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//a[text()='Click here']")
    WebElement clickButton;

    @FindBy(xpath = "//div[@id='flash']")
    WebElement bannerMessage;

    public void notificationMessageMethod() {

         boolean controlWhile = false;
         int count = 0;
         int count2 =0;
         while(!controlWhile)
         {
             String[] array = {"Action successful","please try again"};
             clickButton.click();
             String message = bannerMessage.getText();

             for(int i = 0;i<array.length;i++)
             {
                 if(message.toLowerCase().contains(array[i].toLowerCase()))
                 {
                     array[i] =null;
                     count++;

                 }
             }
             count2++;
             if(count == 2)
             {
                 controlWhile = true;
             }


             if(count2 == 10)
             {
                 controlWhile = true;
             }

         }
         boolean isCompleted;


         if(count !=2)
         {
             isCompleted = false;
         }
         else
         {
             isCompleted = true;
         }

        Assert.assertTrue(isCompleted);


    }
}
