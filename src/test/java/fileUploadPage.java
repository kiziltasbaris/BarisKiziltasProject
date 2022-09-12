import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class fileUploadPage {


    public fileUploadPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//input[@id='file-upload']")
    WebElement chooseFileButton;

    @FindBy(xpath = "//input[@id='file-submit']")
    WebElement uploadButton;

    @FindBy(xpath = "//div/h3")
    WebElement textMessage;



    private String filePath = "C:\\Users\\16475\\Downloads\\1_hfMP2vY7DDvtXtfPepU90A.jpeg";


    public void fileUploadMethod() throws InterruptedException {



        Thread.sleep(2000);
        chooseFileButton.sendKeys(filePath);
        Thread.sleep(2000);
        uploadButton.click();
        Thread.sleep(2000);

        boolean testPassed1 = true;
        boolean testPassed2 = false;


        if (textMessage.isDisplayed()){
            System.out.println(testPassed1);
        }

        if (!textMessage.isDisplayed())
        {
            System.out.println(testPassed2);
        }

    }


    }

