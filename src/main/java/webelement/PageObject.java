/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webelement;

//
//
import java.util.Vector;

//

/**
 *
 * @author lyang
 */
public class PageObject {
        
        public String Table(String Name,Integer i){
            PageObject pg = new PageObject();
            switch(Name){
                case "login":
                    Vector<String> Expected = new Vector<String>(3);
                    Vector<String> Actual = new Vector<String>(3);
                    Expected.add("Log in ADM Lucid.");
                    Expected.add("Remember me?");
                    Expected.add("Log in");
                    Actual.add("//*[@id=\"loginForm\"]/h2");
                    Actual.add("//*[@id=\"loginForm\"]/div[3]/div/label");
                    Actual.add("//*[@id=\"login-submit\"]");
                    return Expected.elementAt(i) +";"+Actual.elementAt(i);
                case "golf":
                    Vector<String> golfExpected = new Vector<String>(15);
                    Vector<String> golfActual = new Vector<String>(15);
                    golfExpected.add("Golf Courses");
                    golfExpected.add("Name");
                    golfExpected.add("Address");
                    golfExpected.add("Description");
                    golfExpected.add("Add Golf Course");
                    golfExpected.add("Name");
                    golfExpected.add("Address");
                    golfExpected.add("City");
                    golfExpected.add("Province");
                    golfExpected.add("Country");
                    golfExpected.add("Description");
                    golfExpected.add("Long Description");
                    golfExpected.add("Owner");
                    golfExpected.add("Email");
                    golfExpected.add("Phone");

                    golfActual.add("/html/body/div/main/h1");
                    golfActual.add("/html/body/div/main/table[2]/thead/tr/th[1]/a");
                    golfActual.add("/html/body/div/main/table[2]/thead/tr/th[2]");
                    golfActual.add("/html/body/div/main/table[2]/thead/tr/th[3]");
                    golfActual.add("/html/body/div/main/h4");
                    golfActual.add("/html/body/div/main/div[1]/div--/form/div[1]/label");
                    golfActual.add("/html/body/div/main/div[1]/div--/form/div[2]/label");
                    golfActual.add("/html/body/div/main/div[1]/div--/form/div[3]/label");
                    golfActual.add("/html/body/div/main/div[1]/div--/form/div[4]/label");
                    golfActual.add("/html/body/div/main/div[1]/div--/form/div[6]/label");
                    golfActual.add("/html/body/div/main/div[1]/div--/form/div[8]/label");
                    golfActual.add("/html/body/div/main/div[1]/div--/form/div[9]/label");
                    golfActual.add("/html/body/div/main/div[1]/div--/form/div[10]/label");
                    golfActual.add("/html/body/div/main/div[1]/div--/form/div[11]/label");
                    golfActual.add("/html/body/div/main/div[1]/div--/form/div[12]/label");

                    return golfExpected.elementAt(i) +";"+golfActual.elementAt(i);
                case "Booking":
                    Vector<String> BookingExpected = new Vector<String>(7);
                    Vector<String> BookingActual = new Vector<String>(7);
                    BookingExpected.add("Golf Course Name");
                    BookingExpected.add("Booked By");
                    BookingExpected.add("Email");
                    BookingExpected.add("Phone");
                    BookingExpected.add("Date");
                    BookingExpected.add("Start Time");
                    BookingExpected.add("End Time");

                    BookingActual.add("/html/body/div/main/div[1]/div/form/div[1]/label");
                    BookingActual.add("/html/body/div/main/div[1]/div/form/div[2]/label");
                    BookingActual.add("/html/body/div/main/div[1]/div/form/div[3]/label");
                    BookingActual.add("/html/body/div/main/div[1]/div/form/div[4]/label");
                    BookingActual.add("/html/body/div/main/div[1]/div/form/div[5]/label");
                    BookingActual.add("/html/body/div/main/div[1]/div/form/div[6]/label");
                    BookingActual.add("/html/body/div/main/div[1]/div/form/div[7]/label");

                    return BookingExpected.elementAt(i) +";"+BookingActual.elementAt(i);
                case "main":
                    Vector<String> mainExpected = new Vector<String>(16);
                    Vector<String> mainActual = new Vector<String>(16);
                    mainExpected.add("OVM Administration");//0
                    mainExpected.add("OVM Administration-QA Hotel");//1 don't use
                    mainExpected.add("OVM Threads");//2 OVM Threads
                    mainExpected.add("Service");//3
                    mainExpected.add("Thread Status");//4
                    mainExpected.add("Enabled");//5
                    mainExpected.add("IPG Retrieval");//6
                    mainExpected.add("OVM Mailer");//7
                    mainExpected.add("Event Bulletin Retrieval");//8
                    mainExpected.add("STB Logging");//9
                    mainExpected.add("Network PVR Monitor");//10
                    mainExpected.add("PMS Queue Monitor");//11
                    mainExpected.add("OVM Status");//12
                    mainExpected.add("Videoserver status");//13
                    mainExpected.add("OVM Version");//14
                    mainExpected.add("IPG Receiver Status");//15
                    mainExpected.add("Main");//16
                    mainExpected.add("Content Management");//17
                    mainExpected.add("Television");//18
                    mainExpected.add("Billing");//19
                    mainExpected.add("System Configuration");//20
                    mainExpected.add("Reports");//21
                    mainExpected.add("Room Management");//22
                    mainExpected.add("Guest Interactions");//23
                    mainExpected.add("Modules");//24
                    mainExpected.add("Support Tools");//25
                    mainExpected.add("Troubleshooting");//26
                    mainExpected.add("Logout");//27
                    mainExpected.add("Copyright © 1996-2020 Guest-Tek Ltd. All Rights Reserved.");//28
                    mainActual.add("/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[1]/h1");//1 
                    mainActual.add("/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[1]");//2
                    mainActual.add("//*[@id=\"content_table\"]/caption");//3
                    mainActual.add("//*[@id=\"content_table\"]/thead/tr/th[1]");//4
                    mainActual.add("//*[@id=\"content_table\"]/thead/tr/th[2]");//5
                    mainActual.add("//*[@id=\"content_table\"]/thead/tr/th[3]");//6
                    mainActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[1]");//7
                    mainActual.add("//*[@id=\"content_table\"]/tbody/tr[2]/td[1]");//8
                    mainActual.add("//*[@id=\"content_table\"]/tbody/tr[3]/td[1]");//9
                    mainActual.add("//*[@id=\"content_table\"]/tbody/tr[4]/td[1]");//10
                    mainActual.add("//*[@id=\"content_table\"]/tbody/tr[5]/td[1]");//11
                    mainActual.add("//*[@id=\"content_table\"]/tbody/tr[6]/td[1]");//12 /html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/center/table/tbody/tr/td[1]/table[2]/caption
                    mainActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/center/table/tbody/tr/td[1]/table[2]/caption");//13
                    mainActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/center/table/tbody/tr/td[1]/table[3]/caption");//14
                    mainActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/center/table/tbody/tr/td[2]/table/tbody/tr/td/table[1]/caption");//15
                    mainActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/center/table/tbody/tr/td[2]/table/tbody/tr/td/table[2]/caption");//16
                    mainActual.add("//*[@id=\"nav\"]/p[1]/a");//17
                    mainActual.add("//*[@id=\"nav\"]/p[2]/a");//18
                    mainActual.add("//*[@id=\"nav\"]/p[3]/a");//19
                    mainActual.add("//*[@id=\"nav\"]/p[4]/a");//20
                    mainActual.add("//*[@id=\"nav\"]/p[5]/a");//21
                    mainActual.add("//*[@id=\"nav\"]/p[6]/a");//22
                    mainActual.add("//*[@id=\"nav\"]/p[7]/a");//23
                    mainActual.add("//*[@id=\"nav\"]/p[8]/a");//24
                    mainActual.add("//*[@id=\"nav\"]/p[9]/a");//25
                    mainActual.add("//*[@id=\"nav\"]/p[10]/a");//26
                    mainActual.add("//*[@id=\"nav\"]/p[11]/a");//27
                    mainActual.add("//*[@id=\"nav\"]/p[12]/a");//28 
                    mainActual.add("/html/body/table/tbody/tr[3]/td");//29  
                    return mainExpected.elementAt(i) +";"+mainActual.elementAt(i);
                case "moviecategories":
                    Vector<String> moviecategoriesExpected = new Vector<String>(20);
                    Vector<String> moviecategoriesActual = new Vector<String>(20);
                    moviecategoriesExpected.add("Name");//0
                    moviecategoriesExpected.add("Image");//1
                    moviecategoriesExpected.add("Visible");//2
                    moviecategoriesExpected.add("Parent Category");//3
                    moviecategoriesExpected.add("Name");//4
                    moviecategoriesExpected.add("Movies");//5
                    moviecategoriesExpected.add("Hollywood");//6
                    moviecategoriesExpected.add("HD");//7
                    moviecategoriesExpected.add("(Hollywood) Comedy");//8
                    moviecategoriesExpected.add("(Hollywood) Comedy");//9
                    moviecategoriesExpected.add("(Hollywood) Action");//10
                    moviecategoriesExpected.add("(Hollywood) Action");//11
                    moviecategoriesExpected.add("(Hollywood) Drama");//12
                    moviecategoriesExpected.add("(Hollywood) Documentary");//13
                    moviecategoriesExpected.add("(Hollywood) Family");//14
                    moviecategoriesExpected.add("(Hollywood) Family");//15
                    moviecategoriesExpected.add("(Hollywood) Thriller");//16
                    moviecategoriesExpected.add("(Hollywood) Thriller");//17
                    moviecategoriesExpected.add("(Hollywood) Asian");//18
                    moviecategoriesExpected.add("Export to CSV");//19
                    moviecategoriesActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[1]");//0
                    moviecategoriesActual.add("//*[@id=\"content_table\"]/tbody/tr[2]/td[1]");//1
                    moviecategoriesActual.add("//*[@id=\"content_table\"]/tbody/tr[3]/td[1]");//2
                    moviecategoriesActual.add("//*[@id=\"content_table\"]/tbody/tr[4]/td[1]");//3
                    moviecategoriesActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[1]");//4
                    moviecategoriesActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/table/tbody/tr[1]/td[2]");//5
                    moviecategoriesActual.add("//*[@id=\"content_table\"]/tbody/tr[2]/td[1]/a/font");//6
                    moviecategoriesActual.add("//*[@id=\"content_table\"]/tbody/tr[3]/td[1]/a/font");//7
                    moviecategoriesActual.add("//*[@id=\"content_table\"]/tbody/tr[4]/td[1]/a/font");//8
                    moviecategoriesActual.add("//*[@id=\"content_table\"]/tbody/tr[5]/td[1]/a/font");//9
                    moviecategoriesActual.add("//*[@id=\"content_table\"]/tbody/tr[6]/td[1]/a/font");//10
                    moviecategoriesActual.add("//*[@id=\"content_table\"]/tbody/tr[7]/td[1]/a/font");//11
                    moviecategoriesActual.add("//*[@id=\"content_table\"]/tbody/tr[8]/td[1]/a/font");//12
                    moviecategoriesActual.add("//*[@id=\"content_table\"]/tbody/tr[9]/td[1]/a/font");//13
                    moviecategoriesActual.add("//*[@id=\"content_table\"]/tbody/tr[10]/td[1]/a/font");//14
                    moviecategoriesActual.add("//*[@id=\"content_table\"]/tbody/tr[11]/td[1]/a/font");//15
                    moviecategoriesActual.add("//*[@id=\"content_table\"]/tbody/tr[12]/td[1]/a/font");//16
                    moviecategoriesActual.add("//*[@id=\"content_table\"]/tbody/tr[13]/td[1]/a/font");//17
                    moviecategoriesActual.add("//*[@id=\"content_table\"]/tbody/tr[14]/td[1]/a/font");//18
                    moviecategoriesActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/form[2]/input[1]");//19
                    return moviecategoriesExpected.elementAt(i) +";"+moviecategoriesActual.elementAt(i);
                case "movies":
                    Vector<String> moviesExpected = new Vector<String>(5);
                    Vector<String> moviesActual = new Vector<String>(5);
                    moviesExpected.add("Movie");
                    moviesExpected.add("DRM Type");
                    moviesExpected.add("Category");
                    moviesExpected.add("Start Date");
                    moviesExpected.add("End Date");
                    moviesActual.add("//*[@id=\"content_table\"]/thead/tr/th[1]");
                    moviesActual.add("//*[@id=\"content_table\"]/thead/tr/th[2]");
                    moviesActual.add("//*[@id=\"content_table\"]/thead/tr/th[3]");
                    moviesActual.add("//*[@id=\"content_table\"]/thead/tr/th[4]");
                    moviesActual.add("//*[@id=\"content_table\"]/thead/tr/th[5]");
                    return moviesExpected.elementAt(i) +";"+moviesActual.elementAt(i);
                case "moviepackage":
                    Vector<String> packageExpected = new Vector<String>(10);
                    Vector<String> packageActual = new Vector<String>(10);
                    packageExpected.add("STANDARD");
                    packageExpected.add("Name");
                    packageExpected.add("Price");
                    packageExpected.add("Meeting Rooms");
                    packageExpected.add("Name");
                    packageExpected.add("Price");
                    packageExpected.add("Add Billing Package");
                    packageExpected.add("Name");
                    packageExpected.add("Asset States");
                    packageExpected.add("Name");
                    packageActual.add("//*[@id=\"content_table\"][1]/caption");
                    packageActual.add("//*[@id=\"content_table\"][1]/tbody/tr[1]/td[1]");
                    packageActual.add("//*[@id=\"content_table\"][1]/tbody/tr[1]/td[2]");
                    packageActual.add("//*[@id=\"content_table\"][2]/caption");
                    packageActual.add("//*[@id=\"content_table\"][2]/tbody/tr[1]/td[1]");
                    packageActual.add("//*[@id=\"content_table\"][2]/tbody/tr[1]/td[2]");
                    packageActual.add("//*[@id=\"content_table\"][3]/caption");
                    packageActual.add("//*[@id=\"content_table\"][3]/tbody/tr[1]/td[1]");
                    packageActual.add("//*[@id=\"content_table\"][4]/caption");
                    packageActual.add("//*[@id=\"content_table\"][4]/tbody/tr[1]/td[1]");
                    return packageExpected.elementAt(i) +";"+packageActual.elementAt(i);
                case "grouppermission3":
                    Vector<String> GroupExpected =new Vector<String>(80);
                    Vector<String> GroupActual =new Vector<String>(80);
                    GroupExpected.add("User Group admin Hotel User Hotel IT NOC Content Guesttek");
                    GroupExpected.add("Read");
                    GroupExpected.add("Write");
                    GroupExpected.add("admin");
                    GroupExpected.add("admin/activities");
                    GroupExpected.add("admin/billing");
                    GroupExpected.add("admin/billing/ajax");
                    GroupExpected.add("admin/booking");
                    GroupExpected.add("admin/categories");
                    GroupExpected.add("admin/channel_map");
                    GroupExpected.add("admin/css");
                    GroupExpected.add("admin/deviceswitcher");
                    GroupExpected.add("admin/guestbulletin");
                    GroupExpected.add("admin/guestdirectory");
                    GroupExpected.add("admin/guestmessages");
                    GroupExpected.add("admin/guestsurvey");
                    GroupExpected.add("admin/hotelbanners");
                    GroupExpected.add("admin/hotelbanners/ipg");
                    GroupExpected.add("admin/ipg");
                    GroupExpected.add("admin/language");
                    GroupExpected.add("admin/language/activities");
                    GroupExpected.add("admin/language/billing");
                    GroupExpected.add("admin/language/billing/ajax");
                    GroupExpected.add("admin/language/booking");
                    GroupExpected.add("admin/language/categories");
                    GroupExpected.add("admin/language/channel_map");
                    GroupExpected.add("admin/language/css");
                    GroupExpected.add("admin/language/deviceswitcher");
                    GroupExpected.add("admin/language/guestbulletin");
                    GroupExpected.add("admin/language/guestdirectory");
                    GroupExpected.add("admin/language/guestmessages");
                    GroupExpected.add("admin/language/guestsurvey");
                    GroupExpected.add("admin/language/hotelbanners");
                    GroupExpected.add("admin/language/hotelbanners/ipg");
                    GroupExpected.add("admin/language/ipg");
                    GroupExpected.add("admin/language/language");
                    GroupExpected.add("admin/language/liquid");
                    GroupExpected.add("admin/language/logs");
                    GroupExpected.add("admin/language/main");
                    GroupExpected.add("admin/language/menus");
                    GroupExpected.add("admin/language/modules");
                    GroupExpected.add("admin/language/moodbox");
                    GroupExpected.add("admin/language/moodz");
                    GroupExpected.add("admin/language/moviemenu");
                    GroupExpected.add("admin/language/movies");
                    GroupExpected.add("admin/language/preferences");
                    GroupExpected.add("admin/language/radio");
                    GroupExpected.add("admin/language/rec_cat");
                    GroupExpected.add("admin/language/restaurants");
                    GroupExpected.add("admin/language/room_access");
                    GroupExpected.add("admin/language/room_access/ajax");
                    GroupExpected.add("admin/language/room_access/antares");
                    GroupExpected.add("admin/language/setup");
                    GroupExpected.add("admin/language/tvi");
                    GroupExpected.add("admin/language/usermanagement");
                    GroupExpected.add("admin/liquid");
                    GroupExpected.add("admin/logs");
                    GroupExpected.add("admin/main");
                    GroupExpected.add("admin/menus");
                    GroupExpected.add("admin/modules");
                    GroupExpected.add("admin/moodbox");
                    GroupExpected.add("admin/moodz");
                    GroupExpected.add("admin/moviemenu");
                    GroupExpected.add("admin/movies");
                    GroupExpected.add("admin/ott");
                    GroupExpected.add("admin/patch_install");
                    GroupExpected.add("admin/patch_install/public/remote");
                    GroupExpected.add("admin/patch_install/tmp");
                    GroupExpected.add("admin/preferences");
                    GroupExpected.add("admin/radio");
                    GroupExpected.add("admin/rec_cat");
                    GroupExpected.add("admin/reporting");
                    GroupExpected.add("admin/restaurants");
                    GroupExpected.add("admin/room_access");
                    GroupExpected.add("admin/room_access/ajax");
                    GroupExpected.add("admin/room_access/antares");
                    GroupExpected.add("admin/setup");
                    GroupExpected.add("admin/tvi");
                    GroupExpected.add("admin/usermanagement"); //Actual                
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[2]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[3]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[2]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[3]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[4]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[5]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[6]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[7]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[8]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[9]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[10]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[11]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[12]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[13]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[14]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[15]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[16]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[17]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[18]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[19]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[20]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[21]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[22]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[23]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[24]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[25]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[26]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[27]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[28]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[29]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[30]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[31]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[32]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[33]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[34]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[35]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[36]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[37]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[38]/td[1]");//
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[39]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[40]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[41]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[42]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[43]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[44]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[45]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[46]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[47]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[48]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[49]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[50]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[51]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[52]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[53]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[54]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[55]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[56]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[57]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[58]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[59]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[60]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[61]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[62]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[63]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[64]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[65]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[66]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[67]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[68]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[69]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[70]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[71]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[72]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[73]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[74]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[75]/td[1]");
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[76]/td[1]");                        
                    GroupActual.add("//*[@id=\"content_table\"]/tbody/tr[77]/td[1]");
                    return GroupExpected.elementAt(i) +";"+GroupActual.elementAt(i);
                case "adminmenu":
                    Vector<String> adminmenuExpected =new Vector<String>(75);
                    Vector<String> adminmenuActual =new Vector<String>(75);
                    adminmenuExpected.add("Movies");
                    adminmenuExpected.add("show_categories");
                    adminmenuExpected.add("show_movies");
                    adminmenuExpected.add("billing_packages"); //billing_packages
                    adminmenuExpected.add("add_movies"); //add_movies
                    adminmenuExpected.add("Main Menu");
                    adminmenuExpected.add("main");
                    adminmenuExpected.add("Billing");
                    adminmenuExpected.add("pms_queue");
                    adminmenuExpected.add("refund_movie");
                    adminmenuExpected.add("channel_bundles");
                    adminmenuExpected.add("User Management");
                    adminmenuExpected.add("list_groups");
                    adminmenuExpected.add("add_group");//
                    adminmenuExpected.add("group_permissions");
                    adminmenuExpected.add("list_users");
                    adminmenuExpected.add("add_user");
                    adminmenuExpected.add("group_menu_perms");
                    adminmenuExpected.add("admin_api_users_list");
                    adminmenuExpected.add("Languages");
                    adminmenuExpected.add("list_languages");
                    adminmenuExpected.add("text_fields");
                    adminmenuExpected.add("Guest UI");
                    adminmenuExpected.add("admin_menu_setup");
                    adminmenuExpected.add("Room Management");
                    adminmenuExpected.add("reset_rooms");
                    adminmenuExpected.add("manual_override");
                    adminmenuExpected.add("stb_list");
                    adminmenuExpected.add("room_types");
                    adminmenuExpected.add("rooms");
                    adminmenuExpected.add("admin_menu_switch_room");
                    adminmenuExpected.add("add_stb");
                    adminmenuExpected.add("room_information");
                    adminmenuExpected.add("current_movie_streams");
                    adminmenuExpected.add("current_tasks");
                    adminmenuExpected.add("Modules");
                    adminmenuExpected.add("modules");
                    adminmenuExpected.add("room_types");
                    adminmenuExpected.add("radio_stations");
                    adminmenuExpected.add("television");
                    adminmenuExpected.add("list_channels");
                    adminmenuExpected.add("channel_bundles");
                    adminmenuExpected.add("channel_bundle_reports");
                    adminmenuExpected.add("system_config");
                    adminmenuExpected.add("hotel_information");
                    adminmenuExpected.add("install_setup");
                    adminmenuExpected.add("reports");
                    adminmenuExpected.add("Reports");
                    adminmenuExpected.add("tvinternet");
                    adminmenuExpected.add("internet_options");
                    adminmenuExpected.add("troubleshooting");
                    adminmenuExpected.add("stb_list");
                    adminmenuExpected.add("admin_menu_stb_summary");
                    adminmenuExpected.add("add_stb");
                    adminmenuExpected.add("room_information");
                    adminmenuExpected.add("airplay_device_list");
                    adminmenuExpected.add("chromecast_devices");
                    adminmenuExpected.add("myaway_device_list");
                    adminmenuExpected.add("current_movie_streams");
                    adminmenuExpected.add("current_tasks");
                    adminmenuExpected.add("admin_menu_recordings_list");
                    adminmenuExpected.add("admin_menu_samsung_license");
                    adminmenuExpected.add("Guest Interactions");
                    adminmenuExpected.add("guest_bulletins");
                    adminmenuExpected.add("guest_surveys");
                    adminmenuExpected.add("admin_menu_guest_messages");
                    adminmenuExpected.add("guest_directory");
                    adminmenuExpected.add("admin_menu_hotel_banner");
                    adminmenuExpected.add("Support Tools");
                    adminmenuExpected.add("myaway_api_test");
                    adminmenuExpected.add("stb_track_list");
                    adminmenuExpected.add("stb_event_list");
                    adminmenuExpected.add("admin_menu_email_logs");
                    adminmenuExpected.add("admin_menu_tomcat_logs");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[2]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[3]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[4]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[5]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[6]/td");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[7]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[8]/td");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[9]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[10]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[11]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[12]/td");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[13]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[14]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[15]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[16]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[17]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[18]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[19]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[20]/td");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[21]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[22]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[23]/td");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[24]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[25]/td");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[26]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[27]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[28]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[29]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[30]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[31]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[32]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[33]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[34]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[35]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[36]/td");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[37]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[38]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[39]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[40]/td");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[41]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[42]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[43]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[44]/td");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[45]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[46]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[47]/td");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[48]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[49]/td");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[50]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[51]/td");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[52]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[53]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[54]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[55]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[56]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[57]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[58]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[59]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[60]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[61]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[62]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[63]/td");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[64]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[65]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[66]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[67]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[68]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[69]/td");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[70]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[71]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[72]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[73]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[74]/td[1]");
                    adminmenuActual.add("//*[@id=\"content_table\"]/tbody/tr[75]/td[1]");               
                    return adminmenuExpected.elementAt(i) +";"+adminmenuActual.elementAt(i);
                case "adminMovies":
                    Vector<String> adminMoviesExpected =new Vector<String>(16);
                    Vector<String> adminMoviesActual =new Vector<String>(16);
                    adminMoviesExpected.add("Movies");
                    adminMoviesExpected.add("Name");
                    adminMoviesExpected.add("Display Name");
                    adminMoviesExpected.add("URL");
                    adminMoviesExpected.add("show_categories");
                    adminMoviesExpected.add("admin_menu_categories");
                    adminMoviesExpected.add("show_categories");
                    adminMoviesExpected.add("show_movies");
                    adminMoviesExpected.add("admin_menu_list_movies");
                    adminMoviesExpected.add("show_movies");
                    adminMoviesExpected.add("billing_packages");
                    adminMoviesExpected.add("admin_menu_billing_pak");
                    adminMoviesExpected.add("billing_packages"); //add_movies
                    adminMoviesExpected.add("add_movies"); //billing_packages
                    adminMoviesExpected.add("admin_menu_list_add_movie");
                    adminMoviesExpected.add("add_movie");                    
                    adminMoviesActual.add("//*[@id=\"content_table\"]/caption");
                    adminMoviesActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[1]");
                    adminMoviesActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[2]");
                    adminMoviesActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[3]");
                    adminMoviesActual.add("//*[@id=\"content_table\"]/tbody/tr[2]/td[1]");
                    adminMoviesActual.add("//*[@id=\"content_table\"]/tbody/tr[2]/td[2]");
                    adminMoviesActual.add("//*[@id=\"content_table\"]/tbody/tr[2]/td[3]");
                    adminMoviesActual.add("//*[@id=\"content_table\"]/tbody/tr[3]/td[1]");
                    adminMoviesActual.add("//*[@id=\"content_table\"]/tbody/tr[3]/td[2]");
                    adminMoviesActual.add("//*[@id=\"content_table\"]/tbody/tr[3]/td[3]");
                    adminMoviesActual.add("//*[@id=\"content_table\"]/tbody/tr[4]/td[1]");
                    adminMoviesActual.add("//*[@id=\"content_table\"]/tbody/tr[4]/td[2]");
                    adminMoviesActual.add("//*[@id=\"content_table\"]/tbody/tr[4]/td[3]");
                    adminMoviesActual.add("//*[@id=\"content_table\"]/tbody/tr[5]/td[1]");
                    adminMoviesActual.add("//*[@id=\"content_table\"]/tbody/tr[5]/td[2]");
                    adminMoviesActual.add("//*[@id=\"content_table\"]/tbody/tr[5]/td[3]");
                    return adminMoviesExpected.elementAt(i) +";"+adminMoviesActual.elementAt(i);
                case "adminmainmenu":
                    Vector<String> adminmainmenuExpected =new Vector<String>(37);
                    Vector<String> adminmainmenuActual =new Vector<String>(37);
                    adminmainmenuExpected.add("Main Menu");
                    adminmainmenuExpected.add("Name");
                    adminmainmenuExpected.add("Display Name");
                    adminmainmenuExpected.add("URL");
                    adminmainmenuExpected.add("main");
                    adminmainmenuExpected.add("admin_menu_main");
                    adminmainmenuExpected.add("main");
                    adminmainmenuExpected.add("movies");
                    adminmainmenuExpected.add("admin_menu_movies");
                    adminmainmenuExpected.add("(Menu) Movies");
                    adminmainmenuExpected.add("television");
                    adminmainmenuExpected.add("admin_menu_television");
                    adminmainmenuExpected.add("(Menu) television");
                    adminmainmenuExpected.add("billing");
                    adminmainmenuExpected.add("admin_menu_billing");
                    adminmainmenuExpected.add("(Menu) Billing");
                    adminmainmenuExpected.add("system_config");
                    adminmainmenuExpected.add("admin_menu_system_config");
                    adminmainmenuExpected.add("(Menu) system_config");
                    adminmainmenuExpected.add("reports");
                    adminmainmenuExpected.add("admin_ui_reports");
                    adminmainmenuExpected.add("(Menu) reports");
                    adminmainmenuExpected.add("room_management");
                    adminmainmenuExpected.add("admin_menu_room_man");
                    adminmainmenuExpected.add("(Menu) Room Management");
                    adminmainmenuExpected.add("guest_interactions");
                    adminmainmenuExpected.add("admin_guest_interactions");
                    adminmainmenuExpected.add("(Menu) Guest Interactions");
                    adminmainmenuExpected.add("modules");
                    adminmainmenuExpected.add("admin_menu_modules");
                    adminmainmenuExpected.add("(Menu) Modules");
                    adminmainmenuExpected.add("support_tools");
                    adminmainmenuExpected.add("support_tools");
                    adminmainmenuExpected.add("(Menu) Support Tools");
                    adminmainmenuExpected.add("troubleshooting");
                    adminmainmenuExpected.add("admin_menu_trouble");
                    adminmainmenuExpected.add("(Menu) troubleshooting");
                    adminmainmenuActual.add("//*[@id=\"content_table\"][2]/caption");
                    adminmainmenuActual.add("//*[@id=\"content_table\"][2]/tbody/tr[1]/td[1]");
                    adminmainmenuActual.add("//*[@id=\"content_table\"][2]/tbody/tr[1]/td[2]");
                    adminmainmenuActual.add("//*[@id=\"content_table\"][2]/tbody/tr[1]/td[3]");
                    adminmainmenuActual.add("//*[@id=\"content_table\"][2]/tbody/tr[2]/td[1]");
                    adminmainmenuActual.add("//*[@id=\"content_table\"][2]/tbody/tr[2]/td[2]");
                    adminmainmenuActual.add("//*[@id=\"content_table\"][2]/tbody/tr[2]/td[3]");
                    adminmainmenuActual.add("//*[@id=\"content_table\"][2]/tbody/tr[3]/td[1]");
                    adminmainmenuActual.add("//*[@id=\"content_table\"][2]/tbody/tr[3]/td[2]");
                    adminmainmenuActual.add("//*[@id=\"content_table\"][2]/tbody/tr[3]/td[3]");
                    adminmainmenuActual.add("//*[@id=\"content_table\"][2]/tbody/tr[4]/td[1]");
                    adminmainmenuActual.add("//*[@id=\"content_table\"][2]/tbody/tr[4]/td[2]");
                    adminmainmenuActual.add("//*[@id=\"content_table\"][2]/tbody/tr[4]/td[3]");
                    adminmainmenuActual.add("//*[@id=\"content_table\"][2]/tbody/tr[5]/td[1]");
                    adminmainmenuActual.add("//*[@id=\"content_table\"][2]/tbody/tr[5]/td[2]");
                    adminmainmenuActual.add("//*[@id=\"content_table\"][2]/tbody/tr[5]/td[3]");
                    adminmainmenuActual.add("//*[@id=\"content_table\"][2]/tbody/tr[6]/td[1]");
                    adminmainmenuActual.add("//*[@id=\"content_table\"][2]/tbody/tr[6]/td[2]");
                    adminmainmenuActual.add("//*[@id=\"content_table\"][2]/tbody/tr[6]/td[3]");
                    adminmainmenuActual.add("//*[@id=\"content_table\"][2]/tbody/tr[7]/td[1]");
                    adminmainmenuActual.add("//*[@id=\"content_table\"][2]/tbody/tr[7]/td[2]");
                    adminmainmenuActual.add("//*[@id=\"content_table\"][2]/tbody/tr[7]/td[3]");
                    adminmainmenuActual.add("//*[@id=\"content_table\"][2]/tbody/tr[8]/td[1]");
                    adminmainmenuActual.add("//*[@id=\"content_table\"][2]/tbody/tr[8]/td[2]");
                    adminmainmenuActual.add("//*[@id=\"content_table\"][2]/tbody/tr[8]/td[3]");
                    adminmainmenuActual.add("//*[@id=\"content_table\"][2]/tbody/tr[9]/td[1]");
                    adminmainmenuActual.add("//*[@id=\"content_table\"][2]/tbody/tr[9]/td[2]");
                    adminmainmenuActual.add("//*[@id=\"content_table\"][2]/tbody/tr[9]/td[3]");
                    adminmainmenuActual.add("//*[@id=\"content_table\"][2]/tbody/tr[10]/td[1]");
                    adminmainmenuActual.add("//*[@id=\"content_table\"][2]/tbody/tr[10]/td[2]");
                    adminmainmenuActual.add("//*[@id=\"content_table\"][2]/tbody/tr[10]/td[3]");
                    adminmainmenuActual.add("//*[@id=\"content_table\"][2]/tbody/tr[11]/td[1]");
                    adminmainmenuActual.add("//*[@id=\"content_table\"][2]/tbody/tr[11]/td[2]");
                    adminmainmenuActual.add("//*[@id=\"content_table\"][2]/tbody/tr[11]/td[3]");
                    adminmainmenuActual.add("//*[@id=\"content_table\"][2]/tbody/tr[12]/td[1]");
                    adminmainmenuActual.add("//*[@id=\"content_table\"][2]/tbody/tr[12]/td[2]");
                    adminmainmenuActual.add("//*[@id=\"content_table\"][2]/tbody/tr[12]/td[3]");
                    adminmainmenuActual.add("//*[@id=\"content_table\"][2]/tbody/tr[13]/td[1]");
                    adminmainmenuActual.add("//*[@id=\"content_table\"][2]/tbody/tr[13]/td[2]");
                    adminmainmenuActual.add("//*[@id=\"content_table\"][2]/tbody/tr[13]/td[3]");                   
                    return adminmainmenuExpected.elementAt(i) +";"+adminmainmenuActual.elementAt(i);  
                case "adminbilling":
                    Vector<String> adminbillingExpected =new Vector<String>(13);
                    Vector<String> adminbillingActual =new Vector<String>(13);
                    adminbillingExpected.add("Billing");
                    adminbillingExpected.add("Name");
                    adminbillingExpected.add("Display Name");
                    adminbillingExpected.add("URL");
                    adminbillingExpected.add("pms_queue");
                    adminbillingExpected.add("admin_menu_pmsqueue");
                    adminbillingExpected.add("billing_pmsqueue");
                    adminbillingExpected.add("refund_movie");
                    adminbillingExpected.add("admin_menu_refund_movie");
                    adminbillingExpected.add("refund_room");
                    adminbillingExpected.add("channel_bundles");
                    adminbillingExpected.add("admin_menu_bundles");
                    adminbillingExpected.add("channel_bundles");
                    adminbillingActual.add("//*[@id=\"content_table\"][3]/caption");
                    adminbillingActual.add("//*[@id=\"content_table\"][3]/tbody/tr[1]/td[1]");
                    adminbillingActual.add("//*[@id=\"content_table\"][3]/tbody/tr[1]/td[2]");
                    adminbillingActual.add("//*[@id=\"content_table\"][3]/tbody/tr[1]/td[3]");
                    adminbillingActual.add("//*[@id=\"content_table\"][3]/tbody/tr[2]/td[1]");
                    adminbillingActual.add("//*[@id=\"content_table\"][3]/tbody/tr[2]/td[2]");
                    adminbillingActual.add("//*[@id=\"content_table\"][3]/tbody/tr[2]/td[3]");
                    adminbillingActual.add("//*[@id=\"content_table\"][3]/tbody/tr[3]/td[1]");
                    adminbillingActual.add("//*[@id=\"content_table\"][3]/tbody/tr[3]/td[2]");
                    adminbillingActual.add("//*[@id=\"content_table\"][3]/tbody/tr[3]/td[3]");
                    adminbillingActual.add("//*[@id=\"content_table\"][3]/tbody/tr[4]/td[1]");
                    adminbillingActual.add("//*[@id=\"content_table\"][3]/tbody/tr[4]/td[2]");
                    adminbillingActual.add("//*[@id=\"content_table\"][3]/tbody/tr[4]/td[3]");                    
                    return adminbillingExpected.elementAt(i) +";"+adminbillingActual.elementAt(i);
                case "usermanagement":
                    Vector<String> usermanagementExpected =new Vector<String>(25);
                    Vector<String> usermanagementActual =new Vector<String>(25);
                    usermanagementExpected.add("User Management");
                    usermanagementExpected.add("Name");
                    usermanagementExpected.add("Display Name");
                    usermanagementExpected.add("URL");
                    usermanagementExpected.add("list_groups");
                    usermanagementExpected.add("admin_menu_list_groups");
                    usermanagementExpected.add("list_groups");
                    usermanagementExpected.add("add_group");
                    usermanagementExpected.add("admin_menu_add_group");
                    usermanagementExpected.add("add_group");
                    usermanagementExpected.add("group_permissions");
                    usermanagementExpected.add("admin_menu_group_perm");
                    usermanagementExpected.add("group_permissions");
                    usermanagementExpected.add("list_users");
                    usermanagementExpected.add("admin_menu_list_user");
                    usermanagementExpected.add("list_users");
                    usermanagementExpected.add("add_user");
                    usermanagementExpected.add("admin_menu_add_user");
                    usermanagementExpected.add("add_user");
                    usermanagementExpected.add("group_menu_perms");
                    usermanagementExpected.add("admin_menu_group_admin");
                    usermanagementExpected.add("group_menu_perms");
                    usermanagementExpected.add("admin_api_users_list");
                    usermanagementExpected.add("admin_api_users_list");
                    usermanagementExpected.add("api_users");
                    usermanagementActual.add("//*[@id=\"content_table\"][4]/caption");
                    usermanagementActual.add("//*[@id=\"content_table\"][4]/tbody/tr[1]/td[1]");
                    usermanagementActual.add("//*[@id=\"content_table\"][4]/tbody/tr[1]/td[2]");
                    usermanagementActual.add("//*[@id=\"content_table\"][4]/tbody/tr[1]/td[3]");
                    usermanagementActual.add("//*[@id=\"content_table\"][4]/tbody/tr[2]/td[1]");
                    usermanagementActual.add("//*[@id=\"content_table\"][4]/tbody/tr[2]/td[2]");
                    usermanagementActual.add("//*[@id=\"content_table\"][4]/tbody/tr[2]/td[3]");
                    usermanagementActual.add("//*[@id=\"content_table\"][4]/tbody/tr[3]/td[1]");
                    usermanagementActual.add("//*[@id=\"content_table\"][4]/tbody/tr[3]/td[2]");
                    usermanagementActual.add("//*[@id=\"content_table\"][4]/tbody/tr[3]/td[3]");
                    usermanagementActual.add("//*[@id=\"content_table\"][4]/tbody/tr[4]/td[1]");
                    usermanagementActual.add("//*[@id=\"content_table\"][4]/tbody/tr[4]/td[2]");
                    usermanagementActual.add("//*[@id=\"content_table\"][4]/tbody/tr[4]/td[3]");
                    usermanagementActual.add("//*[@id=\"content_table\"][4]/tbody/tr[5]/td[1]");
                    usermanagementActual.add("//*[@id=\"content_table\"][4]/tbody/tr[5]/td[2]");
                    usermanagementActual.add("//*[@id=\"content_table\"][4]/tbody/tr[5]/td[3]");
                    usermanagementActual.add("//*[@id=\"content_table\"][4]/tbody/tr[6]/td[1]");
                    usermanagementActual.add("//*[@id=\"content_table\"][4]/tbody/tr[6]/td[2]");
                    usermanagementActual.add("//*[@id=\"content_table\"][4]/tbody/tr[6]/td[3]");
                    usermanagementActual.add("//*[@id=\"content_table\"][4]/tbody/tr[7]/td[1]");
                    usermanagementActual.add("//*[@id=\"content_table\"][4]/tbody/tr[7]/td[2]");
                    usermanagementActual.add("//*[@id=\"content_table\"][4]/tbody/tr[7]/td[3]");
                    usermanagementActual.add("//*[@id=\"content_table\"][4]/tbody/tr[8]/td[1]");
                    usermanagementActual.add("//*[@id=\"content_table\"][4]/tbody/tr[8]/td[2]");
                    usermanagementActual.add("//*[@id=\"content_table\"][4]/tbody/tr[8]/td[3]");                    
                    return usermanagementExpected.elementAt(i) +";"+usermanagementActual.elementAt(i);
                case "adminlanguages":
                    Vector<String> adminlanguagesExpected =new Vector<String>(10);
                    Vector<String> adminlanguagesActual =new Vector<String>(10);
                    adminlanguagesExpected.add("Languages");
                    adminlanguagesExpected.add("Name");
                    adminlanguagesExpected.add("Display Name");
                    adminlanguagesExpected.add("URL");
                    adminlanguagesExpected.add("list_languages");
                    adminlanguagesExpected.add("admin_menu_list_languages");
                    adminlanguagesExpected.add("list_languages");
                    adminlanguagesExpected.add("text_fields");
                    adminlanguagesExpected.add("admin_menu_text_fields");
                    adminlanguagesExpected.add("text_fields");
                    adminlanguagesActual.add("//*[@id=\"content_table\"][5]/caption");
                    adminlanguagesActual.add("//*[@id=\"content_table\"][5]/tbody/tr[1]/td[1]");
                    adminlanguagesActual.add("//*[@id=\"content_table\"][5]/tbody/tr[1]/td[2]");
                    adminlanguagesActual.add("//*[@id=\"content_table\"][5]/tbody/tr[1]/td[3]");
                    adminlanguagesActual.add("//*[@id=\"content_table\"][5]/tbody/tr[2]/td[1]");
                    adminlanguagesActual.add("//*[@id=\"content_table\"][5]/tbody/tr[2]/td[2]");
                    adminlanguagesActual.add("//*[@id=\"content_table\"][5]/tbody/tr[2]/td[3]");
                    adminlanguagesActual.add("//*[@id=\"content_table\"][5]/tbody/tr[3]/td[1]");
                    adminlanguagesActual.add("//*[@id=\"content_table\"][5]/tbody/tr[3]/td[2]");
                    adminlanguagesActual.add("//*[@id=\"content_table\"][5]/tbody/tr[3]/td[3]");
                    return adminlanguagesExpected.elementAt(i) +";"+adminlanguagesActual.elementAt(i);
                case "adminguestui":
                    Vector<String> adminguestuiExpected =new Vector<String>(7);
                    Vector<String> adminguestuiActual =new Vector<String>(7);
                    adminguestuiExpected.add("Guest UI");
                    adminguestuiExpected.add("Name");
                    adminguestuiExpected.add("Display Name");
                    adminguestuiExpected.add("URL");
                    adminguestuiExpected.add("admin_menu_setup");
                    adminguestuiExpected.add("admin_menu_admin_menu");
                    adminguestuiExpected.add("admin_menu_setup");
                    adminguestuiActual.add("//*[@id=\"content_table\"][6]/caption");
                    adminguestuiActual.add("//*[@id=\"content_table\"][6]/tbody/tr[1]/td[1]");
                    adminguestuiActual.add("//*[@id=\"content_table\"][6]/tbody/tr[1]/td[2]");
                    adminguestuiActual.add("//*[@id=\"content_table\"][6]/tbody/tr[1]/td[3]");
                    adminguestuiActual.add("//*[@id=\"content_table\"][6]/tbody/tr[2]/td[1]");
                    adminguestuiActual.add("//*[@id=\"content_table\"][6]/tbody/tr[2]/td[2]");
                    adminguestuiActual.add("//*[@id=\"content_table\"][6]/tbody/tr[2]/td[3]");
                    return adminguestuiExpected.elementAt(i) +";"+adminguestuiActual.elementAt(i);
                case "adminroommanagement":
                    Vector<String> adminroommanagementExpected =new Vector<String>(34);
                    Vector<String> adminroommanagementActual =new Vector<String>(34);
                    adminroommanagementExpected.add("Room Management");
                    adminroommanagementExpected.add("Name");
                    adminroommanagementExpected.add("Display Name");
                    adminroommanagementExpected.add("URL");
                    adminroommanagementExpected.add("reset_rooms");
                    adminroommanagementExpected.add("admin_menu_reset_rooms");
                    adminroommanagementExpected.add("reset_rooms");
                    adminroommanagementExpected.add("manual_override");
                    adminroommanagementExpected.add("admin_menu_manual_overide");
                    adminroommanagementExpected.add("manual_override");
                    adminroommanagementExpected.add("stb_list");
                    adminroommanagementExpected.add("admin_menu_stb_list");
                    adminroommanagementExpected.add("stb_list");
                    adminroommanagementExpected.add("room_types");
                    adminroommanagementExpected.add("room_types");
                    adminroommanagementExpected.add("room_types");
                    adminroommanagementExpected.add("rooms");
                    adminroommanagementExpected.add("admin_menu_rooms");
                    adminroommanagementExpected.add("rooms");
                    adminroommanagementExpected.add("admin_menu_switch_room");
                    adminroommanagementExpected.add("admin_menu_switch_room");
                    adminroommanagementExpected.add("switch_rooms");
                    adminroommanagementExpected.add("add_stb");
                    adminroommanagementExpected.add("admin_menu_add_stb");
                    adminroommanagementExpected.add("add_stb");
                    adminroommanagementExpected.add("room_information");
                    adminroommanagementExpected.add("admin_menu_room_history");
                    adminroommanagementExpected.add("room_information");
                    adminroommanagementExpected.add("current_movie_streams");
                    adminroommanagementExpected.add("admin_menu_current_movie");
                    adminroommanagementExpected.add("current_movie_streams");
                    adminroommanagementExpected.add("current_tasks");
                    adminroommanagementExpected.add("admin_menu_current_tasks");
                    adminroommanagementExpected.add("current_tasks");
                    adminroommanagementActual.add("//*[@id=\"content_table\"][7]/caption");
                    adminroommanagementActual.add("//*[@id=\"content_table\"][7]/tbody/tr[1]/td[1]");
                    adminroommanagementActual.add("//*[@id=\"content_table\"][7]/tbody/tr[1]/td[2]");
                    adminroommanagementActual.add("//*[@id=\"content_table\"][7]/tbody/tr[1]/td[3]");
                    adminroommanagementActual.add("//*[@id=\"content_table\"][7]/tbody/tr[2]/td[1]");
                    adminroommanagementActual.add("//*[@id=\"content_table\"][7]/tbody/tr[2]/td[2]");
                    adminroommanagementActual.add("//*[@id=\"content_table\"][7]/tbody/tr[2]/td[3]");
                    adminroommanagementActual.add("//*[@id=\"content_table\"][7]/tbody/tr[3]/td[1]");
                    adminroommanagementActual.add("//*[@id=\"content_table\"][7]/tbody/tr[3]/td[2]");
                    adminroommanagementActual.add("//*[@id=\"content_table\"][7]/tbody/tr[3]/td[3]");
                    adminroommanagementActual.add("//*[@id=\"content_table\"][7]/tbody/tr[4]/td[1]");
                    adminroommanagementActual.add("//*[@id=\"content_table\"][7]/tbody/tr[4]/td[2]");
                    adminroommanagementActual.add("//*[@id=\"content_table\"][7]/tbody/tr[4]/td[3]");
                    adminroommanagementActual.add("//*[@id=\"content_table\"][7]/tbody/tr[5]/td[1]");
                    adminroommanagementActual.add("//*[@id=\"content_table\"][7]/tbody/tr[5]/td[2]");
                    adminroommanagementActual.add("//*[@id=\"content_table\"][7]/tbody/tr[5]/td[3]");
                    adminroommanagementActual.add("//*[@id=\"content_table\"][7]/tbody/tr[6]/td[1]");
                    adminroommanagementActual.add("//*[@id=\"content_table\"][7]/tbody/tr[6]/td[2]");
                    adminroommanagementActual.add("//*[@id=\"content_table\"][7]/tbody/tr[6]/td[3]");
                    adminroommanagementActual.add("//*[@id=\"content_table\"][7]/tbody/tr[7]/td[1]");
                    adminroommanagementActual.add("//*[@id=\"content_table\"][7]/tbody/tr[7]/td[2]");
                    adminroommanagementActual.add("//*[@id=\"content_table\"][7]/tbody/tr[7]/td[3]");
                    adminroommanagementActual.add("//*[@id=\"content_table\"][7]/tbody/tr[8]/td[1]");
                    adminroommanagementActual.add("//*[@id=\"content_table\"][7]/tbody/tr[8]/td[2]");
                    adminroommanagementActual.add("//*[@id=\"content_table\"][7]/tbody/tr[8]/td[3]");
                    adminroommanagementActual.add("//*[@id=\"content_table\"][7]/tbody/tr[9]/td[1]");
                    adminroommanagementActual.add("//*[@id=\"content_table\"][7]/tbody/tr[9]/td[2]");
                    adminroommanagementActual.add("//*[@id=\"content_table\"][7]/tbody/tr[9]/td[3]");
                    adminroommanagementActual.add("//*[@id=\"content_table\"][7]/tbody/tr[10]/td[1]");
                    adminroommanagementActual.add("//*[@id=\"content_table\"][7]/tbody/tr[10]/td[2]");
                    adminroommanagementActual.add("//*[@id=\"content_table\"][7]/tbody/tr[10]/td[3]");
                    adminroommanagementActual.add("//*[@id=\"content_table\"][7]/tbody/tr[11]/td[1]");
                    adminroommanagementActual.add("//*[@id=\"content_table\"][7]/tbody/tr[11]/td[2]");
                    adminroommanagementActual.add("//*[@id=\"content_table\"][7]/tbody/tr[11]/td[3]");
                    return adminroommanagementExpected.elementAt(i) +";"+adminroommanagementActual.elementAt(i);
                case "adminmodules":
                    Vector<String> adminmodulesExpected =new Vector<String>(13);
                    Vector<String> adminmodulesActual =new Vector<String>(13);
                    adminmodulesExpected.add("Modules");
                    adminmodulesExpected.add("Name");
                    adminmodulesExpected.add("Display Name");
                    adminmodulesExpected.add("URL");
                    adminmodulesExpected.add("modules");
                    adminmodulesExpected.add("admin_menu_modules");
                    adminmodulesExpected.add("modules");
                    adminmodulesExpected.add("room_types");
                    adminmodulesExpected.add("room_types");
                    adminmodulesExpected.add("room_types");
                    adminmodulesExpected.add("radio_stations");
                    adminmodulesExpected.add("radio_stations");
                    adminmodulesExpected.add("radio");
                    adminmodulesActual.add("//*[@id=\"content_table\"][8]/caption"); 
                    adminmodulesActual.add("//*[@id=\"content_table\"][8]/tbody/tr[1]/td[1]");
                    adminmodulesActual.add("//*[@id=\"content_table\"][8]/tbody/tr[1]/td[2]");
                    adminmodulesActual.add("//*[@id=\"content_table\"][8]/tbody/tr[1]/td[3]");
                    adminmodulesActual.add("//*[@id=\"content_table\"][8]/tbody/tr[2]/td[1]");
                    adminmodulesActual.add("//*[@id=\"content_table\"][8]/tbody/tr[2]/td[2]");
                    adminmodulesActual.add("//*[@id=\"content_table\"][8]/tbody/tr[2]/td[3]");
                    adminmodulesActual.add("//*[@id=\"content_table\"][8]/tbody/tr[3]/td[1]");
                    adminmodulesActual.add("//*[@id=\"content_table\"][8]/tbody/tr[3]/td[2]");
                    adminmodulesActual.add("//*[@id=\"content_table\"][8]/tbody/tr[3]/td[3]");
                    adminmodulesActual.add("//*[@id=\"content_table\"][8]/tbody/tr[4]/td[1]");
                    adminmodulesActual.add("//*[@id=\"content_table\"][8]/tbody/tr[4]/td[2]");
                    adminmodulesActual.add("//*[@id=\"content_table\"][8]/tbody/tr[4]/td[3]");
                    return adminmodulesExpected.elementAt(i) +";"+adminmodulesActual.elementAt(i);
                case "admintelevision":
                    Vector<String> admintelevisionExpected =new Vector<String>(13);
                    Vector<String> admintelevisionActual =new Vector<String>(13);
                    admintelevisionExpected.add("television");
                    admintelevisionExpected.add("Name");
                    admintelevisionExpected.add("Display Name");
                    admintelevisionExpected.add("URL");
                    admintelevisionExpected.add("list_channels");
                    admintelevisionExpected.add("admin_menu_ftg_list");
                    admintelevisionExpected.add("television");
                    admintelevisionExpected.add("channel_bundles");
                    admintelevisionExpected.add("admin_menu_bundles");
                    admintelevisionExpected.add("channel_bundles");
                    admintelevisionExpected.add("channel_bundle_reports");
                    admintelevisionExpected.add("admin_menu_bundles_report");
                    admintelevisionExpected.add("channel_bundle_reports");
                    admintelevisionActual.add("//*[@id=\"content_table\"][9]/caption");
                    admintelevisionActual.add("//*[@id=\"content_table\"][9]/tbody/tr[1]/td[1]");
                    admintelevisionActual.add("//*[@id=\"content_table\"][9]/tbody/tr[1]/td[2]");
                    admintelevisionActual.add("//*[@id=\"content_table\"][9]/tbody/tr[1]/td[3]");
                    admintelevisionActual.add("//*[@id=\"content_table\"][9]/tbody/tr[2]/td[1]");
                    admintelevisionActual.add("//*[@id=\"content_table\"][9]/tbody/tr[2]/td[2]");
                    admintelevisionActual.add("//*[@id=\"content_table\"][9]/tbody/tr[2]/td[3]");
                    admintelevisionActual.add("//*[@id=\"content_table\"][9]/tbody/tr[3]/td[1]");
                    admintelevisionActual.add("//*[@id=\"content_table\"][9]/tbody/tr[3]/td[2]");
                    admintelevisionActual.add("//*[@id=\"content_table\"][9]/tbody/tr[3]/td[3]");
                    admintelevisionActual.add("//*[@id=\"content_table\"][9]/tbody/tr[4]/td[1]");
                    admintelevisionActual.add("//*[@id=\"content_table\"][9]/tbody/tr[4]/td[2]");
                    admintelevisionActual.add("//*[@id=\"content_table\"][9]/tbody/tr[4]/td[3]");
                    return admintelevisionExpected.elementAt(i) +";"+admintelevisionActual.elementAt(i);
                case "adminsystemconfig":
                    Vector<String> adminsystemconfigExpected =new Vector<String>(19);
                    Vector<String> adminsystemconfigActual =new Vector<String>(19);
                    adminsystemconfigExpected.add("system_config");
                    adminsystemconfigExpected.add("Name");
                    adminsystemconfigExpected.add("Display Name");
                    adminsystemconfigExpected.add("URL");
                    adminsystemconfigExpected.add("hotel_information");
                    adminsystemconfigExpected.add("admin_menu_hotel_info");
                    adminsystemconfigExpected.add("hotel_information");
                    adminsystemconfigExpected.add("install_setup");
                    adminsystemconfigExpected.add("install_setup");
                    adminsystemconfigExpected.add("admin_install_setup");
                    adminsystemconfigExpected.add("user_management");
                    adminsystemconfigExpected.add("admin_menu_user");
                    adminsystemconfigExpected.add("(Menu) User Management");
                    adminsystemconfigExpected.add("menu_setup");
                    adminsystemconfigExpected.add("admin_menu_ui");
                    adminsystemconfigExpected.add("(Menu) Guest UI");
                    adminsystemconfigExpected.add("languages");
                    adminsystemconfigExpected.add("admin_menu_languages");
                    adminsystemconfigExpected.add("(Menu) Languages");
                    adminsystemconfigActual.add("//*[@id=\"content_table\"][10]/caption");
                    adminsystemconfigActual.add("//*[@id=\"content_table\"][10]/tbody/tr[1]/td[1]");
                    adminsystemconfigActual.add("//*[@id=\"content_table\"][10]/tbody/tr[1]/td[2]");
                    adminsystemconfigActual.add("//*[@id=\"content_table\"][10]/tbody/tr[1]/td[3]");
                    adminsystemconfigActual.add("//*[@id=\"content_table\"][10]/tbody/tr[2]/td[1]");
                    adminsystemconfigActual.add("//*[@id=\"content_table\"][10]/tbody/tr[2]/td[2]");
                    adminsystemconfigActual.add("//*[@id=\"content_table\"][10]/tbody/tr[2]/td[3]");
                    adminsystemconfigActual.add("//*[@id=\"content_table\"][10]/tbody/tr[3]/td[1]");
                    adminsystemconfigActual.add("//*[@id=\"content_table\"][10]/tbody/tr[3]/td[2]");
                    adminsystemconfigActual.add("//*[@id=\"content_table\"][10]/tbody/tr[3]/td[3]");
                    adminsystemconfigActual.add("//*[@id=\"content_table\"][10]/tbody/tr[4]/td[1]");
                    adminsystemconfigActual.add("//*[@id=\"content_table\"][10]/tbody/tr[4]/td[2]");
                    adminsystemconfigActual.add("//*[@id=\"content_table\"][10]/tbody/tr[4]/td[3]");
                    adminsystemconfigActual.add("//*[@id=\"content_table\"][10]/tbody/tr[5]/td[1]");
                    adminsystemconfigActual.add("//*[@id=\"content_table\"][10]/tbody/tr[5]/td[2]");
                    adminsystemconfigActual.add("//*[@id=\"content_table\"][10]/tbody/tr[5]/td[3]");
                    adminsystemconfigActual.add("//*[@id=\"content_table\"][10]/tbody/tr[6]/td[1]");
                    adminsystemconfigActual.add("//*[@id=\"content_table\"][10]/tbody/tr[6]/td[2]");
                    adminsystemconfigActual.add("//*[@id=\"content_table\"][10]/tbody/tr[6]/td[3]");
                    return adminsystemconfigExpected.elementAt(i) +";"+adminsystemconfigActual.elementAt(i);
                case "adminreports":
                    Vector<String> adminreportsExpected =new Vector<String>(7);
                    Vector<String> adminreportsActual =new Vector<String>(7);
                    adminreportsExpected.add("reports");
                    adminreportsExpected.add("Name");
                    adminreportsExpected.add("Display Name");
                    adminreportsExpected.add("URL");
                    adminreportsExpected.add("Reports");
                    adminreportsExpected.add("admin_menu_audit_report");
                    adminreportsExpected.add("audit_reports");
                    adminreportsActual.add("//*[@id=\"content_table\"][11]/caption");
                    adminreportsActual.add("//*[@id=\"content_table\"][11]/tbody/tr[1]/td[1]");
                    adminreportsActual.add("//*[@id=\"content_table\"][11]/tbody/tr[1]/td[2]");
                    adminreportsActual.add("//*[@id=\"content_table\"][11]/tbody/tr[1]/td[3]");
                    adminreportsActual.add("//*[@id=\"content_table\"][11]/tbody/tr[2]/td[1]");
                    adminreportsActual.add("//*[@id=\"content_table\"][11]/tbody/tr[2]/td[2]");
                    adminreportsActual.add("//*[@id=\"content_table\"][11]/tbody/tr[2]/td[3]");
                    return adminreportsExpected.elementAt(i) +";"+adminreportsActual.elementAt(i);
                case "admintvinternet":
                    Vector<String> admintvinternetExpected =new Vector<String>(7);
                    Vector<String> admintvinternetActual =new Vector<String>(7);
                    admintvinternetExpected.add("tvinternet");
                    admintvinternetExpected.add("Name");
                    admintvinternetExpected.add("Display Name");
                    admintvinternetExpected.add("URL");
                    admintvinternetExpected.add("internet_options");
                    admintvinternetExpected.add("admin_menu_internet");
                    admintvinternetExpected.add("billing_internet_options");
                    admintvinternetActual.add("//*[@id=\"content_table\"][12]/caption");
                    admintvinternetActual.add("//*[@id=\"content_table\"][12]/tbody/tr[1]/td[1]");
                    admintvinternetActual.add("//*[@id=\"content_table\"][12]/tbody/tr[1]/td[2]");
                    admintvinternetActual.add("//*[@id=\"content_table\"][12]/tbody/tr[1]/td[3]");
                    admintvinternetActual.add("//*[@id=\"content_table\"][12]/tbody/tr[2]/td[1]");
                    admintvinternetActual.add("//*[@id=\"content_table\"][12]/tbody/tr[2]/td[2]");
                    admintvinternetActual.add("//*[@id=\"content_table\"][12]/tbody/tr[2]/td[3]");
                    return admintvinternetExpected.elementAt(i) +";"+admintvinternetActual.elementAt(i);
                case "admintroubleshooting":
                    Vector<String> admintroubleshootingExpected =new Vector<String>(37);
                    Vector<String> admintroubleshootingActual =new Vector<String>(37);
                    admintroubleshootingExpected.add("troubleshooting");
                    admintroubleshootingExpected.add("Name");
                    admintroubleshootingExpected.add("Display Name");
                    admintroubleshootingExpected.add("URL");
                    admintroubleshootingExpected.add("stb_list");
                    admintroubleshootingExpected.add("admin_menu_stb_list");
                    admintroubleshootingExpected.add("stb_list");
                    admintroubleshootingExpected.add("admin_menu_stb_summary");
                    admintroubleshootingExpected.add("admin_menu_stb_summary");
                    admintroubleshootingExpected.add("stb_summary");
                    admintroubleshootingExpected.add("add_stb");
                    admintroubleshootingExpected.add("admin_menu_add_stb");
                    admintroubleshootingExpected.add("add_stb");
                    admintroubleshootingExpected.add("room_information");
                    admintroubleshootingExpected.add("admin_menu_room_history");
                    admintroubleshootingExpected.add("room_information");
                    admintroubleshootingExpected.add("airplay_device_list");
                    admintroubleshootingExpected.add("airplay_device_list");
                    admintroubleshootingExpected.add("airplay_devices");
                    admintroubleshootingExpected.add("chromecast_devices");
                    admintroubleshootingExpected.add("chromecast_devices");
                    admintroubleshootingExpected.add("admin_chromecast_devices");
                    admintroubleshootingExpected.add("myaway_device_list");
                    admintroubleshootingExpected.add("myaway_device_list");
                    admintroubleshootingExpected.add("myaway_devices");
                    admintroubleshootingExpected.add("current_movie_streams");
                    admintroubleshootingExpected.add("admin_menu_current_movie");
                    admintroubleshootingExpected.add("current_movie_streams");
                    admintroubleshootingExpected.add("current_tasks");
                    admintroubleshootingExpected.add("admin_menu_current_tasks");
                    admintroubleshootingExpected.add("current_tasks");
                    admintroubleshootingExpected.add("admin_menu_recordings_list");
                    admintroubleshootingExpected.add("admin_menu_recordings_list");
                    admintroubleshootingExpected.add("pvr_recordings");
                    admintroubleshootingExpected.add("admin_menu_samsung_license");
                    admintroubleshootingExpected.add("admin_menu_samsung_license");
                    admintroubleshootingExpected.add("samsung_license");
                    admintroubleshootingActual.add("//*[@id=\"content_table\"][13]/caption");
                    admintroubleshootingActual.add("//*[@id=\"content_table\"][13]/tbody/tr[1]/td[1]");
                    admintroubleshootingActual.add("//*[@id=\"content_table\"][13]/tbody/tr[1]/td[2]");
                    admintroubleshootingActual.add("//*[@id=\"content_table\"][13]/tbody/tr[1]/td[3]");
                    admintroubleshootingActual.add("//*[@id=\"content_table\"][13]/tbody/tr[2]/td[1]");
                    admintroubleshootingActual.add("//*[@id=\"content_table\"][13]/tbody/tr[2]/td[2]");
                    admintroubleshootingActual.add("//*[@id=\"content_table\"][13]/tbody/tr[2]/td[3]");
                    admintroubleshootingActual.add("//*[@id=\"content_table\"][13]/tbody/tr[3]/td[1]");
                    admintroubleshootingActual.add("//*[@id=\"content_table\"][13]/tbody/tr[3]/td[2]");
                    admintroubleshootingActual.add("//*[@id=\"content_table\"][13]/tbody/tr[3]/td[3]");
                    admintroubleshootingActual.add("//*[@id=\"content_table\"][13]/tbody/tr[4]/td[1]");
                    admintroubleshootingActual.add("//*[@id=\"content_table\"][13]/tbody/tr[4]/td[2]");
                    admintroubleshootingActual.add("//*[@id=\"content_table\"][13]/tbody/tr[4]/td[3]");
                    admintroubleshootingActual.add("//*[@id=\"content_table\"][13]/tbody/tr[5]/td[1]");
                    admintroubleshootingActual.add("//*[@id=\"content_table\"][13]/tbody/tr[5]/td[2]");
                    admintroubleshootingActual.add("//*[@id=\"content_table\"][13]/tbody/tr[5]/td[3]");
                    admintroubleshootingActual.add("//*[@id=\"content_table\"][13]/tbody/tr[6]/td[1]");
                    admintroubleshootingActual.add("//*[@id=\"content_table\"][13]/tbody/tr[6]/td[2]");
                    admintroubleshootingActual.add("//*[@id=\"content_table\"][13]/tbody/tr[6]/td[3]");
                    admintroubleshootingActual.add("//*[@id=\"content_table\"][13]/tbody/tr[7]/td[1]");
                    admintroubleshootingActual.add("//*[@id=\"content_table\"][13]/tbody/tr[7]/td[2]");
                    admintroubleshootingActual.add("//*[@id=\"content_table\"][13]/tbody/tr[7]/td[3]");
                    admintroubleshootingActual.add("//*[@id=\"content_table\"][13]/tbody/tr[8]/td[1]");
                    admintroubleshootingActual.add("//*[@id=\"content_table\"][13]/tbody/tr[8]/td[2]");
                    admintroubleshootingActual.add("//*[@id=\"content_table\"][13]/tbody/tr[8]/td[3]");
                    admintroubleshootingActual.add("//*[@id=\"content_table\"][13]/tbody/tr[9]/td[1]");
                    admintroubleshootingActual.add("//*[@id=\"content_table\"][13]/tbody/tr[9]/td[2]");
                    admintroubleshootingActual.add("//*[@id=\"content_table\"][13]/tbody/tr[9]/td[3]");
                    admintroubleshootingActual.add("//*[@id=\"content_table\"][13]/tbody/tr[10]/td[1]");
                    admintroubleshootingActual.add("//*[@id=\"content_table\"][13]/tbody/tr[10]/td[2]");
                    admintroubleshootingActual.add("//*[@id=\"content_table\"][13]/tbody/tr[10]/td[3]");
                    admintroubleshootingActual.add("//*[@id=\"content_table\"][13]/tbody/tr[11]/td[1]");
                    admintroubleshootingActual.add("//*[@id=\"content_table\"][13]/tbody/tr[11]/td[2]");
                    admintroubleshootingActual.add("//*[@id=\"content_table\"][13]/tbody/tr[11]/td[3]");
                    admintroubleshootingActual.add("//*[@id=\"content_table\"][13]/tbody/tr[12]/td[1]");
                    admintroubleshootingActual.add("//*[@id=\"content_table\"][13]/tbody/tr[12]/td[2]");
                    admintroubleshootingActual.add("//*[@id=\"content_table\"][13]/tbody/tr[12]/td[3]");                    
                    return admintroubleshootingExpected.elementAt(i) +";"+admintroubleshootingActual.elementAt(i);
                case "listlanguages":
                    Vector<String> listlanguagesExpected =new Vector<String>(5);
                    Vector<String> listlanguagesActual =new Vector<String>(5);
                    listlanguagesExpected.add("English Value");
                    listlanguagesExpected.add("Native Value");
                    listlanguagesExpected.add("ISO Codes");
                    listlanguagesExpected.add("Active");
                    listlanguagesExpected.add("Order");
                    listlanguagesActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[1]");
                    listlanguagesActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[2]");
                    listlanguagesActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[3]");
                    listlanguagesActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[4]");
                    listlanguagesActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[5]");
                    return listlanguagesExpected.elementAt(i) +";"+listlanguagesActual.elementAt(i);
                case "textfields":
                    Vector<String> textfieldsExpected =new Vector<String>(4);
                    Vector<String> textfieldsActual =new Vector<String>(4);
                    textfieldsExpected.add("Add Field");
                    textfieldsExpected.add("Name");
                    textfieldsExpected.add("id_label");
                    textfieldsExpected.add("Name");                    
                    textfieldsActual.add("//*[@id=\"content_table\"]/caption"); 
                    textfieldsActual.add("//*[@id=\"content_table\"]/tbody/tr/td[1]");
                    textfieldsActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[1]"); 
                    textfieldsActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[2]");
                    return textfieldsExpected.elementAt(i) +";"+textfieldsActual.elementAt(i);
                case "FTGChannels":
                    Vector<String> FTGChannelsExpected =new Vector<String>(9);
                    Vector<String> FTGChannelsActual =new Vector<String>(9);
                    FTGChannelsExpected.add("FTG Channels");
                    FTGChannelsExpected.add("Channel Label");
                    FTGChannelsExpected.add("Channel Description");
                    FTGChannelsExpected.add("Source");
                    FTGChannelsExpected.add("DRM Type");
                    FTGChannelsExpected.add("IPG PID");
                    FTGChannelsExpected.add("NPVR Bitrate");
                    FTGChannelsExpected.add("Logo");
                    FTGChannelsExpected.add("Actions");
                    FTGChannelsActual.add("//*[@id=\"content_table\"]/caption");
                    FTGChannelsActual.add("//*[@id=\"content_table\"]/thead/tr/th[1]");
                    FTGChannelsActual.add("//*[@id=\"content_table\"]/thead/tr/th[2]");
                    FTGChannelsActual.add("//*[@id=\"content_table\"]/thead/tr/th[3]");
                    FTGChannelsActual.add("//*[@id=\"content_table\"]/thead/tr/th[4]");
                    FTGChannelsActual.add("//*[@id=\"content_table\"]/thead/tr/th[5]");
                    FTGChannelsActual.add("//*[@id=\"content_table\"]/thead/tr/th[6]");
                    FTGChannelsActual.add("//*[@id=\"content_table\"]/thead/tr/th[7]");
                    FTGChannelsActual.add("//*[@id=\"content_table\"]/thead/tr/th[8]");
                    return FTGChannelsExpected.elementAt(i) +";"+FTGChannelsActual.elementAt(i);
                case "AddChannel":
                    Vector<String> AddChannelExpected =new Vector<String>(14);
                    Vector<String> AddChannelActual =new Vector<String>(14);
                    AddChannelExpected.add("Add Channel");
                    AddChannelExpected.add("Channel Label");
                    AddChannelExpected.add("Channel Description");
                    AddChannelExpected.add("IPG channel description");
                    AddChannelExpected.add("Channel Source");
                    AddChannelExpected.add("Multicast IP");
                    AddChannelExpected.add("Port");
                    AddChannelExpected.add("QAM Major-Minor");
                    AddChannelExpected.add("Management IP");
                    AddChannelExpected.add("Enable NPVR for Channel");
                    AddChannelExpected.add("NPVR Bitrate");
                    AddChannelExpected.add("DRM Type");
                    AddChannelExpected.add("Mobile Streaming Authorized");
                    AddChannelExpected.add("MVP Central Channel");
                    AddChannelActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/form[2]/div/table/caption");
                    AddChannelActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[1]/strong");
                    AddChannelActual.add("//*[@id=\"content_table\"]/tbody/tr[2]/td[1]/strong");
                    AddChannelActual.add("//*[@id=\"content_table\"]/tbody/tr[3]/td[1]/strong");
                    AddChannelActual.add("//*[@id=\"content_table\"]/tbody/tr[4]/td[1]/strong");
                    AddChannelActual.add("//*[@id=\"content_table\"]/tbody/tr[5]/td[1]/strong");
                    AddChannelActual.add("//*[@id=\"content_table\"]/tbody/tr[6]/td[1]/strong");
                    AddChannelActual.add("//*[@id=\"content_table\"]/tbody/tr[7]/td[1]/strong");
                    AddChannelActual.add("//*[@id=\"content_table\"]/tbody/tr[8]/td[1]/strong");
                    AddChannelActual.add("//*[@id=\"content_table\"]/tbody/tr[9]/td[1]/strong");
                    AddChannelActual.add("//*[@id=\"content_table\"]/tbody/tr[10]/td[1]/strong");
                    AddChannelActual.add("//*[@id=\"content_table\"]/tbody/tr[11]/td[1]/strong");
                    AddChannelActual.add("//*[@id=\"content_table\"]/tbody/tr[12]/td[1]/strong");
                    AddChannelActual.add("//*[@id=\"content_table\"]/tbody/tr[13]/td[1]/strong");
                    return AddChannelExpected.elementAt(i) +";"+AddChannelActual.elementAt(i);
                case "editchannels":
                    Vector<String> editchannelsExpected =new Vector<String>(13);
                    Vector<String> editchannelsActual =new Vector<String>(13);
                    editchannelsExpected.add("Edit Channels");
                    editchannelsExpected.add("Channel Label");
                    editchannelsExpected.add("Channel Description");
                    editchannelsExpected.add("IPG PID");
                    editchannelsExpected.add("IPG Desc");
                    editchannelsExpected.add("IP");
                    editchannelsExpected.add("Port");
                    editchannelsExpected.add("QAM Major-Minor");
                    editchannelsExpected.add("Management IP");
                    editchannelsExpected.add("NPVR Bitrate");
                    editchannelsExpected.add("DRM Type");
                    editchannelsExpected.add("MVP Central Channel");
                    editchannelsExpected.add("Mobile Streaming Authorized");
                    editchannelsActual.add("//*[@id=\"content_table\"]/caption");
                    editchannelsActual.add("//*[@id=\"content_table\"]/thead/tr/th[1]");
                    editchannelsActual.add("//*[@id=\"content_table\"]/thead/tr/th[2]");
                    editchannelsActual.add("//*[@id=\"content_table\"]/thead/tr/th[3]");
                    editchannelsActual.add("//*[@id=\"content_table\"]/thead/tr/th[4]");
                    editchannelsActual.add("//*[@id=\"content_table\"]/thead/tr/th[5]");
                    editchannelsActual.add("//*[@id=\"content_table\"]/thead/tr/th[6]");
                    editchannelsActual.add("//*[@id=\"content_table\"]/thead/tr/th[7]");
                    editchannelsActual.add("//*[@id=\"content_table\"]/thead/tr/th[8]");
                    editchannelsActual.add("//*[@id=\"content_table\"]/thead/tr/th[9]");
                    editchannelsActual.add("//*[@id=\"content_table\"]/thead/tr/th[10]");
                    editchannelsActual.add("//*[@id=\"content_table\"]/thead/tr/th[11]");
                    editchannelsActual.add("//*[@id=\"content_table\"]/thead/tr/th[12]");
                    return editchannelsExpected.elementAt(i) +";"+editchannelsActual.elementAt(i);
                case "uploadchannelxml":
                    Vector<String> uploadchannelxmlExpected =new Vector<String>(2);
                    Vector<String> uploadchannelxmlActual =new Vector<String>(2);
                    uploadchannelxmlExpected.add("Upload Channel XML");
                    uploadchannelxmlExpected.add("XML Document");
                    uploadchannelxmlActual.add("//*[@id=\"content_table\"]/caption");
                    uploadchannelxmlActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[1]/strong");
                    return uploadchannelxmlExpected.elementAt(i) +";"+uploadchannelxmlActual.elementAt(i);
                case "smithmicro":
                    Vector<String> smithmicroExpected =new Vector<String>(9);
                    Vector<String> smithmicroActual =new Vector<String>(9);
                    smithmicroExpected.add("SmithMicro Ingestions");
                    smithmicroExpected.add("Channel Name");
                    smithmicroExpected.add("Channel ID");
                    smithmicroExpected.add("Streaming");
                    smithmicroExpected.add("Source IP/Port");
                    smithmicroExpected.add("Encrypted");
                    smithmicroExpected.add("Session ID");
                    smithmicroExpected.add("Last Access Date");
                    smithmicroExpected.add("Total Ingests Detected");
                    smithmicroActual.add("//*[@id=\"content_table\"]/caption");
                    smithmicroActual.add("//*[@id=\"content_table\"]/thead/tr/th[1]");
                    smithmicroActual.add("//*[@id=\"content_table\"]/thead/tr/th[2]");
                    smithmicroActual.add("//*[@id=\"content_table\"]/thead/tr/th[3]");
                    smithmicroActual.add("//*[@id=\"content_table\"]/thead/tr/th[4]");
                    smithmicroActual.add("//*[@id=\"content_table\"]/thead/tr/th[5]");
                    smithmicroActual.add("//*[@id=\"content_table\"]/thead/tr/th[6]");
                    smithmicroActual.add("//*[@id=\"content_table\"]/thead/tr/th[7]");                    
                    smithmicroActual.add("//*[@id=\"content_table\"][2]/tbody/tr/td[1]");
                    return smithmicroExpected.elementAt(i) +";"+smithmicroActual.elementAt(i);
                case "tvaddBundle":
                    Vector<String> tvaddBundleExpected =new Vector<String>(4);
                    Vector<String> tvaddBundleActual =new Vector<String>(4);
                    tvaddBundleExpected.add("Add Bundle");
                    tvaddBundleExpected.add("Bundle Name");
                    tvaddBundleExpected.add("Bundle Description");
                    tvaddBundleExpected.add("Bundle ARR");
                    tvaddBundleActual.add("//*[@id=\"content_table\"]/caption");
                    tvaddBundleActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[1]/strong");
                    tvaddBundleActual.add("//*[@id=\"content_table\"]/tbody/tr[2]/td[1]/strong");
                    tvaddBundleActual.add("//*[@id=\"content_table\"]/tbody/tr[3]/td[1]/strong");
                    return tvaddBundleExpected.elementAt(i) +";"+tvaddBundleActual.elementAt(i);
                case "tvbundlelist":
                    Vector<String> tvbundlelistExpected =new Vector<String>(4);
                    Vector<String> tvbundlelistActual =new Vector<String>(4);
                    tvbundlelistExpected.add("Bundle List");
                    tvbundlelistExpected.add("Bundle Name");
                    tvbundlelistExpected.add("Bundle Description");
                    tvbundlelistExpected.add("Bundle ARR");
                    tvbundlelistActual.add("//*[@id=\"content_table\"][2]/caption");
                    tvbundlelistActual.add("//*[@id=\"content_table\"][2]/tbody/tr[1]/td[1]");
                    tvbundlelistActual.add("//*[@id=\"content_table\"][2]/tbody/tr[1]/td[2]");
                    tvbundlelistActual.add("//*[@id=\"content_table\"][2]/tbody/tr[1]/td[3]");
                    return tvbundlelistExpected.elementAt(i) +";"+tvbundlelistActual.elementAt(i);
                case "tvbundleassignmentreport":
                    Vector<String> tvbundleassignmentreportExpected =new Vector<String>(5);
                    Vector<String> tvbundleassignmentreportActual =new Vector<String>(5);
                    tvbundleassignmentreportExpected.add("Generate Report");
                    tvbundleassignmentreportExpected.add("Start Date");
                    tvbundleassignmentreportExpected.add("End Date");
                    tvbundleassignmentreportExpected.add("Room");
                    tvbundleassignmentreportExpected.add("Bundle History");
                    tvbundleassignmentreportActual.add("//*[@id=\"content_table\"]/caption");
                    tvbundleassignmentreportActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[1]");
                    tvbundleassignmentreportActual.add("//*[@id=\"content_table\"]/tbody/tr[2]/td[1]");
                    tvbundleassignmentreportActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[1]");
                    tvbundleassignmentreportActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[2]");
                    return tvbundleassignmentreportExpected.elementAt(i) +";"+tvbundleassignmentreportActual.elementAt(i);
                case "billing":
                    Vector<String> billingExpected =new Vector<String>(6);
                    Vector<String> billingActual =new Vector<String>(6);
                    billingExpected.add("PMS Queue");
                    billingExpected.add("Room");
                    billingExpected.add("Order");
                    billingExpected.add("Order Time");
                    billingExpected.add("Amount");
                    billingExpected.add("Room Number For Refund");
                    billingActual.add("//*[@id=\"content_table\"]/caption");
                    billingActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[1]"); 
                    billingActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[2]");
                    billingActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[3]");
                    billingActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[4]");
                    billingActual.add("//*[@id=\"content_table\"]/caption");
                    return billingExpected.elementAt(i) +";"+billingActual.elementAt(i);
                case "reports":
                    Vector<String> reportsExpected =new Vector<String>(17);
                    Vector<String> reportsActual =new Vector<String>(17);
                    reportsExpected.add("Daily Audit");
                    reportsExpected.add("Monthly Audit");
                    reportsExpected.add("Movie Orders");
                    reportsExpected.add("Room");
                    reportsExpected.add("Movie");
                    reportsExpected.add("Order Time");
                    reportsExpected.add("Amount");
                    reportsExpected.add("Total Orders");
                    reportsExpected.add("Total Revenue");
                    reportsExpected.add("Internet Orders");
                    reportsExpected.add("Room");
                    reportsExpected.add("Internet Charge");
                    reportsExpected.add("Order Time");
                    reportsExpected.add("Amount");
                    reportsExpected.add("Total Orders");
                    reportsExpected.add("Total Revenue"); 
                    reportsExpected.add("PMS Status");
                    reportsActual.add("//*[@id=\"content_table\"]/caption");
                    reportsActual.add("//*[@id=\"content_table\"][2]/caption");
                    reportsActual.add("//*[@id=\"content_table\"]/caption");
                    reportsActual.add("//*[@id=\"content_table\"]/tbody/tr/td[1]");
                    reportsActual.add("//*[@id=\"content_table\"]/tbody/tr/td[2]");
                    reportsActual.add("//*[@id=\"content_table\"]/tbody/tr/td[3]");
                    reportsActual.add("//*[@id=\"content_table\"]/tbody/tr/td[4]");
                    reportsActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/table[2]/tbody/tr[1]/td[1]");
                    reportsActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/table[2]/tbody/tr[2]/td[1]");
                    reportsActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/table[3]/caption");
                    reportsActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/table[3]/tbody/tr/td[1]");
                    reportsActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/table[3]/tbody/tr/td[2]");
                    reportsActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/table[3]/tbody/tr/td[3]");
                    reportsActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/table[3]/tbody/tr/td[4]");
                    reportsActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/table[5]/tbody/tr[1]/td[1]");
                    reportsActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/table[5]/tbody/tr[2]/td[1]");
                    reportsActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/table[1]/tbody/tr[1]/td[5]");
                    return reportsExpected.elementAt(i) +";"+reportsActual.elementAt(i);
                case "roomlist":
                    Vector<String> roomlistExpected =new Vector<String>(9);
                    Vector<String> roomlistActual =new Vector<String>(9);
                    roomlistExpected.add("Room List");
                    roomlistExpected.add("Room");
                    roomlistExpected.add("Pass Code");
                    roomlistExpected.add("MyAway Code");
                    roomlistExpected.add("Rating");
                    roomlistExpected.add("Language");
                    roomlistExpected.add("Active State");
                    roomlistExpected.add("PMS Status");
                    roomlistExpected.add("Inhibit Charges");
                    roomlistActual.add("//*[@id=\"content_table\"]/caption");
                    roomlistActual.add("//*[@id=\"content_table\"]/thead/tr/td[1]");
                    roomlistActual.add("//*[@id=\"content_table\"]/thead/tr/td[2]");
                    roomlistActual.add("//*[@id=\"content_table\"]/thead/tr/td[3]");
                    roomlistActual.add("//*[@id=\"content_table\"]/thead/tr/td[4]");                    
                    roomlistActual.add("//*[@id=\"content_table\"]/thead/tr/td[5]");
                    roomlistActual.add("//*[@id=\"content_table\"]/thead/tr/td[6]");
                    roomlistActual.add("//*[@id=\"content_table\"]/thead/tr/td[7]");
                    roomlistActual.add("//*[@id=\"content_table\"]/thead/tr/td[8]");                    
                    return roomlistExpected.elementAt(i) +";"+roomlistActual.elementAt(i);
                case "manualoverride":
                    Vector<String> manualoverrideExpected =new Vector<String>(7);
                    Vector<String> manualoverrideActual =new Vector<String>(7);
                    manualoverrideExpected.add("Room");
                    manualoverrideExpected.add("Rating");
                    manualoverrideExpected.add("Pass Code");
                    manualoverrideExpected.add("Language");
                    manualoverrideExpected.add("Room Enabled");
                    manualoverrideExpected.add("PMS Status");
                    manualoverrideExpected.add("Inhibit Charges");
                    manualoverrideActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[1]");
                    manualoverrideActual.add("//*[@id=\"content_table\"]/tbody/tr[2]/td[1]");
                    manualoverrideActual.add("//*[@id=\"content_table\"]/tbody/tr[3]/td[1]");
                    manualoverrideActual.add("//*[@id=\"content_table\"]/tbody/tr[4]/td[1]");
                    manualoverrideActual.add("//*[@id=\"content_table\"]/tbody/tr[5]/td[1]");
                    manualoverrideActual.add("//*[@id=\"content_table\"]/tbody/tr[6]/td[1]");
                    manualoverrideActual.add("//*[@id=\"content_table\"]/tbody/tr[7]/td[1]");
                    return manualoverrideExpected.elementAt(i) +";"+manualoverrideActual.elementAt(i);
                case "roomtypes":
                    Vector<String> roomtypesExpected =new Vector<String>(9);
                    Vector<String> roomtypesActual =new Vector<String>(9);
                    roomtypesExpected.add("Room Types");
                    roomtypesExpected.add("Name");
                    roomtypesExpected.add("Enabled");
                    roomtypesExpected.add("notes");
                    roomtypesExpected.add("Action");
                    roomtypesExpected.add("Add New Room Type");
                    roomtypesExpected.add("Room Type Model");
                    roomtypesExpected.add("Name");
                    roomtypesExpected.add("notes");
                    roomtypesActual.add("//*[@id=\"content_table\"]/caption");
                    roomtypesActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[1]");
                    roomtypesActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[2]");
                    roomtypesActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[3]");
                    roomtypesActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[4]");
                    roomtypesActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/div/form/table/caption");
                    roomtypesActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/div/form/table/tbody/tr[1]/td[1]");
                    roomtypesActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/div/form/table/tbody/tr[2]/td[1]");
                    roomtypesActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/div/form/table/tbody/tr[3]/td[1]");                    
                    return roomtypesExpected.elementAt(i) +";"+roomtypesActual.elementAt(i);
                case "roomslist":
                    Vector<String> roomslistExpected =new Vector<String>(20);
                    Vector<String> roomslistActual =new Vector<String>(20);
                    roomslistExpected.add("Add New Room");
                    roomslistExpected.add("Room");
                    roomslistExpected.add("Package");
                    roomslistExpected.add("Charge State");
                    roomslistExpected.add("Room Type");
                    roomslistExpected.add("Number of STBs in Room");
                    roomslistExpected.add("Room List");//table 2
                    roomslistExpected.add("Room");
                    roomslistExpected.add("Billing Package");
                    roomslistExpected.add("Charge State");
                    roomslistExpected.add("Room Type");
                    roomslistExpected.add("STBs actual");
                    roomslistExpected.add("STBs target");
                    roomslistExpected.add("Manage STB Locations");//table 3
                    roomslistExpected.add("Add STB Location");//table 4
                    roomslistExpected.add("Location:");
                    roomslistExpected.add("Room Type:");
                    roomslistExpected.add("Sync With GlobalSuite");// table 5
                    roomslistExpected.add("Package");
                    roomslistExpected.add("Room Type");
                    roomslistActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/table[1]/caption");
                    roomslistActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/table[1]/tbody/tr[1]/td[1]");
                    roomslistActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/table[1]/tbody/tr[2]/td[1]");
                    roomslistActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/table[1]/tbody/tr[3]/td[1]");
                    roomslistActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/table[1]/tbody/tr[4]/td[1]");
                    roomslistActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/table[1]/tbody/tr[5]/td[1]");
                    roomslistActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/form[1]/div/table/caption");//Room List
                    roomslistActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/form[1]/div/table/thead/tr[2]/td[1]/u");
                    roomslistActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/form[1]/div/table/thead/tr[2]/td[2]/u");
                    roomslistActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/form[1]/div/table/thead/tr[2]/td[3]/u");
                    roomslistActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/form[1]/div/table/thead/tr[2]/td[4]/u");
                    roomslistActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/form[1]/div/table/thead/tr[2]/td[5]");
                    roomslistActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/form[1]/div/table/thead/tr[2]/td[6]");
                    roomslistActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/table[2]/caption");// Manage STB Locations
                    roomslistActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/form[2]/table/caption");// Add STB Location
                    roomslistActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/form[2]/table/tbody/tr[1]/td[1]");
                    roomslistActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/form[2]/table/tbody/tr[2]/td[1]");
                    roomslistActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/table[3]/caption");//Sync with
                    roomslistActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/table[3]/tbody/tr[1]/td[1]");
                    roomslistActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/table[3]/tbody/tr[2]/td[1]");
                    /*roomslistActual.add("//*[@id=\"content_table\"]/caption");//0
                    roomslistActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[1]");
                    roomslistActual.add("//*[@id=\"content_table\"]/tbody/tr[2]/td[1]");
                    roomslistActual.add("//*[@id=\"content_table\"]/tbody/tr[3]/td[1]");
                    roomslistActual.add("//*[@id=\"content_table\"]/tbody/tr[4]/td[1]");
                    roomslistActual.add("//*[@id=\"content_table\"]/tbody/tr[5]/td[1]"); //5
                    roomslistActual.add("//*[@id=\"content_table\"][2]/caption");//table 2
                    roomslistActual.add("//*[@id=\"content_table\"]/thead/tr[2]/td[1]/u");
                    roomslistActual.add("//*[@id=\"content_table\"]/thead/tr[2]/td[2]/u");
                    roomslistActual.add("//*[@id=\"content_table\"]/thead/tr[2]/td[3]/u");
                    roomslistActual.add("//*[@id=\"content_table\"]/thead/tr[2]/td[4]/u"); //10
                    roomslistActual.add("//*[@id=\"content_table\"]/thead/tr[2]/td[5]/u");
                    roomslistActual.add("//*[@id=\"content_table\"]/thead/tr[2]/td[6]/u");
                    roomslistActual.add("//*[@id=\"content_table\"][2]/caption");//table 3
                    roomslistActual.add("//*[@id=\"content_table\"][2]/tbody/tr[1]/td[1]");
                    roomslistActual.add("//*[@id=\"content_table\"][2]/tbody/tr[2]/td[1]");//15
                    roomslistActual.add("//*[@id=\"content_table\"][2]/tbody/tr[3]/td[1]");
                    roomslistActual.add("//*[@id=\"content_table\"][2]/tbody/tr[4]/td[1]");
                    roomslistActual.add("//*[@id=\"content_table\"][2]/tbody/tr[5]/td[1]"); */
                    return roomslistExpected.elementAt(i) +";"+roomslistActual.elementAt(i);
                case "guestbulletins":
                    Vector<String> guestbulletinsExpected =new Vector<String>(10);
                    Vector<String> guestbulletinsActual =new Vector<String>(10);
                    guestbulletinsExpected.add("Bulletins:");
                    guestbulletinsExpected.add("Bulletin Active");
                    guestbulletinsExpected.add("Bulletin Message");
                    guestbulletinsExpected.add("Bulletin Type");
                    guestbulletinsExpected.add("Twitter:");
                    guestbulletinsExpected.add("Twitter Feed");
                    guestbulletinsExpected.add("Hours of Data");
                    guestbulletinsExpected.add("Max Tweets");
                    guestbulletinsExpected.add("Twitter Proxy URL");
                    guestbulletinsExpected.add("Display username");
                    guestbulletinsActual.add("//*[@id=\"content_table\"]/caption");
                    guestbulletinsActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[1]");
                    guestbulletinsActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[2]");
                    guestbulletinsActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[3]");
                    guestbulletinsActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/div/form/table/caption");
                    guestbulletinsActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/div/form/table/tbody/tr[1]/td[1]");
                    guestbulletinsActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/div/form/table/tbody/tr[2]/td[1]");
                    guestbulletinsActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/div/form/table/tbody/tr[3]/td[1]");
                    guestbulletinsActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/div/form/table/tbody/tr[4]/td[1]");
                    guestbulletinsActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/div/form/table/tbody/tr[5]/td[1]");
                    return guestbulletinsExpected.elementAt(i) +";"+guestbulletinsActual.elementAt(i);
                case "guestsurvey":
                    Vector<String> guestsurveyExpected =new Vector<String>(9);
                    Vector<String> guestsurveyActual =new Vector<String>(9);
                    guestsurveyExpected.add("Edit/Delete Guest Survey");
                    guestsurveyExpected.add("Guest_Survey");
                    guestsurveyExpected.add("Language: Press (LANG)");
                    guestsurveyExpected.add("Action");
                    guestsurveyExpected.add("Add Guest Survey");
                    guestsurveyExpected.add("Survey Name");
                    guestsurveyExpected.add("Survey Language");
                    guestsurveyExpected.add("Email Recipients (comma seperated only)");
                    guestsurveyExpected.add("Clone existing survey");
                    guestsurveyActual.add("//*[@id=\"content_table\"]/caption");
                    guestsurveyActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[1]");
                    guestsurveyActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[2]");
                    guestsurveyActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[3]");
                    guestsurveyActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/form/table/caption");
                    guestsurveyActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/form/table/tbody/tr[1]/td[1]/strong");
                    guestsurveyActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/form/table/tbody/tr[2]/td[1]/strong");
                    guestsurveyActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/form/table/tbody/tr[3]/td[1]/strong");
                    guestsurveyActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/form/table/tbody/tr[4]/td[1]/strong");                    
                    return guestsurveyExpected.elementAt(i) +";"+guestsurveyActual.elementAt(i);
                case "guestdirectory":
                    Vector<String> guestdirectoryExpected =new Vector<String>(2);
                    Vector<String> guestdirectoryActual =new Vector<String>(2);
                    guestdirectoryExpected.add("Guest Directory");
                    guestdirectoryExpected.add("Action");
                    guestdirectoryActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[1]");
                    guestdirectoryActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[2]");
                    return guestdirectoryExpected.elementAt(i) +";"+guestdirectoryActual.elementAt(i);
                case "tsSTBList":
                    Vector<String> tsSTBListExpected =new Vector<String>(11);
                    Vector<String> tsSTBListActual =new Vector<String>(11);
                    tsSTBListExpected.add("STB List");
                    tsSTBListExpected.add("Room");
                    tsSTBListExpected.add("Location");
                    tsSTBListExpected.add("MAC");
                    tsSTBListExpected.add("IP");
                    tsSTBListExpected.add("STB Setup");
                    tsSTBListExpected.add("Serial");
                    tsSTBListExpected.add("Model");
                    tsSTBListExpected.add("Software Version");
                    tsSTBListExpected.add("Last Reboot");
                    tsSTBListExpected.add("Last Phone Home");
                    tsSTBListActual.add("//*[@id=\"content_table\"]/caption");
                    tsSTBListActual.add("//*[@id=\"content_table\"]/thead/tr[2]/th[1]");
                    tsSTBListActual.add("//*[@id=\"content_table\"]/thead/tr[2]/th[2]");
                    tsSTBListActual.add("//*[@id=\"content_table\"]/thead/tr[2]/th[3]");
                    tsSTBListActual.add("//*[@id=\"content_table\"]/thead/tr[2]/th[4]");
                    tsSTBListActual.add("//*[@id=\"content_table\"]/thead/tr[2]/th[5]");
                    tsSTBListActual.add("//*[@id=\"content_table\"]/thead/tr[2]/th[6]");
                    tsSTBListActual.add("//*[@id=\"content_table\"]/thead/tr[2]/th[7]");
                    tsSTBListActual.add("//*[@id=\"content_table\"]/thead/tr[2]/th[8]");
                    tsSTBListActual.add("//*[@id=\"content_table\"]/thead/tr[2]/th[9]");
                    tsSTBListActual.add("//*[@id=\"content_table\"]/thead/tr[2]/th[10]");                    
                    return tsSTBListExpected.elementAt(i) +";"+tsSTBListActual.elementAt(i);
                case "tsSTBStatus":
                    Vector<String> tsSTBStatusExpected =new Vector<String>(31);
                    Vector<String> tsSTBStatusActual =new Vector<String>(31);
                    tsSTBStatusExpected.add("STB Status");
                    tsSTBStatusExpected.add("Up");
                    tsSTBStatusExpected.add("Down");
                    tsSTBStatusExpected.add("Booting");
                    tsSTBStatusExpected.add("Boot Failure");
                    tsSTBStatusExpected.add("STB Versions");
                    tsSTBStatusExpected.add("Version");
                    tsSTBStatusExpected.add("Count");
                    tsSTBStatusExpected.add("Installed STB Firmware");
                    tsSTBStatusExpected.add("Platform");
                    tsSTBStatusExpected.add("Version(s)");
                    tsSTBStatusExpected.add("File(s)");
                    tsSTBStatusExpected.add("Running");
                    tsSTBStatusExpected.add("TV Status");
                    tsSTBStatusExpected.add("On");
                    tsSTBStatusExpected.add("Off");
                    tsSTBStatusExpected.add("Unavailable");
                    tsSTBStatusExpected.add("Active TV Channels");
                    tsSTBStatusExpected.add("Channel");
                    tsSTBStatusExpected.add("Count");
                    tsSTBStatusExpected.add("Active Modules");
                    tsSTBStatusExpected.add("Module");
                    tsSTBStatusExpected.add("Count");
                    tsSTBStatusExpected.add("STB Reload/Reboot Settings");
                    tsSTBStatusExpected.add("Sunday");
                    tsSTBStatusExpected.add("Monday");
                    tsSTBStatusExpected.add("Tuesday");
                    tsSTBStatusExpected.add("Wednesday");
                    tsSTBStatusExpected.add("Thursday");
                    tsSTBStatusExpected.add("Friday");
                    tsSTBStatusExpected.add("Saturday");
                    
                    tsSTBStatusActual.add("//*[@id=\"content_table\"]/caption");
                    tsSTBStatusActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[1]");
                    tsSTBStatusActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[2]");
                    tsSTBStatusActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[3]");
                    tsSTBStatusActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[4]");
                    tsSTBStatusActual.add("//*[@id=\"content_table\"][2]/caption");
                    tsSTBStatusActual.add("//*[@id=\"content_table\"][2]/tbody/tr[1]/td[1]");
                    tsSTBStatusActual.add("//*[@id=\"content_table\"][2]/tbody/tr[1]/td[2]");
                    tsSTBStatusActual.add("//*[@id=\"content_table\"][3]/caption");//.Installed STB Firmware
                    tsSTBStatusActual.add("//*[@id=\"content_table\"][3]/tbody/tr[1]/td[1]");
                    tsSTBStatusActual.add("//*[@id=\"content_table\"][3]/tbody/tr[1]/td[2]");
                    tsSTBStatusActual.add("//*[@id=\"content_table\"][3]/tbody/tr[1]/td[3]");
                    tsSTBStatusActual.add("//*[@id=\"content_table\"][3]/tbody/tr[1]/td[4]");
                    tsSTBStatusActual.add("//*[@id=\"content_table\"][4]/caption");//TV Status
                    tsSTBStatusActual.add("//*[@id=\"content_table\"][4]/tbody/tr[1]/td[1]");
                    tsSTBStatusActual.add("//*[@id=\"content_table\"][4]/tbody/tr[1]/td[2]");
                    tsSTBStatusActual.add("//*[@id=\"content_table\"][4]/tbody/tr[1]/td[3]");
                    tsSTBStatusActual.add("//*[@id=\"content_table\"][5]/caption");//Active TV Channels
                    tsSTBStatusActual.add("//*[@id=\"content_table\"][5]/tbody/tr[1]/td[1]");
                    tsSTBStatusActual.add("//*[@id=\"content_table\"][5]/tbody/tr[1]/td[2]");
                    tsSTBStatusActual.add("//*[@id=\"content_table\"][6]/caption");//Active Modules
                    tsSTBStatusActual.add("//*[@id=\"content_table\"][6]/tbody/tr[1]/td[1]");
                    tsSTBStatusActual.add("//*[@id=\"content_table\"][6]/tbody/tr[1]/td[2]");
                    tsSTBStatusActual.add("//*[@id=\"content_table\"][7]/caption");
                    tsSTBStatusActual.add("//*[@id=\"content_table\"][7]/thead/tr/th[2]");
                    tsSTBStatusActual.add("//*[@id=\"content_table\"][7]/thead/tr/th[3]");
                    tsSTBStatusActual.add("//*[@id=\"content_table\"][7]/thead/tr/th[4]");
                    tsSTBStatusActual.add("//*[@id=\"content_table\"][7]/thead/tr/th[5]");
                    tsSTBStatusActual.add("//*[@id=\"content_table\"][7]/thead/tr/th[6]");
                    tsSTBStatusActual.add("//*[@id=\"content_table\"][7]/thead/tr/th[7]");
                    tsSTBStatusActual.add("//*[@id=\"content_table\"][7]/thead/tr/th[8]");
                    return tsSTBStatusExpected.elementAt(i) +";"+tsSTBStatusActual.elementAt(i);
                case "tsAddSTB":
                    Vector<String> tsAddSTBExpected =new Vector<String>(5);
                    Vector<String> tsAddSTBActual =new Vector<String>(5);
                    tsAddSTBExpected.add("Room");
                    tsAddSTBExpected.add("Serial Number");
                    tsAddSTBExpected.add("TVI Setup");
                    tsAddSTBExpected.add("Remote");
                    tsAddSTBExpected.add("Location");
                    tsAddSTBActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[1]");
                    tsAddSTBActual.add("//*[@id=\"content_table\"]/tbody/tr[2]/td[1]");
                    tsAddSTBActual.add("//*[@id=\"content_table\"]/tbody/tr[3]/td[1]");
                    tsAddSTBActual.add("//*[@id=\"content_table\"]/tbody/tr[4]/td[1]");
                    tsAddSTBActual.add("//*[@id=\"content_table\"]/tbody/tr[5]/td[1]");
                    return tsAddSTBExpected.elementAt(i) +";"+tsAddSTBActual.elementAt(i);
                case "tsRoomHistory":
                    Vector<String> tsRoomHistoryExpected =new Vector<String>(27);
                    Vector<String> tsRoomHistoryActual =new Vector<String>(27);
                    tsRoomHistoryExpected.add("Room Settings");
                    tsRoomHistoryExpected.add("Room");
                    tsRoomHistoryExpected.add("Rating");
                    tsRoomHistoryExpected.add("Language");
                    tsRoomHistoryExpected.add("Active State");
                    tsRoomHistoryExpected.add("PMS Status");
                    tsRoomHistoryExpected.add("Inhibit Charges");
                    tsRoomHistoryExpected.add("STB actual");
                    tsRoomHistoryExpected.add("STB target");
                    tsRoomHistoryExpected.add("Movie Orders");
                    tsRoomHistoryExpected.add("Room");
                    tsRoomHistoryExpected.add("Movie Name");
                    tsRoomHistoryExpected.add("Order Time");
                    tsRoomHistoryExpected.add("Playtime");
                    tsRoomHistoryExpected.add("Asset Length");
                    tsRoomHistoryExpected.add("Historic Orders");
                    tsRoomHistoryExpected.add("Room");
                    tsRoomHistoryExpected.add("Movie Name");
                    tsRoomHistoryExpected.add("Order Time");
                    tsRoomHistoryExpected.add("STB List");
                    tsRoomHistoryExpected.add("Room");
                    tsRoomHistoryExpected.add("MAC");
                    tsRoomHistoryExpected.add("IP");
                    tsRoomHistoryExpected.add("STB Setup");
                    tsRoomHistoryExpected.add("Serial");
                    tsRoomHistoryExpected.add("Software Version");
                    tsRoomHistoryExpected.add("Last Reboot");                
                    tsRoomHistoryActual.add("//*[@id=\"content_table\"]/caption");//Room Settings
                    tsRoomHistoryActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[1]");
                    tsRoomHistoryActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[2]");
                    tsRoomHistoryActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[3]");
                    tsRoomHistoryActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[4]");
                    tsRoomHistoryActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[5]");
                    tsRoomHistoryActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[6]");
                    tsRoomHistoryActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[7]");
                    tsRoomHistoryActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[8]");
                    tsRoomHistoryActual.add("//*[@id=\"content_table\"][2]/caption");//Movie Orders
                    tsRoomHistoryActual.add("//*[@id=\"content_table\"][2]/tbody[2]/tr[1]/td[1]");
                    tsRoomHistoryActual.add("//*[@id=\"content_table\"][2]/tbody[2]/tr[1]/td[2]");
                    tsRoomHistoryActual.add("//*[@id=\"content_table\"][2]/tbody[2]/tr[1]/td[3]");
                    tsRoomHistoryActual.add("//*[@id=\"content_table\"][2]/tbody[2]/tr[1]/td[4]");
                    tsRoomHistoryActual.add("//*[@id=\"content_table\"][2]/tbody[2]/tr[1]/td[5]");
                    tsRoomHistoryActual.add("//*[@id=\"content_table\"][3]/caption");//Historic Orders
                    tsRoomHistoryActual.add("//*[@id=\"content_table\"][3]/tbody[2]/tr[1]/td[1]");
                    tsRoomHistoryActual.add("//*[@id=\"content_table\"][3]/tbody[2]/tr[1]/td[2]");
                    tsRoomHistoryActual.add("//*[@id=\"content_table\"][3]/tbody[2]/tr[1]/td[3]");
                    tsRoomHistoryActual.add("//*[@id=\"content_table\"][4]/caption");//STB List
                    tsRoomHistoryActual.add("//*[@id=\"content_table\"][4]/tbody/tr[1]/td[1]");
                    tsRoomHistoryActual.add("//*[@id=\"content_table\"][4]/tbody/tr[1]/td[2]");
                    tsRoomHistoryActual.add("//*[@id=\"content_table\"][4]/tbody/tr[1]/td[3]");
                    tsRoomHistoryActual.add("//*[@id=\"content_table\"][4]/tbody/tr[1]/td[4]");
                    tsRoomHistoryActual.add("//*[@id=\"content_table\"][4]/tbody/tr[1]/td[5]");
                    tsRoomHistoryActual.add("//*[@id=\"content_table\"][4]/tbody/tr[1]/td[6]");
                    tsRoomHistoryActual.add("//*[@id=\"content_table\"][4]/tbody/tr[1]/td[7]");                    
                    return tsRoomHistoryExpected.elementAt(i) +";"+tsRoomHistoryActual.elementAt(i);
                case "tsIPTV":
                    Vector<String> tsIPTVExpected =new Vector<String>(29);
                    Vector<String> tsIPTVActual =new Vector<String>(29);
                    tsIPTVExpected.add("IPTV Apple TV Device List");
                    tsIPTVExpected.add("Room");
                    tsIPTVExpected.add("Location");
                    tsIPTVExpected.add("Name");
                    tsIPTVExpected.add("Version");
                    tsIPTVExpected.add("IP");
                    tsIPTVExpected.add("MAC");
                    tsIPTVExpected.add("Type");
                    tsIPTVExpected.add("Mcast Address");
                    tsIPTVExpected.add("Status");
                    tsIPTVExpected.add("In Room Apple TV Device List");
                    tsIPTVExpected.add("Room");
                    tsIPTVExpected.add("Location");
                    tsIPTVExpected.add("Name");
                    tsIPTVExpected.add("Version");
                    tsIPTVExpected.add("IP");
                    tsIPTVExpected.add("MAC");
                    tsIPTVExpected.add("Type");
                    tsIPTVExpected.add("TV Input"); 
                    tsIPTVExpected.add("Apple TVs");
                    tsIPTVExpected.add("Statistics for Apple TVs");
                    tsIPTVExpected.add("Apple TV Proxy Status"); 
                    tsIPTVExpected.add("Auto-Add Apple TVs"); //Auto Detect
                    tsIPTVExpected.add("IP");
                    tsIPTVExpected.add("Name");
                    tsIPTVExpected.add("MAC");
                    tsIPTVExpected.add("Version");
                    tsIPTVExpected.add("Multicast Address");
                    tsIPTVExpected.add("Multicast Port");                    
                    tsIPTVActual.add("//*[@id=\"content_table\"]/caption");//IPTV
                    tsIPTVActual.add("//*[@id=\"content_table\"]/thead/tr[2]/th[1]");
                    tsIPTVActual.add("//*[@id=\"content_table\"]/thead/tr[2]/th[2]");
                    tsIPTVActual.add("//*[@id=\"content_table\"]/thead/tr[2]/th[3]");
                    tsIPTVActual.add("//*[@id=\"content_table\"]/thead/tr[2]/th[4]");
                    tsIPTVActual.add("//*[@id=\"content_table\"]/thead/tr[2]/th[5]");
                    tsIPTVActual.add("//*[@id=\"content_table\"]/thead/tr[2]/th[6]");
                    tsIPTVActual.add("//*[@id=\"content_table\"]/thead/tr[2]/th[7]");
                    tsIPTVActual.add("//*[@id=\"content_table\"]/thead/tr[2]/th[8]");
                    tsIPTVActual.add("//*[@id=\"content_table\"]/thead/tr[2]/th[9]");
                    tsIPTVActual.add("//*[@id=\"content_table\"]/caption");//table 2
                    tsIPTVActual.add("//*[@id=\"content_table\"]/thead/tr[2]/th[1]");
                    tsIPTVActual.add("//*[@id=\"content_table\"][2]/thead/tr[2]/th[2]");
                    tsIPTVActual.add("//*[@id=\"content_table\"][2]/thead/tr[2]/th[3]");
                    tsIPTVActual.add("//*[@id=\"content_table\"][2]/thead/tr[2]/th[4]");
                    tsIPTVActual.add("//*[@id=\"content_table\"][2]/thead/tr[2]/th[5]");
                    tsIPTVActual.add("//*[@id=\"content_table\"][2]/thead/tr[2]/th[6]");
                    tsIPTVActual.add("//*[@id=\"content_table\"][2]/thead/tr[2]/th[7]");
                    tsIPTVActual.add("//*[@id=\"content_table\"][2]/thead/tr[2]/th[8]");  
                    tsIPTVActual.add("/html/body/div/div[1]/div[1]/h2");
                    tsIPTVActual.add("//*[@id=\"airplayProxyStatusPane\"]/div/h2[1]");
                    tsIPTVActual.add("//*[@id=\"airplayProxyStatusPane\"]/div/h2[2]");
                    tsIPTVActual.add("//*[@id=\"content_table\"]/caption"); //Auto-Add Apple TVs
                    tsIPTVActual.add("//*[@id=\"content_table\"]/thead/tr/th[1]");
                    tsIPTVActual.add("//*[@id=\"content_table\"]/thead/tr/th[2]");
                    tsIPTVActual.add("//*[@id=\"content_table\"]/thead/tr/th[3]");
                    tsIPTVActual.add("//*[@id=\"content_table\"]/thead/tr/th[4]");
                    tsIPTVActual.add("//*[@id=\"content_table\"]/thead/tr/th[5]");
                    tsIPTVActual.add("//*[@id=\"content_table\"]/thead/tr/th[6]");
                    return tsIPTVExpected.elementAt(i) +";"+tsIPTVActual.elementAt(i);
                case "tsChromec":
                    Vector<String> tsChromecExpected =new Vector<String>(15);
                    Vector<String> tsChromecActual =new Vector<String>(15);
                    tsChromecExpected.add("IPTV ChromeCast Device List");
                    tsChromecExpected.add("Room");
                    tsChromecExpected.add("Location");
                    tsChromecExpected.add("Name");
                    tsChromecExpected.add("Version");
                    tsChromecExpected.add("IP");
                    tsChromecExpected.add("MAC");
                    tsChromecExpected.add("UUID");
                    tsChromecExpected.add("Type");
                    tsChromecExpected.add("Mcast Address");
                    tsChromecExpected.add("Status");  
                    tsChromecExpected.add("ChromeCasts");
                    tsChromecExpected.add("Statistics for ChromeCasts");
                    tsChromecExpected.add("ChromeCast Proxy Status");
                    tsChromecExpected.add("Auto-Add ChromeCasts");
                    tsChromecActual.add("//*[@id=\"content_table\"]/caption");
                    tsChromecActual.add("//*[@id=\"content_table\"]/thead/tr[2]/th[1]");
                    tsChromecActual.add("//*[@id=\"content_table\"]/thead/tr[2]/th[2]");
                    tsChromecActual.add("//*[@id=\"content_table\"]/thead/tr[2]/th[3]");
                    tsChromecActual.add("//*[@id=\"content_table\"]/thead/tr[2]/th[4]");
                    tsChromecActual.add("//*[@id=\"content_table\"]/thead/tr[2]/th[5]");
                    tsChromecActual.add("//*[@id=\"content_table\"]/thead/tr[2]/th[6]");
                    tsChromecActual.add("//*[@id=\"content_table\"]/thead/tr[2]/th[7]");
                    tsChromecActual.add("//*[@id=\"content_table\"]/thead/tr[2]/th[8]");
                    tsChromecActual.add("//*[@id=\"content_table\"]/thead/tr[2]/th[9]");
                    tsChromecActual.add("//*[@id=\"content_table\"]/thead/tr[2]/th[10]");                      
                    tsChromecActual.add("/html/body/div/div[1]/div[1]/h2");
                    tsChromecActual.add("//*[@id=\"airplayProxyStatusPane\"]/div/h2[1]");
                    tsChromecActual.add("//*[@id=\"airplayProxyStatusPane\"]/div/h2[2]");
                    tsChromecActual.add("//*[@id=\"content_table\"]/caption");
                    return tsChromecExpected.elementAt(i) +";"+tsChromecActual.elementAt(i);
                case "tsMyAway":
                    Vector<String> tsMyAwayExpected =new Vector<String>(7);
                    Vector<String> tsMyAwayActual =new Vector<String>(7);
                    tsMyAwayExpected.add("MyAway Device List");
                    tsMyAwayExpected.add("Room");
                    tsMyAwayExpected.add("IP");
                    tsMyAwayExpected.add("UUID (Serial or MAC)");
                    tsMyAwayExpected.add("Room Code");
                    tsMyAwayExpected.add("Location");
                    tsMyAwayExpected.add("Remove");
                    tsMyAwayActual.add("//*[@id=\"content_table\"]/caption");
                    tsMyAwayActual.add("//*[@id=\"content_table\"]/thead/tr/th[1]/strong");
                    tsMyAwayActual.add("//*[@id=\"content_table\"]/thead/tr/th[2]/strong");
                    tsMyAwayActual.add("//*[@id=\"content_table\"]/thead/tr/th[3]/strong");
                    tsMyAwayActual.add("//*[@id=\"content_table\"]/thead/tr/th[4]/strong");
                    tsMyAwayActual.add("//*[@id=\"content_table\"]/thead/tr/th[5]/strong");
                    tsMyAwayActual.add("//*[@id=\"content_table\"]/thead/tr/th[6]/strong");
                    return tsMyAwayExpected.elementAt(i) +";"+tsMyAwayActual.elementAt(i);
                case "tsStreamingMovies":
                    Vector<String> tsStreamingMoviesExpected =new Vector<String>(13);
                    Vector<String> tsStreamingMoviesActual =new Vector<String>(13);
                    tsStreamingMoviesExpected.add("Streaming Movies");
                    tsStreamingMoviesExpected.add("Room");
                    tsStreamingMoviesExpected.add("IP");
                    tsStreamingMoviesExpected.add("Asset Name");
                    tsStreamingMoviesExpected.add("Movie Name");
                    tsStreamingMoviesExpected.add("Playtime");
                    tsStreamingMoviesExpected.add("Asset Length");
                    tsStreamingMoviesExpected.add("Total Streams:");
                    tsStreamingMoviesExpected.add("Total Bandwidth:");
                    tsStreamingMoviesExpected.add("Video Assets");// table 2
                    tsStreamingMoviesExpected.add("Asset Name");
                    tsStreamingMoviesExpected.add("Asset Length");
                    tsStreamingMoviesExpected.add("admin_ui_asset_bitrate");
                    tsStreamingMoviesActual.add("//*[@id=\"content_table\"]/caption");
                    tsStreamingMoviesActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[1]");
                    tsStreamingMoviesActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[2]");
                    tsStreamingMoviesActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[3]");
                    tsStreamingMoviesActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[4]");
                    tsStreamingMoviesActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[5]");
                    tsStreamingMoviesActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[6]");
                    tsStreamingMoviesActual.add("//*[@id=\"content_table\"]/tbody/tr[2]/td[1]");
                    tsStreamingMoviesActual.add("//*[@id=\"content_table\"]/tbody/tr[3]/td[1]");
                    tsStreamingMoviesActual.add("//*[@id=\"content_table\"][2]/caption"); //table 2                   
                    tsStreamingMoviesActual.add("//*[@id=\"content_table\"][2]/tbody/tr/td[1]");
                    tsStreamingMoviesActual.add("//*[@id=\"content_table\"][2]/tbody/tr/td[2]");
                    tsStreamingMoviesActual.add("//*[@id=\"content_table\"][2]/tbody/tr/td[3]");
                    return tsStreamingMoviesExpected.elementAt(i) +";"+tsStreamingMoviesActual.elementAt(i);
                case "tsCurrentTasks":
                    Vector<String> tsCurrentTasksExpected =new Vector<String>(5);
                    Vector<String> tsCurrentTasksActual =new Vector<String>(5);
                    tsCurrentTasksExpected.add("Kasenna Tasks");
                    tsCurrentTasksExpected.add("Task Name");
                    tsCurrentTasksExpected.add("Type");
                    tsCurrentTasksExpected.add("Status");
                    tsCurrentTasksExpected.add("Percent Complete");
                    tsCurrentTasksActual.add("//*[@id=\"content_table\"]/caption");
                    tsCurrentTasksActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[1]");
                    tsCurrentTasksActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[2]");
                    tsCurrentTasksActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[3]");
                    tsCurrentTasksActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[4]");
                    return tsCurrentTasksExpected.elementAt(i) +";"+tsCurrentTasksActual.elementAt(i);
                case "tsPVR":
                    Vector<String> tsPVRExpected =new Vector<String>(7);
                    Vector<String> tsPVRActual =new Vector<String>(7);
                    tsPVRExpected.add("Start Time");
                    tsPVRExpected.add("End Time");
                    tsPVRExpected.add("Recording");
                    tsPVRExpected.add("Rooms");
                    tsPVRExpected.add("Error");
                    tsPVRExpected.add("Asset Status");
                    tsPVRExpected.add("Task Status");
                    tsPVRActual.add("//*[@id=\"content_table\"]/thead/tr/th[1]/strong");
                    tsPVRActual.add("//*[@id=\"content_table\"]/thead/tr/th[2]/strong");
                    tsPVRActual.add("//*[@id=\"content_table\"]/thead/tr/th[3]/strong");
                    tsPVRActual.add("//*[@id=\"content_table\"]/thead/tr/th[4]/strong");
                    tsPVRActual.add("//*[@id=\"content_table\"]/thead/tr/th[5]/strong");
                    tsPVRActual.add("//*[@id=\"content_table\"]/thead/tr/th[6]/strong");
                    tsPVRActual.add("//*[@id=\"content_table\"]/thead/tr/th[7]/strong");
                    return tsPVRExpected.elementAt(i) +";"+tsPVRActual.elementAt(i);
                case "tsSamsung":
                    Vector<String> tsSamsungExpected =new Vector<String>(7);
                    Vector<String> tsSamsungActual =new Vector<String>(7);
                    tsSamsungExpected.add("MAC");
                    tsSamsungExpected.add("Key");
                    tsSamsungExpected.add("Modified");
                    tsSamsungExpected.add("Status");
                    tsSamsungExpected.add("Enabled");
                    tsSamsungExpected.add("Upload Samsung License");
                    tsSamsungExpected.add("License File");
                    tsSamsungActual.add("//*[@id=\"content_table\"]/thead/tr/th[1]/strong");
                    tsSamsungActual.add("//*[@id=\"content_table\"]/thead/tr/th[2]/strong");
                    tsSamsungActual.add("//*[@id=\"content_table\"]/thead/tr/th[3]/strong");
                    tsSamsungActual.add("//*[@id=\"content_table\"]/thead/tr/th[4]/strong");
                    tsSamsungActual.add("//*[@id=\"content_table\"]/thead/tr/td/strong");//*[@id="content_table"]/thead/tr/td/strong
                    tsSamsungActual.add("//*[@id=\"content_table\"][2]/caption");//table 2
                    tsSamsungActual.add("//*[@id=\"content_table\"][2]/tbody/tr[1]/td[1]/strong");                    
                    return tsSamsungExpected.elementAt(i) +";"+tsSamsungActual.elementAt(i);
                case "stapi":
                    Vector<String> stapiExpected =new Vector<String>(34);
                    Vector<String> stapiActual =new Vector<String>(34);
                    stapiExpected.add("Select Single Room");//0
                    stapiExpected.add("Input Room:");//1
                    stapiExpected.add("Or");//2
                    stapiExpected.add("Select Room:");//3
                    stapiExpected.add("Select Multiple TVs");//4
                    stapiExpected.add("TV Commands");//5
                    stapiExpected.add("Power:");//6
                    stapiExpected.add("Volume:");//7
                    stapiExpected.add("Inputs:");//8
                    stapiExpected.add("Media Commands");//9
                    stapiExpected.add("Images:");//10                    
                    stapiExpected.add("Order Movie:");//11
                    stapiExpected.add("Play Movie File:");//12
                    stapiExpected.add("Play Trailer:");//13
                    stapiExpected.add("URL:");//14
                    stapiExpected.add("Options:");//15
                    stapiExpected.add("Room Settings");//16
                    stapiExpected.add("Language:");//17
                    stapiExpected.add("Rating:");//18
                    stapiExpected.add("PIN:");//19
                    stapiExpected.add("Channels");//20
                    stapiExpected.add("Channels:");//21                   
                    stapiExpected.add("IPG:");//22
                    stapiExpected.add("Display Modules");//23
                    stapiExpected.add("Module:");//24
                    stapiExpected.add("Alerts");//25
                    stapiExpected.add("Remote Control");//26
                    stapiExpected.add("TV");//27
                    stapiExpected.add("Navigation:");//28
                    stapiExpected.add("Channel");//29
                    stapiExpected.add("Audio");//30
                    stapiExpected.add("Numbers:");//31
                    stapiExpected.add("Media:");//32
                    stapiExpected.add("Hotkeys");//33                    
                    stapiActual.add("/html/body/table/tbody/tr/td/div/table[1]/tbody/tr[1]/td/b");//0
                    stapiActual.add("/html/body/table/tbody/tr/td/div/table[1]/tbody/tr[2]/td[1]");//1
                    stapiActual.add("/html/body/table/tbody/tr/td/div/table[1]/tbody/tr[3]/td");//2
                    stapiActual.add("/html/body/table/tbody/tr/td/div/table[1]/tbody/tr[4]/td[1]");//3
                    stapiActual.add("/html/body/table/tbody/tr/td/div/table[2]/tbody/tr[1]/td/b");//4
                    stapiActual.add("/html/body/table/tbody/tr[3]/td[1]/table/tbody/tr[1]/td/table/tbody/tr[1]/td/b");//5
                    stapiActual.add("/html/body/table/tbody/tr[3]/td[1]/table/tbody/tr[1]/td/table/tbody/tr[2]/td[1]");//6
                    stapiActual.add("/html/body/table/tbody/tr[3]/td[1]/table/tbody/tr[1]/td/table/tbody/tr[3]/td[1]");//7
                    stapiActual.add("/html/body/table/tbody/tr[3]/td[1]/table/tbody/tr[1]/td/table/tbody/tr[4]/td[1]");//8
                    stapiActual.add("/html/body/table/tbody/tr[3]/td[1]/table/tbody/tr[2]/td/table/tbody/tr[1]/td/b");//9
                    stapiActual.add("/html/body/table/tbody/tr[3]/td[1]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]");//10
                    stapiActual.add("/html/body/table/tbody/tr[3]/td[1]/table/tbody/tr[2]/td/table/tbody/tr[3]/td[1]");//11
                    stapiActual.add("/html/body/table/tbody/tr[3]/td[1]/table/tbody/tr[2]/td/table/tbody/tr[4]/td[1]");//12
                    stapiActual.add("/html/body/table/tbody/tr[3]/td[1]/table/tbody/tr[2]/td/table/tbody/tr[5]/td[1]");//13
                    stapiActual.add("/html/body/table/tbody/tr[3]/td[1]/table/tbody/tr[2]/td/table/tbody/tr[6]/td[1]");//14
                    stapiActual.add("/html/body/table/tbody/tr[3]/td[1]/table/tbody/tr[2]/td/table/tbody/tr[7]/td[1]");//15
                    stapiActual.add("/html/body/table/tbody/tr[3]/td[1]/table/tbody/tr[3]/td/table/tbody/tr[1]/td/b");//16
                    stapiActual.add("/html/body/table/tbody/tr[3]/td[1]/table/tbody/tr[3]/td/table/tbody/tr[2]/td[1]");//17
                    stapiActual.add("/html/body/table/tbody/tr[3]/td[1]/table/tbody/tr[3]/td/table/tbody/tr[4]/td[1]");//18
                    stapiActual.add("/html/body/table/tbody/tr[3]/td[1]/table/tbody/tr[3]/td/table/tbody/tr[5]/td[1]");//19
                    stapiActual.add("/html/body/table/tbody/tr[3]/td[1]/table/tbody/tr[4]/td/table/tbody/tr[1]/td/b");//20
                    stapiActual.add("/html/body/table/tbody/tr[3]/td[1]/table/tbody/tr[4]/td/table/tbody/tr[2]/td[1]");//21
                    stapiActual.add("/html/body/table/tbody/tr[3]/td[1]/table/tbody/tr[4]/td/table/tbody/tr[3]/td[1]");//22
                    stapiActual.add("/html/body/table/tbody/tr[3]/td[1]/table/tbody/tr[5]/td/table/tbody/tr[1]/td/b");//23
                    stapiActual.add("/html/body/table/tbody/tr[3]/td[1]/table/tbody/tr[5]/td/table/tbody/tr[2]/td[1]");//24
                    stapiActual.add("/html/body/table/tbody/tr[3]/td[1]/table/tbody/tr[5]/td/table/tbody/tr[3]/td[1]");//25
                    stapiActual.add("/html/body/table/tbody/tr[3]/td[1]/table/tbody/tr[6]/td/table/tbody/tr[1]/td/b");//26
                    stapiActual.add("/html/body/table/tbody/tr[3]/td[1]/table/tbody/tr[6]/td/table/tbody/tr[2]/td[1]");//27
                    stapiActual.add("/html/body/table/tbody/tr[3]/td[1]/table/tbody/tr[6]/td/table/tbody/tr[3]/td[1]");//28
                    stapiActual.add("/html/body/table/tbody/tr[3]/td[1]/table/tbody/tr[6]/td/table/tbody/tr[5]/td[1]");//29
                    stapiActual.add("/html/body/table/tbody/tr[3]/td[1]/table/tbody/tr[6]/td/table/tbody/tr[6]/td[1]");//30
                    stapiActual.add("/html/body/table/tbody/tr[3]/td[1]/table/tbody/tr[6]/td/table/tbody/tr[7]/td[1]");//31
                    stapiActual.add("/html/body/table/tbody/tr[3]/td[1]/table/tbody/tr[6]/td/table/tbody/tr[8]/td[1]");//32
                    stapiActual.add("/html/body/table/tbody/tr[3]/td[1]/table/tbody/tr[6]/td/table/tbody/tr[9]/td[1]");//33                    
                    return stapiExpected.elementAt(i) +";"+stapiActual.elementAt(i);
                    
                case "stbtl":
                    Vector<String> stbtlExpected =new Vector<String>(14);
                    Vector<String> stbtlActual =new Vector<String>(14);
                    stbtlExpected.add("STB Track List");
                    stbtlExpected.add("Room");
                    stbtlExpected.add("Location");
                    stbtlExpected.add("Manufacturer");
                    stbtlExpected.add("MAC");
                    stbtlExpected.add("IP");
                    stbtlExpected.add("STB Setup");
                    stbtlExpected.add("Serial");
                    stbtlExpected.add("Software Version");
                    stbtlExpected.add("Last Reboot");
                    stbtlExpected.add("Last Phone Home");
                    stbtlExpected.add("Remote Logging");
                    stbtlExpected.add("Log Start Time");
                    stbtlExpected.add("Comments");                    
                    stbtlActual.add("//*[@id=\"content_table\"]/caption");
                    stbtlActual.add("//*[@id=\"content_table\"]/thead/tr[2]/th[1]");
                    stbtlActual.add("//*[@id=\"content_table\"]/thead/tr[2]/th[2]");
                    stbtlActual.add("//*[@id=\"content_table\"]/thead/tr[2]/th[3]");
                    stbtlActual.add("//*[@id=\"content_table\"]/thead/tr[2]/th[4]");
                    stbtlActual.add("//*[@id=\"content_table\"]/thead/tr[2]/th[5]");
                    stbtlActual.add("//*[@id=\"content_table\"]/thead/tr[2]/th[6]");
                    stbtlActual.add("//*[@id=\"content_table\"]/thead/tr[2]/th[7]");
                    stbtlActual.add("//*[@id=\"content_table\"]/thead/tr[2]/th[8]");
                    stbtlActual.add("//*[@id=\"content_table\"]/thead/tr[2]/th[9]");
                    stbtlActual.add("//*[@id=\"content_table\"]/thead/tr[2]/th[10]");
                    stbtlActual.add("//*[@id=\"content_table\"]/thead/tr[2]/th[11]");
                    stbtlActual.add("//*[@id=\"content_table\"]/thead/tr[2]/th[12]");
                    stbtlActual.add("//*[@id=\"content_table\"]/thead/tr[2]/th[13]");                    
                    return stbtlExpected.elementAt(i) +";"+stbtlActual.elementAt(i);
                case "stbel":
                    Vector<String> stbelExpected =new Vector<String>(8);
                    Vector<String> stbelActual =new Vector<String>(8);
                    stbelExpected.add("STB Event Logs");
                    stbelExpected.add("Room");
                    stbelExpected.add("IP");
                    stbelExpected.add("Location");
                    stbelExpected.add("Status");
                    stbelExpected.add("TVI Status");
                    stbelExpected.add("Input");
                    stbelExpected.add("Timestamp");
                    stbelActual.add("//*[@id=\"content_table\"]/caption");
                    stbelActual.add("//*[@id=\"content_table\"]/thead/tr/th[1]");
                    stbelActual.add("//*[@id=\"content_table\"]/thead/tr/th[2]");
                    stbelActual.add("//*[@id=\"content_table\"]/thead/tr/th[3]");
                    stbelActual.add("//*[@id=\"content_table\"]/thead/tr/th[4]");
                    stbelActual.add("//*[@id=\"content_table\"]/thead/tr/th[5]");
                    stbelActual.add("//*[@id=\"content_table\"]/thead/tr/th[6]");
                    stbelActual.add("//*[@id=\"content_table\"]/thead/tr/th[7]");
                    return stbelExpected.elementAt(i) +";"+stbelActual.elementAt(i);
                case "vieweh":
                    Vector<String> viewehExpected =new Vector<String>(9);
                    Vector<String> viewehActual =new Vector<String>(9);
                    viewehExpected.add("Select Dates");
                    viewehExpected.add("Start Date");
                    viewehExpected.add("End Date");
                    viewehExpected.add("Subject");
                    viewehExpected.add("Recipient(s)");
                    viewehExpected.add("Submitted");
                    viewehExpected.add("Sent");
                    viewehExpected.add("Mail Attempts");
                    viewehExpected.add("Error Messages");                    
                    viewehActual.add("//*[@id=\"content_table\"]/caption");
                    viewehActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[1]");
                    viewehActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[2]");
                    viewehActual.add("//*[@id=\"content_table\"]/thead/tr/th[1]");
                    viewehActual.add("//*[@id=\"content_table\"]/thead/tr/th[2]");
                    viewehActual.add("//*[@id=\"content_table\"]/thead/tr/th[3]");
                    viewehActual.add("//*[@id=\"content_table\"]/thead/tr/th[4]");
                    viewehActual.add("//*[@id=\"content_table\"]/thead/tr/th[5]");
                    viewehActual.add("//*[@id=\"content_table\"]/thead/tr/th[6]");
                    return viewehExpected.elementAt(i) +";"+viewehActual.elementAt(i);
                case "tomcat":
                    Vector<String> tomcatExpected =new Vector<String>(3);
                    Vector<String> tomcatActual =new Vector<String>(3);
                    tomcatExpected.add("Select Parameters");
                    tomcatExpected.add("Date:");
                    tomcatExpected.add("grep");
                    tomcatActual.add("//*[@id=\"content_table\"]/caption");
                    tomcatActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[1]");
                    tomcatActual.add("//*[@id=\"content_table\"]/tbody/tr[2]/td[1]");
                    return tomcatExpected.elementAt(i) +";"+tomcatActual.elementAt(i);
                case "modules":
                    Vector<String> modulesExpected =new Vector<String>(128);
                    Vector<String> moduleActual =new Vector<String>(128);                   
                    modulesExpected.add("Admin");
                    modulesExpected.add("Adult");
                    modulesExpected.add("Airplay");
                    modulesExpected.add("Appcode");
                    modulesExpected.add("Bookmarks");
                    modulesExpected.add("Ccms");
                    modulesExpected.add("Chromecast");
                    modulesExpected.add("Citizenmconf");
                    modulesExpected.add("Citizenminputs");
                    modulesExpected.add("Custom_gd_spa");
                    modulesExpected.add("Dashboard");
                    modulesExpected.add("Deviceswitcher");
                    modulesExpected.add("Embassy_local_gd");
                    modulesExpected.add("Embassy_technology_gd");
                    modulesExpected.add("Eventbulletin");
                    modulesExpected.add("Externalapplications");
                    modulesExpected.add("Externalmedia");
                    modulesExpected.add("Externalplugin");
                    modulesExpected.add("Folio");
                    modulesExpected.add("Frontdesk");
                    modulesExpected.add("Gd_alldaydining");
                    modulesExpected.add("Gd_argan");
                    modulesExpected.add("Gd_barmenu");
                    modulesExpected.add("Gd_breakfastmenu");
                    modulesExpected.add("Gd_cigart");
                    modulesExpected.add("Gdconradconradone");
                    modulesExpected.add("Gdconraddining");
                    modulesExpected.add("Gdconradrecreation");
                    modulesExpected.add("Gd_dining");
                    modulesExpected.add("Gd_eatanddrinkmenu");
                    modulesExpected.add("Gd_eatdrink");
                    modulesExpected.add("Gd_events");
                    modulesExpected.add("Gdfive");
                    modulesExpected.add("Gdfour");
                    modulesExpected.add("Gd_healthyfoodmenu");
                    modulesExpected.add("Gd_hereonbusiness");
                    modulesExpected.add("Gd_inroomdining");
                    modulesExpected.add("Gd_introduction");
                    modulesExpected.add("Gd_latenight");
                    modulesExpected.add("Gd_lolivier");
                    modulesExpected.add("Gd_nightmenu");
                    modulesExpected.add("Gdone");
                    modulesExpected.add("Gd_otherservices");
                    modulesExpected.add("Gd_outabout");
                    modulesExpected.add("Gd_outfacilities");
                    modulesExpected.add("Gd_roomservice");
                    modulesExpected.add("Gd_rose");
                    modulesExpected.add("Gdseven");
                    modulesExpected.add("Gdsix");
                    modulesExpected.add("Gd_spainfo");
                    modulesExpected.add("Gd_specialmenu");
                    modulesExpected.add("Gdthree");
                    modulesExpected.add("Gd_tucano");
                    modulesExpected.add("Gd_tvphoneinternet");
                    modulesExpected.add("Gdtwo");
                    modulesExpected.add("Gd_wellness");
                    modulesExpected.add("Gd_yoursafety");
                    modulesExpected.add("Guestbulletin");
                    modulesExpected.add("Guestdirectory");
                    modulesExpected.add("Guestdirectoryfour");
                    modulesExpected.add("Guestdirectorythree");
                    modulesExpected.add("Guestdirectorytwo");
                    modulesExpected.add("Guestmessages");
                    modulesExpected.add("Guestsurvey");
                    modulesExpected.add("Hardware");
                    modulesExpected.add("Help");
                    modulesExpected.add("Hilton_Animities_agepool_gd");
                    modulesExpected.add("Hilton_eatanddrink_gd");
                    modulesExpected.add("Hilton_guest_services_menu");
                    modulesExpected.add("Hilton_here_on_business_gd");
                    modulesExpected.add("Hilton_honors_gd");
                    modulesExpected.add("Hilton_inroom_dining_gd");
                    modulesExpected.add("Hilton_our_facility_gd");
                    modulesExpected.add("Hilton_out_and_about_gd");
                    modulesExpected.add("Hilton_spa_information_gd");
                    modulesExpected.add("Hilton_special_promotions_gd");
                    modulesExpected.add("Hilton_tv_phone_internet_gd");
                    modulesExpected.add("Hilton_who_to_call_gd");
                    modulesExpected.add("Hilton_your_safety_gd");
                    modulesExpected.add("Hollywood");
                    modulesExpected.add("Hotelservices");
                    modulesExpected.add("InScape_Meditation");
                    modulesExpected.add("Ipg");
                    modulesExpected.add("Jamesgd_one");
                    modulesExpected.add("Jamesgd_three");
                    modulesExpected.add("Jamesgd_two");
                    modulesExpected.add("Mainmenu");
                    modulesExpected.add("Mandarin_account");
                    modulesExpected.add("Mandarin_connect");
                    modulesExpected.add("Mandarin_gd_ourbrand");
                    modulesExpected.add("Mandarin_listen");
                    modulesExpected.add("Mandarin_menu_connect");
                    modulesExpected.add("Mandarin_menu_listen");
                    modulesExpected.add("Mandarin_menu_spa");
                    modulesExpected.add("Mandarin_menu_watch");
                    modulesExpected.add("Mandarinmoodzgrokker");
                    modulesExpected.add("Mandarin_moodz_ourbrand");
                    modulesExpected.add("Mandarin_services");
                    modulesExpected.add("Mandarin_watch");
                    modulesExpected.add("Medialibrary");
                    modulesExpected.add("Mediashare");
                    modulesExpected.add("Menu_eatdrink");
                    modulesExpected.add("Menu_guestservices");
                    modulesExpected.add("Moodz");
                    modulesExpected.add("Moviemenu");
                    modulesExpected.add("Musiclibrary");
                    modulesExpected.add("Musicmenu");
                    modulesExpected.add("Mymedia");
                    modulesExpected.add("Networkpvr");
                    modulesExpected.add("Penchicagomusic");
                    modulesExpected.add("Penchicagotv");
                    modulesExpected.add("Penchicagovids");
                    modulesExpected.add("Pms");
                    modulesExpected.add("Preferences");
                    modulesExpected.add("Redirect");
                    modulesExpected.add("Registration");
                    modulesExpected.add("Roomcontrol");
                    modulesExpected.add("Sedition_yoga");
                    modulesExpected.add("Siriusmusic");
                    modulesExpected.add("Skin");
                    modulesExpected.add("Spasoft");
                    modulesExpected.add("System");
                    modulesExpected.add("Television");
                    modulesExpected.add("Theme");
                    modulesExpected.add("Tvinternet");
                    modulesExpected.add("Videoplayer");
                    modulesExpected.add("Welcomemat");
                    modulesExpected.add("Worldradio");               
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[2]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[3]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[4]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[5]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[6]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[7]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[8]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[9]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[10]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[11]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[12]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[13]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[14]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[15]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[16]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[17]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[18]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[19]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[20]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[21]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[22]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[23]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[24]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[25]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[26]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[27]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[28]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[29]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[30]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[31]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[32]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[33]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[34]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[35]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[36]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[37]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[38]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[39]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[40]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[41]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[42]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[43]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[44]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[45]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[46]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[47]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[48]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[49]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[50]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[51]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[52]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[53]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[54]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[55]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[56]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[57]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[58]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[59]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[60]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[61]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[62]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[63]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[64]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[65]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[66]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[67]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[68]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[69]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[70]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[71]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[72]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[73]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[74]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[75]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[76]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[77]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[78]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[79]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[80]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[81]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[82]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[83]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[84]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[85]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[86]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[87]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[88]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[89]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[90]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[91]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[92]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[93]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[94]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[95]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[96]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[97]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[98]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[99]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[100]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[101]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[102]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[103]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[104]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[105]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[106]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[107]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[108]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[109]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[110]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[111]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[112]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[113]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[114]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[115]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[116]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[117]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[118]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[119]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[120]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[121]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[122]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[123]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[124]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[125]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[126]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[127]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[128]/td/a");
                    moduleActual.add("//*[@id=\"content_table\"]/tbody/tr[129]/td/a");                   
                    return modulesExpected.elementAt(i) +";"+moduleActual.elementAt(i);
                case "enabledRS":
                    Vector<String> enabledRSExpected =new Vector<String>(31);
                    Vector<String> enabledRSActual =new Vector<String>(31);   
                    enabledRSExpected.add("Enabled Radio Stations");
                    enabledRSExpected.add("Name");
                    enabledRSExpected.add("Call Letters");
                    enabledRSExpected.add("Genre");
                    enabledRSExpected.add("Location");
                    enabledRSExpected.add("Latitude");
                    enabledRSExpected.add("Longitude");
                    enabledRSExpected.add("Central ID");
                    enabledRSExpected.add("Enabled");
                    enabledRSExpected.add("Action");   
                    enabledRSExpected.add("Disabled Radio Stations");//table 2  10
                    enabledRSExpected.add("Name");
                    enabledRSExpected.add("Call Letters");
                    enabledRSExpected.add("Genre");
                    enabledRSExpected.add("Location");
                    enabledRSExpected.add("Latitude");
                    enabledRSExpected.add("Longitude");
                    enabledRSExpected.add("Central ID");
                    enabledRSExpected.add("Enabled");
                    enabledRSExpected.add("Action"); 
                    enabledRSExpected.add("Edit Radio Station");// table 3 20
                    enabledRSExpected.add("Name");
                    enabledRSExpected.add("Call Letters");
                    enabledRSExpected.add("Genre");
                    enabledRSExpected.add("City");
                    enabledRSExpected.add("State/Province"); 
                    enabledRSExpected.add("Country");
                    enabledRSExpected.add("Latitude");
                    enabledRSExpected.add("Longitude");
                    enabledRSExpected.add("URL");
                    enabledRSExpected.add("Last Modified");                    
                    enabledRSActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/div[1]/table/caption");
                    enabledRSActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/div[1]/table/thead/tr/th[1]");
                    enabledRSActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/div[1]/table/thead/tr/th[2]");
                    enabledRSActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/div[1]/table/thead/tr/th[3]");
                    enabledRSActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/div[1]/table/thead/tr/th[4]");
                    enabledRSActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/div[1]/table/thead/tr/th[5]");
                    enabledRSActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/div[1]/table/thead/tr/th[6]");
                    enabledRSActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/div[1]/table/thead/tr/th[7]");
                    enabledRSActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/div[1]/table/thead/tr/th[8]");
                    enabledRSActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/div[1]/table/thead/tr/th[9]");                    
                    enabledRSActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/div[2]/table/caption"); //table 2
                    enabledRSActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/div[2]/table/thead/tr/th[1]");
                    enabledRSActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/div[2]/table/thead/tr/th[2]");
                    enabledRSActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/div[2]/table/thead/tr/th[3]");
                    enabledRSActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/div[2]/table/thead/tr/th[4]");
                    enabledRSActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/div[2]/table/thead/tr/th[5]");
                    enabledRSActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/div[2]/table/thead/tr/th[6]");
                    enabledRSActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/div[2]/table/thead/tr/th[7]");
                    enabledRSActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/div[2]/table/thead/tr/th[8]");
                    enabledRSActual.add("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr/td/div/div[2]/table/thead/tr/th[9]");
                    enabledRSActual.add("//*[@id=\"content_table\"]/caption");
                    enabledRSActual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[1]/strong");
                    enabledRSActual.add("//*[@id=\"content_table\"]/tbody/tr[2]/td[1]/strong");
                    enabledRSActual.add("//*[@id=\"content_table\"]/tbody/tr[3]/td[1]/strong");
                    enabledRSActual.add("//*[@id=\"content_table\"]/tbody/tr[4]/td[1]/strong");
                    enabledRSActual.add("//*[@id=\"content_table\"]/tbody/tr[5]/td[1]/strong");
                    enabledRSActual.add("//*[@id=\"content_table\"]/tbody/tr[6]/td[1]/strong");
                    enabledRSActual.add("//*[@id=\"content_table\"]/tbody/tr[7]/td[1]/strong");
                    enabledRSActual.add("//*[@id=\"content_table\"]/tbody/tr[8]/td[1]/strong");
                    enabledRSActual.add("//*[@id=\"content_table\"]/tbody/tr[9]/td[1]/strong");
                    enabledRSActual.add("//*[@id=\"content_table\"]/tbody/tr[10]/td[1]/strong");                    
                    return enabledRSExpected.elementAt(i) +";"+enabledRSActual.elementAt(i);
                default:
                    return "OVM Administration"+";"+"/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[1]/h1";
            }            
        }
        protected String login(Integer i){
               Vector<String> Expected = new Vector<String>(3);
               Vector<String> Actual = new Vector<String>(3);
               Expected.add("OVM Login - v4.28.1");
               Expected.add("User Name");
               Expected.add("Password");
               Actual.add("//*[@id=\"content_table\"]/caption");
               Actual.add("//*[@id=\"content_table\"]/tbody/tr[1]/td[1]");
               Actual.add("//*[@id=\"content_table\"]/tbody/tr[2]/td[1]");
               return Expected.elementAt(i) +";"+Actual.elementAt(i);
           }       
}
