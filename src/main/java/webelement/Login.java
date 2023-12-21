/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webelement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.*;
/**
 *
 * @author lyang
 */
public class Login {
    public String UI(String Name){
        String webelement="";
        switch(Name)
        {
            case "Login_Titile":
                 webelement="//*[@id=\"loginForm\"]/h2";
                 return webelement;
            case "Login_Top_Login":
                 webelement="/html/body/header/nav/ul/li/a";
                 return webelement;
	        case "Login_username":
                 webelement= "//*[@id=\"Input_Email\"]";
                 return webelement;
            case "Login_password":
                 webelement= "//*[@id=\"Input_Password\"]";
                 return webelement;
            case "Login_Login":
                 webelement= "//*[@id=\"login-submit\"]";
                 return webelement;
            case "Login_Logoff":
                webelement="/html/body/header/nav/ul/li[2]/form/button";
                return webelement;
	        default:
                webelement="form-label";
                return webelement;
        }
   }
}
