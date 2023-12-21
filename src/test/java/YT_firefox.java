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
public class YT_firefox extends TestCase{
    public YT_firefox(String testName)
    {
        super(testName);
    }

    public static junit.framework.Test suite()
    {   controller.YT t =new controller.YT();
        String br="firefox";Integer test=0;
        try{t.test1(br,test);}catch(Exception e){}
        try{t.test2(br,test);}catch(Exception e){}
        try{t.test3(br,test);}catch(Exception e){}
        try{t.test4(br,test);}catch(Exception e){}
        try{t.test5(br,test);}catch(Exception e){}
        try{t.test6(br,test);}catch(Exception e){}
        try{t.test7(br,test);}catch(Exception e){}
        try{t.test8(br,test);}catch(Exception e){}
        try{t.test9(br,test);}catch(Exception e){}
        try{t.test10(br,test);}catch(Exception e){}
        try{t.test11(br,test);}catch(Exception e){}
        try{t.test12(br,test);}catch(Exception e){}
        return new TestSuite(AppTest.class);
    }
}
