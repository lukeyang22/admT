/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author lyang
 */
public class Booking_chrome extends TestCase{
    public Booking_chrome(String testName)
    {
        super(testName);
    }

    public static junit.framework.Test suite()
    {   controller.Booking b =new controller.Booking();
        String br="chrome";Integer test=0;
        //try{b.OpenGolf(br);}catch(Exception e){};
        //try{b.BookGolfCourse2(br,test);}catch(Exception e){}
        //try{b.BookGolfCourseFromDetail(br,test);}catch(Exception e){}
        try{b.BookGolfCourseFromDetail(br,test);}catch(Exception e){}
        return new TestSuite(AppTest.class);
    }
}