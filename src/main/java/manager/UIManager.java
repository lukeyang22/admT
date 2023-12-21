
package manager;

import webelement.*;

public class UIManager {
       String webelement="";
       public String FindElement(String Name){
         if(Name.startsWith("Login_"))
                {Login ui= new Login(); webelement = ui.UI(Name);}
         if(Name.startsWith("BK_"))
                {Booking ui= new Booking(); webelement =ui.UI(Name);}
         if(Name.startsWith("Golf_"))
                {Golf ui= new Golf(); webelement =ui.UI(Name);}

         return webelement;
    }
}
