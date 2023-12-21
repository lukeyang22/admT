package webelement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.*;
public class Golf {
    public String UI(String Name) {
        String webelement = "";
        switch (Name) {
            case "Golf_SearchTextBox":
                webelement = "/html/body/div/main/table[1]/tbody/tr/td[1]/form/input[1]";
                return webelement;
            case "Golf_SearchButton":
                webelement = "/html/body/div/main/table[1]/tbody/tr/td[1]/form/button";
                return webelement;
            case "Golf_drpCountry":
                webelement = "/html/body/div/main/table[1]/tbody/tr/td[2]/form/fieldset/select";
                return webelement;
            case "Golf_Filter":
                webelement = "/html/body/div/main/table[1]/tbody/tr/td[2]/form/fieldset/button";
                return webelement;
            case "Golf_Clear":
                webelement = "/html/body/div/main/table[1]/tbody/tr/td[3]/form/fieldset/button";
                return webelement;
            case "Golf_BookGolf":
                webelement = "/html/body/div/main/table[1]/tbody/tr/td[4]/form/button";
                return webelement;
            case "Golf_AddGolf":
                webelement = "/html/body/div/main/table[1]/tbody/tr/td[5]/form/button";
                return webelement;
            case "Golf_Tests":
                webelement = "/html/body/header/nav/li[2]/button";
                return webelement;
            case "Golf_Course":
                webelement = "/html/body/header/nav/li[2]/div/a[2]";
                return webelement;
            case "Golf_NavPre":
                webelement = "/html/body/div/main/div/ul/li[1]/a";
                return webelement;
            case "Golf_NavNext":
                webelement = "/html/body/div/main/div/ul/li[4]/a";
                return webelement;
            case "Golf_Details_1":
                webelement = "/html/body/div/main/table[2]/tbody/tr[1]/td[6]/a";
                return webelement;
            case "Golf_Details_2":
                webelement = "/html/body/div/main/table[2]/tbody/tr[2]/td[6]/a";
                return webelement;
            case "Golf_Details_3":
                webelement = "/html/body/div/main/table[2]/tbody/tr[3]/td[6]/a";
                return webelement;
            case "Golf_Details_4":
                webelement = "/html/body/div/main/table[2]/tbody/tr[4]/td[6]/a";
                return webelement;
            case "Golf_Details_5":
                webelement = "/html/body/div/main/table[2]/tbody/tr[5]/td[6]/a";
                return webelement;

            case "Golf_Name_Cell_1":
                webelement = "/html/body/div/main/table[2]/tbody/tr[1]/td[1]";
                return webelement;
            case "Golf_Address_Cell_1":
                webelement = "/html/body/div/main/table[2]/tbody/tr[1]/td[2]";
                return webelement;
            case "Golf_Description_Cell_1":
                webelement = "/html/body/div/main/table[2]/tbody/tr[1]/td[3]";
                return webelement;
            case "Golf_Email_Cell_1":
                webelement = "/html/body/div/main/table[2]/tbody/tr[1]/td[4]/a";
                return webelement;
            case "Golf_Phone_Cell_1":
                webelement = "/html/body/div/main/table[2]/tbody/tr[1]/td[5]";
                return webelement;

            case "Golf_NameTextbox":
                webelement = "//*[@id=\"Name\"]";
                return webelement;
            case "Golf_AddressTextbox":
                webelement = "//*[@id=\"Address\"]";
                return webelement;
            case "Golf_CityTextbox":
                webelement = "//*[@id=\"City\"]";
                return webelement;
            case "Golf_ProvinceTextbox":
                webelement = "//*[@id=\"Province\"]";
                return webelement;
            case "Golf_CountryDroplist":
                webelement = "//*[@id=\"Country\"]";
                return webelement;
            case "Golf_DesTextbox":
                webelement = "//*[@id=\"Description\"]";
                return webelement;
            case "Golf_LongDesTextarea":
                webelement = "//*[@id=\"LongDes\"]";
                return webelement;
            case "Golf_OwnerTextbox":
                webelement = "//*[@id=\"Owner\"]";
                return webelement;
            case "Golf_EmailTextbox":
                webelement = "//*[@id=\"Email\"]";
                return webelement;
            case "Golf_PhoneTextbox":
                webelement = "//*[@id=\"PhoneNumber\"]";
                return webelement;
            case "Golf_CreateButton":
                webelement = "/html/body/div/main/div[1]/div--/form/div[14]/input";
                return webelement;

            case "Golf_SaveButton":
                webelement = "/html/body/div/main/div[1]/div/form/div[11]/input";
                return webelement;
            case "Golf_DeleteButton":
                webelement ="/html/body/div/main/div/form/input[2]";
                return webelement;
            default:
                webelement = "form-label";
                return webelement;
        }
    }
}
