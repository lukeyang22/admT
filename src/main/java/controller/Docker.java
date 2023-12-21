package controller;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import manager.Screenshot;
import manager.TestManager;
import manager.UIManager;
import org.junit.Assert;
import org.openqa.selenium.ImmutableCapabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.openqa.selenium.remote.*;
import org.openqa.selenium.support.ui.Wait;
import util.Compare;
import util.Load;
import webelement.PageObject;

import java.io.IOException;
import java.net.MalformedURLException;
import com.opencsv.CSVWriter;
//import our own classes

import java.net.URL;
import java.util.concurrent.TimeUnit;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.ExtentTest;
public class Docker extends Base {
    //private WebDriver driver;  private String webElement="";
    private RemoteWebDriver driver;
    //protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
    public static String remote_url_chrome = "http://localhost:4445/wd/hub";//"http://localhost:4445/wd/hub";
    public static String remote_url_firefox = "http://localhost:4446/wd/hub";
    public static String remote_url_edge = "http://localhost:4447/wd/hub";
    public static String remote_url_node = "http://localhost:4444/wd/hub";
    static final String APP_URL = "https://www.admlucid.com";

    //Constructor
    public Docker() {
        super();
    }

    TestManager testManager = new TestManager();
    UIManager uimanager = new UIManager();
    Compare compare = new Compare();
    Load wait = new Load();
    Screenshot st = new Screenshot();
    PageObject pg = new PageObject();
    ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(getReportPath() + "Docker" + getDateTime() + ".html");
    ExtentReports extent = new ExtentReports();

    public void home_firefox() throws MalformedURLException, InterruptedException {
        extent.attachReporter(htmlReporter);
        ExtentTest test = extent.createTest("Test: Docker - verify Golf Course using Web Browser -- Chrome", "Test Docker - Adm Lucid");
        System.out.println("Test Home");
        test.info("Test Home");  extent.flush();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--ignore-ssl-errors=yes");
        options.addArguments("--ignore-certificate-errors");
        try {
            driver = new RemoteWebDriver(new URL(remote_url_firefox), options);
            test.pass("Open Docker webdriver");
        } catch (MalformedURLException e) {
            e.printStackTrace();
            test.fail((e));
        }extent.flush();
        synchronized (this) {
            try {
                driver.get(APP_URL);
                wait(20);
                test.info("Go to " + APP_URL);
                if (driver.getCurrentUrl().equalsIgnoreCase("https://www.admlucid.com/")) {
                    test.pass("URL: " + driver.getCurrentUrl());
                } else {
                    test.fail("URL is not expected");
                    test.info(driver.getCurrentUrl());
                }
                extent.flush();
                if (driver.getTitle().contains("Home Page - Admlucid")) {
                    test.pass("Page Title is: " + driver.getTitle());
                } else {
                    test.fail("Page Title is not equal");
                }
                extent.flush();
            } catch (Exception e) {
                test.fail("Second Try " + e);
            } extent.flush();
        }
    }

    public void home_chrome() {
        extent.attachReporter(htmlReporter);
        ExtentTest test = extent.createTest("Test: Docker - verify Golf Course using Web Browser -- Chrome", "Test Docker - Adm Lucid");
        ChromeOptions optionsc = new ChromeOptions();
        //optionsc.addArguments("browserVersion", "115");
        optionsc.addArguments("--ignore-ssl-errors=yes");
        optionsc.addArguments("--ignore-certificate-errors");
        test.info("Test Home");  extent.flush();
        try {  driver = new RemoteWebDriver(new URL(remote_url_chrome), optionsc);
               test.pass("Open docker webdriver - chrome");
        } catch (MalformedURLException e) {
            e.printStackTrace();
            test.fail(e);
        }extent.flush();
        synchronized (this) {
            try {
                driver.get(APP_URL);
                wait(20);
                test.info("Go to " + APP_URL);
                if (driver.getCurrentUrl().equalsIgnoreCase("https://www.admlucid.com/")) {
                    test.pass("URL: " + driver.getCurrentUrl());
                } else {
                    test.fail("URL is not expected");
                    test.info(driver.getCurrentUrl());
                }
                extent.flush();
                if (driver.getTitle().contains("Home Page - Admlucid")) {
                    test.pass("Page Title is: " + driver.getTitle());
                } else {
                    test.fail("Page Title is not equal");
                }
                extent.flush();
            } catch (Exception e) {
                test.fail("Second Try " + e);
            } extent.flush();
        }

    }

    public void home_edge() {
        extent.attachReporter(htmlReporter);
        ExtentTest test = extent.createTest("Test: Docker - verify Golf Course using Web Browser -- edge", "Test Docker - Adm Lucid");
        test.info("Test Home");extent.flush();
        EdgeOptions optionse = new EdgeOptions();
        optionse.addArguments("--ignore-ssl-errors=yes");
        optionse.addArguments("--ignore-certificate-errors");

        try {
            driver = new RemoteWebDriver(new URL(remote_url_edge), optionse);test.pass("Open Docker Edge");
        } catch (MalformedURLException e) {
            e.printStackTrace();
            test.fail(e);
        }extent.flush();
        synchronized (this) {
            try {
                driver.get(APP_URL);
                wait(20);
                test.info("Go to " + APP_URL);
                if (driver.getCurrentUrl().equalsIgnoreCase("https://www.admlucid.com/")) {
                    test.pass("URL: " + driver.getCurrentUrl());
                } else {
                    test.fail("URL is not expected");
                    test.info(driver.getCurrentUrl());
                }
                extent.flush();
                if (driver.getTitle().contains("Home Page - Admlucid")) {
                    test.pass("Page Title is: " + driver.getTitle());
                } else {
                    test.fail("Page Title is not equal");
                }
                extent.flush();
            } catch (Exception e) {
                test.fail("Second Try " + e);
            } extent.flush();
        }

    }

}

