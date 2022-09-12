import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class floatingMenuPage {


    public floatingMenuPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h3[normalize-space()='Floating Menu']")
    WebElement floatMenu;

    public void floatingMenuMethod() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,4000)");
        Thread.sleep(5000);

          boolean testPassed1= true;
          boolean testPassed2=false;

        if (floatMenu.isDisplayed())
        {

            System.out.println(testPassed1);

        }

        if (!floatMenu.isDisplayed())
        {
            System.out.println(testPassed2);
        }





    }
}
