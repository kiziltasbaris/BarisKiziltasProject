import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class JavascriptErrorPage {
    public JavascriptErrorPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void errorHandle()
    {
       LogEntries logs = Driver.getDriver().manage().logs().get(LogType.BROWSER);
       boolean isPassed = false;
       for(LogEntry logEntry: logs)
       {

           if(logEntry.getMessage().toLowerCase().contains("cannot read properties of undefined (reading 'xyz')".toLowerCase()))
           {
                isPassed = true;
           }
       }

        Assert.assertTrue(isPassed);


    }




}
