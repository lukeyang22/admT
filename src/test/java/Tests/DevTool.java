import junit.framework.TestCase;
import junit.framework.TestSuite;
public class DevTool extends TestCase{
    public DevTool(String testName)
    {
        super(testName);
    }

    public static junit.framework.Test suite()
    {   controller.DevTool d =new controller.DevTool();
        try{d.GeoLocation_City("Reading");}catch(Exception e){System.err.println(e);}
        //try{d.WebperformanceMetrics("https://www.admlucid.com");}catch(Exception e){}
        //try{d.viewConsoleLogs();}catch(Exception e){System.err.println(e);}
        //try{d.device("iPad");}catch(Exception e){System.err.println(e);}
        return new TestSuite(AppTest.class);
    }

}
