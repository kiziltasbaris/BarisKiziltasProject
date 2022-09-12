import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class MouseHoverPage {

    public MouseHoverPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='example']//div[1]//img[1]")
    WebElement userName1;

    @FindBy(xpath = "//div[@class='row']//div[2]//img[1]")
    WebElement userName2;

    @FindBy(xpath = "//div[3]//img[1]")
    WebElement userName3;





    public void MouseHoverMethod() throws InterruptedException {



            Actions actions = new Actions(Driver.getDriver());
            actions.moveToElement(userName1).perform();
            Thread.sleep(2000);
            WebElement userName1Text=Driver.getDriver().findElement(By.xpath("//h5[normalize-space()='name: user1']"));
            String str1=userName1Text.getText();
            System.out.println(str1);
            Thread.sleep(2000);
            Boolean result1=userName1Text.isDisplayed();
            System.out.println("username1 is displayed : " +result1);

            Actions actions1= new Actions(Driver.getDriver());
            actions1.moveToElement(userName2).perform();
            Thread.sleep(2000);
            WebElement userName2Text=Driver.getDriver().findElement(By.xpath("//h5[normalize-space()='name: user2']"));
            String str2=userName2Text.getText();
            System.out.println(str2);
            Thread.sleep(2000);
            Boolean result2=userName2Text.isDisplayed();
            System.out.println("username2 is displayed :  "+result2);

            Actions actions2 = new Actions(Driver.getDriver());
            actions2.moveToElement(userName3).perform();
            Thread.sleep(2000);
            WebElement userName3Text=Driver.getDriver().findElement(By.xpath("//h5[normalize-space()='name: user3']"));
            String str3=userName3Text.getText();
            System.out.println(str3);
            Thread.sleep(2000);
            Boolean result3=userName3Text.isDisplayed();
            System.out.println("username3 is displayed :  "+ result3);







    }
}
