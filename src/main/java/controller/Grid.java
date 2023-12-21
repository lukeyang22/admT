package controller;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import manager.Screenshot;
import manager.TestManager;
import manager.UIManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.http.ClientConfig;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.Compare;
import util.Load;
import webelement.PageObject;

import java.net.MalformedURLException;
import java.net.URI;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.net.URL;  //import URL
import org.openqa.selenium.remote.RemoteWebDriver; //import RemoteWebDriver
public class Grid extends Base{

    //private StringBuffer verificationErrors = new StringBuffer();
    private RemoteWebDriver driver;
    private String webElement="";
    //Constructor
    public Grid() {
        super();
    }
    //extent reports
    TestManager testManager = new TestManager();;
    ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(getReportPath()+"ExpectedConditions"+getDateTime()+".html");
    ExtentHtmlReporter htmlReporter1 = new ExtentHtmlReporter(getReportPath()+"Regression"+getDateTime()+".html");
    ExtentHtmlReporter htmlReporter2 = new ExtentHtmlReporter(getReportPath()+"Sanity"+getDateTime()+".html");

    //Call methods
    UIManager uimanager = new UIManager();Compare compare = new Compare();Load wait =new Load();Screenshot st= new Screenshot(); PageObject pg=new PageObject();
    ExtentReports extent = new ExtentReports();    Base bs = new Base();

   /* protected void testGrid(String bs) throws MalformedURLException {
        String browser=""; String remote_url="http://localhost:4444";
        switch(bs){
            case "chrome":
                DesiredCapabilities capability = new  DesiredCapabilities();
                capability.setBrowserName("chrome");
                capability.setPlatform(Platform.WIN11);
                try{ driver = new RemoteWebDriver(new URL(remote_url), capability);}
                catch(Exception e){System.err.println("****************RemoteWebDriver***********************"+e);}
                break;
            case "chrome_w":
                DesiredCapabilities capability_w = new  DesiredCapabilities();
                capability_w.setBrowserName("chrome_w");
                capability_w.setPlatform(Platform.WIN8);
                ClientConfig config = ClientConfig.defaultConfig().connectionTimeout(Duration.ofMinutes(20))
                        .readTimeout(Duration.ofMinutes(20)); // I change this 3 minute(Default) to 20 mi
                WebDriver remoteWebDriver = RemoteWebDriver.builder().oneOf(capability_w).address(remote_url).config(config).build(); // now you can use this remoteWebDriver.

               /* break;
            case "firefox":
                DesiredCapabilities capability_f = new  DesiredCapabilities();
                capability_f.setBrowserName("firefox");
                capability_f.setPlatform(Platform.WIN11);
                try{driver = new RemoteWebDriver(new URL(remote_url), capability_f);}
                catch(Exception e){System.err.println("****************RemoteWebDriver***********************"+e);}
                break;
            case "edge":
                DesiredCapabilities capability_e = new  DesiredCapabilities();
                capability_e.setBrowserName("MicrosoftEdge");
                capability_e.setPlatform(Platform.WIN11);
                try{driver = new RemoteWebDriver(new URL(remote_url), capability_e);}
                catch(Exception e){System.err.println("****************RemoteWebDriver***********************"+e);}
                break;
            case "firefox_mac":
                DesiredCapabilities capability_m = new  DesiredCapabilities();
                capability_m.setBrowserName("firefox");
                capability_m.setPlatform(Platform.MAC);
                try{driver = new RemoteWebDriver(new URL(remote_url), capability_m);}
                catch(Exception e){System.err.println("****************RemoteWebDriver***********************"+e);}
                break;
            case "firefox_linux":
                DesiredCapabilities capability_l = new  DesiredCapabilities();
                capability_l.setBrowserName("firefox");
                capability_l.setPlatform(Platform.LINUX);
                try{driver = new RemoteWebDriver(new URL(remote_url), capability_l);}
                catch(Exception e){System.err.println("****************RemoteWebDriver***********************"+e);}
                break;
            case "safari":
                DesiredCapabilities capability_s = new  DesiredCapabilities();
                capability_s.setBrowserName("safari");
                capability_s.setPlatform(Platform.MAC);
                try{driver = new RemoteWebDriver(new URL(remote_url), capability_s);}
                catch(Exception e){System.err.println("****************RemoteWebDriver***********************"+e);}
                break;
            default:
                SafariOptions optionsS = new SafariOptions();
                driver = new SafariDriver(optionsS);break;
        }
        String baseUrl = "";
        try{baseUrl=testManager.setProperty("url");}catch(Exception e){System.err.print(e);}
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get(baseUrl); driver.manage().window().maximize();wait.For(2);
    }*/
    protected void testGrid(String bs) throws MalformedURLException {
        String browser=""; String remote_url="http://localhost:4444";
        switch(bs){
            case "chrome":
                DesiredCapabilities capability = new  DesiredCapabilities();
                capability.setBrowserName("chrome");
                capability.setPlatform(Platform.WIN11);
                try{ driver = new RemoteWebDriver(new URL(remote_url), capability);}
                catch(Exception e){System.err.println("****************RemoteWebDriver***********************"+e);}
                break;
            case "chrome_w":
                DesiredCapabilities capability_w = new  DesiredCapabilities();
                capability_w.setBrowserName("chrome_w");
                capability_w.setPlatform(Platform.WIN8);
                ClientConfig config = ClientConfig.defaultConfig().connectionTimeout(Duration.ofMinutes(20))
                        .readTimeout(Duration.ofMinutes(20)); // I change this 3 minute(Default) to 20 mi
                WebDriver remoteWebDriver = RemoteWebDriver.builder().oneOf(capability_w).address(remote_url).config(config).build(); // now you can use this remoteWebDriver.

               /* try{ driver = new RemoteWebDriver(new URL(remote_url), capability_w);}
                catch(Exception e){System.err.println("****************RemoteWebDriver***********************"+e);}*/
                break;
            case "firefox":
                DesiredCapabilities capability_f = new  DesiredCapabilities();
                capability_f.setBrowserName("firefox");
                capability_f.setPlatform(Platform.WIN11);
                try{driver = new RemoteWebDriver(new URL(remote_url), capability_f);}
                catch(Exception e){System.err.println("****************RemoteWebDriver***********************"+e);}
                break;
            case "edge":
                DesiredCapabilities capability_e = new  DesiredCapabilities();
                capability_e.setBrowserName("MicrosoftEdge");
                capability_e.setPlatform(Platform.WIN11);
                try{driver = new RemoteWebDriver(new URL(remote_url), capability_e);}
                catch(Exception e){System.err.println("****************RemoteWebDriver***********************"+e);}
                break;
            case "firefox_mac":
                DesiredCapabilities capability_m = new  DesiredCapabilities();
                capability_m.setBrowserName("firefox");
                capability_m.setPlatform(Platform.MAC);
                try{driver = new RemoteWebDriver(new URL(remote_url), capability_m);}
                catch(Exception e){System.err.println("****************RemoteWebDriver***********************"+e);}
                break;
            case "firefox_linux":
                DesiredCapabilities capability_l = new  DesiredCapabilities();
                capability_l.setBrowserName("firefox");
                capability_l.setPlatform(Platform.LINUX);
                try{driver = new RemoteWebDriver(new URL(remote_url), capability_l);}
                catch(Exception e){System.err.println("****************RemoteWebDriver***********************"+e);}
                break;
            case "safari":
                DesiredCapabilities capability_s = new  DesiredCapabilities();
                capability_s.setBrowserName("safari");
                capability_s.setPlatform(Platform.MAC);
                try{driver = new RemoteWebDriver(new URL(remote_url), capability_s);}
                catch(Exception e){System.err.println("****************RemoteWebDriver***********************"+e);}
                break;
            default:
                SafariOptions optionsS = new SafariOptions();
                driver = new SafariDriver(optionsS);break;
        }
        String baseUrl = "";
        try{baseUrl=testManager.setProperty("url");}catch(Exception e){System.err.print(e);}
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get(baseUrl); driver.manage().window().maximize();wait.For(2);
    }
    public void pageTitleUrl(String browser,Integer testInt) throws MalformedURLException {
        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        ExtentTest test = extent.createTest("Test: ExpectedConditions - Page title and URL using Web Browser -- "+browser, "Test Booking - Adm Lucid");
        testGrid(browser);
        String s = "Index - Admlucid";
        String url = "https://www.admlucid.com/Golf";
        test.info("************************************* Check ExpectedConditions **********************************************");
        try{new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.titleIs(s));  test.pass("*****ExpectedConditions-titleIs is true");}catch(Exception e){test.fail("titleIs ERROR: "+e);}extent.flush();
        try{new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.titleContains(s));  test.pass("*****ExpectedConditions-titleContains is true");}catch(Exception e){test.fail("titleContains ERROR: "+e);}extent.flush();

        try{new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.urlToBe(url));test.pass("*****ExpectedConditions-urlToBe is true");}catch(Exception e){test.fail("urlToBe Error: "+e);}extent.flush();
        try{new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.urlContains(url));test.pass("*****ExpectedConditions-urlContains is true");}catch(Exception e){test.fail("urlContains Error: "+e);}extent.flush();
        try{new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.urlMatches(url));test.pass("*****ExpectedConditions-urlMatches is true");}catch(Exception e){test.fail("urlMatches Error: "+e);}extent.flush();

        driver.quit();
    }
    public void textToBetextMatches(String browser,Integer testInt) throws MalformedURLException{
        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        ExtentTest test = extent.createTest("Test: ExpectedConditions - textToBe textMatches using Web Browser -- "+browser, "Test textToBe - Adm Lucid");
        testGrid(browser);
        test.info("Validate texts of Book Golf Course");
        try{new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.textToBe(By.xpath("/html/body/div/main/h1"),"Golf Courses"));test.pass("*****ExpectedConditions-textToBe is true");}catch(Exception e){test.fail("textToBe Error: "+e);}extent.flush();
        try{new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("/html/body/div/main/table[1]/tbody/tr/td[1]/form/button"),"Search"));test.pass("*****ExpectedConditions-textToBePresentInElementLocated is true");}catch(Exception e){test.fail("textToBePresentInElementLocated Error: "+e);}extent.flush();

        driver.quit();
    }

    public void visibilityofElements(String browser,Integer testInt) throws MalformedURLException{
        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        ExtentTest test = extent.createTest("Test: ExpectedCondition Visibility - using Web Browser -- "+browser, "Test ExpectedCondition - Adm Lucid");
        testGrid(browser);driver.get("https://www.admlucid.com");
        //picture - visibility
        try{new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/main/div[1]/img")));test.pass("*****ExpectedConditions-visibilityOfElementLocated is true");}catch(Exception e){test.fail("visibilityOfElementLocated Error: "+e);}extent.flush();
        // picture - invisibility
        try{new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div/main/div[1]/img")));test.pass("*****ExpectedConditions-invisibilityOfElementLocated is true");}catch(Exception e){test.fail("invisibilityOfElementLocated Error: "+e);}extent.flush();

        driver.quit();
    }
    public void elementToBeSelected(String browser,Integer testInt) throws MalformedURLException{
        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        ExtentTest test = extent.createTest("Test: ExpectedCondition BeSelected - using Web Browser -- "+browser, "Test ExpectedCondition - Adm Lucid");
        testGrid(browser);driver.get("https://admlucid.com/Home/WebElements");
        //Check element to be selected
        test.info("Checkbox1 is not seelected");
        try{new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeSelected(By.id("Checkbox1")));test.pass("*****ExpectedConditions-elementToSelected is true");}catch(Exception e){test.fail("elementToSelected Error: "+e);}extent.flush();
        //Select Check box1
        test.info("select the checkbox1");
        driver.findElement(By.id("Checkbox1")).click();
        //Check element to be selected again
        test.info("Check the checkbox1 again after selected it");
        try{new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeSelected(By.id("Checkbox1")));test.pass("*****ExpectedConditions-elementToSelected is true");}catch(Exception e){test.fail("elementToSelected Error: "+e);}extent.flush();
        driver.quit();
    }
    public void elementToBeClickable(String browser,Integer testInt) throws  MalformedURLException{
        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        ExtentTest test = extent.createTest("Test: ExpectedCondition clickable - using Web Browser -- "+browser, "Test ExpectedCondition - Adm Lucid");
        testGrid(browser);driver.get("https://admlucid.com/Home/WebElements");
        JavascriptExecutor jse = (JavascriptExecutor) driver; // (driver is your browser webdriver object)
        jse.executeScript("window.scrollBy(0,document.body.scrollHeight || document.documentElement.scrollHeight)", "");
        //Check element to be clickable
        test.info("Check if 'Disable for 15s' is clickable");
        try{new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(By.id("Wait45")));test.pass("*****ExpectedConditions-elementToBeClickable is true");}catch(Exception e){test.fail("elementToBeClickable Error: "+e);}extent.flush();
        //Click on it
        test.info("Disable the button of 'Disable for 15s'");
        try{driver.findElement(By.id("Wait45")).click();}catch(Exception e){}
        //Check element to be selected again
        //test.info("Check the button of 'Disable for 15s' again after clicked it");
        try{new WebDriverWait(driver, Duration.ofSeconds(1)).until(ExpectedConditions.elementToBeClickable(By.id("Wait45")));test.pass("*****ExpectedConditions-elementToBeClickable is true");}catch(Exception e){test.fail("elementToBeClickable Error: "+e);}extent.flush();
        wait.For(2);
        driver.quit();
    }
    public void loginHerald(String browser, Integer testInt) throws  MalformedURLException{

        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        ExtentTest test = extent.createTest("Test: Color - Delete Golf Course from the Details of Golf Course using Web Browser -- "+browser, "Test Color - Adm Lucid");

        try{testGrid(browser); wait.For(2);test.pass("Open Web Browser");}catch(Exception e){test.fail("Could not open the web app"+e);} extent.flush();
        driver.get("https://calgaryherald.com/");wait.For(5);
        //Login
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[3]/div[2]/div/button")).click();
        driver.findElement(By.xpath("//*[@id=\"loginradius-login-emailid\"]")).sendKeys("lulukeyang@gmail.com");
        driver.findElement(By.id("loginradius-login-password")).sendKeys("Ca2022l134$");
        driver.findElement(By.id("loginradius-submit-login")).click();
    }
}
