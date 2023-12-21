package controller;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
//import our own classes
import manager.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.*;
import webelement.PageObject;
import static org.junit.Assert.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.ExtentTest;
import com.opencsv.CSVReader;
public class Booking extends Base{

    //private StringBuffer verificationErrors = new StringBuffer();
    private WebDriver driver;  private String webElement="";
    //Constructor
    public Booking() {
        super();
    }
    //extent reports
    TestManager testManager = new TestManager();;
    ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(getReportPath()+"Booking"+getDateTime()+".html");
    ExtentHtmlReporter htmlReporter1 = new ExtentHtmlReporter(getReportPath()+"Regression"+getDateTime()+".html");
    ExtentHtmlReporter htmlReporter2 = new ExtentHtmlReporter(getReportPath()+"Sanity"+getDateTime()+".html");

    //Call methods
    UIManager uimanager = new UIManager();Compare compare = new Compare();Load wait =new Load();Screenshot st= new Screenshot(); PageObject pg=new PageObject();
    ExtentReports extent = new ExtentReports();
    Base bs = new Base();
    public void OpenGolf(String browser) throws MalformedURLException, InterruptedException {
       testBrowser(browser);
    }
    public void BookGolfCourse(String browser,Integer testInt) throws MalformedURLException, InterruptedException {
        testBrowser(browser);
        clickButton("BK_BookGolfCourse","Book Golf Course");wait.For(2);

        dropList("BK_drpGolf","Tiger A");
        enterText("BK_txtBookedBy","John Smith");
        enterText("BK_txtEmail","john.smith@admlucid.com");
        enterText("BK_txtPhone","1-416 889 3445");
        enterText("BK_txtDate","2023"+ Keys.ARROW_RIGHT+"0920");
        enterText("BK_txtStartTime","08:30AM");
        enterText("BK_txtEndTime","10:30AM");
        clickButton("BK_btnCreate","Create");
        BrowserClose();
    }
    public void BookGolfCourse2(String browser,Integer testInt){
        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        ExtentTest test = extent.createTest("Test: Booking - Book Golf Course from the button of Book Golf Course using Web Browser -- "+browser, "Test Booking - Adm Lucid");
        try{testBrowser(browser); wait.For(2);test.pass("Open Web Browser");}catch(Exception e){test.fail("Could not open the web app"+e);} extent.flush();

        try{clickButton("BK_BookGolfCourse","Book Golf Course");test.pass("The button of Book Golf Course"); wait.For(10);}catch(NoSuchElementException e){test.fail("The button of Book Golf Course: "+e);try{st.getScreenshot(getdriver(),"Booking");}catch(Exception e1){};try{test.addScreenCaptureFromPath(st.addScreenshot());}catch(Exception e2){}}extent.flush();

        //Validate texts of Book Golf Course
        test.info("Validate texts of Book Golf Course");
        //if (verifyTitleText("Booking",0)=="true"){test.pass("Booking");test.info(verifyTitleTextInfo("Booking", 0));extent.flush();}
        //else{test.skip("Booking");test.info(verifyTitleTextInfo("Booking", 0));try{st.getScreenshot(getdriver(),"Booking");extent.flush();}catch(Exception e){System.out.println("Error:"+e);}try{test.addScreenCaptureFromPath(st.addScreenshot());extent.flush();} catch(Exception e){}}

        if (verifyTitleText("Booking",0)=="true"){test.pass("Booking");test.info(verifyTitleTextInfo("Booking", 0));extent.flush();}
        else{test.warning("Booking");test.info(verifyTitleTextInfo("Booking", 0));try{st.getScreenshot2(getdriver(),"/html/body/div/main/div[1]/div/form/div[1]/label","Booking");extent.flush();}catch(Exception e){System.out.println("Error:"+e);}try{test.addScreenCaptureFromPath(st.addScreenshot());extent.flush();} catch(Exception e){}}


       /* if (verifyTitleText("Booking",1)=="true"){test.pass("Booking");test.info(verifyTitleTextInfo("Booking", 1));extent.flush();}
        else{test.fail("Booking");test.info(verifyTitleTextInfo("Booking", 1));try{st.getScreenshot(getdriver(),"Booking");extent.flush();}catch(Exception e){System.out.println("Error:"+e);}try{test.addScreencastFromPath(st.addScreenshot());extent.flush();} catch(Exception e){}}

        if (verifyTitleText("Booking",2)=="true"){test.pass("Booking");test.info(verifyTitleTextInfo("Booking", 2));extent.flush();}
        else{test.fail("Booking");test.info(verifyTitleTextInfo("Booking", 2));try{st.getScreenshot(getdriver(),"Booking");extent.flush();}catch(Exception e){System.out.println("Error:"+e);}try{test.addScreencastFromPath(st.addScreenshot());extent.flush();} catch(Exception e){}}

        if (verifyTitleText("Booking",3)=="true"){test.pass("Booking");test.info(verifyTitleTextInfo("Booking", 3));extent.flush();}
        else{test.fail("Booking");test.info(verifyTitleTextInfo("Booking", 3));try{st.getScreenshot(getdriver(),"Booking");extent.flush();}catch(Exception e){System.out.println("Error:"+e);}try{test.addScreencastFromPath(st.addScreenshot());extent.flush();} catch(Exception e){}}

        if (verifyTitleText("Booking",4)=="true"){test.pass("Booking");test.info(verifyTitleTextInfo("Booking", 4));extent.flush();}
        else{test.fail("Booking");test.info(verifyTitleTextInfo("Booking", 4));try{st.getScreenshot(getdriver(),"Booking");extent.flush();}catch(Exception e){System.out.println("Error:"+e);}try{test.addScreencastFromPath(st.addScreenshot());extent.flush();} catch(Exception e){}}

        if (verifyTitleText("Booking",5)=="true"){test.pass("Booking");test.info(verifyTitleTextInfo("Booking", 5));extent.flush();}
        else{test.fail("Booking");test.info(verifyTitleTextInfo("Booking", 5));try{st.getScreenshot(getdriver(),"Booking");extent.flush();}catch(Exception e){System.out.println("Error:"+e);}try{test.addScreencastFromPath(st.addScreenshot());extent.flush();} catch(Exception e){}}

        if (verifyTitleText("Booking",6)=="true"){test.pass("Booking");test.info(verifyTitleTextInfo("Booking", 6));extent.flush();}
        else{test.fail("Booking");test.info(verifyTitleTextInfo("Booking", 6));try{st.getScreenshot(getdriver(),"Booking");extent.flush();}catch(Exception e){System.out.println("Error:"+e);}try{test.addScreencastFromPath(st.addScreenshot());extent.flush();} catch(Exception e){}}


        try{dropList("BK_drpGolf","Tiger A");test.pass("Golf Course Dropdown List");}catch(NoSuchElementException e){test.fail("The dropdown list of Golf Course: "+e);}extent.flush();

        try{ enterText("BK_txtBookedBy","John Smith");test.pass("Text Box - BookedBy");}catch(NoSuchElementException e){test.fail("Text Box - BookedBy "+e);}extent.flush();

        try{enterText("BK_txtEmail","john.smith@admlucid.com");test.pass("Text Box - Email");}catch(NoSuchElementException e){test.fail("Text Box - Email "+e);}extent.flush();

        try{enterText("BK_txtPhone","1-416 889 3445");test.pass("Text Box - Phoner");}catch(NoSuchElementException e){test.fail("Text Box - Phoner "+e);}extent.flush();

        try{enterText("BK_txtDate","2023"+ Keys.ARROW_RIGHT+"0920");test.pass("Text Box - Date");}catch(NoSuchElementException e){test.fail("ext Box - Date "+e);}extent.flush();

        try{enterText("BK_txtStartTime","08:30AM");test.pass("Text Box - Start");}catch(NoSuchElementException e){test.fail("Text Box - Start "+e);}extent.flush();

        try{enterText("BK_txtEndTime","10:30AM");test.pass("Text Box - End");wait.For(5);}catch(NoSuchElementException e){test.fail("Text Box - End "+e);}extent.flush();

        try{clickButton2("BK_btnCreate");test.pass("Button - Create");wait.For(5);}catch(NoSuchElementException e){test.fail("The button of Book Golf Course"+e);}extent.flush();
*/
        BrowserClose();
    }

    public void BookGolfCourseFromDetail(String browser,Integer testInt){
        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        ExtentTest test = extent.createTest("Test: Booking - Book Golf Course from the Details of Book Golf Course using Web Browser -- "+browser, "Test Booking - Adm Lucid");
        try{testBrowser(browser); wait.For(2);test.pass("Open Web Browser");}catch(Exception e){test.fail("Could not open the web app"+e);} extent.flush();

        try{enterText("Golf_SearchTextBox", "Golf Vacations");test.pass("Golf Search Text Box for");}catch (NoSuchElementException e){test.fail("Golf Search Text Box for ");}extent.flush();
        try{clickButton2("Golf_SearchButton");test.pass("Golf Search Button");}catch (NoSuchElementException e){test.fail("Golf Search Button");}extent.flush();
        try{clickLink("Details");test.pass("Golf Details Link");}catch (NoSuchElementException e){test.fail("Golf Details Link");}extent.flush();

        try{clickButton2("BK_btnBook");test.pass("Book Button");}catch(NoSuchElementException e){test.fail("Book Button "+e);}extent.flush();
        //Validate texts of Book Golf Course
       /* test.info("Validate texts of Book Golf Course");

        if (verifyTitleText("Booking",1)=="true"){test.pass("Booking");test.info(verifyTitleTextInfo("Booking", 1));extent.flush();}
        else{test.fail("Booking");test.info(verifyTitleTextInfo("Booking", 1));try{st.getScreenshot(getdriver(),"Booking");extent.flush();}catch(Exception e){System.out.println("Error:"+e);}try{test.addScreencastFromPath(st.addScreenshot());extent.flush();} catch(Exception e){}}

        if (verifyTitleText("Booking",2)=="true"){test.pass("Booking");test.info(verifyTitleTextInfo("Booking", 2));extent.flush();}
        else{test.fail("Booking");test.info(verifyTitleTextInfo("Booking", 2));try{st.getScreenshot(getdriver(),"Booking");extent.flush();}catch(Exception e){System.out.println("Error:"+e);}try{test.addScreencastFromPath(st.addScreenshot());extent.flush();} catch(Exception e){}}

        if (verifyTitleText("Booking",3)=="true"){test.pass("Booking");test.info(verifyTitleTextInfo("Booking", 3));extent.flush();}
        else{test.fail("Booking");test.info(verifyTitleTextInfo("Booking", 3));try{st.getScreenshot(getdriver(),"Booking");extent.flush();}catch(Exception e){System.out.println("Error:"+e);}try{test.addScreencastFromPath(st.addScreenshot());extent.flush();} catch(Exception e){}}

        if (verifyTitleText("Booking",4)=="true"){test.pass("Booking");test.info(verifyTitleTextInfo("Booking", 4));extent.flush();}
        else{test.fail("Booking");test.info(verifyTitleTextInfo("Booking", 4));try{st.getScreenshot(getdriver(),"Booking");extent.flush();}catch(Exception e){System.out.println("Error:"+e);}try{test.addScreencastFromPath(st.addScreenshot());extent.flush();} catch(Exception e){}}

        if (verifyTitleText("Booking",5)=="true"){test.pass("Booking");test.info(verifyTitleTextInfo("Booking", 5));extent.flush();}
        else{test.fail("Booking");test.info(verifyTitleTextInfo("Booking", 5));try{st.getScreenshot(getdriver(),"Booking");extent.flush();}catch(Exception e){System.out.println("Error:"+e);}try{test.addScreencastFromPath(st.addScreenshot());extent.flush();} catch(Exception e){}}

        if (verifyTitleText("Booking",6)=="true"){test.pass("Booking");test.info(verifyTitleTextInfo("Booking", 6));extent.flush();}
        else{test.fail("Booking");test.info(verifyTitleTextInfo("Booking", 6));try{st.getScreenshot(getdriver(),"Booking");extent.flush();}catch(Exception e){System.out.println("Error:"+e);}try{test.addScreencastFromPath(st.addScreenshot());extent.flush();} catch(Exception e){}}
        */
        try{ enterText("BK_txtBookedBy","John Smith");test.pass("Text Box - BookedBy");}catch(NoSuchElementException e){test.fail("Text Box - BookedBy "+e);}extent.flush();

        try{enterText("BK_txtEmail","john.smith@admlucid.com");test.pass("Text Box - Email");}catch(NoSuchElementException e){test.fail("Text Box - Email "+e);}extent.flush();

        try{enterText("BK_txtPhone","1-416 889 3445");test.pass("Text Box - Phoner");}catch(NoSuchElementException e){test.fail("Text Box - Phoner "+e);}extent.flush();

        try{enterText("BK_txtDate","2023"+ Keys.ARROW_RIGHT+"0930");test.pass("Text Box - Date");}catch(NoSuchElementException e){test.fail("ext Box - Date "+e);}extent.flush();

        try{enterText("BK_txtStartTime","10:30AM");test.pass("Text Box - Start");}catch(NoSuchElementException e){test.fail("Text Box - Start "+e);}extent.flush();

        try{enterText("BK_txtEndTime","12:30PM");test.pass("Text Box - End");wait.For(5);}catch(NoSuchElementException e){test.fail("Text Box - End "+e);}extent.flush();

        try{clickButton2("BK_btnCreate");test.pass("Button - Create");wait.For(5);}catch(NoSuchElementException e){test.fail("The button of Book Golf Course"+e);}extent.flush();

        BrowserClose();
    }
}
