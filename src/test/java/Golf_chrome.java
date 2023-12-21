/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author lyang
 */
public class Golf_chrome extends TestCase{
    public Golf_chrome(String testName)
    {
        super(testName);
    }

    public static junit.framework.Test suite()
    {   controller.Golf g =new controller.Golf();
        String br="chrome";Integer test=0;
        //try{b.OpenGolf(br);}catch(Exception e){};
        //try{g.searchGolfCourse(br,test);}catch(Exception e){}
        try{g.searchGolfCourseCSV(br,test);}catch(Exception e){}
        //try{g.searchGolfCourseDB(br,test);}catch(Exception e){}
        //try{g.listGolfCourseByCountry(br,test);}catch(Exception e){}
       // try{g.addGolfCourse(br,test);}catch(Exception e){}

        return new TestSuite(AppTest.class);
    }
}
