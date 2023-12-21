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
public class Docker extends TestCase{
    public Docker(String testName)
    {
        super(testName);
    }

    public static junit.framework.Test suite()
    {   controller.Docker d =new controller.Docker();
        try{d.home_firefox();}catch(Exception e){}
        //try{d.home_chrome();}catch(Exception e){}
        //try{d.home_edge();}catch(Exception e){}
        return new TestSuite(AppTest.class);
    }
}
