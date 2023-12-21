/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@Execution(ExecutionMode.CONCURRENT)
/**
 *
 * @author lyang
 */
public class Golf_firefox extends TestCase{
    public Golf_firefox(String testName)
    {
        super(testName);
    }

    public static junit.framework.Test suite()
    {   controller.Golf g =new controller.Golf();
        String br="firefox";Integer test=0;
        //try{b.OpenGolf(br);}catch(Exception e){};
        try{g.searchGolfCourse(br,test);}catch(Exception e){}
        try{g.listGolfCourseByCountry(br,test);}catch(Exception e){}
        try{g.addGolfCourse(br,test);}catch(Exception e){}
        try{g.editGolfCourse(br,test);}catch(Exception e){}
        try{g.deleteGolfCourse(br,test);}catch(Exception e){}
        return new TestSuite(AppTest.class);
    }
}
