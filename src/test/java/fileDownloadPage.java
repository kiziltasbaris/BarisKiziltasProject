import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.File;


public class fileDownloadPage {

    public fileDownloadPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//a)[2]")
    WebElement txt;
    @FindBy(xpath = "(//a)[3]")
    WebElement jpeg;
    @FindBy(xpath = "(//a)[4]")
    WebElement jpg;

    public void fileDownloadMethod() throws InterruptedException {
        Actions action = new Actions(Driver.getDriver());

        action.keyDown(Keys.CONTROL).click(txt).build().perform();
        Thread.sleep(5000);
        action.keyDown(Keys.CONTROL).click(jpeg).build().perform();
        Thread.sleep(5000);
        action.keyDown(Keys.CONTROL).click(jpg).build().perform();


        File fileTXT = new File("C:\\Users\\16475\\Downloads\\some-file.txt");
        File fileJPEG = new File("C:\\Users\\16475\\Downloads\\1_hfMP2vY7DDvtXtfPepU90A.jpeg");
        File fileJPG = new File("C:\\Users\\16475\\Downloads\\aaa.jpg");

        boolean testPassed = fileTXT.exists() && fileJPEG.exists() && fileJPG.exists();

        Assert.assertTrue(testPassed);



    }

}
