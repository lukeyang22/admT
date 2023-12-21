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
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.Compare;
import util.Load;
import webelement.PageObject;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class YT extends Base{

    //private StringBuffer verificationErrors = new StringBuffer();
    private RemoteWebDriver driver;
    private String webElement="";
    //Constructor
    public YT() {
        super();
    }
    //extent reports
    TestManager testManager = new TestManager();;
    ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(getReportPath()+"YouTube"+getDateTime()+".html");
    ExtentHtmlReporter htmlReporter1 = new ExtentHtmlReporter(getReportPath()+"Regression"+getDateTime()+".html");
    ExtentHtmlReporter htmlReporter2 = new ExtentHtmlReporter(getReportPath()+"Sanity"+getDateTime()+".html");
    public static Integer w = 50;
    //Call methods
    UIManager uimanager = new UIManager();Compare compare = new Compare();Load wait =new Load();Screenshot st= new Screenshot(); PageObject pg=new PageObject();
    ExtentReports extent = new ExtentReports();    Base bs = new Base();

    protected void testGrid(String bs) throws MalformedURLException {
        String browser=""; String remote_url="http://localhost:4444";
        switch(bs){
            case "chrome":
                ChromeOptions optionsc = new ChromeOptions();
                optionsc.addArguments("--ignore-ssl-errors=yes");
                optionsc.addArguments("--ignore-certificate-errors");
                try {  driver = new RemoteWebDriver(new URL(remote_url), optionsc);
                } catch (MalformedURLException e) { }
                break;
            case "firefox":
                FirefoxOptions optionsf = new FirefoxOptions();
                optionsf.addArguments("--ignore-ssl-errors=yes");
                optionsf.addArguments("--ignore-certificate-errors");
                try {  driver = new RemoteWebDriver(new URL(remote_url), optionsf);
                } catch (MalformedURLException e) { }
                break;
            case "edge":
                EdgeOptions optionse = new EdgeOptions();
                optionse.addArguments("--ignore-ssl-errors=yes");
                optionse.addArguments("--ignore-certificate-errors");
                try {  driver = new RemoteWebDriver(new URL(remote_url), optionse);
                } catch (MalformedURLException e) { }
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
    public void test1(String browser,Integer testInt) throws MalformedURLException {
        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        ExtentTest test1 = extent.createTest("Test: YT 1 -  using Web Browser -- "+browser, "Test YT - Adm Lucid");

        testGrid(browser);
        try{driver.get("https://youtu.be/3dF7kfkI34k");test1.info("Open YT 1");extent.flush();wait.For(w);

        driver.quit();}catch(Exception e){System.err.println(e);}
    }
    public void test2(String browser,Integer testInt) throws MalformedURLException {
        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        ExtentTest test2 = extent.createTest("Test: YT 2 -  using Web Browser -- "+browser, "Test YT - Adm Lucid");

        testGrid(browser);
        try{driver.get("https://youtu.be/K8pzZCN-5hU");test2.info("Open YT 2");extent.flush();wait.For(w);

        driver.quit();}catch(Exception e){System.err.println(e);}
    }
    public void test3(String browser,Integer testInt) throws MalformedURLException {
        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        ExtentTest test3 = extent.createTest("Test: YT 3 -  using Web Browser -- "+browser, "Test YT - Adm Lucid");

        testGrid(browser);
        try{driver.get("https://youtu.be/K00OTzPFXe8");test3.info("Open YT 3");extent.flush();wait.For(w);

        driver.quit();}catch(Exception e){System.err.println(e);}
    }
    public void test4(String browser,Integer testInt) throws MalformedURLException {
        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        ExtentTest test4 = extent.createTest("Test: YT 4-  using Web Browser -- "+browser, "Test YT - Adm Lucid");

        testGrid(browser);
        try{driver.get("https://youtu.be/xT9h2yx6xwo"); test4.info("Open YT 1");extent.flush();wait.For(w);

        driver.quit();}catch(Exception e){System.err.println(e);}
    }
    public void test5(String browser,Integer testInt) throws MalformedURLException {
        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        ExtentTest test5 = extent.createTest("Test: YT 5 -  using Web Browser -- "+browser, "Test YT - Adm Lucid");

        testGrid(browser);
        try{driver.get("https://youtu.be/8eU9UFXnXkY");test5.info("Open YT 5");extent.flush();wait.For(w);

        driver.quit();}catch(Exception e){System.err.println(e);}
    }
    public void test6(String browser,Integer testInt) throws MalformedURLException {
        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        ExtentTest test6 = extent.createTest("Test: YT 6 -  using Web Browser -- "+browser, "Test YT - Adm Lucid");

        testGrid(browser);
        try{driver.get("https://youtu.be/aTGYnRewgO8");test6.info("Open YT 6");extent.flush();wait.For(w);

        driver.quit();}catch(Exception e){System.err.println(e);}
    }
    public void test7(String browser,Integer testInt) throws MalformedURLException {
        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        ExtentTest test7 = extent.createTest("Test: YT 7 - using Web Browser -- "+browser, "Test YT - Adm Lucid");

        testGrid(browser);
        try{driver.get("https://youtu.be/cVIMTM2MCzU");test7.info("Open YT 7");extent.flush();wait.For(w);

        driver.quit();}catch(Exception e){System.err.println(e);}
    }
    public void test8(String browser,Integer testInt) throws MalformedURLException {
        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        ExtentTest test8 = extent.createTest("Test: YT 8 -  using Web Browser -- "+browser, "Test YT - Adm Lucid");

        testGrid(browser);
        try{driver.get("https://youtu.be/dLzFJ2yccSY");test8.info("Open YT 8");extent.flush();wait.For(w);

        driver.quit();}catch(Exception e){System.err.println(e);}
    }
    public void test9(String browser,Integer testInt) throws MalformedURLException {
        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        ExtentTest test9 = extent.createTest("Test: YT 9 -  using Web Browser -- "+browser, "Test YT - Adm Lucid");

        testGrid(browser);
        try{driver.get("https://youtu.be/ZtEl8eHtFXc");test9.info("Open YT 9");extent.flush();wait.For(w);

        driver.quit();}catch(Exception e){System.err.println(e);}
    }
    public void test10(String browser,Integer testInt) throws MalformedURLException {
        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        ExtentTest test10 = extent.createTest("Test: YT 10 -  using Web Browser -- "+browser, "Test YT - Adm Lucid");

        testGrid(browser);
        try{driver.get("https://youtu.be/kcf46P-ykLA");test10.info("Open YT 10");extent.flush();wait.For(w);

        driver.quit();}catch(Exception e){System.err.println(e);}
    }
    public void test11(String browser,Integer testInt) throws MalformedURLException {
        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        ExtentTest test11 = extent.createTest("Test: YT 11 - using Web Browser -- "+browser, "Test YT - Adm Lucid");

        testGrid(browser);
        try{driver.get("https://youtu.be/bBYtzIJ_Kfo");test11.info("Open YT 11");extent.flush();wait.For(w);

        driver.quit();}catch(Exception e){System.err.println(e);}
    }
    public void test12(String browser,Integer testInt) throws MalformedURLException {
        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        ExtentTest test12 = extent.createTest("Test: YT 12 -  using Web Browser -- "+browser, "Test YT - Adm Lucid");

        testGrid(browser);
        driver.get("https://youtu.be/CAd2A2HyAxY");test12.info("Open YT 12");extent.flush();wait.For(w);

        driver.quit();
    }
    public void test13(String browser,Integer testInt) throws MalformedURLException {
        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        ExtentTest test12 = extent.createTest("Test: YT 12 -  using Web Browser -- "+browser, "Test YT - Adm Lucid");

        testGrid(browser);
        driver.get("https://youtu.be/CAd2A2HyAxY");//test13.info("Open YT 12");extent.flush();wait.For(w);

        driver.quit();
    }
    public void test14(String browser,Integer testInt) throws MalformedURLException {
        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        ExtentTest test12 = extent.createTest("Test: YT 12 -  using Web Browser -- "+browser, "Test YT - Adm Lucid");

        testGrid(browser);
        driver.get("https://youtu.be/bBYtzIJ_Kfo");//test12.info("Open YT 12");extent.flush();wait.For(w);

        driver.quit();
    }
    public void test15(String browser,Integer testInt) throws MalformedURLException {
        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        ExtentTest test12 = extent.createTest("Test: YT 12 -  using Web Browser -- "+browser, "Test YT - Adm Lucid");

        testGrid(browser);
        driver.get("https://youtu.be/kcf46P-ykLA");//test12.info("Open YT 12");extent.flush();wait.For(w);

        driver.quit();
    }
    public void test16(String browser,Integer testInt) throws MalformedURLException {
        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        ExtentTest test12 = extent.createTest("Test: YT 12 -  using Web Browser -- "+browser, "Test YT - Adm Lucid");

        testGrid(browser);
        driver.get("https://youtu.be/ZtEl8eHtFXc");//test12.info("Open YT 12");extent.flush();wait.For(w);

        driver.quit();
    }
    public void test17(String browser,Integer testInt) throws MalformedURLException {
        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        ExtentTest test12 = extent.createTest("Test: YT 12 -  using Web Browser -- "+browser, "Test YT - Adm Lucid");

        testGrid(browser);
        driver.get("https://youtu.be/dLzFJ2yccSY");//test12.info("Open YT 12");extent.flush();wait.For(w);

        driver.quit();
    }
    public void test18(String browser,Integer testInt) throws MalformedURLException {
        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        ExtentTest test12 = extent.createTest("Test: YT 12 -  using Web Browser -- "+browser, "Test YT - Adm Lucid");

        testGrid(browser);
        driver.get("https://youtu.be/cVIMTM2MCzU");//test12.info("Open YT 12");extent.flush();wait.For(w);

        driver.quit();
    }
    public void test19(String browser,Integer testInt) throws MalformedURLException {
        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        ExtentTest test12 = extent.createTest("Test: YT 12 -  using Web Browser -- "+browser, "Test YT - Adm Lucid");

        testGrid(browser);
        driver.get("https://youtu.be/aTGYnRewgO8");//test12.info("Open YT 12");extent.flush();wait.For(w);

        driver.quit();
    }
    public void test20(String browser,Integer testInt) throws MalformedURLException {
        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        ExtentTest test12 = extent.createTest("Test: YT 12 -  using Web Browser -- "+browser, "Test YT - Adm Lucid");

        testGrid(browser);
        driver.get("https://youtu.be/xT9h2yx6xwo");//test12.info("Open YT 12");extent.flush();wait.For(w);

        driver.quit();
    }
    public void test21(String browser,Integer testInt) throws MalformedURLException {
        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        ExtentTest test12 = extent.createTest("Test: YT 12 -  using Web Browser -- "+browser, "Test YT - Adm Lucid");

        testGrid(browser);
        driver.get("https://youtu.be/K00OTzPFXe8");//test12.info("Open YT 12");extent.flush();wait.For(w);

        driver.quit();
    }
    public void test22(String browser,Integer testInt) throws MalformedURLException {
        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        ExtentTest test12 = extent.createTest("Test: YT 12 -  using Web Browser -- "+browser, "Test YT - Adm Lucid");

        testGrid(browser);
        driver.get("https://youtu.be/K8pzZCN-5hU");//test12.info("Open YT 12");extent.flush();wait.For(w);

        driver.quit();
    }
    public void test23(String browser,Integer testInt) throws MalformedURLException {
        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        ExtentTest test12 = extent.createTest("Test: YT 12 -  using Web Browser -- "+browser, "Test YT - Adm Lucid");

        testGrid(browser);
        driver.get("https://youtu.be/x9f30Yqcma0");//test12.info("Open YT 12");extent.flush();wait.For(w);

        driver.quit();
    }
    public void test24(String browser,Integer testInt) throws MalformedURLException {
        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        ExtentTest test12 = extent.createTest("Test: YT 12 -  using Web Browser -- "+browser, "Test YT - Adm Lucid");

        testGrid(browser);
        driver.get("https://youtu.be/x9f30Yqcma0");//st12.info("Open YT 12");extent.flush();wait.For(w);

        driver.quit();
    }
    public void test25(String browser,Integer testInt) throws MalformedURLException {
        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        ExtentTest test12 = extent.createTest("Test: YT 12 -  using Web Browser -- "+browser, "Test YT - Adm Lucid");

        testGrid(browser);
        driver.get("https://youtu.be/Z0GRob7lmb0");//test12.info("Open YT 12");extent.flush();wait.For(w);

        driver.quit();
    }
    public void test26(String browser,Integer testInt) throws MalformedURLException {
        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        ExtentTest test12 = extent.createTest("Test: YT 12 -  using Web Browser -- "+browser, "Test YT - Adm Lucid");

        testGrid(browser);
        driver.get("https://youtu.be/fNMOtNOmPDM");//test12.info("Open YT 12");extent.flush();wait.For(w);

        driver.quit();
    }
    public void test27(String browser,Integer testInt) throws MalformedURLException {
        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        ExtentTest test12 = extent.createTest("Test: YT 12 -  using Web Browser -- "+browser, "Test YT - Adm Lucid");

        testGrid(browser);
        driver.get("https://youtu.be/JW1uArD11Ig");//test12.info("Open YT 12");extent.flush();wait.For(w);

        driver.quit();
    }
    public void test28(String browser,Integer testInt) throws MalformedURLException {
        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        ExtentTest test12 = extent.createTest("Test: YT 12 -  using Web Browser -- "+browser, "Test YT - Adm Lucid");

        testGrid(browser);
        driver.get("https://youtu.be/O3DwM6hLsQI");//test12.info("Open YT 12");extent.flush();wait.For(w);

        driver.quit();
    }
    public void test29(String browser,Integer testInt) throws MalformedURLException {
        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        ExtentTest test12 = extent.createTest("Test: YT 12 -  using Web Browser -- "+browser, "Test YT - Adm Lucid");

        testGrid(browser);
        driver.get("https://youtu.be/6ibGaDMASdw");//test12.info("Open YT 12");extent.flush();wait.For(w);

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
