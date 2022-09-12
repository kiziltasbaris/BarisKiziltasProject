import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.Set;

    public class TabsPage {
        public TabsPage() {
            PageFactory.initElements(Driver.getDriver(), this);
        }
        @FindBy(xpath = "//a[text()='Click Here']")
        WebElement clickHereButton;

        public void clickHereButton() {

        this.clickHereButton.click();

        Set<String> allTabs=Driver.getDriver().getWindowHandles();
        for(String tab:allTabs){
            Driver.getDriver().switchTo().window(tab);

        }
        String actual=Driver.getDriver().getTitle();
        String expected="New Window";

        Assert.assertEquals(actual,expected,"The page isn't loaded.");
    }
    }

