package Tests;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@Execution(ExecutionMode.CONCURRENT)
/**
 *
 * @author lyang
 */
public class Grid_chrome extends TestCase{
    public Grid_chrome(String testName)
    {
        super(testName);
    }
    controller.Grid g =new controller.Grid();
    String br="chrome";Integer test=0;
    @Test
    public static junit.framework.Test suite()
    {   controller.Grid g =new controller.Grid();
        String br="chrome";Integer test=0;
        try{g.pageTitleUrl(br,test);}catch(Exception e){}
        try{g.textToBetextMatches(br,test);}catch(Exception e){}
        /*try{g.visibilityofElements(br,test);}catch(Exception e){}
        try{g.elementToBeSelected(br,test);}catch(Exception e){}
        try{g.elementToBeClickable(br,test);}catch(Exception e){}*/
        return new TestSuite(AppTest.class);
    }
}
