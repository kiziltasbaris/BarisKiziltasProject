import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSteps {

    WebDriver driver;
    LoginPage lg;
    SecurePage sc;
    CheckBoxesPage cbp;
    ContextMenuPage cmp;
    dragAndDropPage drg;
    DropDownPage drp;

    iframePage frame;

    MouseHoverPage mhv;

    TabsPage tp;

    AlertPage alert;

    fileUploadPage uploadPage;

    fileDownloadPage downloadPage;

    floatingMenuPage floatingMenu;

    notificationMessagePage nmp;

    JavascriptErrorPage jep;

    dynamicContentPage dynamicContent;

    dynamicControlPage dcp;

    dynamicLoadingPage dlp;



    @BeforeMethod
    public void setup() {
        System.out.println();
        this.driver = Driver.getDriver();
        lg = new LoginPage();
        sc = new SecurePage();
        cbp = new CheckBoxesPage();
        cmp = new ContextMenuPage();
        drg = new dragAndDropPage();
        drp = new DropDownPage();
        frame = new iframePage();
        mhv = new MouseHoverPage();
        tp= new TabsPage();
        alert= new AlertPage();
        uploadPage = new fileUploadPage();
        downloadPage=new fileDownloadPage();
        floatingMenu=new floatingMenuPage();
        nmp= new notificationMessagePage();
        jep  = new JavascriptErrorPage();
        dcp= new dynamicControlPage();
        dlp=new dynamicLoadingPage();
        dynamicContent= new dynamicContentPage();




    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }

    @Test(priority = 0)
    public void taskOne() {
        driver.get("http://localhost:7080/login");
        String username = "tomsmith";
        String password = "SuperSecretPassword!";
        lg.inputUsername(username);
        lg.inputPassword(password);
        lg.clickLogin();
        Assert.assertTrue(sc.verifyBannerMessage());
    }

    @Test(priority = 1)
    public void taskTwo() {
        driver.get("http://localhost:7080/login");
        String username = "BarisKiziltas";
        String password = "SuperSecretPassword!";
        lg.inputUsername(username);
        lg.inputPassword(password);
        lg.clickLogin();
        Assert.assertFalse(sc.verifyBannerMessage());

    }

    @Test(priority = 2)
    public void taskThree() {
        driver.get("http://localhost:7080/checkboxes");
        Assert.assertTrue(cbp.checkBoxes());
    }

    @Test(priority = 3)
    public void taskFour() {
        driver.get("http://localhost:7080/context_menu");
        Assert.assertTrue(cmp.verifyAlertMessage());
    }

    @Test(priority = 4)
    public void taskFive() {
        driver.get("http://localhost:7080/drag_and_drop");
        drg.dragAndDropMethod();

    }

    @Test(priority = 5)
    public void taskSix()  {
        driver.get("http://localhost:7080/dropdown");
        drp.dropDownMethod();


    }

    @Test(priority = 6)
    public void taskSeven() {
        driver.get("http://localhost:7080/dynamic_content ");
        dynamicContent.dynamicContentMethod();

    }


    @Test(priority = 7)
    public void taskEight() {
        driver.get("http://localhost:7080/dynamic_controls");
        dcp.controlPageMethod();


    }

    @Test(priority = 8)
    public void taskNine() {
        driver.get("http://localhost:7080/dynamic_loading/2 ");
        dlp.controlPageMethod();

    }

    @Test(priority = 9)
    public void taskTeen() throws InterruptedException {
        driver.get("http://localhost:7080/download");
        downloadPage.fileDownloadMethod();

    }

    @Test(priority = 10)
    public void taskEleven() throws InterruptedException {
        driver.get("http://localhost:7080/upload");
        uploadPage.fileUploadMethod();

    }

    @Test(priority = 11)
    public void taskTwelve() throws InterruptedException {
        driver.get("http://localhost:7080/floating_menu");
        floatingMenu.floatingMenuMethod();


    }

    @Test(priority = 12)
    public void taskThirteenth() {
        driver.get("http://localhost:7080/iframe ");
        frame.iframePage2();


    }

    @Test(priority = 13)
    public void taskFourteenth() throws InterruptedException {
        driver.get("http://localhost:7080/hovers");
        mhv.MouseHoverMethod();
    }

    @Test(priority = 14)
    public void taskFifteenth() throws InterruptedException {
        driver.get("http://localhost:7080/javascript_alerts");
        alert.alertMethod();



    }

    @Test(priority = 15)
    public void taskSixTeen(){
        driver.get("http://localhost:7080/javascript_error");
        jep.errorHandle();
    }

    @Test(priority = 16)
    public void taskSeventeenth(){
        driver.get("http://localhost:7080/windows");
        tp.clickHereButton();
    }

    @Test(priority = 17)
    public void taskEighteen() throws InterruptedException {
        driver.get("http://localhost:7080/notification_message_rendered ");
        nmp.notificationMessageMethod();
    }





}
