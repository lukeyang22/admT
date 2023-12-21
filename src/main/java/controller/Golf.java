package controller;
import com.aventstack.extentreports.ExtentTest;
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.*;
import webelement.PageObject;
import static org.junit.Assert.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import controller.Login;
//read csv file
import com.opencsv.CSVReader;
//retrive test data from MySQL database
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class Golf extends Base{
    private WebDriver driver;  private String webElement="";
    //Constructor
    public Golf() {
        super();
    }

    //ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("src/main/java/report/Booking.html");
    ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(getReportPath()+"Golf"+getDateTime()+".html");
    ExtentHtmlReporter htmlReporter1 = new ExtentHtmlReporter(getReportPath()+"Regression"+getDateTime()+".html");
    ExtentHtmlReporter htmlReporter2 = new ExtentHtmlReporter(getReportPath()+"Sanity"+getDateTime()+".html");
    //Call methods
    UIManager uimanager = new UIManager();Compare compare = new Compare();Load wait =new Load();Screenshot st= new Screenshot(); PageObject pg=new PageObject();
    ExtentReports extent = new ExtentReports(); Base bs = new Base();Login lg= new Login();


    public void searchGolfCourse(String browser, Integer testInt) throws MalformedURLException, InterruptedException {
        String[][] golfC={{"Sky Golf Course","100 Avenue, Davenport,Northern Territory,Australia","Wonderful view and well supplied features","smith@skygolf.com","16656557777"},
                {"Colorado Golf Club","900 2Ave, Rocky Mountains,Colorado,United States","Golf in Colorado Springs","smithw@cgc.com","18884563456"},
                {"Tiger C","1000 BLVD Old Head, Old Head,Colorado,Canada","The Play Golf Calgary Greenfee Card is a gift card that you load in advance and use to pay for your greenfee's to secure some great greenfee pricing. Use the card at all 3 our Calgary Golf Course.","info@golfvacation.com","18884563456"},
                {"McCleery Golf Course", "214 Outdoor Dr., Vancouver,British Columbia,Canada", "Featuring well sculptured and meticulously maintained","mccleery@gmail.com", "14032678890"}
        };

        String[] webe={"Golf_Name_Cell_1","Golf_Address_Cell_1","Golf_Description_Cell_1","Golf_Email_Cell_1","Golf_Phone_Cell_1"};
        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        ExtentTest test = extent.createTest("Test: Golf - Search for  Golf Course using Web Browser -- "+browser, "Test Golf - Adm Lucid");
        testBrowser(browser);
        //Validate table column title text
        test.info("Validate golf table column title text");
        if (verifyTitleText("golf",0)=="true"){test.pass("golf");test.info(verifyTitleTextInfo("golf", 0));extent.flush();}
        else{test.fail("golf");test.info(verifyTitleTextInfo("golf", 0));try{st.getScreenshot(getdriver(),"golf");extent.flush();}catch(Exception e){System.out.println("Error:"+e);}try{test.addScreenCaptureFromPath(st.addScreenshot());extent.flush();} catch(Exception e){}}

       // if (verifyTitleText("golf",1)=="true"){test.pass("golf");test.info(verifyTitleTextInfo("golf", 1));extent.flush();}
        //else{test.fail("golf");test.info(verifyTitleTextInfo("golf", 1));try{st.getScreenshot(getdriver(),"golf");extent.flush();}catch(Exception e){System.out.println("Error:"+e);}try{test.addScreenCaptureFromPath(st.addScreenshot());extent.flush();} catch(Exception e){}}

        if (verifyTitleText("golf",2)=="true"){test.pass("golf");test.info(verifyTitleTextInfo("golf", 2));extent.flush();}
        else{test.fail("golf");test.info(verifyTitleTextInfo("golf", 2));try{st.getScreenshot(getdriver(),"golf");extent.flush();}catch(Exception e){System.out.println("Error:"+e);}try{test.addScreenCaptureFromPath(st.addScreenshot());extent.flush();} catch(Exception e){}}

        if (verifyTitleText("golf",3)=="true"){test.pass("golf");test.info(verifyTitleTextInfo("golf", 3));extent.flush();}
        else{test.fail("golf");test.info(verifyTitleTextInfo("golf", 3));try{st.getScreenshot(getdriver(),"golf");extent.flush();}catch(Exception e){System.out.println("Error:"+e);}try{test.addScreenCaptureFromPath(st.addScreenshot());extent.flush();} catch(Exception e){}}

        for(int i=0;i<golfC.length;i++) {
            try{enterText("Golf_SearchTextBox", golfC[i][0]);test.pass("Golf Search Text Box for "+golfC[i][0]);}catch (NoSuchElementException e){test.fail("Golf Search Text Box for "+golfC[i][0]);}extent.flush();
            try{clickButton2("Golf_SearchButton");test.pass("Golf Search Button");}catch (NoSuchElementException e){test.fail("Golf Search Button");}extent.flush();
            for(int a=0;a<5;a++){
                try{getText(webe[a]).equalsIgnoreCase(golfC[i][a]);test.pass("Passed content is "+golfC[i][a]);}catch(NoSuchElementException e) {test.info("Actual content is not "+golfC[i][a]);test.fail(e);}extent.flush();
            }
            clickButton("Golf_Clear","Clear");
            wait.For(3);
        }
        BrowserClose();
    }

    //Use CSV reader do data driven testing
    public void searchGolfCourseCSV(String browser, Integer testInt) throws IOException, InterruptedException {
        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        String[] webe={"Golf_Name_Cell_1","Golf_Address_Cell_1","Golf_Description_Cell_1","Golf_Email_Cell_1","Golf_Phone_Cell_1"};
        ExtentTest test = extent.createTest("Test: Golf - Search for  Golf Course using Web Browser -- "+browser, "Test Golf Data Dvirven Testing using csv- Adm Lucid");
        testBrowser(browser);
        String CSV_PATH="src/main/java/util/testData.csv";   String[] golfC = new String[5];
        CSVReader csvReader = new CSVReader(new FileReader(CSV_PATH));

        //Validate table column title text
        test.info("Validate golf table column title text");
        if (verifyTitleText("golf",0)=="true"){test.pass("golf");test.info(verifyTitleTextInfo("golf", 0));extent.flush();}
        else{test.fail("golf");test.info(verifyTitleTextInfo("golf", 0));try{st.getScreenshot(getdriver(),"golf");extent.flush();}catch(Exception e){System.out.println("Error:"+e);}try{test.addScreenCaptureFromPath(st.addScreenshot());extent.flush();} catch(Exception e){}}

        if (verifyTitleText("golf",2)=="true"){test.pass("golf");test.info(verifyTitleTextInfo("golf", 2));extent.flush();}
        else{test.fail("golf");test.info(verifyTitleTextInfo("golf", 2));try{st.getScreenshot(getdriver(),"golf");extent.flush();}catch(Exception e){System.out.println("Error:"+e);}try{test.addScreenCaptureFromPath(st.addScreenshot());extent.flush();} catch(Exception e){}}

        if (verifyTitleText("golf",3)=="true"){test.pass("golf");test.info(verifyTitleTextInfo("golf", 3));extent.flush();}
        else{test.fail("golf");test.info(verifyTitleTextInfo("golf", 3));try{st.getScreenshot(getdriver(),"golf");extent.flush();}catch(Exception e){System.out.println("Error:"+e);}try{test.addScreenCaptureFromPath(st.addScreenshot());extent.flush();} catch(Exception e){}}

        while((golfC = csvReader.readNext()) != null) {
            String golfName= golfC[0];
            String golfAddress = golfC[1];
            String golfDes = golfC[2];
            String golfEmail = golfC[3];
            String golfPhone = golfC[4];
            test.info("******************************************************************************************************************************");
            test.info(golfC[0]+"___"+golfC[1]+"___"+golfC[2]+"___"+golfC[3]+"___"+golfC[4]);
            try{enterText("Golf_SearchTextBox", golfC[0]);test.pass("Golf Search Text Box for "+golfC[0]);}catch (NoSuchElementException e){test.fail("Golf Search Text Box for "+golfC[0]);}extent.flush();
            try{clickButton2("Golf_SearchButton");test.pass("Golf Search Button");}catch (NoSuchElementException e){test.fail("Golf Search Button");}extent.flush();
            for(int a=1;a<5;a++){
                try{getText(webe[a]).equalsIgnoreCase(golfC[a]);test.pass("Passed content is "+golfC[a]);}catch(NoSuchElementException e) {test.info("Actual content is not "+golfC[a]);test.fail(e);}extent.flush();
            }
            clickButton("Golf_Clear","Clear");
            wait.For(2);
        }
        BrowserClose();


     }

    public void searchGolfCourseDB(String browser, Integer testInt) throws IOException {
        switch (testInt) {
            case 0:
                extent.attachReporter(htmlReporter);
                break;
            case 1:
                extent.attachReporter(htmlReporter1);
                break;
            case 2:
                extent.attachReporter(htmlReporter2);
                break;
        }
        String[] webe = {"Golf_Name_Cell_1", "Golf_Address_Cell_1", "Golf_Description_Cell_1", "Golf_Email_Cell_1", "Golf_Phone_Cell_1"}; String[] golfC = new String[5];
        ExtentTest test = extent.createTest("Test: Golf - Search for  Golf Course using Web Browser -- " + browser, "Test Golf Data Dvirven Testing using database- Adm Lucid");
        //connect to database
        String url = "jdbc:mysql://localhost:3306/adm";
        String username = "ly";        String password = "2022K03!";

        try {
            // Step 1: Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish the database connection
            Connection connection = DriverManager.getConnection(url, username, password);
            String testData = "SELECT * FROM adm.golf";

            testBrowser(browser);
            test.info("Validate golf table column title text");
            if (verifyTitleText("golf",0)=="true"){test.pass("golf");test.info(verifyTitleTextInfo("golf", 0));extent.flush();}
            else{test.fail("golf");test.info(verifyTitleTextInfo("golf", 0));try{st.getScreenshot(getdriver(),"golf");extent.flush();}catch(Exception e){System.out.println("Error:"+e);}try{test.addScreenCaptureFromPath(st.addScreenshot());extent.flush();} catch(Exception e){}}

            if (verifyTitleText("golf",2)=="true"){test.pass("golf");test.info(verifyTitleTextInfo("golf", 2));extent.flush();}
            else{test.fail("golf");test.info(verifyTitleTextInfo("golf", 2));try{st.getScreenshot(getdriver(),"golf");extent.flush();}catch(Exception e){System.out.println("Error:"+e);}try{test.addScreenCaptureFromPath(st.addScreenshot());extent.flush();} catch(Exception e){}}

            if (verifyTitleText("golf",3)=="true"){test.pass("golf");test.info(verifyTitleTextInfo("golf", 3));extent.flush();}
            else{test.fail("golf");test.info(verifyTitleTextInfo("golf", 3));try{st.getScreenshot(getdriver(),"golf");extent.flush();}catch(Exception e){System.out.println("Error:"+e);}try{test.addScreenCaptureFromPath(st.addScreenshot());extent.flush();} catch(Exception e){}}

            if (connection != null) {
                System.out.println("Connected to the database!"); test.info("Connected to the database!"); extent.flush();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(testData);
                while (resultSet.next()) {
                    golfC[0] = resultSet.getString("Name");
                    golfC[1] = resultSet.getString("Address");
                    golfC[2] = resultSet.getString("Description");
                    golfC[3] = resultSet.getString("Email");
                    golfC[4] = resultSet.getString("Phone");
                    test.info("---------------------------   Test Date From Database   ------------------------------------------------------");
                    test.info(golfC[0]+"___"+golfC[1]+"___"+golfC[2]+"___"+golfC[3]+"___"+golfC[4]);
                    try{enterText("Golf_SearchTextBox", golfC[0]);test.pass("Golf Search Text Box for "+golfC[0]);}catch (NoSuchElementException e){test.fail("Golf Search Text Box for "+golfC[0]);}extent.flush();
                    try{clickButton2("Golf_SearchButton");test.pass("Golf Search Button");}catch (NoSuchElementException e){test.fail("Golf Search Button");}extent.flush();
                    for(int a=1;a<5;a++){
                        try{getText(webe[a]).equalsIgnoreCase(golfC[a]);test.pass("Passed content is "+golfC[a]);}catch(NoSuchElementException e) {test.info("Actual content is not "+golfC[a]);test.fail(e);}extent.flush();
                    }
                    clickButton("Golf_Clear","Clear");

                }
                resultSet.close();statement.close();connection.close(); BrowserClose();
            }
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed! Check your credentials or database URL.");
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void listGolfCourseByCountry(String browser,Integer testInt) throws MalformedURLException, InterruptedException {
        String[][] golfC={{"Australia","Sky Golf Course","100 Avenue, Davenport,Northern Territory,Australia","Wonderful view and well supplied features","smith@skygolf.com","16656557777"},
                {"Mexico","Wadeiras Country Club","102 Street , Mexico City,CDMX,Mexico","Mexico City Golf Courses","shawnee@mcc.com","176588698976"},
                {"Russia","Tiger Golf","2-W Kapot Proyez, Moscow,MO,Russia","Nice small golf field","www@motiger.com","89032257863"}};
        String[] webe={"Golf_Name_Cell_1","Golf_Address_Cell_1","Golf_Description_Cell_1","Golf_Email_Cell_1","Golf_Phone_Cell_1"};
        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        ExtentTest test = extent.createTest("Test: Golf - List Golf Course by country using Web Browser -- "+browser, "Test Golf - Adm Lucid");
        testBrowser(browser);
        //Validate table column title text
        test.info("Validate golf table column title text");
        if (verifyTitleText("golf",0)=="true"){test.pass("golf");test.info(verifyTitleTextInfo("golf", 0));extent.flush();}
        else{test.fail("golf");test.info(verifyTitleTextInfo("golf", 0));try{st.getScreenshot(getdriver(),"golf");extent.flush();}catch(Exception e){System.out.println("Error:"+e);}try{test.addScreenCaptureFromPath(st.addScreenshot());extent.flush();} catch(Exception e){}}

        if (verifyTitleText("golf",2)=="true"){test.pass("golf");test.info(verifyTitleTextInfo("golf", 2));extent.flush();}
        else{test.fail("golf");test.info(verifyTitleTextInfo("golf", 2));try{st.getScreenshot(getdriver(),"golf");extent.flush();}catch(Exception e){System.out.println("Error:"+e);}try{test.addScreenCaptureFromPath(st.addScreenshot());extent.flush();} catch(Exception e){}}

        if (verifyTitleText("golf",3)=="true"){test.pass("golf");test.info(verifyTitleTextInfo("golf", 3));extent.flush();}
        else{test.fail("golf");test.info(verifyTitleTextInfo("golf", 3));try{st.getScreenshot(getdriver(),"golf");extent.flush();}catch(Exception e){System.out.println("Error:"+e);}try{test.addScreenCaptureFromPath(st.addScreenshot());extent.flush();} catch(Exception e){}}

        for(int i=0;i<golfC.length;i++) {
            try{dropList("Golf_drpCountry",golfC[i][0]);test.pass("Select a country for "+golfC[i][0]);}catch (NoSuchElementException e){test.fail("Select a country for "+golfC[i][0]+e);}extent.flush();
            try{clickButton2("Golf_Filter");test.pass("Golf Filter Button");}catch (NoSuchElementException e){test.fail("Golf Filter Button"+e);}extent.flush();
            for(int a=1;a<6;a++){
                try{getText(webe[a]).equalsIgnoreCase(golfC[i][a]);test.pass("Passed content is "+golfC[i][a]);}catch(NoSuchElementException e) {test.info("Actual content is not "+golfC[i][a]);test.fail(e);}extent.flush();
            }
            clickButton("Golf_Clear","Clear");
            wait.For(3);
        }
        BrowserClose();
    }

    public void sortName(String browser, Integer testInt) throws MalformedURLException, InterruptedException {
        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        testBrowser(browser);
        clickButton2("");
        //Validate column text sorted by

    }

    public void addGolfCourse(String browser, Integer testInt) throws MalformedURLException, InterruptedException {
        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        ExtentTest test = extent.createTest("Test: Golf - add a golf course using Web Browser -- "+browser, "Test Golf - Adm Lucid");
        testBrowser(browser);
        //login
        Login(); wait.For(3);
        try{clickButton("Golf_Tests","Tests"); clickLink("Golf_Course");}catch (NoSuchElementException e){System.err.println(e);}
        //Add golf course
        try{clickButton("Golf_AddGolf","Add Golf Course");test.pass("Add Golf Course Button");}catch(NoSuchElementException e){test.fail("Add Golf Course Button "+e);}extent.flush();
        //Validate page row text
        test.info("Validate page row text");
        if (verifyTitleText("golf",4)=="true"){test.pass("golf");test.info(verifyTitleTextInfo("golf", 4));extent.flush();}
        else{test.fail("golf");test.info(verifyTitleTextInfo("golf", 4));try{st.getScreenshot(getdriver(),"golf");extent.flush();}catch(Exception e){System.out.println("Error:"+e);}try{test.addScreenCaptureFromPath(st.addScreenshot());extent.flush();} catch(Exception e){}}

        if (verifyTitleText("golf",5)=="true"){test.pass("golf");test.info(verifyTitleTextInfo("golf", 5));extent.flush();}
        else{test.fail("golf");test.info(verifyTitleTextInfo("golf", 5));try{st.getScreenshot(getdriver(),"golf");extent.flush();}catch(Exception e){System.out.println("Error:"+e);}try{test.addScreenCaptureFromPath(st.addScreenshot());extent.flush();} catch(Exception e){}}

        if (verifyTitleText("golf",6)=="true"){test.pass("golf");test.info(verifyTitleTextInfo("golf", 6));extent.flush();}
        else{test.fail("golf");test.info(verifyTitleTextInfo("golf", 6));try{st.getScreenshot(getdriver(),"golf");extent.flush();}catch(Exception e){System.out.println("Error:"+e);}try{test.addScreenCaptureFromPath(st.addScreenshot());extent.flush();} catch(Exception e){}}

        if (verifyTitleText("golf",7)=="true"){test.pass("golf");test.info(verifyTitleTextInfo("golf", 7));extent.flush();}
        else{test.fail("golf");test.info(verifyTitleTextInfo("golf", 7));try{st.getScreenshot(getdriver(),"golf");extent.flush();}catch(Exception e){System.out.println("Error:"+e);}try{test.addScreenCaptureFromPath(st.addScreenshot());extent.flush();} catch(Exception e){}}

        if (verifyTitleText("golf",8)=="true"){test.pass("golf");test.info(verifyTitleTextInfo("golf", 8));extent.flush();}
        else{test.fail("golf");test.info(verifyTitleTextInfo("golf", 8));try{st.getScreenshot(getdriver(),"golf");extent.flush();}catch(Exception e){System.out.println("Error:"+e);}try{test.addScreenCaptureFromPath(st.addScreenshot());extent.flush();} catch(Exception e){}}

        if (verifyTitleText("golf",9)=="true"){test.pass("golf");test.info(verifyTitleTextInfo("golf", 9));extent.flush();}
        else{test.fail("golf");test.info(verifyTitleTextInfo("golf", 9));try{st.getScreenshot(getdriver(),"golf");extent.flush();}catch(Exception e){System.out.println("Error:"+e);}try{test.addScreenCaptureFromPath(st.addScreenshot());extent.flush();} catch(Exception e){}}

        if (verifyTitleText("golf",10)=="true"){test.pass("golf");test.info(verifyTitleTextInfo("golf", 10));extent.flush();}
        else{test.fail("golf");test.info(verifyTitleTextInfo("golf", 10));try{st.getScreenshot(getdriver(),"golf");extent.flush();}catch(Exception e){System.out.println("Error:"+e);}try{test.addScreenCaptureFromPath(st.addScreenshot());extent.flush();} catch(Exception e){}}

        if (verifyTitleText("golf",11)=="true"){test.pass("golf");test.info(verifyTitleTextInfo("golf", 11));extent.flush();}
        else{test.fail("golf");test.info(verifyTitleTextInfo("golf", 11));try{st.getScreenshot(getdriver(),"golf");extent.flush();}catch(Exception e){System.out.println("Error:"+e);}try{test.addScreenCaptureFromPath(st.addScreenshot());extent.flush();} catch(Exception e){}}

        if (verifyTitleText("golf",12)=="true"){test.pass("golf");test.info(verifyTitleTextInfo("golf", 12));extent.flush();}
        else{test.fail("golf");test.info(verifyTitleTextInfo("golf", 12));try{st.getScreenshot(getdriver(),"golf");extent.flush();}catch(Exception e){System.out.println("Error:"+e);}try{test.addScreenCaptureFromPath(st.addScreenshot());extent.flush();} catch(Exception e){}}

        if (verifyTitleText("golf",13)=="true"){test.pass("golf");test.info(verifyTitleTextInfo("golf", 13));extent.flush();}
        else{test.fail("golf");test.info(verifyTitleTextInfo("golf", 13));try{st.getScreenshot(getdriver(),"golf");extent.flush();}catch(Exception e){System.out.println("Error:"+e);}try{test.addScreenCaptureFromPath(st.addScreenshot());extent.flush();} catch(Exception e){}}

        if (verifyTitleText("golf",14)=="true"){test.pass("golf");test.info(verifyTitleTextInfo("golf", 14));extent.flush();}
        else{test.fail("golf");test.info(verifyTitleTextInfo("golf", 14));try{st.getScreenshot(getdriver(),"golf");extent.flush();}catch(Exception e){System.out.println("Error:"+e);}try{test.addScreenCaptureFromPath(st.addScreenshot());extent.flush();} catch(Exception e){}}

        //Fill in values and save
        test.info("Start adding a golf course");test.pass("");
        try{enterText("Golf_NameTextbox", "Mountain View Golf");test.pass("Text Box Name");}catch(NoSuchElementException e){test.fail("Text Box Name"+e);}extent.flush();
        try{enterText("Golf_AddressTextbox","1188 Mountain AVE");test.pass("Text Box Address");}catch(NoSuchElementException e){test.fail("Text Box Address"+e);}extent.flush();
        try{enterText("Golf_CityTextbox", "Red River");test.pass("Text Box City");}catch(NoSuchElementException e){test.fail("Text Box City"+e);}extent.flush();
        try{enterText("Golf_ProvinceTextbox","ON");test.pass("Text Box Province");}catch(NoSuchElementException e){test.fail("Text Box Province"+e);}extent.flush();

        try{dropList("Golf_CountryDroplist","Greenland");test.pass("Dropdown list Country");}catch(NoSuchElementException e){test.fail("Dropdown list Country"+e);}extent.flush();

        try{enterText("Golf_DesTextbox","Nice View Mountain Golf");test.pass("Text Box Description");}catch(NoSuchElementException e){test.fail("Text Box Description"+e);}extent.flush();
        try{enterText("Golf_LongDesTextarea","Nice View Mountain Golf Nice View Mountain Golf Nice View Mountain Golf");test.pass("Text Box long Description");}catch(NoSuchElementException e){test.fail("Text Box long Description"+e);}extent.flush();
        try{enterText("Golf_OwnerTextbox","Daniel Dow");test.pass("Text Box Owner");}catch(NoSuchElementException e){test.fail("Text Box Owner"+e);}extent.flush();
        try{enterText("Golf_EmailTextbox","test2@admlucid.com");test.pass("Text Box Email");}catch(NoSuchElementException e){test.fail("Text Box Email"+e);}extent.flush();
        try{enterText("Golf_PhoneTextbox", "614 556 8899");test.pass("Text Box Phone");}catch(NoSuchElementException e){test.fail("Text Box Phone"+e);}extent.flush();

        try{clickButton2("Golf_CreateButton");test.pass("Button Create");}catch(NoSuchElementException e){test.fail("Button Create"+e);}extent.flush();
        //Log out and close browser
        clickLink("Logout");
        BrowserClose();
    }
    public void editGolfCourse(String browser, Integer testInt) throws MalformedURLException, InterruptedException {
        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        ExtentTest test = extent.createTest("Test: Golf - edit a golf course using Web Browser -- "+browser, "Test Golf - Adm Lucid");
        testBrowser(browser);
        //login
        Login(); wait.For(3);
        try{clickButton("Golf_Tests","Tests"); clickLink("Golf_Course");}catch (NoSuchElementException e){System.err.println(e);}
        try{enterText("Golf_SearchTextBox", "Mountain View Golf");test.pass("Golf Search Text Box for");}catch (NoSuchElementException e){test.fail("Golf Search Text Box for ");}extent.flush();
        try{clickButton2("Golf_SearchButton");test.pass("Golf Search Button");}catch (NoSuchElementException e){test.fail("Golf Search Button");}extent.flush();
        try{clickLink("Edit");;test.pass("Golf Edit Link");}catch (NoSuchElementException e){test.fail("Golf Edit Link");}extent.flush();

        try{enterText("Golf_LongDesTextarea","One of the greatest things about golf (besides the beverage cart) is that you can play a ragged, run-of-the-mill course and have the time of your life, or you can play a world-famous course and have the time of your life — the fun factor doesn’t necessarily correlate with the price. Mountain golf courses have an elevated appeal based on location alone. Here are three to play this summer.");test.pass("Text Box long Description");}catch(NoSuchElementException e){test.fail("Text Box long Description"+e);}extent.flush();

        try{enterText("Golf_OwnerTextbox","Test2 Daniel");test.pass("Text Box Owner");}catch(NoSuchElementException e){test.fail("Text Box Owner"+e);}extent.flush();

        try{clickButton2("Golf_SaveButton"); clickLink("Golf_Course");}catch (NoSuchElementException e){System.err.println(e);}
        //Log out and close browser
        clickLink("Logout");
        BrowserClose();
    }

    public void deleteGolfCourse(String browser, Integer testInt) throws MalformedURLException, InterruptedException {
        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        ExtentTest test = extent.createTest("Test: Golf - delete a golf course using Web Browser -- "+browser, "Test Golf - Adm Lucid");
        testBrowser(browser);
        //login
        Login(); wait.For(3);
        try{clickButton("Golf_Tests","Tests"); clickLink("Golf_Course");}catch (NoSuchElementException e){System.err.println(e);}
        try{enterText("Golf_SearchTextBox", "Mountain View Golf");test.pass("Golf Search Text Box for");}catch (NoSuchElementException e){test.fail("Golf Search Text Box for ");}extent.flush();
        try{clickButton2("Golf_SearchButton");test.pass("Golf Search Button");}catch (NoSuchElementException e){test.fail("Golf Search Button");}extent.flush();
        try{clickLink("Delete");;test.pass("Golf Delete Link");}catch (NoSuchElementException e){test.fail("Golf Delete Link");}extent.flush();wait.For(8);

        try{clickButton2("Golf_DeleteButton");test.pass("Golf Delete Button");}catch (NoSuchElementException e){test.fail("Golf Delete Button");}extent.flush();

        //Log out and close browser
        clickLink("Logout");
        BrowserClose();
    }
    public void Login(){
        clickLink("Login");
        enterText("Login_username",lg.getEmail());
        enterText("Login_password",lg.getPassword());
        clickButton("Login_Login", "Log in");
    }
    public void checkPermissionForEditDelete(String browser, Integer testInt) throws MalformedURLException, InterruptedException {
        switch(testInt){
            case 0:
                extent.attachReporter(htmlReporter);break;
            case 1:
                extent.attachReporter(htmlReporter1);break;
            case 2:
                extent.attachReporter(htmlReporter2);break;
        }
        testBrowser(browser);

        //Login and check other added golf course I should not have permission to edit or delete


    }
}
