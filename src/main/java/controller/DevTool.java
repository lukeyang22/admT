package controller;

import com.google.common.collect.ImmutableList;
import manager.Screenshot;
import manager.TestManager;
import manager.UIManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v120.emulation.Emulation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.openqa.selenium.devtools.v119.log.Log;
import org.openqa.selenium.devtools.v119.performance.Performance;
import org.openqa.selenium.devtools.v119.performance.model.Metric;
import org.openqa.selenium.remote.RemoteWebDriver;
import util.Compare;
import util.Load;
import webelement.PageObject;
import com.opencsv.CSVWriter;


public class DevTool {
    private WebDriver driver;  private String webElement="";
    //Constructor
    public DevTool() {
        super();
    }

    //Call methods
    TestManager testManager = new TestManager();    UIManager uimanager = new UIManager();    Compare compare = new Compare();    Load wait =new Load();    Screenshot st= new Screenshot(); PageObject pg=new PageObject();
    public static String remote_url_chrome = "http://localhost:4445/wd/hub";
    public void GeoLocation_City(String c) {
        ChromeOptions options = new ChromeOptions();
        ChromeDriverService service = new ChromeDriverService.Builder().build();
        options.setExperimentalOption("excludeSwitches", ImmutableList.of("disable-popup-blocking"));
        options.addArguments("--remote-allow-origins=*");

        options.setCapability(ChromeOptions.CAPABILITY, options);

        options.setAcceptInsecureCerts(true);
       // ChromeDriverService service=new ChromeDriverService.Builder().withLogOutput(System.out).build(); //usingPort(61190)
        String[][] city={{"Berlin","52.5043","13.4501","1"},{"London","51.507351","-0.127758","1"},{"Tokyo","35.689487","139.691706","1"},{"New York","40.712776","-74.005974","1"},{"Los Angeles","34.052235","-118.243683","1"},{"Chicago","41.878113","-87.629799","1"},{"Houston","29.760427","-95.369804"},
                {"Bradford","53.7950","-1.7594","1"},{"Reading","51.4543","-0.9781","1"},{"Stoke-on-Trent","53.0027","-2.1794","1"},{"Wolverhampton","52.5862","-2.1286","1"}}; Float[] arr = new Float[4];
        for(int i=0;i<10;i++)
        {
            if(city[i][0]==c)
            {
                for(int a=1;a<4;a++)
                {
                    arr[a]=Float.parseFloat(city[i][a]);
                }
            }
        }
        for(int n=1;n<4;n++)
        {
            System.out.println(arr[n]);
        }
        //ChromeDriver driver = new ChromeDriver();
        //try{driver = new RemoteWebDriver(new URL(remote_url_chrome), options);}catch (MalformedURLException e){}
        try {
            ChromeDriver driver = (ChromeDriver) new RemoteWebDriver(new URL(remote_url_chrome), options);
            DevTools devTools = driver.getDevTools();
            devTools.createSession();
            devTools.send(Emulation.setGeolocationOverride(Optional.of(arr[1]),
                    Optional.of(arr[2]),
                    Optional.of(arr[3])));
            driver.get("https://my-location.org/");//driver.navigate().refresh();driver.get("https://my-location.org/");
        } catch (MalformedURLException e) {
            System.err.println(e);
        }}
    String view_url="https://youtu.be/QMVFZYW0LeI"; Integer w=180;
   /* public void Vivew_From_City(String c) {
        ChromeOptions optionsc = new ChromeOptions();
        optionsc.addArguments("--ignore-ssl-errors=yes");
        optionsc.addArguments("--ignore-certificate-errors");
        try {  driver = new RemoteWebDriver(new URL("http://localhost:4444"), optionsc);
        } catch (MalformedURLException e) { }

        ChromeOptions options = new ChromeOptions();
        ChromeDriverService service = new ChromeDriverService.Builder().build();
        options.setExperimentalOption("excludeSwitches", ImmutableList.of("disable-popup-blocking"));
        options.addArguments("--remote-allow-origins=*");

        options.setCapability(ChromeOptions.CAPABILITY, options);

        options.setAcceptInsecureCerts(true);
        // ChromeDriverService service=new ChromeDriverService.Builder().withLogOutput(System.out).build(); //usingPort(61190)
        String[][] city={{"Berlin","52.5043","13.4501","1"},{"London","51.507351","-0.127758","1"},{"Tokyo","35.689487","139.691706","1"}}; Float[] arr = new Float[4];
        for(int i=0;i<3;i++)
        {
            if(city[i][0]==c)
            {
                for(int a=1;a<4;a++)
                {
                    arr[a]=Float.parseFloat(city[i][a]);
                }
            }
        }
        for(int n=1;n<4;n++)
        {
            System.out.println(arr[n]);
        }
       // ChromeDriver driver = new ChromeDriver();
        driver = new RemoteWebDriver(new URL("http://localhost:4444"), optionsc);

        try {
            driver = new RemoteWebDriver(new URL("http://localhost:4444"), optionsc);
            DevTools devTools = driver.getDevTools();
            devTools.createSession();
            devTools.send(Emulation.setGeolocationOverride(Optional.of(arr[1]),
                    Optional.of(arr[2]),
                    Optional.of(arr[3])));
            driver.get(view_url);driver.navigate().refresh();driver.get(view_url);wait.For(w); driver.quit();
        } catch (Exception e) {
            System.err.println(e);
        }}*/
    public void view1(){
        driver.get(view_url); wait.For(w);driver.quit();
    }
    public void WebperformanceMetrics(String website) {
        ChromeDriverService service=new ChromeDriverService.Builder().withLogOutput(System.out).usingPort(61190).build();
        ChromeDriver driver = new ChromeDriver(service);
        DevTools devTools = driver.getDevTools();
        devTools.createSession();
        devTools.send(Performance.enable(Optional.empty()));
        List<Metric> metricList = devTools.send(Performance.getMetrics());

        //driver.get("https://google.com");
        driver.get(website);
        List<String[]> data = new ArrayList<String[]>();
        for(Metric m : metricList) {
            System.out.println("****************");
            System.out.println(m.getName() + " = " + m.getValue());
            data.add(new String[] { m.getName() + " = " + m.getValue() });
        }

        File report = new File("src/main/java/report/report.csv");
        try{
        FileWriter outputfile = new FileWriter(report);
        CSVWriter writer = new CSVWriter(outputfile);

            writer.writeAll(data);writer.close();}catch (IOException e){}
        driver.quit();
    }
    public void viewConsoleLogs() {
        ChromeDriverService service=new ChromeDriverService.Builder().withLogOutput(System.out).build();
        ChromeDriver driver = new ChromeDriver(service);
        DevTools devTools = driver.getDevTools();
        //DevTools devTools = driver.getDevTools();
        devTools.createSession();
        devTools.send(Log.enable());
        devTools.addListener(Log.entryAdded(), logEntry -> {
            System.out.println("-------------------------------------------");
            System.out.println("Request ID = " + logEntry.getNetworkRequestId());
            System.out.println("URL = " + logEntry.getUrl());
            System.out.println("Stack Trace = " + logEntry.getStackTrace());
            System.out.println("Args = " + logEntry.getArgs());
            System.out.println("Category = " + logEntry.getCategory());
            System.out.println("Line Number = " + logEntry.getLineNumber());
            System.out.println("Source = " + logEntry.getSource());
            System.out.println("Level = " + logEntry.getLevel());
            System.out.println("Text = " + logEntry.getText());
            System.out.println("Worker Id = " + logEntry.getWorkerId());
            System.out.println("-------------------------------------------");
        });
        driver.get("https://www.alberta.ca/404");
        driver.quit();
    }
    public void device(String de) {

        String[][] dev ={{"iPhone","375","812","50"},{"iPad","328","215","60"},{"tablet","550","960","40"}}; Integer[] arr= new Integer[4];
        for(int i=0;i<3;i++)
        {
            if(dev[i][0]==de)
            {
                for(int a=1;a<4;a++)
                {
                    arr[a]=Integer.parseInt(dev[i][a]);
                }
            }
        }
        for(int n=1;n<4;n++)
        {
            System.out.println(arr[n]);
        }
        ChromeDriverService service=new ChromeDriverService.Builder().withLogOutput(System.out).build();
        ChromeDriver driver = new ChromeDriver(service);
        DevTools devTools = driver.getDevTools();
        devTools.createSession();
        // iPhone 11 Pro dimensions
        devTools.send(Emulation.setDeviceMetricsOverride(arr[1],
                arr[2],
                arr[3],
                true,
                Optional.empty(),
                Optional.empty(),
                Optional.empty(),
                Optional.empty(),
                Optional.empty(),
                Optional.empty(),
                Optional.empty(),
                Optional.empty(),
                Optional.empty()));
        driver.get("https://www.admlucid.com");
        driver.quit();
    }
}

