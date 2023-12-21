package webelement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.*;
public class Booking {
    public String UI(String Name) {
        String webelement="";
        switch (Name) {
            case "BK_BookGolfCourse":
                webelement = "/html/body/div/main/table[1]/tbody/tr/td[4]/form/button";
                return webelement;
            case "BK_drpGolf":
                webelement = "//*[@id=\"GolfName\"]";
                return webelement;
            case "BK_txtBookedBy":
                webelement = "//*[@id=\"Customer\"]";
                return webelement;
            case "BK_txtEmail":
                webelement = "//*[@id=\"Email\"]";
                return webelement;
            case "BK_txtPhone":
                webelement = "//*[@id=\"Phone\"]";
                return webelement;
            case "BK_txtDate":
                webelement = "//*[@id=\"Date\"]";
                return webelement;
            case "BK_txtStartTime":
                webelement = "//*[@id=\"StartTime\"]";
                return webelement;
            case "BK_txtEndTime":
                webelement = "//*[@id=\"EndTime\"]";
                return webelement;
            case "BK_btnCreate":
                webelement = "/html/body/div/main/div[1]/div/form/div[8]/input";
                return webelement;
            case "BK_btnBook":
                webelement = "/html/body/div/main/div[2]/form/input";
                return webelement;
            case "Text_row_1":
                webelement = "/html/body/div/main/div[1]/div/form/div[1]/label";
            default:
                webelement = "form-label";
                return webelement;
        }
    }
}
