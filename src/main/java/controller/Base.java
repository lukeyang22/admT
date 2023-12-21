/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.safari.SafariDriver;
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
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import manager.Screenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import java.util.concurrent.TimeUnit;
//import our own classes
import manager.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.*;
import webelement.PageObject;
import static org.junit.Assert.*;
import static org.openqa.selenium.By.*;

/**
 *
 * @author adm
 */
public class Base {
    private StringBuffer verificationErrors = new StringBuffer();
	private WebDriver driver;  private String webElement="";
	//Constructor	
        public Base() {
            super();     
        }

        //Call methods
        TestManager testManager = new TestManager();UIManager uimanager = new UIManager();Compare compare = new Compare();Load wait =new Load();Screenshot st= new Screenshot(); PageObject pg=new PageObject();

        protected void testBrowser(String bs) throws MalformedURLException, InterruptedException {
            String browser="";
            switch(bs){

                case "chrome":
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--remote-allow-origins=*"); options.addArguments("--remote-debugging-port=9999");
                    driver = new ChromeDriver(options); break;
                case "firefox":
                    FirefoxOptions optionsFF = new FirefoxOptions();
                    //optionsFF.addArguments("--remote-allow-origins=*");
                    driver = new FirefoxDriver(optionsFF);break;
                case "edge":
                    EdgeOptions optionsE = new EdgeOptions();
                    optionsE.addArguments("--remote-allow-origins=*");
                    driver = new EdgeDriver(optionsE);break;

                default:
                    SafariOptions optionsS = new SafariOptions();
                    driver = new SafariDriver(optionsS);break;
            }            
            String baseUrl = "";
            try{baseUrl=testManager.setProperty("url");}catch(Exception e){System.err.print(e);}
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            driver.get(baseUrl); driver.manage().window().maximize();wait.For(2);
        }
        protected void clickButton(String w, String txt ){
            if(driver.findElement(xpath(uimanager.FindElement(w))).getText().equals(txt))
            {
                driver.findElement(xpath(uimanager.FindElement(w))).click();
            }
            else {System.err.println("Could not find the button");}
        }
        protected void clickButton2(String w){
            driver.findElement(xpath(uimanager.FindElement(w))).click();
        }
        protected void enterText(String w, String txt){
           driver.findElement(xpath(uimanager.FindElement(w))).clear();
           driver.findElement(xpath(uimanager.FindElement(w))).sendKeys(txt);
        }
        protected void dropList(String w, String valueTxt){
            Select drplist = new Select(driver.findElement(xpath(uimanager.FindElement(w))));
            drplist.selectByVisibleText(valueTxt);
        }
        protected  void alertAccept(){
            driver.switchTo().alert().accept();
        }
        protected void BrowserClose(){
            driver.quit();
        }

    protected String verifyTitleText(String page, Integer i){
        String[]Text = pg.Table(page, i).split(";");
        //System.out.println(Text[0]+"---"+driver.findElement(By.xpath(Text[1])).getText());
        String r="";
        if(Text[0].equalsIgnoreCase(driver.findElement(xpath(Text[1])).getText()))
            r="true";
        else{ r="false";
            Actions action=new Actions(driver);
            WebElement web =driver.findElement(xpath(Text[1]));
            action.moveToElement(web).build().perform();
        }
        return r;
    }
    protected String verifyTableText(String table, Integer i){
        String[]Text = pg.Table(table, i).split(";");
        //System.out.println(Text[0]+"---"+driver.findElement(By.xpath(Text[1])).getAttribute("innerHTML"));
        String r="";
        if(Text[0].equalsIgnoreCase(driver.findElement(xpath(Text[1])).getAttribute("innerHTML")))
            r="true";
        else r="false";
        return r;
    }
    protected String verifyTableTextInfo(String table, Integer i){
        String[]Text = pg.Table(table, i).split(";");
        return "Expeted:"+Text[0]+"----Actual:"+driver.findElement(xpath(Text[1])).getAttribute("innerHTML").trim();
    }
    protected String verifyTitleTextInfo(String table, Integer i){
        String[]Text = pg.Table(table, i).split(";");
        return "Expeted:"+Text[0]+"----Actual:"+driver.findElement(xpath(Text[1])).getText();
    }
    protected WebDriver getdriver(){
       // if (driver == null){ driver = new FirefoxDriver(); return driver;}
        //else
            return driver=this.driver;
    }
    protected String screenshotName(String screenshotname) throws Exception{
        String dateName = new SimpleDateFormat("yyyyMMddhh").format(new Date()); String sn="";
        FileReader reader = new FileReader("src/main/java/config/config.properties");
        Properties properties = new Properties();
        properties.load(reader);
        sn=properties.getProperty("propertyScreenshot") +screenshotname+dateName+".png";
        return sn;
    }
    String DataTime="";
    public String getDateTime(){
        return DataTime = new SimpleDateFormat("yyyyMMddhhmm").format(new Date());
    }

    String rpLocation ="";
    public String getReportPath(){
        try{
            rpLocation = testManager.setProperty("report");
        }catch(Exception e){};
        return rpLocation;
    }
    public void clickLink(String lText){
       try{ driver.findElement(By.linkText(lText)).click();}catch(NoSuchElementException e){System.err.println(e);}
    }
    public String getText(String w){
        return driver.findElement(By.xpath(uimanager.FindElement(w))).getText();
    }
       /* protected void UserName_Input(){
            String Username="";try{Username=testManager.setProperty("username");}catch(Exception e){System.err.print(e);}
            webElement="Login_username";          
            if(ValidateWebelement(webElement)=="True")
            {  driver.findElement(By.xpath(uimanager.FindElement(webElement))).clear();            
               driver.findElement(By.xpath(uimanager.FindElement(webElement))).sendKeys(Username); }
            else { System.exit(1);}    
        }        
        protected void PassWord_Input(){
            String Password="";try{Password=testManager.setProperty("password");}catch(Exception e){System.err.print(e);}
            webElement = "Login_password";
            if(ValidateWebelement(webElement)=="True")
            {   driver.findElement(By.xpath(uimanager.FindElement(webElement))).clear();            
                driver.findElement(By.xpath(uimanager.FindElement(webElement))).sendKeys(Password);}
            else { System.exit(1);} 
        }
        protected void UserName(String un){
            webElement="Login_username";          
            if(ValidateWebelement(webElement)=="True")
            {  driver.findElement(By.xpath(uimanager.FindElement(webElement))).clear();            
               driver.findElement(By.xpath(uimanager.FindElement(webElement))).sendKeys(un); }
            else { System.exit(1);}  
        }
        protected void PassWord(String pw){
            webElement = "Login_password";
            if(ValidateWebelement(webElement)=="True")
            {   driver.findElement(By.xpath(uimanager.FindElement(webElement))).clear();            
                driver.findElement(By.xpath(uimanager.FindElement(webElement))).sendKeys(pw);}
            else { System.exit(1);} 
        }
        protected void enter_username(String username){
            webElement="Login_username";              
            if(ValidateWebelement(webElement)=="True")
            {  driver.findElement(By.xpath(uimanager.FindElement(webElement))).clear();            
               driver.findElement(By.xpath(uimanager.FindElement(webElement))).sendKeys(username); }
            else { System.exit(1);}    
        }
        protected void enter_password(String password){
            webElement = "Login_password";
            if(ValidateWebelement(webElement)=="True")
            {   driver.findElement(By.xpath(uimanager.FindElement(webElement))).clear();            
                driver.findElement(By.xpath(uimanager.FindElement(webElement))).sendKeys(password);}
            else { System.exit(1);} 
        }
        protected void Wrong_Password(String pw){
            webElement = "Login_password";
            if(ValidateWebelement(webElement)=="True")
            {   driver.findElement(By.xpath(uimanager.FindElement(webElement))).clear();            
                driver.findElement(By.xpath(uimanager.FindElement(webElement))).sendKeys(pw);}
            else { System.exit(1);}
        }
        protected void LoginPage_IsCorrect(){
           
            webElement =  "//*[@id=\"content_table\"]/caption";          
            //if(ValidateWebelement(webElement)=="True")
                assertTrue(getTableText(webElement).contains("OVM Login -"));            
           System.out.println("It gets text:"+getTableText(webElement));
        }
        protected void Signin_Click() {  
           webElement = "Login_signin";           
           if(ValidateWebelement(webElement)=="True")
           {     driver.findElement(By.xpath(uimanager.FindElement(webElement))).click(); driver.manage().window().maximize();}
           else { System.exit(1);} 
           System.out.println("List:"+uimanager.FindElement("PageObject_Login"));
        }        
        protected String Login_Successful(){                  
            //if(assertEquals("Dashboard - Synapse Luke 3", driver.getTitle()))
           String r = "false";
           if (driver.getTitle() == "Dashboard - Synapse Luke 3" )  
           {
               r ="true";
           }
           else{r="false";}
           return r;
        }
        //private commond methods
        protected String GetText(String webElement){
            return driver.findElement(By.xpath(uimanager.FindElement(webElement))).getText();
        }
        protected String getText(String s){
           return driver.findElement(By.xpath(s)).getText();
        }
        protected boolean isEnabled(String btn){
           webElement=btn;
           if(ValidateWebelement(webElement)=="True")
           {try{          
                driver.findElement(By.xpath(uimanager.FindElement(webElement))).isEnabled(); return true;
                    } catch (NoSuchElementException e){} 
           }                   
           return false;
        }   
        protected boolean isReadOnly(String textbox){
           webElement=textbox;           
               if(driver.findElement(By.xpath(uimanager.FindElement(webElement))).getAttribute("disabled").contains("true")){return true;}
               else return false;          
        }
        protected boolean isEditable(String textbox){
           webElement=textbox;           
               if(driver.findElement(By.xpath(uimanager.FindElement(webElement))).isEnabled()){return true;}
               else return false;          
        }
        protected boolean isElementPresent(By by) {
            try {
                    driver.findElement(by);
                    return true;
                } catch (NoSuchElementException e) {
            return false;
        }  }  
        protected boolean isElementPresent2(String s1) {
            try {
                    driver.findElement(By.xpath(uimanager.FindElement(s1))).isDisplayed();
                    return true;
                } catch (NoSuchElementException e) {
            return false;
        }  }  
        protected boolean isChecked(String bx) {
           webElement=bx;
           if(ValidateWebelement(webElement)=="True" &&               
                driver.findElement(By.xpath(uimanager.FindElement(webElement))).isSelected()) return true;
           else return false; 
        }  
        protected boolean isNotChecked(String bx) {
           webElement=bx;
           if(ValidateWebelement(webElement)=="True" &&          
                driver.findElement(By.xpath(uimanager.FindElement(webElement))).isSelected()) return false;
           else return true; 
        }   
        protected String getButtonText(String webElement){
           return driver.findElement(By.xpath(uimanager.FindElement(webElement))).getAttribute("value");
        }
        protected String getTableText(String webElement){
           // return driver.findElement(By.xpath(uimanager.FindElement(webElement))).getAttribute("innerHTML");
           //return driver.findElement(By.xpath(webElement)).getAttribute("innerHTML");
           // return driver.findElement(By.xpath(".//*[@id=\"content_table\"]//td[contains(text(),'User Name')])")).getText();
           //return driver.findElement(By.xpath(".//*[@id=\"content_table\"]/tbody/tr[1]/td[1]")).getAttribute("innerHTML");
           return driver.findElement(By.xpath(webElement)).getAttribute("innerHTML");
        }
        protected String verifyTitleText(String page, Integer i){
           String[]Text = pg.Table(page, i).split(";");
           //System.out.println(Text[0]+"---"+driver.findElement(By.xpath(Text[1])).getText());           
           String r="";
           if(Text[0].equalsIgnoreCase(driver.findElement(By.xpath(Text[1])).getText()))
                r="true";           
           else r="false";    
           return r; 
        }
        protected String verifyTableText(String table, Integer i){
           String[]Text = pg.Table(table, i).split(";");
           //System.out.println(Text[0]+"---"+driver.findElement(By.xpath(Text[1])).getAttribute("innerHTML"));            
           String r="";
           if(Text[0].equalsIgnoreCase(driver.findElement(By.xpath(Text[1])).getAttribute("innerHTML")))
                r="true";           
           else r="false";    
           return r; 
        }
        protected String verifyTableRowContent(String s1[][], String s2[][],Integer row,Integer col){
           String r="";
           for(int i=0;i<row;i++)
           {
               for(int j=0; j<col;j++)
                  if(s1[i][j].toString().equalsIgnoreCase(driver.findElement(By.xpath(uimanager.FindElement(s2[i][j]))).getText()))
                  {  r="True"; System.out.println("The table row: "+"["+i+"]["+j+"] content is equal."); 
                  }else{r="False";System.out.println("expected--"+s1[i][j].toString()+" Actual--"+driver.findElement(By.xpath(uimanager.FindElement(s1[i][j]))).getText());break;}
           }
           return r;
        }
        protected String verifyTableCellContent(String s1[],String s2[],Integer row){
            String r="False";
            for(int i=0;i<row;i++)
            {
                if(s1[i].toString().contains(driver.findElement(By.xpath(uimanager.FindElement(s2[i]))).getText()))
                {     r="True";System.out.println("Equal");}                
            }
            return r;            
        }
        protected String verifyTableTextInfo(String table, Integer i){
           String[]Text = pg.Table(table, i).split(";");
           return "Expeted:"+Text[0]+"----Actual:"+driver.findElement(By.xpath(Text[1])).getAttribute("innerHTML").trim();
        }
        protected String verifyTitleTextInfo(String table, Integer i){
           String[]Text = pg.Table(table, i).split(";");
           return "Expeted:"+Text[0]+"----Actual:"+driver.findElement(By.xpath(Text[1])).getText();
        }
        protected String comparedTwoStrings(String s1, String s2){
           String r="False";
           if(s1.trim().equalsIgnoreCase(s2.trim()))
           {
               r="True";
           }           
           return r; 
        }
        protected String compareTableOneRow(String s1[][],String s2[][], Integer row1, Integer row2,Integer col){
            String r="";
            for(int i=0;i<col;i++)
            {   try{
                 if(s1[i][row1].toString().equalsIgnoreCase(driver.findElement(By.xpath(uimanager.FindElement(s2[i][row2]))).getText()))
                 {
                     r="True";System.out.println(s1[i][row1].toString()+"--"+ s2[row2][i]+"content is equal.");
                 }else{r="False"; System.out.println("s1 - s2 content is not equal.");}}catch(NoSuchElementException e){r="False";}
            }
            return r;
        }
        protected void Close(){driver.quit();}
        
        protected String screenshotName(String screenshotname) throws Exception{
            String dateName = new SimpleDateFormat("yyyyMMddhh").format(new Date()); String sn="";
            FileReader reader = new FileReader("src/main/java/com/guesttek/ovm/ui/config/config.properties");
            Properties properties = new Properties();
            properties.load(reader);
            sn=properties.getProperty("propertyScreenshot") +screenshotname+dateName+".png";
            return sn;
        }
        protected WebDriver getdriver(){
            if (driver == null){ driver = new FirefoxDriver(); return driver;}
            else
                return driver;
        }
        protected void Download_File(String webElement){
           if(ValidateWebelement(webElement)=="True")
           {driver.findElement(By.xpath(uimanager.FindElement(webElement))).click(); wait.For(20);}
           else { System.exit(1);} 
        }
        protected boolean File_IsExisted(String path, String filename){
           File f= new File(path+"/"+filename);
           if(f.exists()&& FileUtils.sizeOf(f)!=0) return true;
           else return false;
        }
        protected String TwoFileContentEquals (String file1, String file2) throws IOException{
           File f1=new File(file1);
           File f2=new File(file2);
           String r="";
           if(FileUtils.contentEquals(f1, f2))
           {r="True";}
           else r="False";
           return r;
        }
        protected boolean TwoFileContent(String file1, String file2) throws IOException{
           File f1=new File(file1);
           File f2=new File(file2);
           if(FileUtils.contentEquals(f1, f2)) return true;
           else return false;
        }
        protected boolean File_Delete(String filename){
           File f = new File(filename);
           if(f.exists()){ f.delete(); return true;}
           else {System.out.println("The file is not existing!");return false;}
        }
        protected boolean File_extension_Delete(String filepath, String ext){           
           File[] f = new File(filepath).listFiles();
           List<String> fileNames = new ArrayList<String>();          
           for(File file : f)
           {    
              if(file.getName().endsWith(ext))
              { 
                fileNames.add(file.getName());System.out.println("The file--"+fileNames); file.delete();
              }  
              //return true;
           }
           if(fileNames.size()>0)
               return true;
           return false;          
        }
        protected void Fill_Text_inField(String webElement, String text) {           
           if(ValidateWebelement(webElement)=="True")
           {   driver.findElement(By.xpath(uimanager.FindElement(webElement))).clear();            
               driver.findElement(By.xpath(uimanager.FindElement(webElement))).sendKeys(text);}
           else { System.exit(1);}
        }
        protected void Choose_DropList(String webElement, String text) {
           if(ValidateWebelement(webElement)=="True")
           {               
               driver.findElement(By.xpath(uimanager.FindElement(webElement))).sendKeys(text);}
           else { System.exit(1);} 
        }
        protected Integer table_Row(String s1, String s2){
           Integer rowNum=0;
           for(int i=1; i<500; i++)
           {    
               try{driver.findElement(By.xpath(s1+i+s2)).isDisplayed();rowNum=i;}catch(NoSuchElementException e){break;}               
               //try{driver.findElements(By.xpath(s1+1+s2));rowNum =i+1;System.out.println("The table has row:"+rowNum);}catch(NoSuchElementException e){break;}
           }  
           System.out.println("The table has row: "+rowNum);
           return rowNum; 
        }
        protected Integer tableRow(String s1, String s2, Integer checkNum){
           Integer rowNum=0;
           for(int i=1; i<checkNum; i++)
           {    
               try{driver.findElement(By.xpath(s1+i+s2)).isDisplayed();rowNum=i;}catch(NoSuchElementException e){System.err.print(e);break;}         
           }             
           return rowNum;  
        }
        protected String table_IsExisting(String webElement, Integer rowNum){
           String r="False";
           for(int i=1; i<rowNum; i++)
           {
               if(driver.findElement(By.xpath(uimanager.FindElement(webElement+i))).isDisplayed()){ r="True";}
               else{r="False";}
           }
           return r;
        }
        protected void Search(String webElement1,String webElement2,String text){
           if(ValidateWebelement(webElement)=="True")
           {   driver.findElement(By.xpath(uimanager.FindElement(webElement1))).clear();            
               driver.findElement(By.xpath(uimanager.FindElement(webElement1))).sendKeys(text);}
           else { System.exit(1);}
           wait.For(20);           
           assertTrue(driver.findElement(By.xpath(webElement2)).getText().contains(text));
        }
        protected boolean Search2(String webElement1,String webElement2,String text){
            if(ValidateWebelement(webElement1)=="True")
            {   driver.findElement(By.xpath(uimanager.FindElement(webElement1))).clear();            
               driver.findElement(By.xpath(uimanager.FindElement(webElement1))).sendKeys(text);}
            else { System.exit(1);}wait.For(2);
            try{                
                    if(driver.findElement(By.xpath(webElement2)).getText().contains(text))return true;
                    else{System.out.println("content are not equal"); return false;}               
            }catch(NoSuchElementException e){System.err.print("ERROR:"+e);return false;}             
        }
        protected boolean Search3(String webElement1,String webElement2,String text){
            if(ValidateWebelement(webElement1)=="True")
            {   driver.findElement(By.xpath(uimanager.FindElement(webElement1))).clear();            
               driver.findElement(By.xpath(uimanager.FindElement(webElement1))).sendKeys(text);}
            else { System.exit(1);}wait.For(2);
            try{                
                    if(driver.findElement(By.xpath(uimanager.FindElement(webElement2))).getText().contains(text))return true;
                    else{System.out.println("content are not equal"); return false;}               
            }catch(NoSuchElementException e){System.err.print("ERROR:"+e);return false;}             
        }
        //public methods   
       // String dateName = new SimpleDateFormat("yyyyMMddhh").format(new Date());
        public void Login(String browser){
          String Username="";try{Username=testManager.setProperty("username");}catch(Exception e){System.err.print(e);}
          String baseUrl = "";try{baseUrl=testManager.setProperty("url");}catch(Exception e){System.err.print(e);}
          String Password="";try{Password=testManager.setProperty("password");}catch(Exception e){System.err.print(e);}        
         
          try{Login_URL(browser);System.out.println("1.Title of the page is -> "+driver.getTitle());               
          }catch(Exception e){}//test.info("Launch browser:"+browser+ ",enter url:"+baseUrl);test.pass("Passed URL");
          System.out.println("1.URL of the page is -> "+driver.getCurrentUrl());         
          LoginPage_IsCorrect(); //test.info("Page Titile:"+ driver.getTitle());
          UserName_Input();//test.info("Enter user name:"+Username);test.pass("Passed user name");
          PassWord_Input();//test.info("Enter password:"+Password);test.pass("Passed password");
          Signin_Click();wait.For(100);Login_Successful();          
        }
        
        protected void clickElement(String element){
           webElement =element;          
           if(ValidateWebelement(webElement)=="True")
           {    driver.findElement(By.xpath(uimanager.FindElement(webElement))).click(); wait.For(6);
                }
           else { System.out.print(element+"not found!");System.exit(1);} 
        }
        protected void clickLink(String element){
           webElement =element;     
               driver.findElement(By.linkText((webElement))).click(); wait.For(6);                         
        }
        protected void click_element(String element){
           webElement =element;          
           try{driver.findElement(By.xpath(webElement)).click(); wait.For(10);}catch(NoSuchElementException e){}
        }
        protected void click_hidden_element(String element){
            
           JavascriptExecutor js =(JavascriptExecutor)driver;
           List <WebElement> elmnt =driver.findElements(By.xpath(element));
           js.executeScript("arguments[0].scrollIntoView(true);",elmnt);
          js.executeScript("arguments[0].click();",elmnt);        
          
        }       */
}
